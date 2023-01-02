package string_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_ReturnDuplicatedChars {

    /*
               input: inteerrrviiew
               output:  ier
        create method return duplicated unique value
     */


    //solution1
    public static String test(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency > 1 && !result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    //solution2
    public static String test2(String str) {
        List<String> list = new ArrayList<>();
        String[] arr = str.split("");
        Arrays.stream(arr).distinct().forEach(a -> {
            if (Arrays.stream(arr).filter(b -> b.equals(a)).count() > 1) {
                list.add(a);
            }
        });
        return list.toString();
    }

    public static void main(String[] args) {


        // Sorting array
        String str = String_ReturnDuplicatedChars.test("inteerrrviiew");
        System.out.println(str);

        int[] nums = {2, 4, 9, 6, 3, 1};

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i+1; j <nums.length; j++) {

                if (nums[i] > nums[j]){

                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(nums));
    }

}



