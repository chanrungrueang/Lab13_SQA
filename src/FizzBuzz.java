public class FizzBuzz {
    public String convert(int i){
        if((i%3 == 0) && (i%5==0)){
            return "FizzBuzz";
        }
        else if (i%3 == 0){
            return "Fizz";
        }
        else if (i%5==0){
            return "Buzz";
        }
        else{
            String s=Integer.toString(i);
            return s;
        }
    }
}
