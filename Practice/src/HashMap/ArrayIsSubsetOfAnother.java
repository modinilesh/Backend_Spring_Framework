package HashMap;

import java.util.Arrays;

public class ArrayIsSubsetOfAnother {
	
	public String isSubset( long a1[], long a2[], long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        int i=0;
        int j=0;
        
        boolean flag = false;
        while(i<a1.length && j<a2.length){
            
            if(a1[i] == a2[j]){
                i++;
                j++;
                flag = true;
            }
            else{
                i++;
                flag = false;
            } 
        
        }
        if(flag) return "Yes";
            
        return "No";
    }

	public static void main(String[] args) {
		
		
		

	}

}
