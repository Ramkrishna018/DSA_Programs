
class PrintZerosAndOnce{
public static void main(String[] args){
   int[] num = {0,0,0,1,1,1,1,0,0,1,0,0,0,0,0,0,1,1};
    int countZeros = 0;    
     for(int i = 0; i < num.length;i++){
     if(num[i]==0){
       countZeros++;
   }
}
    for(int j = 0;j < num.length;j++){
          if(j < countZeros){
           num[j] = 0;
   }else{
     num[j] = 1;
}
  }
  for(int val : num){
   System.out.print(val+" ");    
}    
 }
}



