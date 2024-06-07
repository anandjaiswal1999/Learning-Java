package DSU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DSU {
    List<Integer> parent =new ArrayList<>();
    List<Integer> rank =new ArrayList<>();
    List<Integer> size =new ArrayList<>();
    public DSU (int n){
        for(int i=0;i<=n;i++){
            parent.add(i);
            rank.add(0);
            rank.add(1);
        }
    }
    public int findParent(int node){
        if(node == parent.get(node)){
            return node;
        }
        int k=findParent(parent.get(node));
        parent.set(node,k);
        return k;
    }
    public void unionByRank(int u , int v){
        int parentA=findParent(u);
        int parentB=findParent(v);
        if(parentB==parentA)return;
        if(rank.get(parentA)<rank.get(parentB)){
            parent.set(parentA,parentB);
        } else if (rank.get(parentA)>rank.get(parentB)) {
            parent.set(parentB,parentA);
        }else{
            parent.set(parentB,parentA);
            rank.set(parentA,rank.get(parentA)+1);
        }
    }
    public void unionBySize(int u , int v){
        int parentA=findParent(u);
        int parentB=findParent(v);
        if(parentB==parentA)return;
        if(size.get(parentA)<size.get(parentB)){
            parent.set(parentA,parentB);
            size.set(parentB,size.get(parentB)+ size.get(parentA));

        } else{
            parent.set(parentB,parentA);
            size.set(parentA,size.get(parentB)+ size.get(parentA));
        }
    }

    public static void main(String[] args) {
        DSU dsu = new DSU(8);
        dsu.unionByRank(1,2);
        dsu.unionByRank(2,3);
        dsu.unionByRank(3,4);
        dsu.unionByRank(4,5);
        dsu.unionByRank(5,6);
        System.out.println(dsu.findParent(3));
        System.out.println(dsu.findParent(7));
        dsu.unionByRank(3,7);
        System.out.println(dsu.findParent(3));
        System.out.println(dsu.findParent(7));
        Map<String, Integer> mp = new HashMap<>();
//        if(mp.containsKey("ahs")){
//
//        }


    }

}
