package upmc;

import java.util.Arrays;

public class ArrayList<T> {

    private Object[] array;
    private int size;

    public ArrayList() {
        this.array = new Object[10];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(T e) {

        if (this.size == this.array.length - 1) {
            this.array = Arrays.copyOf(this.array, this.size * 2);
        }
        this.array[this.size] = e;
        this.size++;
    }

    public T get(int i) {
        return (T) this.array[i];
    }

    public int indexOf(Object o) {

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == o) { // test de pointeur, si les 2 pointent vers le même espace mémoire dans le tas, on rentre dans le if
                return i;
            }
        }
        return -1;
    }

    public T remove(int i) {
        T element = this.get(i);
        if (i != this.array.length - 1) {
            for (int n = i; n < this.array.length - 1; n++) {
                T nextOne = this.get(n + 1);
                T currentOne = this.get(n);
                this.array[n + 1] = currentOne;
                this.array[n] = nextOne;
            }
        }
        this.array = Arrays.copyOfRange(this.array, 0, this.array.length - 2);
        this.size--;
        return (T) element;
    }

    public boolean remove(T e) {
        for (int i = 0; i < this.array.length - 1; i++) {
            if(this.array[i] == e){
                this.remove(i);
                this.size--;
                return true;
            }
        }
        return false;
    }
}

//public void add (T e) { }
//public T get ( int i) { }
//public int indexOf ( Object o) {}
//public E remove ( int index ) {}
//public boolean remove ( Object o) { }
