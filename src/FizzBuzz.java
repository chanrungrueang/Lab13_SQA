public class FizzBuzz {
    public String convert(int i){
        if(i%3==0){
            return "Fizz";
        }
        else if (i%5==0){
            return "Bizz";
        }
        else{
            return "FizzBizz";
        }
    }
}
