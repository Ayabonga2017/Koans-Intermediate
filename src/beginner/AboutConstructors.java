package beginner;


import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutConstructors {

   public class A {
        String someString = "a";

        public A() {
            someString += "x";
        }

    }

    public class B extends A {
        public B() {
            someString += "g";
        }

    }

    @Koan
    public void simpleConstructorOrder() {
        assertEquals(new B().someString, "axg");
    }

    public class Aa {
        String someString = "a";

        public Aa() {
            someString += "x";
        }

        public Aa(String s) {
            someString += s;
        }
    }

    public class Bb extends Aa {
        public Bb() {
            super("Boo");
            someString += "g";
        }

    }

    @Koan
    public void complexConstructorOrder() {
        assertEquals(new Bb().someString, "aBoog");
    }

}
