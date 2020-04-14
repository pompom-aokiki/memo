//FizzBuzz-----------------------------------------------
    public class java_study_test {
            public static void main(String[] args) throws Exception {
                // System.out.println("start");
                for (int i = 1;i <= 30;i++){
                    if((i%3 == 0)&&(i%5 == 0)){
                        System.out.println("FizzBuzz");
                    } else if(i%3 == 0){
                        System.out.println("Fizz");
                    } else if(i%5 == 0){
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
                // System.out.println("end");
            }
        }
        
//-----------------------------------------------






