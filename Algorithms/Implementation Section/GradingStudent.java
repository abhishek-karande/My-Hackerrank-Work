import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudent {

    static int[] solve(int[] grades, int n){
        
        
        int i=0;
        while(i<n){
            if(grades[i]>=38){
               int diff=grades[i]%5;
                if(diff>=3){
                    diff=5-diff;
                    grades[i]=grades[i]+diff;
                }
                i++;
            }
            else{
                i++;
            }
        }
            
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades,n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
