public class Pattern3 {
    public static void main(String[] args) {
        int space = 5 - 1;
        int star = 1;
        for (int i = 1; i <= 5; i++) {
            //  System.out.println(space + "," + star);
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");

            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }

            space--;
            star++;
            System.out.println();

        }

    }
}