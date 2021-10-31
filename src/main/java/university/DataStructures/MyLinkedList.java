package university.DataStructures;
import university.Interfaces.Comparable;
import university.Nodes.MyGenericNode;

public class MyLinkedList <T extends Comparable> {
    private MyGenericNode<T> first;
    private MyGenericNode<T> last;
    private int size;

    public MyLinkedList(){
        this.last = this.first = null;
        this.size = 0;
    }

    public void add(T data){
        if(data!=null){
            MyGenericNode<T> newNode = new MyGenericNode<>(data);
            if(first == null){
                first = last = newNode;
                size++;
            }else{
                if(last.getData().compareTo(data) < 1){
                    last.setNext(newNode);
                    last = newNode;
                }else{
                    MyGenericNode<T> previous = null;
                    for( MyGenericNode<T> current = first;
                        current != null;
                        current = current.getNext()){
                            if(current.getData().compareTo(data) >= 1){
                                if(previous == null){
                                    newNode.setNext(first);
                                    first = newNode;
                                }else{
                                    previous.setNext(newNode);
                                    newNode.setNext(current);
                                }
                                size++;
                                break;
                            }
                            previous = current;
                        }
                }
            }
        }
    }
    public T get(int index){
        T aux = null;
        if(index<size){
            for(MyGenericNode<T> current = first ; index>0; index--){
                aux = current.getData();
                current = current.getNext();
            }
        }else{
            System.out.println("Hola te olvidaste que no puedes hacer eso tamaño = "+size);
        }
        return aux;
    }
    public void print(){
        String output ="";
        for(MyGenericNode<T> current = first;
            current != null;
            current = current.getNext()){
                output += current.getData()+" -> ";
        }
        System.out.println(output + " ]:");
    }
    public void delete(T d){
        MyGenericNode<T> aux = null;
        if(d != null){
            for(MyGenericNode)
        }
    }

    
}
