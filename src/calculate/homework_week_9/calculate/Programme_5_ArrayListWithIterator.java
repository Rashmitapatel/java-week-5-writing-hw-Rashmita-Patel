package calculate.homework_week_9.calculate;

import java.util.ArrayList;
import java.util.ListIterator;

/*
Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grapes");
        fruitList.add("Mango");
        fruitList.add("Kiwi");
        fruitList.add("Orange");
        fruitList.add("Blackberry");
        fruitList.add("Strawberry");
        fruitList.add("Cherry");
        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next() + ", ");
        }
    }







}
