package lesson8.hw;
import java.util.*;
public class ConvertArrInList {
    public static void main(String[] args) {

        int[] arr = {25, 35, 48, 88, 225, 8741, -25, -33, 11, 6984, 11, 0, 254, 88};
        String[] arrStr = {"a", "B", "c", "D", "e", "F", "g!"};
        ArrayList<Integer> list;
        ArrayList<String> listStr;

        LinkedList<Integer> listL;
        LinkedList<String> listStrL;

        list = (ArrayList) convertArrayInList(arr, "array");
        listStr = (ArrayList) convertArrayInList(arrStr, "array");

        listL = (LinkedList) convertArrayInList(arr, "linked");
        listStrL = (LinkedList) convertArrayInList(arrStr, "linked");


        System.out.println("Int array: " + Arrays.toString(arr));
        System.out.println("ArrayList<Integer> : " + list.toString());
        System.out.println("LinkedList<Integer> : " + listL.toString());

        System.out.println();

        System.out.println("String array: " + Arrays.toString(arrStr));
        System.out.println("ArrayList<String> : " + listStr.toString());
        System.out.println("LinkedList<String> : " + listStrL.toString());

    }


    public static List convertArrayInList(int [] arr, String typeList) {
        List<Integer> list;
        if(typeList.equals("array")) {
            list = new ArrayList<>(arr.length);
        } else if (typeList.equals("linked")) {
            list = new LinkedList<>();
        }   else {
            list = new ArrayList<>();
        }

        for(int i: arr) {
            list.add(i);
        }
        return list;
    }

    public static List convertArrayInList(String [] arr, String typeList) {
        List<String> list;
        if(typeList.equals("array")) {
            list = new ArrayList<>(arr.length);
        } else if (typeList.equals("linked")) {
            list = new LinkedList<>();
        }   else {
            list = new ArrayList<>();
        }

        for(String i: arr) {
            list.add(i);
        }
        return list;
    }
}