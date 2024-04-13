package poly_override;

public class B extends A {
    public void onePiece2(){
        System.out.println("69");
    }

    public static void main(String[] args) {
        B b = new B();
        b.onePiece();
        b.onePiece2();
    }

}
