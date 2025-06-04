class sortNegPos{
public static void main(String[] args){
      int[] num = {23,-7,12,-10,40,60};
      int sort = 0;
    
    for(int i = 0; i < num.length; i++){
        for(int j = i + 1; j < num.length; j++){
       if(num[i]> num[j]){
        int temp  = num[j];
          num[j]   = num[i];
            num[i] = temp;
          
}


}
}
   for(int sort : num){
    System.out.println(sort);
}
}

} 