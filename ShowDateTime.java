import java.util.Date;              // जरूरी import
import java.sql.Timestamp;
 
class ShowDateTime{
public static void main(String[] args){
   Date da = new Date();
   Timestamp ts = new Timestamp(da.getTime());
   System.out.println(ts);
}
}