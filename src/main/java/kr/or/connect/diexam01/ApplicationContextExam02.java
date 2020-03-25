package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam02 {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml"); 
    
    Car car = (Car) ac.getBean("c"); //스프링 컨테이너가 car 객체를 만들어준다. 
    car.run();
  }
}

