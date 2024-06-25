EM_URL ='http://localhost:3000/employee';

loadAllEmployees();

$("form").on('submit',(e)=>{
    e.preventDefault();
    $("form").addClass('was-validated');
    if (document.querySelector("form").checkValidity()){
        saveEmployee();
    }
}).on('reset',()=>{
    $("form").removeClass('was-validated')
});

 async function saveEmployee(){
     try {
         let genderVal;
         const selectedGender = $("input[name='inlineRadioOptions']:checked").val();
         if (selectedGender === 'option1') {
             genderVal = 'male';
         } else if (selectedGender === 'option2') {
             genderVal = 'female';
         } else {
             genderVal = 'undefined';
         }
         console.log(genderVal);
         const newEmployee = {
             id : $("#txt-id").val().trim(),
             name : $("#txt-name").val().trim(),
             address : $("#txt-address").val().trim(),
             department : document.getElementById('slc-department').value,
             gender : genderVal
         }

         await $.ajax(EM_URL,{
             method : 'POST',
             data: JSON.stringify(newEmployee),
             headers:{
                 'Content-Type': 'application/json'
             }
         });

         if (newEmployee.gender === 'female') {
             icon = 'bi bi-person-standing-dress';
         }else {
             icon = 'bi bi-person-standing';
         }
         const rowHtml = `
            <tr>
             td>${newEmployee.id}</td>
            <td> <i class="${icon}"></i>${newEmployee.name}</td>
            <td>${newEmployee.contact}</td>
            <td><i class="bi bi-trash"></i></td>
        </tr>
    `;

         $('#tbl-employee > tbody').append(rowHtml);
         $('#tbl-employee > tfoot').hide();
         $("form").trigger('reset');
     }catch (e){
         alert("not save");
         console.log(e);
     }

}
async function loadAllEmployees(){
    const EmployeeList = await $.ajax(EM_URL);

    if (EmployeeList.length){
        $('#tbl-employee > tbody').empty();
        $('#tbl-employee > tfoot').hide();
        EmployeeList.forEach((employee)=>{

            if (employee.gender === 'female') {
                icon = 'bi bi-person-standing-dress';
            }else {
                icon = 'bi bi-person-standing';
            }
            const rowHtml = `
                <tr>
                    <td>${employee.id}</td>
                    <td> <i class="${icon}"></i>${employee.name}</td>
                    <td>${employee.department}</td>
                    <td><i class="bi bi-trash"></i></td>
                </tr>
            `;
            $('#tbl-employee > tbody').append(rowHtml);
        });
    }    else{
    $('#tbl-student>tfoot').show();
}
}

$('#tbl-employee >tbody').on('click','td:last-child>i',async (e) =>{
    const employeeId = $(e.target).parents("tr").children().first().text();

    try {
        await $.ajax(`${EM_URL}/${employeeId}`,{method:'DELETE'})
        $(e.target).parents("tr").fadeOut(500, ()=>{
            $(e.target).parents("tr").remove();
            if (!$('#tbl-employee >tbody>tr').length){
                $('#tbl-employee > tfoot').show();
            }
        });
    }catch (e){
        alert("failed to delete the employees,try again");
        console.log(e);
    }
});

$('#btn-new-employee').on('click',()=>{
    $('form').trigger('reset');
    $('#txt-id').val(genarateNewId());
    $('#txt-name,#txt-address').val("");
    $('#inlineRadio1').empty();
    $('#inlineRadio2').empty();
    $('#slc-department').val('select-department');
    $('#txt-name').trigger('focus');
    console.log(genarateNewId());
});

function genarateNewId(){
    const lastEmployeeId = $('#tbl-employee > tbody > tr:last-child > td:first-child').text();
    const newId =  +lastEmployeeId.replace('E-','')+1
    return "E-"+`${newId}`.padStart(3,'0');
}

$('#tbl-employee > tbody').on('click', 'td', async (e) => {
    let depa;
    const employeeId = $(e.target).parents("tr").children().first().text();
    try {
        const employee = await $.ajax(`${EM_URL}/${employeeId}`);

        $('#txt-id').val(employee.id);
        $('#txt-name').val(employee.name);
        $('#txt-address').val(employee.address);
        if ('male' === employee.gender){
            $('#inlineRadio1').prop('checked',true);
        }else {
            $('#inlineRadio2').prop('checked',true);
        }

        if ('machanic'===employee.department){
            depa = 'machanic';
        }else if('water'===employee.department){
            depa = 'water';
        }else if ('center' === employee.department){
            depa = 'center';
        }
        $('#slc-department').val(depa);
    } catch (error) {
        alert("Failed to fetch the employee details, please try again.");
        console.log(error);
    }
});
