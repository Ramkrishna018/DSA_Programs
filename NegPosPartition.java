class NegPosPartition {
    public static void main(String[] args) {
        int[] num = {23, -7, 12, -10, 40, 60};

        int left = 0, right = num.length - 1;

        while (left < right) {
           
        // left when we continues get negetives
            while (left < right && num[left] < 0) left++;

            // right take thme back continues we get positive
            while (left < right && num[right] >= 0) right--;

            // left positive and right negative swap
            if (left < right) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
            }
        }

        for (int x : num) System.out.print(x + " ");
        
    }
}
