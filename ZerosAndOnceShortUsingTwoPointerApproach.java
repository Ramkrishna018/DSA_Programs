class ZerosAndOnceShortUsingTwoPointerApproach{

public static void main(String[] args){
    
int[] num = {0,0,0,0,1,1,1,0,0,0,1,0,1,0};
   int left = 0;
   int right = num.length-1;

  while(left<right){
       if(num[left] == 0){
       left++;
   } else if(num[right] == 1){
       right--;
   } else{
       int temp = num[left];
       num[left] = num[right];
       num[right] = temp;
   }

}
    for(int sort : num){
       System.out.print(sort+" ");
  }
 } 
}

/*
README

 Step 1:
arr[left] = arr[0] = 0 → so left++

Now: left = 1, right = 7

 Step 2:
arr[left] = 1, arr[right] = 1

So arr[right] == 1 → right--

Now: left = 1, right = 6

 Step 3:
arr[left] = 1, arr[right] = 0

So swap

java
Copy
Edit
temp = arr[left]; // 1
arr[left] = arr[right]; // 0
arr[right] = temp; // 1
Now: array = {0, 0, 1, 0, 1, 0, 1, 1}

left++, right--

Now: left = 2, right = 5

 Step 4:
arr[left] = 1, arr[right] = 0

Again swap

After swap: {0, 0, 0, 0, 1, 1, 1, 1}

left = 3, right = 4

 Step 5:
arr[left] = 0 → left++

left = 4, right = 4

 Condition false: left < right → 4 < 4 ❌ → loop ends
*/