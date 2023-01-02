package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of the List of integers
     */

    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 0, 0, 0, 3, 2, 4, 5, 9, 4);
        //List_MoveAllZerosToTheEnd.moveZerosToTheEnd(list);

        int zeroCount = 0;
        for (int i = 0; i < list.size(); i++) {
             if (list.get(i) == 0){
                 zeroCount++;
             }
        }
        System.out.println(zeroCount);




    }


}
