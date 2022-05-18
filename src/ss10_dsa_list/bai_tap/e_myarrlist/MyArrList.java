package ss10_dsa_list.bai_tap.e_myarrlist;

import ss10_dsa_list.thuc_hanh.myarraylist.MyArrayList;

import java.util.Arrays;

public class MyArrList<E> {
    public int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyArrList() {

    }

    public MyArrList(int capacity) {
        if (capacity > 0) {
            System.out.println("Khởi tạo thành công với kích thước là : " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Lỗi tham số truyền vào");
            throw new IllegalArgumentException("capacity : " + capacity);
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khởi tạo thành công với kích thước là : " + elements.length);
        } else {
            throw new IllegalArgumentException("minCapacity : " + minCapacity);
        }
    }

    public void add(E e, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Lỗi index : " + index);
        } else if (elements.length == index + 1) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            size++;
            elements[index] = e;
        } else {
            if (size == elements.length) {
                ensureCapacity(1);
            }
            System.arraycopy(elements, index, elements, index + 1,
                    size - index);
            elements[index] = e;
            size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = size;
        return v;
    }

    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

}
