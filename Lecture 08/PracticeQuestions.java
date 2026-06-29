public class PracticeQuestions{
    public static void main(String[] args){


        // pattern 1
        outer: // label for outer loop
        for(int i=1;i<=5;i++){
            inner: // label for inner loop
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
                if(j==3){
                    break outer; // breaks out of the outer loop
                }
            }
            System.out.println();
        }
    }
}