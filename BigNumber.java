public class BigNumber {

    public static int bigNumber() {
        int num = 0;
        for (int i = 10000; i > 1000; i--) {
            if (i % 10 == 0 && i % 13 == 0) {
                num = i;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.print("Biggest number: ");
        System.out.println(bigNumber());

    }

}