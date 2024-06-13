package Tasks.Task3;
public class Employee {
	int empid;
	String empname;
	double salary;
	String deptname;
  Employee(int empid,String empname,double salary ,String deptname){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		this.deptname=deptname;
	}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
  public String toString() {
	return empid+" "+empname+" "+salary+" " +deptname;
	  
  }

}
