public class Tasks2 {
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }

    public static int sumDouble(int a, int b) {
        return (a == b) ? 2 * (a + b) : a + b;
    }
}

    /*ИЛИ ПОНЯТНЕЕ
   // public int sumDouble(int a, int b) {
       if (a==b) {
            return 2*(a+b);
        } else {
            return (a+b);
        }
   } */