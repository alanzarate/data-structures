package u_dataStructures;

import u_dataStructures.DataStructures.MyLinkedList;
import u_dataStructures.DataStructures.MyQueue;
import u_dataStructures.DataStructures.MySortedSet;
import u_dataStructures.TestObjects.Person;
import u_dataStructures.TestObjects.Planet;

/**
 * Hello world!
 *
 */
public class App 
{
    static final Planet p1 = new Planet("earth", 4.5);
    static final Planet p2 = new Planet("mars", 5.2);
    static final Planet p3 = new Planet("venus", 6.3);
    static final Planet p4 = new Planet("jupyter", 7.4);
    static final Planet p5 = new Planet("uranus", 8.3);

    static final Person pe1 = new Person("The", "Arrive");
    static final Person pe2 = new Person("Dominic", "Joreto" );
    static final Person pe3 = new Person("White","Kambo" );
    static final Person pe4 = new Person("Emily", "Manuary");
    static final Person pe5 = new Person("Alan", "Zarate");
    static final Person pe6 = new Person("Lan","Bario");
    static final Person pe7 = new Person(null,  null);
    static final Person pe8 = new Person("LOLO", "Jarez");
    public static void main( String[] args )
    {
        
        testingLinkedList();
        testingSortedSet();
        testignQueue();

  
    }
    public static void testingLinkedList(){
        System.out.println(p1.compareTo(p2));
        System.out.println(p5.compareTo(p4));
        System.out.println(p3.compareTo(p3));
        System.out.println("++++++++++++++++++++++++");
        System.out.println(pe1.compareTo(pe2));
        System.out.println(pe2.compareTo(pe3));
        System.out.println(pe5.compareTo(pe4));
        System.out.println(pe5.compareTo(pe5));
       

        System.out.println(">>>>>>>>>>>>>>>>>>  Probando LinkedList >>>>>>>>>>>>>>>>>>>>>>>>>>");

        MyLinkedList<Person> linkedList = new MyLinkedList<>();
        linkedList.add(pe1);
        linkedList.add(pe2);
        linkedList.add(pe3);
        linkedList.add(pe4);
        linkedList.add(pe5);
        linkedList.add(pe4);
        linkedList.add(pe2);
        linkedList.add(pe6);
        linkedList.add(null);
        linkedList.add(pe7);
        linkedList.add(pe8);
        linkedList.print();
        System.out.println(linkedList.size());
        System.out.println("El objeto de pe7: tiene atributos nulos?"+pe7.hasNullAtributtes()+"\t"+pe7);
        System.out.println("____________Get __________");
        System.out.println("Primer elemento "+linkedList.get(0));
        System.out.println("Ultimo elemento "+linkedList.get(linkedList.size()-1));
        System.out.println("Elemento -1 "+ linkedList.get(-1));
        System.out.println(linkedList.get(linkedList.size()));

        System.out.println("______________Delete _______");
        linkedList.delete(0);
        linkedList.delete(9);
        System.out.println("Eliminados 0 y 9");
        linkedList.print();
        System.out.println(linkedList.size());
        linkedList.delete(pe5);
        System.out.println("Eliminado pe5");
        linkedList.print();
        System.out.println(linkedList.size());
        
        System.out.println("________Is empty _________");
        System.out.println(linkedList.isEmpty());
    }
    public static void testingSortedSet(){
        System.out.println("\n\n>>>>>>>>>>>>>>>>>>  Probando SortedSet >>>>>>>>>>>>>>>>>>>>>>>>>>");
 
        MySortedSet<Person> sortedSet = new MySortedSet<>();
        sortedSet.add(pe1);
        sortedSet.add(pe2);
        sortedSet.add(pe3);
        sortedSet.add(pe4);
        sortedSet.add(pe5);
        sortedSet.add(pe4);
        sortedSet.add(pe2);
        sortedSet.add(pe6);
        sortedSet.add(null);
        sortedSet.add(pe7);
        sortedSet.add(pe8);
        sortedSet.print();
        System.out.println("tamanio "+sortedSet.size());
        
        System.out.println("__________Get __________");
        System.out.println(sortedSet.get(0));
        System.out.println(sortedSet.get(sortedSet.size()-1));
        System.out.println(sortedSet.get(-1));
        System.out.println(sortedSet.get(sortedSet.size()));

        System.out.println("_________Delete _______");
        sortedSet.delete(0);
        sortedSet.delete(9);
        sortedSet.print();
        System.out.println(sortedSet.size());
        sortedSet.delete(pe5);
        sortedSet.print();
        System.out.println(sortedSet.size());
        
        System.out.println("__________Is empty _________");
        System.out.println(sortedSet.isEmpty());
        
    }
    public static void testignQueue(){
        System.out.println("\n\n>>>>>>>>>>>>>>>>>>  Probando Queue >>>>>>>>>>>>>>>>>>>>>>>>>>");

        MyQueue<Person> queue = new MyQueue<>();
        queue.add(pe1);
        queue.add(pe2);
        queue.add(pe3);
        queue.add(pe4);
        queue.add(pe5);
        queue.add(pe4);
        queue.add(pe2);
        queue.add(pe6);
        queue.add(null);
        queue.add(pe7);
        queue.add(pe8);
        

        //es mi caso, un mismo elemento no puede estar dos veces o mas en la misma fial
        queue.print();

        queue.getOut();
        queue.print();
        queue.getOut();
        queue.print();
        System.out.println(queue.peekFront());
        queue.print();
        System.out.println(queue.size());
        queue.add(pe1);
        queue.print();
        System.out.println(queue.size());  

    }
}
