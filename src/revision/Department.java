package revision;

import java.util.ArrayList;

public class Department {
    int department_Number;
    String department_Name;
    ArrayList<Employee> Employee_List;
    public Department(){

    }

    public Department(int department_Number, String department_Name) {
        this.department_Number = department_Number;
        this.department_Name = department_Name;
        Employee_List = new ArrayList<Employee>();
    }

    public void setDepartment_Number(int department_Number) {
        this.department_Number = department_Number;
    }

    public int getDepartment_Number() {
        return department_Number;
    }

    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }

    public String getDepartment_Name() {
        return department_Name;
    }
    public void add_Employee(Employee e){
        Employee_List.add(e);
    }
    public void remove_Employee(int index){
        Employee_List.remove(index);
    }
    public int get_Employee_Count(){
        return Employee_List.size();
    }
    public void print_Basic_Data(){
        for(int i=0;i<Employee_List.size();i++){
            System.out.println(Employee_List.get(i).getName()+" "+Employee_List.get(i).ssn+" " + Employee_List.get(i).getSex());
        }
    }

    // This function used to print all details for employee by casting type of employee from Employee to The type you want to print his details

    public void print_All_Details(){
        for(int i=0;i<Employee_List.size();i++){
            if(Employee_List.get(i) instanceof Salaried_Employee)
                ((Salaried_Employee) Employee_List.get(i)).Display_All_Details();
            if(Employee_List.get(i) instanceof Commission_Employee)
                ((Commission_Employee) Employee_List.get(i)).Display_All_Details();
            if(Employee_List.get(i) instanceof Hourly_Employee)
                ((Hourly_Employee) Employee_List.get(i)).Display_All_Details();
            if(Employee_List.get(i) instanceof Base_Plus_commission_Employee)
                ((Base_Plus_commission_Employee) Employee_List.get(i)).Display_All_Details();
        }
    }

}

