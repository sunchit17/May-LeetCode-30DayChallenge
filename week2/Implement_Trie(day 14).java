/*
Implement a trie with insert, search, and startsWith methods.

Example:

Trie trie = new Trie();

trie.insert("apple");
trie.search("apple");   // returns true
trie.search("app");     // returns false
trie.startsWith("app"); // returns true
trie.insert("app");   
trie.search("app");     // returns true

Note:
- You may assume that all inputs are consist of lowercase letters a-z.
- All inputs are guaranteed to be non-empty strings.
*/


class Trie {

    /** Initialize your data structure here. */
    HashSet <String> set; //using a hash set 
    public Trie() {
        set = new HashSet();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        set.add(word); 
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return set.contains(word);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for(String s:set) // check if any string has the prefix
        {
            if(s.startsWith(prefix)==true)
            {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
