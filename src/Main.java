import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(32);
        arrayList.add(324);
        arrayList.add(345);
        arrayList.add(53);
        arrayList.add(23);


        changeIndex(arrayList,1,4);
        System.out.println("Старый массив" + arrayList);
        System.out.println("Новый массив" + changeIndex(arrayList,4,5));
    }

    public static ArrayList<Integer> changeIndex(ArrayList<Integer> array, int indexOne, int indexTwo) {
        int indBufOne = 1;
        int indBufTwo = 1;
        indBufOne = array.get(indexOne);
        indBufTwo = array.get(indexTwo);
        array.set(indexOne,indBufTwo);
        array.set(indexTwo,indBufOne);
        return array;

    }
}