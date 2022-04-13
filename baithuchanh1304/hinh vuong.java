package shapes;

 import java.util.scanner;

 public class HinhVuong extends HinhChuNhat {

     //Constructor
     public HinhVuong() {
         ten = "Hinh Vuong";
     }
     public void nhapCanh(){
         System.out.println("Canh = ");
         Scanner scanner = new Scanner(System.in);
         Dai = Rong = scanner.nextFloat();
     }
 }