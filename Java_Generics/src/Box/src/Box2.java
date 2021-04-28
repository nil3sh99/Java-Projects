package Box.src;

/**
 * Generic class that defines a wrapper class around a single 
 * element of a generic type. 
 */

/**
 * Class Integer
	java.lang.Object
		java.lang.Number
			java.lang.Integer
			
 * @author Nilesh Aggarwal
 *
 * @param <T> this signifies that the Box2 extends all the type of super class Number 
 */

public class Box2<T extends Number> {

    private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
/**
 * Generic method that uses both the generic type of the class
 * it belongs to, as well as an additional generic type that is
 * bound to the Number type. 
 */
    public void inspect(){
        System.out.println("T: " + t.getClass().getName());
    }
    
    public <U> void inspectWithAdditionalType(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    } 
    
    public static void main(String[] args) {
        Box2<Integer> integerBox = new Box2<Integer>();
//        Box2 integerBox = new Box2();
        integerBox.set(new Integer(10));
        integerBox.inspect();
        integerBox.inspectWithAdditionalType("Hello world");
        Integer i = integerBox.get();
//        System.out.println(i);
    }
}
