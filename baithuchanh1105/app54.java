import java.util.HashSet;
import java.util.Scanner; 

public class Hash { 
public static void main(String[] args) { 
String name; 
HashSet<String> hashSetString = new HashSet<>();
Scanner scanner = new Scanner(system.in); 
//them phan tu vao hashSetString 
hashsetstring. add ("wilson"); 
hashSetString. add("Nike"); 
hashsetstring. add("Volvo") ; 
hashSetString. add("Kia") ; 
hashSetString. add("Lenovo") ; 
hashsetstring. add ("Lenovo") ; 
// hien thi cac phan tu trong hashSetString 
System.out.println("cac phan tu trong hashSetString:");
System.out.println(hashSetString) ; 
System.out.println("nhap phantu can xoa: ");
name = scanner.nextLine(); 
// neu phan tu can xoa co ton tai hashSetstring thi thong bao xoa se thanh cong 
// va hien thi cac phan tu con lai nguoc lai thong bao xoa se khong thanh cong
if (hashSetString.contains(name)) {
hashSetString.remove(name); 
System.out.println("xoa thanh cong!");
System.out.println("cac phan tu con lai trong hashString:");
System.out.printl( hashsetstring);
} else {
     System.out.println("xoa khong thanh cong!");
}
}
}
