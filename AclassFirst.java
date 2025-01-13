class Demo {
    int a;
    String b;

    Demo() {
        a = 06;
        b = "rahul";
    }

    void show() // void show is a method
    {
        System.out.println(a + " " + b);
    }
}

class AclassFirst {
    public static void main(String[] args) {

        Demo r = new Demo();
        r.show();
    }
}
