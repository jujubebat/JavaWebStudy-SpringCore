package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {

  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml"); //ApplicationContext 인터페이스를 구현한다.
    System.out.println("초기화 완료!!");
    
    UserBean  userBean = (UserBean)ac.getBean("userBean");
    userBean.setName("park");
    
    System.out.println(userBean.getName());
    
    UserBean  userBean2 = (UserBean)ac.getBean("userBean");
    userBean.setName("kim");
    
    System.out.println(userBean.getName());
    
    if(userBean == userBean2) 
      System.out.println("같은 인스턴스 입니다.");
  }

}
