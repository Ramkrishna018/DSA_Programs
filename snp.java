//sORTING_nEGETIVE-pOSITIVE
class SortNegPos {
    public static void main(String[] args) {
        int[] num = {23, -7, 12, -10, 40, 60};

        // Sorting in ascending order
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }

        // Printing sorted array
        for (int value : num) {
            System.out.print(value + " ");
        }
    }
}



/*

Loop Start:
i = 0:
j = 1 → 23 > -7 → swap → [-7, 23, 12, -10, 40, 60]

j = 2 → -7 > 12 → 

j = 3 → -7 > -10 → swap → [-10, 23, 12, -7, 40, 60]

j = 4 → -10 > 40 → 

j = 5 → -10 > 60 → 

i = 1:
j = 2 → 23 > 12 → swap → [-10, 12, 23, -7, 40, 60]

j = 3 → 12 > -7 → swap → [-10, -7, 23, 12, 40, 60]
j = 4 → -7 > 40 → 

j = 5 → -7 > 60 → 

i = 2:
j = 3 → 23 > 12 → swap → [-10, -7, 12, 23, 40, 60]

j = 4 → 12 > 40 → ❌

j = 5 → 12 > 60 → 

i = 3:
j = 4 → 23 > 40 → 

j = 5 → 23 > 60 → 

i = 4:
j = 5 → 40 > 60 → 

 Final Sorted Array:
css
Copy
Edit
[-10, -7, 12, 23, 40, 60]
*/

