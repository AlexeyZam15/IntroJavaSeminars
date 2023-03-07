package seminar02;

public class Main {
    public static void main(String[] args) {
//        String str = "Hello World";
//        StringBuilder builder = new StringBuilder("Hello World");
//        builder.append(str).append("!").append(" Привет Мир!");
//        System.out.println(builder);
//        System.out.println("Строка str = " + str);
//        str += "!";
//        System.out.println(str);

        String str = "";
        StringBuilder builder = new StringBuilder();

        long begin = System.currentTimeMillis();
//        long begin = System.nanoTime();

//        for (int i = 0; i < 10_000; i++) {
//            str += Character.getName(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("to string: " + (end - begin));
//
//        begin = System.currentTimeMillis();
//        for (int i = 0; i < 10_000; i++) {
//            builder.append(Character.getName(i));
//        }
//        end = System.currentTimeMillis();
//        System.out.println("To StringBuilder: " + (end - begin));

//        System.out.println(str.toLowerCase());
//        System.out.println(str.length());
//        System.out.println("_*".repeat(10));

        int max = 100000;

        for (int i = 0; i < max; i++) {
            str += "_*";
        }
        long end = System.currentTimeMillis();
        System.out.println("to string: " + (end - begin));

        begin = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            builder.append("_*");
        }
        end = System.currentTimeMillis();
        System.out.println("To StringBuilder: " + (end - begin));

        begin = System.currentTimeMillis();
        str = "_*".repeat(max);
        end = System.currentTimeMillis();
        System.out.println("To Repeat: " + (end - begin));

        String a = "d";
        String f = "d";

        System.out.println(str.equals("N"));
        ;
        //if (str == "N")
        System.out.println(str.contains("N"));
        str = "Hello    World!";
        System.out.println(str.replace("l", "p"));
        System.out.println(str.replaceFirst("l", "p"));
        System.out.println(str.charAt(0));
        String[] strings = str.split(" ");
        builder.replace(0, 1, "F");
        builder.reverse();
        builder.insert(4, "inserted");
        builder.deleteCharAt(6);
        builder.indexOf("Fd");
        str = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        str += "1";
        System.out.println(str);
    }
}
