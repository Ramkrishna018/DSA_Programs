class Reverse{
  String org = "Ramkrishna";
   String rev = "";
public static void main(String[] args){
           Reverse reverse = new Reverse();

       for(int i = reverse.org.length()-1; i >=0;i--){

          reverse.rev = reverse.rev + reverse.org.charAt(i);
}
System.out.println(reverse.rev);
}
}