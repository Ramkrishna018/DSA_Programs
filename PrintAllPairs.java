// Final Score: 95 / 100 
class PrintAllPairs{

    public static void main(String[] args){
      int[] num = {10,20,30}; 
     for(int i = 0; i < num.length ; i++){
            
           for(int j = 0; j < num.length; j++){
              
            System.out.print("(" + num[i] + " " + num[j] + ") = " + (num[i] + num[j]) + ", ");
      }
      System.out.println();
     
  }
 }
}