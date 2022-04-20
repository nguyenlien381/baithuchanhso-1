class OnlinefStudent extends Student{
	protected String Quequan;
	protected String Namsinh;
	public void intPutOnlineStudent(){
			Scanner input = new Scanner(System.in);
		System.out.println("Nhap que quan");
		this.Quequan = input.nextLine();
		System.out.println("Nhap nam sinh");
		this.namsinh = input.nextFloat();
	}
	public void showOfflineStudent(){
		System.out.println("Que quan : " +this.Quequan +" Nam sinh " + this.namsinh);
	}
}