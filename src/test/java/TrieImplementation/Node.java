package TrieImplementation;

import java.util.ArrayList;
import java.util.List;

public class Node {
    Node [] nodes= new Node[26];

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    boolean flag;
    boolean contains(char c){
        return nodes[c - 'a'] != null;
    }
    void put(char c, Node r){
        nodes[c-'a']=r;
    }

    public Node find(char c) {
        return nodes[c-'a'];
    }
}
