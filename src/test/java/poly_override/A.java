package poly_override;

public class A {
    public void onePiece(){
        System.out.println("luffy");
    }
    public void onePiece2(){
        System.out.println("56");
    }

    public static void main(String[] args) {
        A a = new A();
        a.onePiece();
        a.onePiece2();
    }

}
