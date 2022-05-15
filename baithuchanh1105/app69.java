import java.util.TreeSet; 
Import java.util.Set; 
Import java.util.Scanner; 
Public class TreeSetExp1 { 
public static void main(String[]  args) { 
int number; 
treeSet<Integer> treeSetInteger = new TreeSet<>();
Scanner scanner = new Scanner(System.in);
 
// them cac phan tu vao treeSetInteger 
treeSetInteger.add(0); 
treeSetInteger.add(3); 
treeSetInteger.add(1); 
treeSetInteger.add(4); 
treeSetInteger.add(2); 
treeSetInteger.add(8); 
// hien thi cac phan tu  trong treeSetInteger 
System.out.println("Cac phan tu trong treeSetInteger: ");
System.out.println(treeSetInteger); 
System.out.println("Nhap phan tu can them: "); 
number = scanner.nextlnt(); 
// them mot phan tu moi vao treeSetInteger tu ban phim
// neu phan tu do da ton tai thi thong bao da ton tai nguoc lai thi them vao
if (!treeSetInteger.contains(number)) { 
treeSetInteger.add (number); 
System.out.println("Them thanh cong!" );
System.out.println("ca phan tu trong treeSetInteger sau khi them: ");
System.out.printin(treesetlnteger); 
}else { 
System.out.println("phan tu" + number + "da ton tai!");
}
}
}

