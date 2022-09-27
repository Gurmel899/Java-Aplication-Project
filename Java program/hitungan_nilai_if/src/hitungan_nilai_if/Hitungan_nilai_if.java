
package hitungan_nilai_if;

import java.util.Scanner;

public class Hitungan_nilai_if {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

  
  System.out.println("Masukkan Sebuah Nilai = ");
  int nilai = input.nextInt();
  
  if (nilai>=80){
   System.out.println("A");
  }
  else if (nilai>=75&&nilai<=80){
   System.out.println("B+");
  }
  else if (nilai>=70&&nilai<=74){
   System.out.println("B");
  }
  else if (nilai>=65&&nilai<=69){
   System.out.println("C+");
  }
  else if (nilai>=60&&nilai<=64){
   System.out.println("C");
  }
  else if (nilai>=50&&nilai<=59){
   System.out.println("D");
  }
  else if (nilai<=50){
   System.out.println("E");
  }
  else {
   
  }
 } 
        
       
} 
        
    
    


