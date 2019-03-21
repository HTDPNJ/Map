import java.util.*;

public class Test02
{
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        Iterator iter=set.iterator();
        while(iter.hasNext()){
            Map.Entry e= (Map.Entry) iter.next();
            System.out.println(e.getKey()+"--"+e.getValue());
        }

    }
}
