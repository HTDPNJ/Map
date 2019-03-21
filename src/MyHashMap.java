public class MyHashMap
{
   MyEntry[] arr=new MyEntry[990];
   int size;
   public void put(Object key,Object value){
       MyEntry e=new MyEntry(key,value);
       for(int i=0;i<size;i++){
           if(arr[i].key.equals(key)){
               arr[i].value=value;
               return;
           }

       }
       arr[size++]=e;
   }
   public Object get(Object key){
       for(int i=0;i<size;i++){
           if(arr[i].key.equals(key))
               return arr[i].value;
       }
       return null;
   }

    public static void main(String[] args)
    {
        MyHashMap m=new MyHashMap();
        m.put(1,"abc");
        m.put(2,"cd");
        System.out.println(m.get(1));
    }
    public boolean containKey(Object key){
       for(int i=0;i<size;i++){
           if(arr[i].key.equals(key))
               return true;
       }
       return false;
    }
}
class MyEntry{
            Object key;
            Object value;
    public MyEntry()
    {
    }
    public MyEntry(Object key, Object value)
    {
        this.key = key;
        this.value = value;
    }
}
