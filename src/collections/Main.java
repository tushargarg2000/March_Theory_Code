package collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Op1
        Collection<Integer> list =new HashSet<>();

        Map<Song,String> map = new HashMap<>();

        //Op2
        List<Double> arrList = new ArrayList<>();


        Collections.sort(arrList);

        arrList.add(1);

        int[] arr = new int[10];



        HashSet<Integer> hashSet = new HashSet<Integer>();

        LinkedList<Integer> li = new LinkedList<>();


        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Stack<Integer> stack = new Stack<>();

        Iterator iterator = li.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator it2 = pq.iterator();

        while (it2.hasNext()){
            System.out.println(it2.next());
        }


        for(Integer no : pq ){
            System.out.println(no);
        }

        for(Integer no : pq){
            System.out.println(no);
        }


        for(Integer no : stack)
        {
            System.out.println(no);
        }

        arrList.add(1);

        hashSet.add(1);

        li.add(1);

        pq.add(1);

        arrList.size();
        hashSet.size();
        li.size();
        pq.size();

        stack.add(1);

        stack.size();

        arrList.isEmpty();

        hashSet.isEmpty();

        stack.isEmpty();

        stack.remove(1);

        arrList.get(0);

        stack.get(1);

//        hashSet.get(1);






    }
}
