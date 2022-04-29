package Com.Bridgelabz;

public class ArrayBasicDemo {
    public void arraydemo(){

        String [] arr1 = new String [] {"cadbury","nestle","mars","amul","lindt"};
        String arr2[] = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
    }
    public static void main(String[] args) {
        ArrayBasicDemo abc=new ArrayBasicDemo();
        abc.arraydemo();
    }
}
