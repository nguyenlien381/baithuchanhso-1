class Person {
    protected String name;
	protected String sex;
public void intputPerson() {
    Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap Ten :");
		this.name = scanner.nextLine();
		System.out.println("Nhap gioi tinh");
		this.sex = scanner.nextLine();
}
public void showPerson() {
    System.out.println("Ten : " +this.name +" Gioi Tinh :" +this.sex+");
}
}


  