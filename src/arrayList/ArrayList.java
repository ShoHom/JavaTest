package arrayList;

import java.util.Arrays;

public class ArrayList<E> {
    //定义数组的默认容量为10
    private static final int DEFAULT_CAPACITY = 10;
    //定义默认空数组
    private static final Object[] EMPTY_ELEMENTDATA = {};
    //定义空数组，用于数组判空或者置空
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    //定义缓存数组，并不可序列化
    transient Object[] elementData;
    //数组长度
    private int size;
    //定义最大数组长度
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    //获取数组长度的方法
    public int size() {
        return size;
    }

    //----------------------扩容-----------------------

    //构造器构造默认数组长度为空的数组
    public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    //数组添加元素方法
    public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }

    //计算数组装纳元素所需的最小容量
    private static int calculateCapacity(Object[] elementData, int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    //确认内部容量
    private void ensureCapacityInternal(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
    }

    //确认容量是否合法
    private void ensureExplicitCapacity(int minCapacity) {
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    //扩容方法
    private void grow(int minCapacity) {
        //将缓存数组容量赋值为旧容量
        int oldCapacity = elementData.length;
        //将新数组容量赋值为旧容量的1.5倍 通过位运算符来计算的原因是：提高运算效率
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        //这里对容量是否超过数组最大容量值进行了判断
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        //对数组元素进行复制，容量为newCapacity
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

    //--------------------缩容-----------------------

    //移除元素方法
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = elementData(index);
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        elementData[--size] = null;
        trimToSize();
        return oldValue;
    }

    //越界判断
    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    E elementData(int index) {
        return (E) elementData[index];
    }

    //缩容方法
    public void trimToSize() {
        // 判断当前是否需要缩容
        if (size < elementData.length) {
            // 如果size为0，直接给elementData赋值内置的空数组
            // 不为0则创建一个size长度的新数组
            elementData = (size == 0)
                    ? EMPTY_ELEMENTDATA
                    : Arrays.copyOf(elementData, size);
        }
    }

    //---------------------获取指定下标元素-------------------
    public E get(int index) {
        rangeCheck(index);
        return elementData(index);
    }
}
