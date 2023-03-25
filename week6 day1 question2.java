import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=0){
            System.out.println("Invalid");
        }
        else{
        String arr[] = new String[a];
        int alpha = 0, digi = 0;
        for(int i=0;i<a;i++){
            arr[i] = sc.next();
            if(arr[i].charAt(0)>= '0' && arr[i].charAt(0) <= '9') digi++;
            else alpha++;
        }
        
        System.out.println(digi +" \n"+alpha);
        }
        
        
    }
}
