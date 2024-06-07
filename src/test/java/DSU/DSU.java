package DSU;

import java.util.ArrayList;
import java.util.List;

public class DSU {
    List<Integer> parent =new ArrayList<>();
    List<Integer> rank =new ArrayList<>();
    public DSU (int n){
        for(int i=0;i<=n;i++){
            parent.add(i);
            rank.add(0);
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
        if(rank.get(parentA)<rank.get(parentB)){
            parent.set(parentA,parentB);
        } else if (rank.get(parentA)>rank.get(parentB)) {
            parent.set(parentB,parentA);
        }else{
            parent.set(parentB,parentA);
            rank.set(parentA,rank.get(parentA)+1);
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


    }

}
