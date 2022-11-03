package ch7_20191130;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MyArray implements Iterator {
    public static int MAX_LENGTH = 50000;
    private int[] base = new int[MAX_LENGTH];
    private int myArrayIndex = -1;
    private int nextIndex = 0;
    public boolean next(){
        if (this.size() >  nextIndex ){
            return true;
        }
        return false;
    }
    public int value(){
        return get(nextIndex++);
    }
    public void finish(){
          nextIndex = 0;
    }
    public void update(int index,int value){
        base[index] = value;        
    }
    public void add(int value){
        base[++myArrayIndex] = value;        
    }
    public int size(){
        return myArrayIndex +1;
    }
    public int get(int index){
        if (index > myArrayIndex || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return base[index];
    }
    
    public List<Integer> toList(Supplier<? extends List> sp){
         List<Integer> list = sp.get();
        for (int i =0;i < size();i++){
            list.add(get(i));
        }
         return list;
    }
    
    public void replaceAll(UnaryOperator<Integer> uo){
        for (int i =0 ; i< size(); i++){
            update(i,uo.apply(get(i)));
        }
    }
  
}
