/* Online Java Compiler and Editor */
public class Employee {
int employeeId;
int salary;
String dept;

Employee(int empid,int sal, String d){
employeeId=empid;
salary=sal;
dept =d;
}
public static void main(String[] args) {

Employee harsha = new Employee(101,3000,"Testing");
Employee varsha = new Employee(102,5000,"Engineering");
System.out.println(harsha.employeeId+" Salary "+harsha.salary+" Dept "+harsha.dept);
System.out.println(varsha.employeeId+" Salary "+varsha.salary+" Dept "+varsha.dept);
}
}