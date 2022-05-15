import java. util.Map; 
import java. util. LinkedHashMap; 
public class LinkedHash { 
public static void  main(String[] args) { 
LinkedHashMap<Integer, String> hm =  new LinkeMap<Integer,String>();
Hm.put(100,"Mo");
 hm. put (101, "Dia"); 
hm. put (102, "Chat"); 
for(Map. Entry<lnteger, String> m: hm. entrySet())
System.out.println(m.getKey()+"  "m.getVaIue()); 

System.out.print1n("Before invoking remove method: "hm);
Hm.remove(101);
System.out.println( "After invoking remove method: "+hm);
}
}

