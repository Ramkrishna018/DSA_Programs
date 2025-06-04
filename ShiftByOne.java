class ShiftByOne{
 public static void main(String[] args){
/*   
 int[] num = {1,2,3,4,5};
      int last = num[num.length-1]; 
      for(int i = num.length-1; i > 0;i--){
            num[i] = num[i-1];  // there in first time => num[4] = num[4-1(3)] =>  Number four index  = third indexplace value go inside  
}  
       num[0] = last;
   for(int lastNum : num){
    System.out.print(lastNum);
 }
*/

int[] num = {1,2,3,4,5};
      int[] last = num[num.length-1]; 
      for(int i = num.length-1; i > 0;i--){
            num[i] = num[i-1];  // there in first time => num[4] = num[4-1(3)] =>  Number four index  = third indexplace value go inside  
}  
       num[0] = last;
   for(int lastNum : num){
    System.out.print(lastNum);
 }
}
}