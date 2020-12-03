package DS;

public class ArrayList {
    private static final int SIZE_FACTOR = 5;

    private Object data[];

    private int index;
    private int size;

    public ArrayList(){
        this.data = new Object[SIZE_FACTOR];
        this.size = SIZE_FACTOR;
    }

    public void add (Object obj){
        if(this.index == this.size-1) increaseSizeAndReallocate();
        data[index] = obj;
        this.index++;
    }

    private void increaseSizeAndReallocate() {
        this.size += SIZE_FACTOR;
        
        Object newData[] = new Object[size];
        for(int i = 0; i<data.length; i++) newData[i] = this.data[i];
        this.data = newData;
    }

    public Object get(int i){
        return this.data[i];
    }

    public void remove(int i){
        for(int x = 0; x<data.length-1; x++) data[x] = data[x+1];
        this.index--;
    }
}
