package design;

import java.text.ParseException;
import java.util.Arrays;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee=new EmployeeInfo();
		employee.setName("Djamel");
		employee.setEmployeeId(3);
		EmployeeInfo.setCompanyName("PnT");
		employee.setSalary(120000);
		employee.setSsn("462-64-8541");
		employee.setEmail("djamelna@gmail.com");
		employee.setDate_of_birth("14/09/1990");
		employee.benefitLayout();
		employee.assignDepartment();
		employee.printInfo();
		int Bonus=EmployeeInfo.calculateEmployeeBonus(120000,"best");
		System.out.println("your bonus is: $"+Bonus);
		int pension= 0;
		try {
			pension = EmployeeInfo.calculateEmployeePension(5,120000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("your pension is: $"+pension);



	}

}
