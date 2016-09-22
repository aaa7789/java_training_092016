package com.mms.oops.anonymous.classwork;

public class EmployerTest {
	
	public  void callWork(Employee employee)
	{
		employee.work();
	}

	public static void main(String[] args) {
		
		
		Employee  developer = new Developer();
		EmployerTest test = new EmployerTest();
		
		test.callWork(developer);
		test.callWork(new Employee() {
			
			@Override
			public void work() {
				System.out.println("this is from manager class");
				
			}
		});
	}

}
