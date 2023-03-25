import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Long Acc_no = sc.nextLong();
        String Acc_Name= sc.nextLine();
        Acc_Name+=sc.nextLine();
        Character Gender = sc.next().charAt(0);
        int Wit_Ammount = sc.nextInt();
        int Cur_Ammount = 20000;
        if(Wit_Ammount<=20000){
              if(Gender =='M'){
                  System.out.println("Hi Mr. " +Acc_Name + "!");
                  System.out.print("Your Account Balance after withdrawl is " +(Cur_Ammount-Wit_Ammount) +".");
              }else{
                  System.out.println("Hi Ms. "+Acc_Name +" !");
                  System.out.print("Your Account Balance after withdrawl is " +(Cur_Ammount-Wit_Ammount) +".");
              }
            
        }else{
            System.out.println("Hi Ms. "+Acc_Name +"!");
            System.out.print("Insufficient Funds! You can not withdraw " +Wit_Ammount +".");
        }
        
    }
}
