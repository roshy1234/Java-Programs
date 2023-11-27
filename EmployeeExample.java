class Employee{
           String name;
           String address;
           int age;
           long phoneNo;
           long salary;
Employee(String name, int age, long phoneNo, long salary, String address){
	this.name=name;
	this.age=age;
	this.phoneNo=phoneNo;
	this.salary=salary;
	this.address=address;
}
public void PrintSalary(){
	System.out.println("Salary:" +salary);
}
public void PrintDetails(){
	System.out.println("Name:" +name);
	System.out.println("Age:" +age);
	System.out.println("Phone Number:" +phoneNo);
	System.out.println("Address:" +address);
	System.out.println("Salary:" +salary +"$");
}
}

class Officer extends Employee{
String Specialisation;
public Officer(String name, int age, long phoneNo, long salary, String address, String Specialisation){
super(name, age, phoneNo, salary, address);
this.Specialisation=Specialisation;
}
void PrintDetails(String occupation){
	if(occupation=="Officer"){
	System.out.println("Name:" +name);
	System.out.println("Age:" +age);
	System.out.println("Phone Number:" +phoneNo);
	System.out.println("Address:" +address);
	System.out.println("Salary:" +salary+"$");
	System.out.println("Specialisation:"+Specialisation);
}
}
}

class Manager extends Employee{
String Department;
public Manager(String name, int age, long phoneNo, long salary, String address, String Department){
super(name, age, phoneNo, salary, address);
this.Department=Department;
}
public void PrintDetails(String occupation){
	if(occupation=="Manager"){	
	System.out.println("Name:" +name);
	System.out.println("Age:" +age);
	System.out.println("Phone Number:" +phoneNo);
	System.out.println("Address:" +address);
	System.out.println("Salary:" +salary+"$");
	System.out.println("Department:" +Department);
}
}
}

class EmployeeExample{
public static void main(String args[])
{
Employee Employee1=new Employee("Harry", 32, 9898989, 50000, "Florida");
Officer Employee2=new Officer("John", 39, 7007007, 500000, "Los Angles", "Mercenary");
Manager Employee3=new Manager("Winston", 60, 9876543, 5000000, "New York", "Continental");
Employee2.PrintSalary();
Employee1.PrintDetails();
Employee2.PrintDetails("Officer");
Employee3.PrintDetails("Manager");
}
}
