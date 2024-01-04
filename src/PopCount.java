import java.util.Objects;

public class PopCount {
    public static void main(String[] args) {
        System.out.println(eggCount(2000000000  ));
    }
    public static int eggCount(int number) {
       String result = Integer.toBinaryString(number);
       int count = 0;
        for(int i = 0; i < result.length(); i++){
            if(result.charAt(i) == '1'  ){
                count++;
            }
        }
        return count;
    }
}

