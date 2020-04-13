//FizzBuzz-----------------------------------------------
    public class java_study_test {
        public static void main(String[] args) throws Exception {
            System.out.println("start");
            for (int i = 1;i <= 30;i++){
                if((i%3 == 1)&&(i%5 == 1)){
                    System.out.println("FizzBuzz");
                } else if(i%3 == 1){
                    System.out.println("Fizz");
                } else if(i%5 == 1){
                    System.out.println("Buzz");
                }
            }
            System.out.println("end");
        }
    }
//-----------------------------------------------






