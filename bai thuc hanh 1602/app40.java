package cau_truc_switch_case;
 
import java.util.Scanner;
 
public class switchdemo  HienThiNgayCuaTuan
 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ngay = scan.nextint();
        switch(ngay){
           case 1:System.out.println("thu 2");
           break;
           case 2:System.out.println("thu 3");
           break;
           case 3:System.out.println("thu 4");
           break;
           case 4:System.out.println("thu 5");
           break;
           case 5:System.out.println("thu 6");
           break;
           case 6:System.out.println("thu 7");
           break;
           case 7:System.out.println("chu nhat");
           break;
           default:System.out.println("so ngay trong tuan sai");
        }}}

    

        