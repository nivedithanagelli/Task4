import java.io.*;
import java.util.*;

public class SparseArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String s = scan.nextLine();
        
        String [] strs = new String[n];
        for(int i = 0; i < n; i++)
        {
            strs[i] = scan.nextLine().trim();
        }
        
        int q = scan.nextInt();
        s = scan.nextLine();
        String [] queries = new String[q];
        
        for(int i = 0; i < q; i++)
        {
            queries[i] = scan.nextLine().trim();
        }
        
        for(int j = 0; j < q; j++)
        {
            int count = 0;
            int strLen = queries[j].length();
            for(int i = 0; i < n; i++)
            {
                if(strLen == strs[i].length() && strs[i].equals(queries[j]))
                    count++;
            }
            
            System.out.println(count);
        }
    }
}
