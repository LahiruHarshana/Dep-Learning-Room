EM_URL ='http://localhost:3000/employee';

loadAllEmployees();
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
                    <td>${employee.name}</td>
                    <td>${employee.department}</td>
                    <td><i class="${icon}"></i></td>
                </tr>
            `;
            $('#tbl-employee > tbody').append(rowHtml);
        });
    }
}