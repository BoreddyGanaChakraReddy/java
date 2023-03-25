import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int a=sc.nextInt();
        int x = 2;
        if(a>=10 && a<=50){
            for(int i=2;i<=a;i++){
                if(a%i == 0){
                    x = i;
                    break;
                }
            }
            while(a != 1){
            while(a%x == 0){
                al.add(x);
                a/=x;
                
            }
                x++;
            }
            for(int r : al){
                System.out.print(r+" ");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
