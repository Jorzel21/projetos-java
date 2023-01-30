public class InvertArray {
    public static void main(String[] args) {
        int[] vector = {0, 1, 43, 12, 43, -5};
        int count = 0;
        while (count < (vector.length)){
            System.out.println(vector[count]);
            count++;
        }
        System.out.println("PUILAA");
        for (int i = (vector.length - 1); i >= 0; i-- ){
            System.out.println(vector[i]);
        }

    }
}
