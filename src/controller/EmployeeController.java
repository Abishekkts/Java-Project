package controller;

import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

import daoimpl.EmployeeDao;
import model.Employee;

public class EmployeeController {
	EmployeeDao empDao=null;
	public EmployeeController() throws ClassNotFoundException, SQLException{
	empDao=new EmployeeDao();
}

public void addEmployee(String UFN,String ULN,String UID,String UP,String UG,String UR) {
	Employee emp=new Employee();
	//BufferReader reader=new BufferReader (new InputStreamReader(System.in));
	emp.setFirstName(UFN);
	emp.setLastName(ULN);
	emp.setUserId(UID);
	emp.setPassword(UP);
	emp.setRole(UR);
	emp.setGender(UG);
	
	empDao.addEmployee(emp);

}

public void getAllEmployees() {
	
	List<Employee> allEmpList=empDao.getAllEmployees();
	for(Employee emp:allEmpList) {
		System.out.println(emp);
	}
}

public Employee checkLogin(String userId, String password) {
	
	Employee emp = new Employee();
	emp.setUserId(userId);
	emp.setPassword(password);
	empDao.checkLogin(emp); 
	return emp;
}

public Employee activateEmployee(String UID) {
	Employee emp = new Employee();
	emp.setUserId(UID);
	empDao.activateEmployee(emp);
	return emp;
}

public Employee DeactivateEmp(String UID) {
	Employee emp = new Employee();
	emp.setUserId(UID);
	empDao.deactivateEmployee(emp);
	return emp;
}

public Employee getEmployeeById(int id) {
	Employee emp = new Employee();
	emp.setEmpId(id);
	empDao.getEmployeeById(emp);
	return emp;
	
}
public Employee updateEmployee(String UFN, String ULN, String UP, String UID) {
	Employee emp= new Employee();
	emp.setFirstName(UFN);
	emp.setLastName(ULN);
	emp.setPassword(UP);
	emp.setUserId(UID);
	empDao.updateEmployee(emp);
	return emp;
}
public Employee DeleteEmployee(int EID) {
	   Employee emp= new Employee();
	   emp.setEmpId(EID);
	   empDao.deleteEmployee(emp);
	   return emp;
}

}









