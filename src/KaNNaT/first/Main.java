package KaNNaT.first;

public class Main {

    public static void main(String[] args) {

        // Task # 1
        // # 1.1

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        // # 1.2

        double[] beanch = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < beanch.length; i++) {
            System.out.println(beanch[i]);
        }

        System.out.println();

        // # 1.3

        int[] box = new int[]{13, 22, 31, 14, 43};
        for (int i = 0; i < box.length; i++) {
            System.out.println(box[i]);
        }
        System.out.println();

        // Task # 2
        // # 2.1

        int[] giv = new int[3];
        giv[0] = 1;
        giv[1] = 2;
        giv[2] = 3;
        for (int i = 0; i < giv.length - 1; i++) {
            System.out.print(giv[i] + ", ");
        }
        System.out.print(giv[giv.length - 1]);


        System.out.println();

        // # 2.2

        double[] div = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < div.length - 1; i++) {
            System.out.print(div[i] + ", ");
        }
        System.out.print(div[div.length - 1]);

        System.out.println();

        // # 2.3

        int[] biv = new int[]{13, 22, 31, 14, 43};
        for (int i = 0; i < biv.length - 1; i++) {
            System.out.print(biv[i] + ", ");
        }
        System.out.print(biv[biv.length - 1]);

        System.out.println();
        System.out.println();

        // Task # 3
        // # 3.1
        int[] vig = new int[3];
        vig[0] = 1;
        vig[1] = 2;
        vig[2] = 3;
        for (int i = vig.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(vig[i]);
            } else {
                System.out.print(vig[i] + ", ");
            }
        }

        System.out.println();

        // # 3.2
        double[] vid = new double[]{1.57, 7.654, 9.986};
        for (int i = vid.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(vid[i]);
            } else {
                System.out.print(vid[i] + ", ");
            }
        }

        System.out.println();

        // # 3.3
        int[] vib = new int[]{13, 22, 31, 14, 43};
        for (int i = vib.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(vib[i]);
            } else {
                System.out.print(vib[i] + ", ");
            }
        }

        System.out.println();
        System.out.println();

        // Task # 4
        int[] socks = {1, 2, 3};
        for (int i = 0; i < socks.length; i++) {
            if (socks[i] % 2 != 0) {
                socks[i] = socks[i] + 1;
            }
            if (i != socks.length - 1) {
                System.out.print(socks[i] + ", ");
            } else {
                System.out.println(socks[i]);
            }

        }
    }
}

