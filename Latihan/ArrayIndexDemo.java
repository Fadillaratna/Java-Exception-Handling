package Latihan;

public class ArrayIndexDemo {

    public static void main(String[] args) {
       int[] nums = {1, 2, 3};
        
        //Exception ---> terjaadi error di : nums[4]=3;, maka yang di try catch adalah syntax itu
        
        try{
            nums[4]=3;
        }catch(ArrayIndexOutOfBoundsException e){ //Menggunakan ArrayIndexOutOfBoundsException --> karena pada output
                                                                                  //program ketika di run muncul Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
            System.err.println(e);                                                                       
        }
        
        
         System.out.println(""+nums[2]); 
    }
    
}
