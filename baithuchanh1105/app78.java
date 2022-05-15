public static void main(String[] args) { 
// khai bao 1 HashMap ten hashMap1 
// moi phan tu trong hashMap1 bao gom 2 phan 
// key (Integer) va value (Float) 
HashMap<Integer, Float> hashMap1 = new HashMap<>(); 
// khai bao 1 HashMap ten hashMap2 
// moi phan tu trong hashMap2 bao gom 2 phan
// key (String) va value (String) 
// co kich thuoc khoi tao = 10 
HashMap<String, String> hashMap2 = new  HashMap<>(10);
// khai bao 1 HashMap co kich thuoc khoi tao = 4 
// va yeu to tai  = 0.75f (mac dinh) 
// chi tiet ve kich thuoc khoi tao va yeu to tai
// cac ban xem lai bai HashSet 
HashMap<Doub1e, Double> hashMap3  = new HashMap<>(4, 0.75f);
// khai bao 1 HashMap duoc tao thanh tu  1 Collection khac 
HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap<>());
}
