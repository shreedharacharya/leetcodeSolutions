package Test;


import java.util.*;

public class RemoveDub {
    LinkedList<String> ll = new LinkedList<>();
    LinkedHashMap<Integer, Integer> jj = new LinkedHashMap<>();
//    TreeSet<Integer> tt = new TreeSet<>();
    public static void main(String[] args) {
       RemoveDub rd= new RemoveDub();
       rd.addInList();
//       Set<String> set = rd.removeDuplicates();
//        for (String item : set) {
//            System.out.println(item);
//        }

        StringBuilder sb = new StringBuilder();

    }

    private void addInList() {
        HashSet<Integer> set = new HashSet<>();
        jj.put(19,1);
        jj.put(2,2);
        jj.put(19,3);
        for(int v: jj.values()){
            System.out.println(v);
        }
        ll.add("ram");
        ll.add("shyam");
        ll.add("ram");
        ll.add("gita");
    }

    private Set<String> removeDuplicates() {

        TreeSet<String> treeSet = new TreeSet<>();
        for(int i=0; i<ll.size();i++){
            treeSet.add(ll.get(i));
        }
        return treeSet;

    }


}
