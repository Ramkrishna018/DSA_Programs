class MOL{
     public void m1(){
     System.out.println("First m1()");
}

 public void m1(int a){
     System.out.println("Second m1()");
}

public void m1(int a, int b){
     System.out.println("Third m1()");
}
 public static void main(String[] args){
   MOL mol = new MOL();
     mol.m1();
     mol.m1(5);
     mol.m1(5,10);   
}
}