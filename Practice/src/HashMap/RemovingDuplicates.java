package HashMap;

import java.util.HashSet;

public class RemovingDuplicates {
	
	//method 1 ---> O(N)
	public static char[] remove(char[] arr) {
		String str = "";
		for(char c : arr) {
			if(str.indexOf(c) == -1) {
				str += c;
			}
		}
		char[] ans = str.toCharArray();
		return ans;
	}
	
	//method 2 ---> using hashmap
	public static char[] remove1(char[] arr) {
		HashSet<Character> set = new HashSet<>();
		for(char c : arr) {
			set.add(c);
		}
		char[] ans = new char[set.size()];
		int i=0;
		for(char c : set) {
			ans[i++] = c;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		char[] c = {'N', 'e', 'e', 'l', 'e', 's', 'h'};
		System.out.println(remove(c));

	}

}
