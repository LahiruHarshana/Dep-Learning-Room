const API_URL = 'http://localhost:3000/students';
loadAllStudents();


$('#tbl-student >tbody').on('click','td:last-child > i',(e)=>{
    console.log($(e.target).parents("tr").children().first().text());
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