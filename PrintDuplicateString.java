class PrintDuplicateString{
public static void main(String[] args){
 String[] name ={"Rishi","Ram","Ronak","Rahul","Jhanvi","Shivani","Shivani","Shivam","Rahul"};
      
 System.out.println("Duplicate names (only once):");

      for(int i = 0; i < name.length;i++){
         boolean isDuplicate = false;

    // Step 1: check future duplicates
 for(int j = i + 1; j < name.length; j++){
     if(name[i].equals(name[j])){
       isDuplicate = true;
         break;
} 
} 
       if(isDuplicate){
         boolean alreadyPrinted = false;
   
// Step 2: check past duplicates
 
        for(int k = 0;k < i;k++){
      if(name[i].equals(name[k])){
          alreadyPrinted = true;
          break;
}
         
}
    
      if(!alreadyPrinted){
        System.out.println(name[i]);
}
                  

}
}
}
}