 class MOR{
   public void m1(){
   System.out.println("MOR FROM MOR1");
}
}

class MOR2 extends MOR{
   public void m1(){
     super.m1();
   System.out.println("MOR FROM MOR2");
}
}

class MOR3 extends MOR2{
   public void m1(){
    super.m1();
   System.out.println("MOR FROM MOR3");
}

public static void main(String[] args){
      MOR3 mor = new MOR3(); 
           mor.m1();
}
}