package com.topyfi.runner;

import java.util.Objects;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.topyfi.javabrains.Circle;
import com.topyfi.javabrains.Shape;

public class DrawingApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/topyfi/runner/spring.xml");
		context.registerShutdownHook();
		Shape shape= (Shape) context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("mes", null, "Default Greeting", null));
		
		
		
		//Objects.requireNonNull(shape);
		
	}
}
