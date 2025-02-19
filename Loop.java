public class LoopExample {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int searchkey=3;
        boolean result=false;


        for(int n:num){
            if(n==searchkey){
                result=true;
                break;
            }
            else{
                result=false;
            }

        }
        if(result==true){
            System.out.println("number found");
        }
        else{
            System.out.println("number not found");

        }

    }
}
