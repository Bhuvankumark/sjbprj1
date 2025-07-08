package dsa.mca.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class DemoDSA {

    public static void main(String[] args) {

        ArrayList<Integer> n= new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(3);
        n.add(2, 400); 
        System.out.println("ArrayList : " +n);

        LinkedList<Integer> m = new LinkedList<>();
        m.add(100);
        m.addLast(200);
        m.addFirst(67); 
        System.out.println("LinkedList : " +m);
        
        HashSet<Integer> h=new HashSet<>();
        h.add(200);
        h.add(500);
        h.add(400);
        h.add(200);
        System.out.println("HashSet : " +h);
        
        LinkedHashSet<Integer> l=new LinkedHashSet<>();        
        l.add(23);
        l.add(58);
        l.add(49);
        l.add(23);
        System.out.println("LinkedHashSet : " +l);
        
        TreeSet<Integer> t=new TreeSet<>();
        t.add(23);
        t.add(58);
        t.add(49);
        t.add(23);
        System.out.println("TreeSet : " + t);
        
        HashMap<String, Integer> d=new HashMap<>();
        d.put("CPU", 100);
        d.put("RAM", 101);
        d.put("KEYBOARD", 102);
        d.put("CPU", 103);
        d.put("DESTOP", 104);
        d.put("RAM", 107);
        d.put("KEYBOARD", 100);
        d.put("CPU", 105);
        System.out.println("HashMap : " + d);
        
        LinkedHashMap<String, Integer> lh=new LinkedHashMap<>();
        lh.put("CPU", 100);
        lh.put("RAM", 101);
        lh.put("KEYBOARD", 102);
        lh.put("CPU", 103);
        lh.put("DESTOP", 104);
        lh.put("RAM", 107);
        lh.put("KEYBOARD", 100);
        lh.put("CPU", 105);
        System.out.println("LinkedHashMap : " + lh);
        
		}
        
    }

