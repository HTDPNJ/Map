import java.util.HashMap;

public class MyHashSet
{
    HashMap map;
    private static final Object PRESENT=new Object();
    public MyHashSet(){
        map=new HashMap();
    }
    public int size(){
        return map.size();
    }
    public void add(Object o){
        map.put(o,PRESENT);
    }
    public void remove(Object o){
        map.remove(o);
    }

    public static void main(String[] args)
    {
        MyHashSet myset=new MyHashSet();
        myset.add("aaa");
        System.out.println(myset.size());
        myset.remove("aaa");
        System.out.println(myset.size());
    }
}
