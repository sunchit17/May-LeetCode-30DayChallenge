/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:
Input: s: "cbaebabacd" p: "abc"
Output:
[0, 6]

Example 2:
Input: s: "abab" p: "ab"
Output:
[0, 1, 2]
*/


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int n = s.length();
        int m = p.length();
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        if(m>n)
            return list;
        
        int[] s_array = new int[26];
        int[] p_array = new int[26];
        
        for (int i = 0; i < m; i++) {
			s_array[p.charAt(i) - 'a']++;
			if (i < m - 1) {
				p_array[s.charAt(i) - 'a']++;
				count++;
			}
		}
        
        for (int j = count; j < n; j++) {
			p_array[s.charAt(j) - 'a']++;
			if (match(s_array,p_array))
				list.add(j - (m - 1));
			p_array[s.charAt(j - (m - 1)) - 'a']--;
		}
        return list;
    }
    
    
    public static boolean match(int[] a, int[] b) {
		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] != b[j])
				return false;
			i++;
			j++;
		}
		return true;
	}
}
