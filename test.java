import java.util.*;
class Main{
    public static void main(String [] args){
        Integer[] a={1,2,3,4,5,6,7};
        Collections.shuffle(Arrays.asList(a));
        System.out.println("After Shuffled:"+ Arrays.toString(a));
    }
}
