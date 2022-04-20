class Customer extends Person{
	protected String makh;
	protected String Ten;
	protected String email;
	public void intPutCustomer(){
			Scanner input = new Scanner(System.in);
		System.out.println("Nhap ma khach hang");
		this.makh = input.nextLine();
		System.out.println("Nhap Ten");
		this.Ten = input.nextFloat();
		System.out.println("Nhap email");
		this.email = input.nextLine();
	}
	public void showCustomer(){
		System.out.println("Ma khach hang : " +this.makh +" Ten " + this.Ten);
	}
}
	