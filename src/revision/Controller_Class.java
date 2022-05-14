package revision;

public class Controller_Class {
    public static void main(String[] args) {
        // you will enter the number of department and the name
        Department d1 = new Department(1, "Quality department");
        // This is salaried employee
        Salaried_Employee SE = new Salaried_Employee("Ramadan", "Giza", 123456789, Gender.male, 12000, 1500, 500);
        // add employee to  Quality department (salaried employee) (Employee is above)
        d1.add_Employee(SE);
        // This is hourly employee
        Hourly_Employee HE = new Hourly_Employee("Mohamed", "6 October", 123456, Gender.male, 200, 30);
        // add employee to  Quality department (hourly employee) (Employee is above)
        d1.add_Employee(HE);
        // return number of employees
        System.out.println("number of employees" + d1.get_Employee_Count());
        // print basic data for department employee
        d1.print_Basic_Data();
        // print all data for department employee
        d1.print_All_Details();



    }
}

