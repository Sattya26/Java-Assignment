class Sattya {
    public static void main(String[] args) {
        int a = 20, b = 70, c = 54;
        if(a <= b && a <= c) {
            System.out.println(a + " is the smallest among all numbers");
        } else if(b <= a && b <= c) {
            System.out.println(b + " is the smallest among all numbers");
        } else {
            System.out.println(c + " is the smallest among all numbers");
        }
    }
}
o/p:
20 is the smallest among all numbers