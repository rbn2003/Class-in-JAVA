    import java.util.ArrayList;
    public class ArrayListDemo {
        public static void main(String[] args) {
// ArrayList is a very useful class for collecting things in a list.
// It acts very much like an automatically-expanding array.
// Section 1: ArrayLists and type parameteres, basic usage
//
//
// Let's create an ArrayList that can only hold objects of type Foo (this includes subclasses of Foo, because
// any instance of a subclass of Foo "is-a" Foo also).
            ArrayList<Foo> arraylist = new ArrayList<Foo>(); // Note the new syntax: the "type parameter" inside the carats!
            arraylist.add(new Foo(10));
            arraylist.add(new Foo(50));
            arraylist.add(new Foo(13));
// At this point, arraylist holds three instances of Foo.
// It's much like an array, with the following contents:
// index 0 holds a Foo with myInt of 10.
// index 1 holds a Foo with myInt of 50.
// index 2 holds a Foo with myInt of 13.
// Notice that we never had to worry about the size of the ArrayList!
// Now, let's access some of the contents of our arraylist:
            Foo firstFoo = arraylist.get(0);
            Foo secondFoo = arraylist.get(1);
            System.out.println(firstFoo.getMyInt()); // will print 10
            System.out.println(secondFoo.getMyInt()); // will print 50
// Let's iterate over the contents of arraylist:
            for (int i = 0; i < arraylist.size(); i++) {
                Foo thisFoo = arraylist.get(i);
                System.out.println("The Foo at index " + i + " has a myInt of " +
                        thisFoo.getMyInt());
            }
// There are other useful instance methods in ArrayList. Check the Javadoc for details!
// Here's a demonstration of the method remove, which removes the element at the specified
// index. The elements at indices greater than the removed index will "fall down" one index.
            arraylist.remove(1); // Removes the Foo at index 1, with myInt of 50
// Let's prove it by iterating over arraylist again:
            System.out.println("After removing index 1: ");
            for (int i = 0; i < arraylist.size(); i++) {
                Foo thisFoo = arraylist.get(i);
                System.out.println("The Foo at index " + i + " has a myInt of " +
                        thisFoo.getMyInt());
            }
// Section 2: ArrayLists without type parameters (avoid this)
//
//
// Final note on type parameters, which are optional according to the Java
            specification:
            ArrayList arraylistWithoutTypeParameter = new ArrayList(); // This works, but is not recommended!
// This is equivalent to declaring an ArrayList with type parameter Object.
// You can put anything you want in it, but you'll very likely have to cast constantly!
// Here's an example of what that looks like:
            arraylistWithoutTypeParameter.add(new Foo(100));
// Now, let's access the Foo we just added, and call its getMyInt method:
            ((Foo) arraylistWithoutTypeParameter.get(0)).getMyInt(); // This is annoying! We have to cast.
// So, try to type parameterize your ArrayLists as specifically as you can, to avoid this issue.
// Section 3: Using ArrayLists to hold primitive types (with auto-boxing and -unboxing)
//
//
// The type parameter of ArrayList can only be a type of object.
// So, if we want to hold ints in an ArrayList, we CAN'T just do this:
// ArrayList<int> intList = new ArrayList<int>(); // does not work! Try it.
// Fortunately, there are Java classes we've discussed which act as wrapper classes
// for each of the primitive types. Integer is the wrapper class for int, Double
// is the wrapper class for double, etc.
// Also, as we've discussed, Java supports so-called "auto-boxing" and
            Object Integer;
            "auto-unboxing",
// which are ways in which we're allowed to be lazy about the difference between,
// say, actual ints, and instances of the class Integer.
// Remember, for example, that the following works:
                    Integer anInt = 42; // This is auto-boxing.
            int primitiveInt = anInt; // This is auto-unboxing.
// So, to create an ArrayList that can only hold integers, we'll give it
// the wrapper class as a type parameter:
            ArrayList<Integer> intArrayList = new ArrayList<Integer>();
// Now, we can use the magic of auto-boxing and auto-unboxing to easily// store an ArrayList of integers:
            intArrayList.add(100);
            intArrayList.add(200);
            intArrayList.add(500);
//// Let's iterate over it to show that it works as we expect:
//for (int i = 0; i < intArrayList.size(); i++) {
//System.out.println("intArrayList element " + i + ": " +
//intArrayList.get(i));
//}
//}
//}
        }