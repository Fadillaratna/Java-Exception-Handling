package Latihan;

public class NullPointerDemo {

    public static void main(String[] args) {
      
      String name=null;
       
       try{
           System.out.print("Length of the string"+name.length());
       }catch( Exception e){
           System.out.println(e);
       }
       
    }
    
}
