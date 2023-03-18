import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //TODO
      /*  • Generics метод тузунуз. • Параметрине generic
        тибиндеги массивди алсын. • Ал метод биринчи массивдин биринчи жана акыркы элементтерин консолго
        чыгарсын, анан бардык
        элементтерин чыгарсын.*/

        Genericable generic = new Generic();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Random().nextInt(1,20);
        }
        generic.genericMethod(arr);
    }
}