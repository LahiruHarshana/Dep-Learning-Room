const API_URL = 'http://localhost:3000/students';
loadAllStudents();
async function loadAllStudents(){
    const studentList = await $.ajax(API_URL);

    if (studentList.length){
        $('#tbl-student > tfoot').hide();
    }else{

    }
    console.log(studentList);
}