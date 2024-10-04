//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ar(arr);

    }

    public static void ar(int arr[]) {
        try {
        for (int i = 0; i < arr.length+1; i++) {

        System.out.println(arr[i]);}
        }
        catch (Exception err){
        System.out.println("ошибка итераций больше чем надо" + err);

        }
    }

}