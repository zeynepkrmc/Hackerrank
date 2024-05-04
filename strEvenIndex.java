package hackerrank;

import java.io.*;
import java.util.*;

public class strEvenIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        
        int n =  input.nextInt();
        input.nextLine();
        
        
          for(int i=0; i <n; i++){
              String s = input.nextLine();
              
            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();
          
        for(int j=0; j<s.length(); j++){
            if(j % 2 == 0){
                evenChars.append(s.charAt(j));
            }else{
                 oddChars.append(s.charAt(j));
            }
        }
       
       System.out.println(evenChars.toString() + " " + oddChars.toString());
    }
    input.close();    
    }
   
}