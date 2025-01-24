class One {
    int x;

    One(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        Two obj = new Two(5);
        System.out.println("The value of x is: " + obj.x);
    }
}
