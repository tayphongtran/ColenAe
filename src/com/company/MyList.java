package com.company;

import java.util.Arrays;

public class MyList<E> {
    private int Size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }
    public void  add(int index, Object element){
//        if (index >= Size || index < 0){
//
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
//        } else {
//            if (Size == elements.length){
//                ensureCapa();
//            }
//           elements[index] = elements;
//        }
        if (Size == elements.length){
            ensureCapa();
        }else {

            if (index >= 0 && index< Size){
                for ( ; index < Size   ; index++ ) {

                    Object  temp = elements[index];
                    elements[index] = element;
                    element = elements[index + 1];
                    elements[index + 1] = temp;
                }


            }

        }
    }

    public void add(E e){
        if (Size == elements.length){
            ensureCapa();
        }
        elements[Size++] = e;
    }
    public void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public E  get(int i){
       if (i >= Size || i < 0){
           throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
       }
       return (E) elements[i];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "Size=" + Size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
