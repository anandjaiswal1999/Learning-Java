package TrieImplementation;

public class TrieImpl {
    Node root;

    public TrieImpl() {
        root= new Node();
    }
    public void insert(String s){
        Node r=root;
        for(int i=0;i<s.length();i++){
            if(!r.contains(s.charAt(i))){
                r.put(s.charAt(i),new Node());
            }
            r=r.find(s.charAt(i));
        }
        r.setFlag(true);
    }
    public boolean search(String s) {
        Node r=root;
        for(int i=0;i<s.length();i++){
            if(!r.contains(s.charAt(i))){
                return false;
            }else{
                r=r.find(s.charAt(i));
            }
        }
        return r.isFlag();
    }

    public boolean startsWith(String s) {
        Node r=root;
        for(int i=0;i<s.length();i++){
            if(!r.contains(s.charAt(i))){
                return false;
            }else{
                r=r.find(s.charAt(i));
            }
        }
        return true;
    }
}
