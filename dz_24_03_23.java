import java.util.Arrays;
import java.util.Scanner;

public class dz_24_03_23 {
    public static void main(String[] args) {

        System.out.println(">>> Task #1 ");
        int[] sup_number = new int[1000];
        for (int i = 0; i < sup_number.length; i++) {
            int n = i + 1;
            sup_number[i] = n * n * n;
        }
        //System.out.println(Arrays.toString(sup_number)); //вывод массива
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = num1.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = num2.nextInt();

        System.out.println(sup_number[number1 - 1]);
        System.out.println(sup_number[number2 - 1]);


        System.out.println(">>> Task #2 ");
        Scanner count_n = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        int n = count_n.nextInt();

        int[] n_number = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner numbers = new Scanner(System.in);
            int number_i = numbers.nextInt();
            n_number[i] = number_i;
        }

        Scanner div = new Scanner(System.in);
        System.out.print("Введите множитель: ");
        int n_div = div.nextInt();

        for (int i = 0; i < n_number.length; i++) {
            System.out.println(n_number[i] * n_div);
        }

        System.out.println(">>> Task #3 ");

        while (true) {
            System.out.println("Выберите номер операции: ");
            System.out.println("[1].Сумма");
            System.out.println("[2].Разность");
            System.out.println("[3].Произведение");
            System.out.println("[4].Частное");
            System.out.println("[5].Сравнение");
            System.out.println("[6].Выход");

            Scanner operationt_n = new Scanner(System.in);
            System.out.print("Ввод: ");
            int operation = operationt_n.nextInt();
            if (operation == 6) {
                break;
            }
            else if (operation >= 1 && operation <= 5) {
                Scanner int1 = new Scanner(System.in);
                System.out.print("Введите первое число: ");
                int number_1 = int1.nextInt();
                Scanner int2 = new Scanner(System.in);
                System.out.print("Введите второе число: ");
                int number_2 = int2.nextInt();

                if (operation == 1) {
                    System.out.printf("%d + %d = %d \n", number_1, number_2, number_1 + number_2);
                }
                else if (operation == 2) {
                    System.out.printf("%d - %d = %d \n", number_1, number_2, number_1 - number_2);
                }
                else if (operation == 3) {
                    System.out.printf("%d x %d = %d \n", number_1, number_2, number_1 * number_2);
                }
                else if (operation == 4) {
                    System.out.printf("%d : %d = %d \n", number_1, number_2, number_1 / number_2);
                }
                else if (operation == 5) {
                    if (number_1 > number_2){
                        System.out.printf("%d > %d \n", number_1, number_2);
                    }
                    else if (number_1 < number_2){
                        System.out.printf("%d < %d \n", number_1, number_2);
                    }
                    else {
                        System.out.printf("%d = %d \n", number_1, number_2);
                    }
                }
            }
            else {
                System.out.println(">>> Вронг! Алярм! Попробуйте ещё раз. ");
                System.out.println("---------------------------------");
            }
        }

        System.out.println(">>> Task #4 ");
        Scanner q_n = new Scanner(System.in);
        System.out.print("Введите первое слогаемое: ");
        String q = q_n.nextLine();
        Scanner w_n = new Scanner(System.in);
        System.out.print("Введите второе слогаемое: ");
        String w = w_n.nextLine();
        Scanner e_n = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        Integer e = e_n.nextInt();

        boolean flag = true;
        for (int i = 0; i <= 10; i++) {

            String s = String.valueOf(i);
            char digit = s.toCharArray()[0];
            String n1 = q.replace('?', digit);
            String n2 = w.replace('?', digit);

            if ((Integer.parseInt(n1) + Integer.parseInt(n2)) == e) {
                System.out.println(i);
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Решения нет");
        }
    }
}