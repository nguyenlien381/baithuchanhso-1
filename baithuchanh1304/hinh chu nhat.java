package shapes;

 import java.util.scanner;

 public class HinhChuNhat extends HinhHoc {

     public float dai;
     public float rong;

     //Constructor
     public HinhChuNhat() {
         ten = "Hinh Chu Nhat";
     }
     public void nhapChieuDai() {
         System.out.println("Chieu Dai = ");
         Scanner scanner = new Scanner(System.in);
         Dai = scanner.nextFloat();
     }
     public void nhapChieuRong() {
         System.out.println("Chieu Rong = ");
         Scanner scanner = new Scanner(System.in);
         Rong = scanner.nextFloat();
     }
     public void tinhChuVi() {
         ChuVi = 2 * ( dai + rong);
     }
     public void tinhDienTich() {
         DienTich = dai * rong;
     }
 }