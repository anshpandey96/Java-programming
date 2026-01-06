class Mahesh {
    int x;     // instance (object) member variable
    int y;     // instance (object) member variable

    void fun1() {   // instance method
        System.out.println("fun1");
    }

    void fun2() {   // instance method
        System.out.println("fun2");
    }
}

class Object1 {
    public static void main(String[] args) {
        Mahesh m1 = new Mahesh();   // ✅ fixed case
        Mahesh m2 = new Mahesh();   // ✅ fixed case

        m1.x = 5;
        m2.y = 10;

        m1.fun1();   // optional: show output
        m2.fun2();   // optional: show output
    }
}