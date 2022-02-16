import java.util.scanner;
public calss tinhtongcacsonguyen{
    public static void main(String[] args){
        int number, sum = 0;
        scanner scanner = new scanner(System.in);
        do {
            System.out.println("nhập vào số nguyên bất kỳ:");
            number = scanner.nextInt();
            sum += number;//sum = sum + number;
        } while (sum > 100);
        System.out.println("tổng các số nguyên vua nhập ="+sum);
        }
    }
}