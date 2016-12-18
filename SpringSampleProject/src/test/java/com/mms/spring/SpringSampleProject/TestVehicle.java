package com.mms.spring.SpringSampleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestVehicle {

	public static void main(String[] args) {
		
		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\practice\\java_training\\201609_batch\\workspace\\SpringSampleProject\\applicationContext.xml");
		Vehicle car = (Vehicle) context.getBean("vehicle");
		car.run();

	}

}
