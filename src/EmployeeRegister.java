import java.util.ArrayList;
import java.util.List;

public class EmployeeRegister {
    private List<String> employees = new ArrayList<>();
    private  String company;
    private List<String> employeesRole = new ArrayList<>();

   public EmployeeRegister(String company) {
        this.company = company;
    }
    public void addEmployees(String names){
        this.employees.add(names);
        }

    public EmployeeRegister(List<String> employeesRole) {
        this.employeesRole = employeesRole;
    }

    public void addRoles(String role){
        employeesRole.add(role);
    }

    //List the roles and print them
    public void listRoles() {
        for (String role : employeesRole) {
            int index = employeesRole.indexOf(role) + 1;
            System.out.println(index + ". List of EmployeeRegister Class  " + role);
        }
    }
    //List the employee names and print them
    public void listEmployee() {
        for (String employee :employees ) {
            int index= employees.indexOf(employee) +1;
           System.out.println(index + ". List of EmployeeRegister Class " + employee);
        }
    }

    public void listEmployeeRole(){
        for (String employee:employees){
            //get the index of the name
            int index=employees.indexOf(employee);
            // then get the same index from the role
            String empRole = employeesRole.get(index);
            System.out.println((index+1)  +". "+ employee +" . " + empRole);
        }

    }
    @Override
    public String toString() {
        return "Employee{" +
                "employees=" + employees +
                '}';
    }

    //.........................Using the CLASS - Using Employee Class to create a new Employee

    //List created using Employee Class
    private List<Employee> employeesClassList = new ArrayList<>();

    public void createEmp(String name, String role, int id){
        Employee newEmp = new Employee(name,role,id);
        //add the new enunciated employee to the list

        this.employeesClassList.add(newEmp);
    }

    public void listEmployees() {
        for (Employee employee :employeesClassList ) {
            int index= employeesClassList.indexOf(employee)+1;
            System.out.println(index + ". Using the EmployeeClass " + employee);
            System.out.println(employeesClassList);
        }
    }

    public void deleteEmployee(String name) {
        for (Employee employee:employeesClassList) {
            if (employee.getName()==name){
             employeesClassList.remove(employee);
            }
        }
    }

    public void UpdateEmployee(int id, String role) {
        for (Employee employee:employeesClassList) {
            if (employee.getId()==id){
             employee.setRole(role);
            }
        }
    }
}

