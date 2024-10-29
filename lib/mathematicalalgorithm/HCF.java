package mathematicalalgorithm;

public class HCF {
    static int getHFC(int num1, int num2){
        int result = Math.min(num1, num2);

        while (result > 0) {
            if(num1%result == 0 && num2%result == 0){
                break;
            }
            result--;
        }
        return result;
    }
}
