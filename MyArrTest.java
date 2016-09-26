package lesson8.hw;

public class MyArrTest {
    public static void main(String[] args) {
        int[] arr = {25, 35, 48, 88, 225, 8741, -25, -33, 11, 6984, 11, 0, 254, 88};
        long[] arr1 = {252544785655425L, 3452364325632456L, 3456456456L, -225484848485262L, 6541631236513516350L};
        String[] arr2 = {" x", "DD", "Gv", "FG", "gg", "rr", "FF", "ww", "THUFJDS", "WWWWWWW"};

        Integer[] arrInt = new Integer[arr.length];
        Long[] arrL = new Long[arr1.length];
        int cnt = 0;
        for (int i: arr) {
            arrInt[cnt++] = i;
        }
        cnt=0;
        for (long i: arr1) {
            arrL[cnt++] = i;
        }

        MyArr<Integer> arrInteger = new MyArr<>(arrInt);
        MyArr<Long> arrLong = new MyArr<>(arrL);
        MyArr<String> arrString = new MyArr<>(arr2);

        System.out.print("My Integer array (" + arrInteger.getSize() + " elements): ");
        System.out.print(arrInteger.toString());
        System.out.println();

        System.out.print("My Long array (" + arrLong.getSize() + " elements): ");
        System.out.print(arrLong.toString());
        System.out.println();

        System.out.print("My String array (" + arrString.getSize() + " elements): ");
        System.out.print(arrString.toString());
    }
}


class MyArr<E> {
    private E[] arr;
    private final int size;

    public MyArr(E[] arr) {
        this.arr = arr;
        size = arr.length;
    }

    public E getElement(int index) {
        return arr[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i<size; i++) {
                sb.append(this.getElement(i) + ", ");
            }
            sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);
            sb.append("]");
        return sb.toString();
        }
}