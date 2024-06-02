package TrieImplementation;

public class main {
    public static void main(String[] args) {
        TrieImpl trie=new TrieImpl();
        trie.insert("apple");
        boolean isApplePresent = trie.startsWith("b");
        System.out.println(isApplePresent);
    }
}
