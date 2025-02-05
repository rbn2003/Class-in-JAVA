// A demonstration class that acts as a wrapper for an int.
public class Foo {
    private int myInt = 0;
    public Foo(int myInt) {
        this.myInt = myInt;
    }
    public int getMyInt() {
        return this.myInt;
    }
    public void setMyInt(int newInt) {
        this.myInt = newInt;
    }
}
