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

// allways remember in java call by value concept is prasent not call by refrence but when we use Objects and arrays we can fell like that ok.
/*

public class Test {
    public static void changeArray(int[] arr) {
        System.out.print(arr[0]);   // पहले element को print करेगा (main से भेजे गए array का)
        arr[0] = 999;               // पहले element को 999 से replace कर देगा
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        changeArray(myArray);      // method call
        System.out.println(myArray[0]);  // updated value को print करेगा Output : 999
     }
}
*/

public class Test {
    public static void changeValue(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int a = 10;
        changeValue(a);
        System.out.println(a);  // Output: 10
    }
}
