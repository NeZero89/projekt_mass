import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
      //  task5();
      //  task6();
      //  task7();
      //  task8();
        // task9();
        // task10();

    }
public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arr=generateRandomArray();
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum=sum+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");

        }
    public static void task2() {
        System.out.println("Задача №2");
        int[] arr=generateRandomArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);

    }
    public static void task3() {
        System.out.println("Задача №3");
        int[] arr=generateRandomArray();
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum=sum+=arr[i];}
        float a = 0;
        a= sum/arr.length;


        System.out.println("Средняя сумма трат за месяц составила "+a+" рублей");

    }

    public static void task4() {
        System.out.println("Задача №4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

                for (int i = 0; i < reverseFullName.length-1; i = i++){
            System.out.println(reverseFullName[i]);
    }
        System.out.println(reverseFullName);
    }
    }