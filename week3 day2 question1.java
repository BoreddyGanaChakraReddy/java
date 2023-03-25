import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
    Scanner obj = new Scanner(System.in);
    String e = obj.next();
    String f = obj.next();

    int[] eCount = new int[26];
    int[] fCount = new int[26];

    for (int i = 0; i < e.length(); i++) {
      eCount[e.charAt(i) - 'a']++;
      fCount[f.charAt(i) - 'a']++;
    }

    Arrays.sort(eCount);
    Arrays.sort(fCount);

    for (int i = 0; i < 26; i++)
    {
      if (eCount[i] !=fCount[i])
      {
        System.out.println("Not Similar");
        return;
      }
    }

    System.out.println("Similar");
  }

}
