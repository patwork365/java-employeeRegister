import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
     //STAGE 1
        //Make a list of employee using list
          List<String> employee = new ArrayList<>();
        //Make a list of employee using the class
          EmployeeRegister emplist = new EmployeeRegister("CitiBank");
        //Add an employee to the list
            employee.add("Prapti R");
            employee.add("Tina S");
            employee.add("Mona L");

        // Add employee in the class by add method in the class
            emplist.addEmployees("Adam Jen");
            emplist.addEmployees("Brad Pitt");
        //Print all employee in list
            System.out.println("All employees " + employee);


        //List all employee from list
        String chosenEmployee =employee.get(0);
        System.out.println(chosenEmployee);
        System.out.println(employee.get(1));


    //STAGE 2
       //List of Roles
       List<String> roles = new ArrayList<>();
       roles.add("Associate");
        roles.add("AVP");
        roles.add("VP");
        roles.add("Director");
        roles.add("Managing Director");
        System.out.println(roles);
      //Find the last role and sout it out
        System.out.println("Role at index 2 = " + roles.get(2));
      //Loop thru the roles and sount them
      for (int i=0; i<=roles.size()-1;i++)
          System.out.println(roles.get(i));

      for (String role: roles) {
          System.out.println("Using For-Each loop " + role);
        }

      // Use Array to add roles
       String[] RoleNames={"Scrum Master","QA manager","Business Analyst"};

        addAll(roles, RoleNames);
        System.out.println("Added Roles using String Array " + roles);
      //Employee have roles
      //Change an employee role



       //Using  Employee class to list all employee

        emplist.listEmployee();
      //Using Employee Class to add role

        emplist.addRoles("Nurse");
        emplist.addRoles("Doctor");
        //List all the roles from the class and print them
        emplist.listRoles();
        //.................. Created the new Employee Class     // Using Employee Class
        EmployeeRegister emplists = new EmployeeRegister("deutsche bank");
        emplists.createEmp("Sheena A", "Developer",1);
        emplists.createEmp("Rupali P", "Sr Developer",2);
        emplists.listEmployees();
        // delete from the list
//        emplists.deleteEmployee("Sheena A");
        //update the role of employee
         emplists.UpdateEmployee(2,"Designer");
    }


}