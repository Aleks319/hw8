package lesson8.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateListTest {
    public static void main(String[] args) {
        String[] arr1 = {" x", "DD", "Gv", "FG", "gg", "rr", "FF", "ww"};
        String[] arr2 = {" x", "DD", "Gv", "FG", "gg", "rr", "FF", "ww", "THUFJDS", "WWWWWWW"};


        System.out.println("String 1:");
        System.out.println(Arrays.toString(arr1));
        try{
            System.out.println("ModifyList1: " + createModifyList(arr1));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("String 2:");
        System.out.println(Arrays.toString(arr2));
        try{
            System.out.println("ModifyList2: " + createModifyList(arr2));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

    public static <E> ArrayList<E> createModifyList(E [] arr) throws MyException{
        ArrayList<E> list;
        if(arr.length != 10) {
            throw new MyException("Input array must contain 10 elements!");
        }
        list = new ArrayList<>();
        for(E i: arr) {
            list.add(i);
        }

        list.subList(0,2).clear();
        list.remove(list.size()-1);

        return list;
    }

}
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "MyException: " + super.getMessage();
    }
}