class FindUniqueElement {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 1, 2, 3, 4, 7, 6};

        System.out.println("Unique elements are:");

        for (int i = 0; i < num.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < num.length; j++) {
                // अगर same element मिला और position भी same नहीं है
                if (num[i] == num[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(num[i]);
            }
        }
    }
}
