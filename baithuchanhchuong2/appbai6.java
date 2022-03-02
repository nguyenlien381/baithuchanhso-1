public static void main(String[] args) {
        int number, temp = 1;
        long giaiThua = 1;
         
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.println("Nhập vào 1 số bất kỳ: ");
            number = scanner.nextInt();
        } while ((number <= 0) || (number > 5));
        
        System.out.println(number + "! = " + giaiThua);
    }
 
}