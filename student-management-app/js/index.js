const API_URL = 'http://localhost:3000/students';
loadAllStudents();


$('#tbl-student >tbody').on('click','td:last-child > i',async (e)=>{
    const studentId = $(e.target).parents("tr").children().first().text();

    try {
       await $.ajax(`${API_URL}/${studentId}`,{method:'DELETE'})
        $(e.target).parents("tr").fadeOut(500);
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