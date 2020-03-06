package Interest.collections;
import java.util.Arrays;
public class CustomList<Cc>{
private int size=0;//size of list
private static int init_capacity=10;
private Object[] li;
public CustomList()
{
  li=new Object[init_capacity];
}
public void adding(Cc val)
{
   if(size==li.length)
   {
     increaseCapacity();
   }
   li[size++]=val;
}
public void increaseCapacity()
{
int newlislen=li.length*2;
li=Arrays.copyOf(li, newlislen);
}
public Cc getting(int i)
{
     if(i>=size ||i<0)
     {
        throw new IndexOutOfBoundsException("Index error");
    }
     return (Cc) li[i];
 }
public Cc remove(int i)
{
 if(i>=size ||i<0)
 {
     throw new IndexOutOfBoundsException("Index error");
 }
 Object item=li[i];
 int num=li.length-(i+1);
 System.arraycopy(li, i+1, li, i, num);
 size--;
 return (Cc) item;

}
public String toString()
  {
       StringBuilder sbi = new StringBuilder();
       sbi.append('[');
       for(int i = 0; i < size ;i++) {
           sbi.append(li[i].toString());
           if(i<size-1){
               sbi.append(",");
           }
       }
       sbi.append(']');
       return sbi.toString();
  }

}