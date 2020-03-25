package kr.or.connect.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car 
{
    @Autowired //알아서 Engine 객체를 v8에 주입해라!
    private Engine v8;
    
    public Car() {
      System.out.println("Car 생성자");
    }
    
    
    public void setEngine(Engine e) {
      this.v8 = e;
    }
    
    public void run() {
      System.out.println("엔진을 이용하여 달립니다.");
      v8.exec();
    }
    
   /* 
  //이 main 메서드에 있는 과정을 스프링 Ioc가 대신 해준다.
   public static void main(String[] args) { 
     Engine e = new Engine();
     Car c = new Car();
     c.setEngine(e);
     c.run();
  }*/
}
