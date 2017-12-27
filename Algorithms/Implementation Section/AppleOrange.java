import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int aCount=0,oCount=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt()+a;
            if(apple[apple_i]>=s && apple[apple_i]<=t){
                aCount++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt()+b;
            if(orange[orange_i]>=s && orange[orange_i]<=t){
                oCount++;
            }
        }
        
    System.out.println(aCount+"\n"+oCount);
    }
    
}
