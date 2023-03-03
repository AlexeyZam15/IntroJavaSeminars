package seminar01;

import java.util.Random;

public class Main {

//    константа
    final int constanta = 1;

    private static int i = 1; //32bit -2млрд до 2 млрд
    private static long l; //64bit

    private static byte b; //8bit
    private short sh; //16bit

    private float f; //32bit floating point
    private double d; //64bit floating point

    private static boolean aBoolean; //по умолчанию false

    //хранится индекс символа в таблице asci
    private static char aChar = 65; //16бит без знака диапазон 0-65535

    //    String - это ссылочная переменная - класс
//    Значение по умолчанию - пустая строка ""
    static String string = "Привет Мир!";
    static String str;
    // инструкция - String, конструктор - new String()
    String tmpS = new String("Привет Мир!");

    static int[] ints = new int[10];

    // так лучше не делать!
    static int[] ints2 = new int[Short.MAX_VALUE];

    public static void main(String[] arg) {
        getInt(String.valueOf(12));

        ints[3] = 10;
//        создаём новый массив в два раза больше первого массива
        int[] tmp = new int[ints.length * 2];
        Random random = new Random();

//        присваивем элементы первого массива новому массиву
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == 0)
                tmp[j] = random.nextInt(100);
            else tmp[j] = ints[j];
        }
        tmp[15] = 5;
//        переназначаем изначальный массив размеров вдвое больше с сохранением старых данных
        ints = tmp;

        if (aBoolean) {
            getInt(String.valueOf(12));
        } else if (l > i) {
            getInt(String.valueOf(13));
        } else {
            getInt(String.valueOf(14));
        }

        for (int i : ints) {
            System.out.println(i);
        }

        System.out.println(Integer.toBinaryString(512));
        System.out.println(Integer.max(1,2));
        System.out.println(Integer.toHexString(158));

        System.out.println(Integer.toBinaryString(158));
        System.out.println(Integer.toBinaryString(158).length());
        System.out.println(
                Integer.toBinaryString(158).repeat(6)
        );
        System.out.println(
                Integer.toBinaryString(158).repeat(6).length()
        );

    }

    static int getInt(String str) {
        int i = 0;
        Main.i = i;
        return Integer.parseInt(str);
    }

    static void print(String str) {
        System.out.println(str);
    }
}
