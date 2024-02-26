package spring.ejercicios;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ejercicios {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("personas.xml");

		Persona p1=(Persona)context.getBean("PersonaMasculino");
		System.out.println(p1.toString());
		Persona p2=(Persona)context.getBean("PersonaFemenino");
		System.out.println(p2.toString());
	}
}
