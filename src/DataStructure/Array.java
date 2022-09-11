package DataStructure;

public class Array <T> {

    

    public T get(int index) {
        return datas[index];
    }

    public void set(T data,int index) {
        datas[index] = data;
    }

    private T datas[];
    int length;
}
