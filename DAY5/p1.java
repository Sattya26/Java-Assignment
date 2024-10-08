class Sattya{
    public static void main(String[] args) {
        int a = 17, b = 28, c = 40;
        if(a >= b && a >= c) {
            System.out.println(a + " is the largest among all numbers");
        } else if(b >= a && b >= c) {
            System.out.println(b + " is the largest among all numbers");
        } else {
            System.out.println(c + " is the largest among all numbers");
        }
    }
}

o/p:
40 is the largest among all numbers