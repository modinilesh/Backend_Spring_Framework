package HashMap;

import java.util.HashSet;
public class FirstRepeatingCharacter {
	
	public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return i;
            else set.add(i);
        }

        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
