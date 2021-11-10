import java.util.AbstractList;

public class MyArrayList <T> extends AbstractList<T> {

    private T[] data = (T[])new Object[3];
    private int numElements = 0;

    //this method will double the size of data
    //it will copy all the elements over to the new space.
    private void resize (){
        //1. Make a larger array
        T[] largerData =(T[])new Object[data.length * 2];

        //2. Copy over old data
        for(int x = 0; x < data.length; x++){
            largerData[x] = data [x];
        }

        //3. Change the reference
        data = largerData;
    }

    public boolean add(T element){

        //verify enough space
        if(numElements == data.length){
            //if not enough space
            resize();
        }
        //insert the elements
        data[numElements] = element;
        //keep track of the size.
        numElements++;

        return true; //true = list changed, false = no change (ArrayList will always change)
    }

    @Override
    public T get(int index) {
        return data[index];
    }

    @Override
    public int size() {
        return numElements;
    }
}
