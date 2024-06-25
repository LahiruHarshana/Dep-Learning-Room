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
    }

    $
}