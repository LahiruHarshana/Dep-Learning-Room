const API_URL = 'http://localhost:3000/students';
loadAllStudents();


$('form').on('submit',()=>{
    $("form").addClass('was-validated');
    if (document.querySelector("form").checkValidity()){
        alert("Validated");
    }
}).on('reset',()=>{
    $('form').removeClass('was-validated');
});

$('#tbl-student >tbody').on('click','td:last-child > i',async (e)=>{
    const studentId = $(e.target).parents("tr").children().first().text();



    try {
       await $.ajax(`${API_URL}/${studentId}`,{method:'DELETE'})
        $(e.target).parents("tr").fadeOut(500, ()=>{
           $(e.target).parents("tr").remove();
           if (!$('#tbl-student >tbody>tr').length) $('#tbl-student > tfoot').show();
        });
    }catch (e){
        alert("failed to delete the students,try again");
        console.log(e);
    }
});
async function loadAllStudents(){
    const studentList = await $.ajax(API_URL);

    if (studentList.length){
        $('#tbl-student > tfoot').hide();
        studentList.forEach(studentList=>{
            const rowHtml =`
        <tr>
            <td>${studentList.id}</td>
            <td>${studentList.name}</td>
            <td>${studentList.contact}</td>
            <td><i class="bi bi-trash"></i></td>
        </tr>
        `;
        $('#tbl-student > tbody').append(rowHtml);
        });
    }else{
        $('#tbl-student>tfoot').show();
    }
    console.log(studentList);
}

$('#btn-new-student').on('click',()=>{
    $('form').trigger('reset');
    $('#txt-id').val(genarateNewId());
    $('#txt-name,#txt-contact').val("");
    $('#txt-name').trigger('focus');
    console.log(genarateNewId());
});

function genarateNewId(){
   const lastStudentId = $('#tbl-student > tbody > tr:last-child > td:first-child').text();
  const newId =  +lastStudentId.replace('S','')+1
    return "S"+`${newId}`.padStart(3,'0');
}