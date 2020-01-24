package Homework3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void swap(ArrayList arrayList, int i, int j){
        Object temp = arrayList.get(i);
        arrayList.set(i, arrayList.get(j));
        arrayList.set(j, temp);
    }


    public static void main(String[] args) {
        //first
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("orange");
        arrayList.add("white");
        arrayList.add("blue");
        arrayList.add("red");
        System.out.println(arrayList);


        System.out.println();
        //second
        for(String color: arrayList){
            System.out.println(color);
        }


        System.out.println();
        //third
        arrayList.add(0, "yellow");
        System.out.println(arrayList);


        System.out.println();
        //fourth
        System.out.println(arrayList.get(5));


        System.out.println();
        //fifth
        arrayList.set(0, "black");
        System.out.println(arrayList);


        System.out.println();
        //sixth
        arrayList.remove(2);
        System.out.println(arrayList);


        System.out.println();
        //seventh
        if(arrayList.contains("red")){
            System.out.println(arrayList.get(arrayList.indexOf("red")));
        }
        else
            System.out.println("no such item");


        System.out.println();
        //eight
        Comparator<? super String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.compareTo(o2) > 0) return 1;
                else if(o1.compareTo(o2) < 0) return -1;
                return 0;
            }
        };
        arrayList.sort(comparator);
        System.out.println(arrayList);


        System.out.println();
        //ninth
        ArrayList<String> newArrayList = (ArrayList<String>) arrayList.clone();
        //System.out.println(arrayList);
        arrayList.set(0, "white");
        System.out.println(arrayList);
        System.out.println(newArrayList);


        System.out.println();
        //tenth
        System.out.println(arrayList);
        int n = arrayList.size();
        for(int i = 0; i < n/2; i++){
            String temp = arrayList.get(i);
            arrayList.set(i,arrayList.get(n-1-i));
            arrayList.set(n-1-i, temp);
        }
        System.out.println(arrayList);


        System.out.println();
        //eleventh
        System.out.println(arrayList.equals(newArrayList));
        newArrayList = (ArrayList<String>)arrayList.clone();
        System.out.println(arrayList.equals(newArrayList));


        System.out.println();
        //twelfth
        System.out.println(arrayList);
        swap(arrayList, 0, 1);
        System.out.println(arrayList);


        System.out.println();
        //thirtieth
        ArrayList<String> joinedArrayList = new ArrayList<>();
        for(String i: arrayList) {
            joinedArrayList.add(i);
        }
        for(String i: newArrayList) {
            joinedArrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println(newArrayList);
        System.out.println(joinedArrayList);


        System.out.println();
        //fortieth
        System.out.println("I have used Clone to safely COPY the ArrayList, so if you excuse me, I won't repeat myself :)");


        System.out.println();
        //fiftieth
        arrayList.clear();
        System.out.println(arrayList);


        System.out.println();
        //sixtieth
        System.out.println(arrayList.isEmpty());


        System.out.println();
        //seventieth

        newArrayList.set(1, "specified element");
        System.out.println(newArrayList);
    }
}
