package Latihan;

public class TestThrow {
  static void validate(int age){  
     if(age<18)  
      throw new java.lang.ArithmeticException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
   public static void main(String args[]){  
      try{
         validate(13);   
      }catch(java.lang.ArithmeticException a){
          System.out.println("Kesalahan/Exception : " + a);
      }
      
      System.out.println("rest of the code...");  
  } 
}
    
