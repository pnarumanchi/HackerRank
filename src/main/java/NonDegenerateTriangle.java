import java.util.Arrays;

public class NonDegenerateTriangle {

    public static void main(String[] args) {

        int [] input1= {1,3,6,2,6};
        int [] input2 = {8,10,3,2,4};
        int [] input3 = {7,3,7,9,10};

      //  String results [] = solution(input1, input2, input3);

      /*  for(String s:results)
            System.out.println(s.toString());*/
    }

    String[] solution(int[] arr1, int[] arr2, int[] arr3) {
        System.out.println("Size of first array" + arr1.length);
        System.out.println("Size of second array" + arr2.length);
        System.out.println("Size of third array" + arr3.length);
        String[] result = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int[] arr = new int[3];
            arr[0] = arr1[i];
            arr[1] = arr2[i];
            arr[2] = arr3[i];

            Arrays.sort(arr);

            for (int j = 0; j < arr.length-2; j++) {
                if (arr[j] + arr[j + 1] > arr[j + 2])
                    result[i] = "Yes";
                else
                    result[i] = "No";
            }
        }
        return result;
    }
}
