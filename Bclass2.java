class a {
    int a;
    String name;

    a() {
        a = 0;
        name = null;
    }

    void show() {
        System.out.println(a + " " + name);
    }
}
// i have followed camel case

public class Bclass2 {
    public static void main(String[] args) {
        a c = new a();
        c.show();
    }

}
