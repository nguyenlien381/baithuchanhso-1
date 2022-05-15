import java .util.LinkedHashMap; 
import java.util. Set; 

public class LinkedHashMapExamp1e1 { 
public static void main (String args[]) { 
//init linkedHashMap 
LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
// add elements to linkedHashMap 
linkedHashMap. put (1, '"Java"); 
linkedHashMap. put(3, "C++"); 
linkedHashMap. put(2, "PHP"); 
linkedHashMap. put (4, "Python") ; 
// show linkedHashMap before remove 
System.out.println("After remove: ") ; 
//show hasdMap
Show(linkeHashMap);
}
// show hashMap 
show(1inkedHashMap); 
}
//show HashMap 
public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
Set<Integer> keySet = linkedHashMap.keySet();
For (Integer key : keySet) {
       System.out.println(key + " " + linkedHashMap.get(key));
}
}
}



