// {1,4,9,8,11,20,3,8} Sum of two keys = 16

  class SumOfTowKeys{
 public static void main(String [] args){

// Initialize array 
 int[] arr = {1,4,9,8,11,20,3,8};
  // Complete length
    int n = arr.length;
  // Loops
 
  for(int i = 0; i < n ; i++){
    for(int j = i+1; j < n; j++){
       if(arr[i]+arr[j]==16){
      System.out.println(" Success: " + arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));

}
}
}
}
} 