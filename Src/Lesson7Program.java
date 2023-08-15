import java.util.Arrays;
import java.util.Random;

public class Lesson7Program {
//    public final double PI = 3.14;
//        int a;
//        static int b;
    public static void main(String[] args) {
        Person person = new Person();
        person.personInfo("Andrey", "Khrypach", "Lviv", 1234567);
        Person.personInfoStatic("Andrey", "Khrypach", "Lviv", "1234567");

        int a = 0;
        Integer a1 = a;
        short a2 = 0;
        Short a3 = a2;
        byte b1 = 0;
        Byte b2 = b1;
        boolean bool = true;
        Boolean bool1 = bool;
        double d = 3.14;
        Double d1 = d;
        float f1 = 4.567f;
        Float f2 = f1;
        long l1 = 121324243l;
        Long l2 = l1;
        char c1 = 'A';
        Character c2 = c1;
        Integer in = null;
        int aaaa = in;
        System.out.println(aaaa);
        if(in == null)
        System.out.println(in);

//        int[] array1 = new int[]{1,2,3};
//        int[] array2 = array1;
//        int[] array3 = new int[array1.length];
//        int[] arrayC = new int[array1.length];
//        System.arraycopy(array1, 0, array3, 0, array1.length);
//        Arrays.setAll(arrayC, i -> array1[i]);
//        int[] copiedArray = Arrays.copyOf(array1, array1.length);
//        int[] copiedArray2 = array1.clone();
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
//        array2[0] = 5;
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        int a = 0;
//        String str = "Hello world";
//        Integer b = a;
//        System.out.println(b);
//        a = 3;
//        System.out.println(a);
//        System.out.println(b);

        //        Lesson7Program program = new Lesson7Program();
//        int a = 0;
//        System.out.println(a);
//        System.out.println(program.a);
//        System.out.println(b);

//        Lesson7Program program = new Lesson7Program();
//        double radius = 9/(2*program.PI);
//        System.out.println(radius);
//        int[] array1 = initializeArray(new int[5]);
//        int[] array2 = initializeArray(new int[8]);
//        int[] array3 = initializeArray(6);
//        int[] array1 = new int[5];
//        int[] array2 = new int[8];
//        array1 = initializeArray(array1);
//        array2 = initializeArray(array2);
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = random.nextInt();
//        }
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = random.nextInt();
//        }
    }

    public static int[] initializeArray(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
    public static int[] initializeArray(int lengthArray){
        Random random = new Random();
        int[] array = new int[lengthArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
    public static int[] initializeArray(short lengthArray, boolean check){
        Random random = new Random();
        int[] array = new int[lengthArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}

