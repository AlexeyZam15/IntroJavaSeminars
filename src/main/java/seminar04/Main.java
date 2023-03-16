package seminar04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> data = new ArrayList<>();
        int index = 0;
        System.out.println("Введите фамилию, имя, отчество, пол и возраст, или q для остановки ввода: ");
        String[] data2;
        String input = sc.nextLine();
        if (!input.equals("q")) {
            input = index++ + " " + input;
            data2 = input.split(" ");
            data.add(data2);
        }

        while (!input.equals("q")) {
            System.out.println("Введите фамилию, имя, отчество, пол и возраст, или q для остановки ввода: ");
            input = sc.nextLine();
            if (!input.equals("q")) {
                input = index++ + " " + input;
                data2 = input.split(" ");
                data.add(data2);
            }
        }

        int[] orderIndexes = new int[data.size()];

        for (int i = 0; i < orderIndexes.length; i++) {
            orderIndexes[i] = i;
        }

        specialPrintArrayList(data, orderIndexes);

        System.out.println("Вывести сортированный список по возрасту и полу? y - да, n - нет");
        input = sc.nextLine();
        if (input.equals("y")) {
//            long begin = System.currentTimeMillis();

//            Метод 1
//            String[][] array = getSortedArray(data, 4, orderIndexes, true);
//            orderIndexes = getIndexesArray(array);
//            array = getSortedArray(data, 5, orderIndexes, true);
//            orderIndexes = getIndexesArray(array);

//            Метод 2
//            String[][] array = getSortedArray(data, 4, orderIndexes, false);
//            orderIndexes = getSortedArrayIndexes(array);
//            array = getSortedArray(data, 5, orderIndexes, false);
//            orderIndexes = getSortedArrayIndexes(array);

//            System.out.println("Время выполнения: " + (System.currentTimeMillis() - begin));

//            Метод 3
            bubbleIndexesSort(orderIndexes, data, 4);
            bubbleIndexesSort(orderIndexes, data, 5);

            specialPrintArrayList(data, orderIndexes);
        }
    }

    static void specialPrintArrayList(ArrayList<String[]> data, int[] orderIndexes) {
        for (int i : orderIndexes) {
            for (int j = 1; j < data.get(i).length; j++) {
                if (j != 2 && j != 3) {
                    System.out.print(data.get(i)[j] + " ");
                } else System.out.print(data.get(i)[j].charAt(0) + ". ");
            }
            System.out.println();
        }
    }

    static String[][] getSortedArray(ArrayList<String[]> data, int column, int[] orderIndexes, boolean sort) {
        String[][] array = new String[data.size()][2];
        int index = 0;
        for (int i : orderIndexes) {
            array[index][0] = data.get(i)[0];
            array[index][1] = data.get(i)[column];
            index++;
        }
        if (sort) Arrays.sort(array, Comparator.comparing(arr -> arr[1]));
        return array;
    }

    static int[] getIndexesArray(String[][] array) {
        int[] orderIndexes = new int[array.length];
        for (int i = 0; i < orderIndexes.length; i++) {
            orderIndexes[i] = Integer.parseInt(array[i][0]);
        }
        return orderIndexes;
    }

    static int[] getSortedArrayIndexes(String[][] array) {
        int[] sortedArrayIndexes = new int[array.length];
        int startIndex = 0;
        ArrayList<String> exceptionsIndexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            sortedArrayIndexes[i] = getMinElementIndex(array, exceptionsIndexes);
            exceptionsIndexes.add(String.valueOf(sortedArrayIndexes[i]));
        }
        return sortedArrayIndexes;
    }

    static int getMinElementIndex(String[][] array, ArrayList<String> exceptionsIndexes) {
        int minElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
            minElementIndex = Integer.parseInt(array[i][0]);
            boolean flag = false;
            for (String j : exceptionsIndexes) {
                if (Integer.toString(minElementIndex).equals(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) break;
        }
//        int index = 0;
//        int minElementIndex = Integer.parseInt(array[index][0]);
//        while (exceptionsIndexes.contains(array[minElementIndex][0])) {
//            minElementIndex = Integer.parseInt(array[++index][0]);
//        }
        int number;
        try {
            number = Integer.parseInt(array[minElementIndex][1]);
        } catch (NumberFormatException e) {
            number = array[minElementIndex][1].charAt(0);
        }
        int min = number;
        for (int i = 0; i < array.length; i++) {
            if (exceptionsIndexes.contains(array[i][0])) continue;
            try {
                number = Integer.parseInt(array[i][1]);
            } catch (NumberFormatException e) {
                number = array[i][1].charAt(0);
            }
            if (number < min) {
                minElementIndex = Integer.parseInt(array[i][0]);
                min = number;
            }
        }
        return minElementIndex;
    }

    static void bubbleIndexesSort(int[] orderIndexes, ArrayList<String[]> data, int column) {
        for (int count = 0; count < orderIndexes.length; count++) {
            boolean sorted = true;
            for (int i = 0; i < orderIndexes.length - 1; i++) {
                if (column == 4) {
                    if (Integer.parseInt(data.get(orderIndexes[i])[column]) > Integer.parseInt(data.get(orderIndexes[i + 1])[column])) {
                        int t = orderIndexes[i + 1];
                        orderIndexes[i + 1] = orderIndexes[i];
                        orderIndexes[i] = t;
                        sorted = false;
                    }
                } else if (data.get(orderIndexes[i])[column].charAt(0) > data.get(orderIndexes[i + 1])[column].charAt(0)) {
                    int t = orderIndexes[i + 1];
                    orderIndexes[i + 1] = orderIndexes[i];
                    orderIndexes[i] = t;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }

}
