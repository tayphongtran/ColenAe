package com.company;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("co gi day");
        myList.add("co gi day1");
        myList.add("co gi day2");
        myList.add("co gi day3");
        myList.add("co gi day4");
        myList.add("co gi day5");
//        System.out.println(myList.get(1));
        System.out.println(myList.getSize());
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(" ..........   ");
        myList.add(3,"co khong");
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
