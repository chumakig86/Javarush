package com.javarush.task.task20.task2028;
import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
/*
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    private ArrayList<Node<String>> heap = new ArrayList<>();
    private int heapSize = 0;

    public CustomTree()
    {
        add("0");
    }

    private class Coursor implements Iterator
    {

        int cursor = 1;
        int lastRet = -1;
        int expectedModCount = modCount;

        public Coursor()
        {
            while (cursor < heap.size())
                if (heap.get(cursor) == null)
                    cursor++;
                else break;
        }

        @Override
        public boolean hasNext()
        {
            return cursor != heap.size() && (heapSize > 1);
        }

        @Override
        public Object next()
        {
            checkForComodification();
            try
            {
                int i = cursor;
                String next = heap.get(i).item;
                lastRet = i;
                cursor++;
                while (cursor < heap.size() && heap.get(cursor) == null)
                    cursor++;
                return next;
            }
            catch (IndexOutOfBoundsException e)
            {
                checkForComodification();
                throw new NoSuchElementException();
            }
            catch (NullPointerException e)
            {
                System.out.println("NullPointerException:");
                System.out.println("Cursor = " + cursor);
                for (int i = 0; i < heap.size(); i++)
                {
                    System.out.println(heap.get(i));
                }
                throw e;
            }
        }

        @Override
        public void remove()
        {
            if (lastRet < 0)
                throw new IllegalStateException();
            checkForComodification();

            try
            {
                CustomTree.this.remove(heap.get(lastRet).item);
                if (lastRet == cursor)
                {
                    while (cursor < heap.size() || heap.get(cursor) == null)
                        cursor++;
                }
                lastRet = -1;
                expectedModCount = modCount;
            }
            catch (IndexOutOfBoundsException e)
            {
                throw new ConcurrentModificationException();
            }
        }

        final void checkForComodification()
        {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public Iterator<String> iterator()
    {
        return new Coursor();
    }

    private static class Node<E> implements Serializable
    {
        E item;
        int arrayListIndex;
        Node<E> nextL;
        Node<E> nextR;
        Node<E> parent;

        Node(Node<E> nextL, Node<E> nextR, E element, Node<E> parent)
        {
            this.item = element;
            this.nextL = nextL;
            this.nextR = nextR;
            this.parent = parent;
        }

        @Override
        public String toString()
        {
            return "Value = " + item + ", heapIndex = " + arrayListIndex + ";";
        }
    }

    private Node<String> lastParent()
    {
        for (int i = (heap.size() - 1) / 2; i < heap.size(); i++)
        {
            if (heap.get(i) != null && (heap.get(i).nextL == null || heap.get(i).nextR == null))
                return heap.get(i);
        }
        return null;
    }

    @Override
    public boolean remove(Object o)
    {
        boolean result = false;
        for (int i = 0; i < heap.size(); i++)
        {
            if (heap.get(i) != null && heap.get(i).item.equals((String) o))
            {
                result = removeWithChilds((Node<String>) heap.get(i));
                break;
            }
        }

        for (int i = heap.size() - 1; i > 0; i--)
        {
            if (heap.get(i) == null)
                heap.remove(i);
            else break;
        }
        return result;
    }

    public boolean removeWithChilds(Node<String> node)
    {
        if (node.nextR != null)
            removeWithChilds(node.nextR);
        if (node.nextL != null)
            removeWithChilds(node.nextL);
        if (node.arrayListIndex == heap.size() - 1)
            heap.remove(heap.size() - 1);
        Node<String> parent = node.parent;

        if (parent != null)
        {
            if (parent.nextL == node)
            {
                parent.nextL = parent.nextR;
                parent.nextR = null;
            }
            if (parent.nextR == node)
                parent.nextR = null;
        }
        if (node.arrayListIndex < heap.size())
            heap.set(node.arrayListIndex, null);
        node = null;
        heapSize--;
        return true;
    }

    @Override
    public boolean add(String s)
    {
        final Node<String> p = lastParent();
        final Node<String> newNode = new Node<>(null, null, s, p);
        if (p != null)
            if (p.nextL == null) p.nextL = newNode;
            else p.nextR = newNode;
        newNode.arrayListIndex = heap.size();
        heap.add(newNode);
        heapSize++;
        return true;
    }

    @Override
    public int size()
    {
        if (heapSize == 0)
            return 0;
        else return heapSize - 1;
    }

    public String getParent(String value)
    {
        String parent = null;
        for (int i = 0; i < heap.size(); i++)
        {
            if (heap.get(i) != null && heap.get(i).item.equals(value))
            {
                parent = heap.get(i).parent.item;
            }
        }
        if (parent != null && parent.equals("0")) parent = null;
        return parent;
    }

    @Override
    public ListIterator<String> listIterator(int index)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<String> listIterator()
    {
        return super.listIterator();
    }

    @Override
    public String get(int index)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear()
    {
        Iterator<String> iterator = this.iterator();
        while (iterator.hasNext())
        {
            remove(iterator.next());
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this.size() != ((CustomTree) o).size())
            return false;
        Iterator<String> iterator1 = this.iterator();
        Iterator<String> iterator2 = ((CustomTree) o).iterator();
        while (iterator1.hasNext())
        {
            if (!iterator1.next().equals(iterator2.next()))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty()
    {
        return (this.size() == 0);
    }

    @Override
    public boolean contains(Object o)
    {
        for (int i = 0; i < heap.size(); i++)
            if (heap.get(i) != null && heap.get(i).item.equals((String) o))
            {
                return true;
            }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        return super.retainAll(c);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

    @Override
    public CustomTree clone() throws CloneNotSupportedException
    {
        try
        {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream oIS = new ObjectInputStream(in);
            return (CustomTree) oIS.readObject();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException
    {
        List<String> list = new CustomTree();
        for (int i = 1; i < 16; i++)
        {
            list.add(String.valueOf(i));
        }
        System.out.println("Expected 3, actual is " + ((CustomTree) list).getParent("8"));
        list.remove("5");
        System.out.println("Expected null, actual is " + ((CustomTree) list).getParent("11"));
    }
}