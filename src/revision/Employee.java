package revision;
enum Gender{male,female};
public  abstract class Employee
{
    String name;
    String address;
    int ssn;
    Gender sex;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return address;
    }

    public void setSsn(int ssn){
        this.ssn=ssn;
    }

    public int getSsn(){
        return ssn;
    }



    public void setSex(Gender sex){
        this.sex=sex;
    }

    public Gender getSex(){
        return sex;
    }

    public Employee(){

    }

    public Employee(String name , String address , int ssn ,Gender sex){
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssn=" + ssn +
                ", sex=" + sex +
                '}';
    }
    public abstract double earnings();
}
