import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.delete;


public class Main {

    public static void main(String[] args) {
        // Вывести индексы повторяющихся элементов массива
//        int [] array = {1,3,4,6,2,3,5,6};
//        for(int i=0; i<array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    System.out.println(j);
//                }
//            }
//        }
        // Удалить из массива повторяющиеся элементы и вывести в консоль
//        int [] array = {1,3,4,6,2,3,5,6};
//
//        int[] distinct = Arrays.stream(array).distinct().toArray();
//        System.out.println(Arrays.toString(distinct));

        //Вывести тру или фолс если массив содержит дубликаты
//        int [] array = {1,3,4,6,2,3,5,6};
//        System.out.println(isUnik(array));


        //Вывести в консоль элементы, которые имеют повторы
//        int[] array = {1, 3, 4, 6, 2, 3, 5, 6,8,8,1};
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if ((array[i] == array[j]) && (i != j)) {
//                    System.out.println("Duplicate Element is : " + array[j]);
//                }
//            }
//
//        }

        List<Integer> list = new ArrayList<>();


//    public static boolean isUnik(int [] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (j!=i && array[i] == array[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//
//    }


        // singletone
//        public class Singleton {
//
//            private static Singleton instance;
//
//            private Singleton() {
//            }
//
//            public static Singleton getInstance() {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//                return instance;
//            }
//
//            public void print() {
//                System.out.println("This is singleton print method");
//            }
//        }
//
//
//        Scanner sc = new Scanner(System.in);     Поменять два числа используя третье
//
//        int first =  sc.nextInt();
//        int second =  sc.nextInt();
//        int firth;
//        firth = first;
//        first = second;
//        second = firth;
//        System.out.println(first + "and" + second);
//
//        int[] array = {1, 6, 8, 90, 24, 5, 8, 15, 6, 6};  // Вывести в консоль повторки в массиве
//        HashSet<Integer> unics = new HashSet<Integer>();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    unics.add(array[j]);
//                }
//            }
//        }
//        System.out.println(unics.toString());


        String str1 = "     it's my new task about Strings";// Перевернуть строку

//        StringBuilder str2 = new StringBuilder();
//        str2.append(str1);
//        str2 = str2.reverse();
//        System.out.println(str2);


       // Удалить из массива дубликаты и вывести в консоль

        int [] arrays = {1,4,6,76,45,6,16,1,76,77,78};

//        int [] distinct = Arrays.stream(arrays).distinct().toArray();
//        System.out.println(Arrays.toString(distinct));



       // найти второе самое большое число
     int firstMax = arrays[0];
     int index = 0;
     for(int i=1; i<arrays.length;i++){
         if(arrays[i] > firstMax){
             firstMax = arrays[i];
             index = i;
         }
     }
     arrays[index] = 0;
        int secondmax = arrays[0];
        for(int i=1; i<arrays.length;i++){
            if(arrays[i] > secondmax){
                secondmax = arrays[i];

            }
        }
        System.out.println(secondmax);




        public class Cache <K, V> {
            private final Map<K, V> MAP = new ConcurrentHashMap<K, V>();

            public void addValue (K key, V value) {
                this.MAP.put(key, value);
            }

            public V getValue (K key) {
                return this.MAP.get(key);
            }
        }


//thread1
        var myGeneralCache = new Cache();

//thread2,3,4..n

        var myAnotherCache = new Cache();
    }

}




