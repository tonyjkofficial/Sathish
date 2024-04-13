package poly_overloading;

public class A {
    public void onePiece(String s){
        System.out.println("Name:"+s);
    }
    public void onePiece(int n){
        System.out.println("mumber:"+n);
    }

    public static void main(String[] args) {
        A a = new A();
        a.onePiece("Luffy");
        a.onePiece(56);
    }
}
