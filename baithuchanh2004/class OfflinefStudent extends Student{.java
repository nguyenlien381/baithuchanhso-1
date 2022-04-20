class OfflinefStudent extends Student{
	protected String adrress;
	protected String ngaysinh;
	public void intPutOfflineStudent(){
			Scanner input = new Scanner(System.in);
		System.out.println("Nhap dia chi");
		this.adrress = input.nextLine();
		System.out.println("Nhap ngay sinh");
		this.ngaysinh = input.nextFloat();
	}
	public void showOfflineStudent(){
		System.out.println("Dia chi : " +this.adrress +" Ngay sinh " + this.ngaysinh);
	}
}