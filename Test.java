/*
class GenBits{
public static void main(String[] args){
         int a = 5;    // 0101
        int b = 1;    

        int result = a & b;  // 0001 => 1
        System.out.println("a & b = " + result);

}

}

*/

public class Test {
    public static void changeArray(int[] arr) {
        arr[0] = 999;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        changeArray(myArray);
        System.out.println(myArray[0]);  // Output: 999
    }
}
