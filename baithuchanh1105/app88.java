public static void main(String[] args) { 
HashMap<String, String>hashMapCity  = new  HashMap<>();
hashMapCity.put("QNg", "Quang Ngai"); 
hashMapCity.put("QN",  "Quang Nam"); 
// trong truong hop nay ta thay
// key cua Quång Nam va Quång Ninh 
// deu la QN nen chuong trinh se them  
// vao trong hashMapCity value dung sau (tuc la Quang Ninh) 
hashMapCity.put("QN "Quang Ninh"); 
hashMapCity.put("HCM", "Thanh pho Ho Chi Minh"); 

System.out.println("danh sach cac thanh pho trong hashMapCity: ");
Set<Map.Entry<String,String>>setCity = hashMapCity.entrySet(); 
System.out.println( setCity); 
// lay thanh pho co ma la QNg
// va hien thi ten thanh pho
System.out.println( "QNg: " + hashMapCity.get("NT"));
// lay thanh pho co ma la NT 
// vi trong hashMapCity khong co thanh pho nao co ma la NT 
// nen se hien thi gia tri null 
System.out.println( "NT: " +hashMapCity.get("NT");
// De kiem tra xem 1 value co trong Hashmap hay khong
// chung ta se dung phuong thuc containsVa1ue() 
if (hashmapCity.containsVa1ue( "Thanh pho Ho Chi Minh")) { 
   System.out.println("co thanh pho Ho Chi Minh trong hashMapCity");
}
}

