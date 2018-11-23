import java.lang.reflect.Array;
import java.util.ArrayList;

class BuggyWidget {

    Boolean isAdult(int age){
        if(age < 0){
            throw new IllegalArgumentException("age can only be a positive number");
        }
        return age >= 18;
    }

    void forever(){
        forever();
    }

    long[] useALotOfMemory(){
        return new long[Integer.MAX_VALUE];
    }

    int divide(int numerator, int denominator){
        return numerator / denominator;
    }

    Integer getNthElement(ArrayList<Integer> array, int index){
        return array.get(index);
    }

    double power(int base, int exp){
        int result = 1;
        for(int i = 0; i < Math.abs(exp); i++){
            result *= base;
        }
        if (exp >= 0){
            return result;
        }
        return 1.0 / result;
    }

}
