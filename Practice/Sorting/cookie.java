package Practice.Sorting;

import java.util.Arrays;

public class cookie {
    public int findContentChildren(int[] g, int[] s) {
       int n = g.length;
       int m = s.length;
       int i = 0;
       int j = 0;
       int count = 0;
       Arrays.sort(s);
       Arrays.sort(g);
       while(i<n && j<m){
           if(s[j]>=g[i]){
               ++i;
               ++j;
               count++;
           }
           if(i<n && j<m && g[i]>s[j]){
               ++j;
           }
           
       } 
       return count;
    }
}

