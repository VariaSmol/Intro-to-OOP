public class Lab6 {

    public static void main(String[] args) {

        double sum = 0;

        int[] arrayOfRandomNums = new int[10];

        for (int i = 0; i < 10; i++) {

            arrayOfRandomNums[i] = (int)
                    (Math.random() * 100);

            System.out.println(arrayOfRandomNums[i]
            );

            sum += arrayOfRandomNums[i];

        }

        System.out.println("Average is equal to " + sum / 10);

    }
}