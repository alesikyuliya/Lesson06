import java.util.Arrays;
import java.util.Random;

public class Lesson6Program {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1_000];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(100);
        }
        int keyElement = 87;
        Arrays.sort(array);
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == keyElement) {
                System.out.println(middleIndex);
                break;
            }
        }
    }
//        for (int index = 0; index < array.length; index++) {
//            if(array[index] == keyElement){
//                System.out.println(keyElement + " index = " + index);
//                break;
//            }
//        }
//
//
//
//
//    }
//        Random random = new Random();
//
//        int[] array = new int[10_000];
//        for (int index = 0; index < array.length; index++) {
//            array[index] = random.nextInt(10);
//        }
//
//        System.out.println(Arrays.toString(array));
//        long beforeTime = System.currentTimeMillis();


//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j > i; j--) {
//                if(array[i] > array[j]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

//        Arrays.sort(array);
//
//        long afterTime = System.currentTimeMillis();
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(afterTime - beforeTime);
//    }

}
