import java.util.LinkedList;
import java.util.List;

public class MyHashMap002
{
    LinkedList[] arr=new LinkedList[999];
    int size;
    public void put(Object key,Object value){
        MyEntry e=new MyEntry(key,value);
        int a=key.hashCode()%arr.length;
        if(arr[a]==null){
            LinkedList list=new LinkedList();
            list.add(e);
            arr[a]=list;
        }else{
            arr[a].add(e);
        }
    }
    public Object get(Object key){
        int a=key.hashCode()%arr.length;
        if(arr[a]!=null){
            LinkedList list=arr[a];
            for(int i=0;i<list.size();i++){
                MyEntry e=(MyEntry) list.get(i);
                if(e.key.equals(key)){
                    return e.value;
                }
            }
        }
        return null;
    }
}
