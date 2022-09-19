public class Lab9_2 {

    public static void main(String[] args) {

        System.out.println("i
                        | m(i) ");

                System.out.println("---|--------");
        for (int i = 1; i <= 20; i++ ) {

            if (i < 10) System.out.print(i + "
                    | ");

            else System.out.print(i + " | ");

            System.out.printf("%.4f", m(i)
            );

            System.out.println();
        }

    }

    public static double m(int n)
    {

        double m = 0;

        for(double i=1;i<= n;i++ )
        {

            m += (i/(i+1)
            );

        }

        return m;

    }
}