import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1 и 2");
//      Первый массив
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(Arrays.toString(array));
//      Второй массив
        double [] array2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(array2));
//        Третий массив
        String [] array3 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(array3));
        }
    public static void task2() {
        System.out.println();
        System.out.println("Задача 3");
//      Первый массив
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[2] + ", " + array[1] + ", " + array[0]);
//      Второй массив
        double [] array2 = {1.57, 7.654, 9.986};
        System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);
//        Третий массив
        String [] array3 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 5; i > 0; i = i - 1) {
            System.out.print(array3[i] + ", ");
        }
        System.out.print(array3[0]);
    }
    public static void task3(){
        System.out.println();
        System.out.println("Задача 4");
        int [] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                array[i] ++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}