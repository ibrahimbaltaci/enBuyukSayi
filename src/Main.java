public class Main {
    public static void main(String[] args) {
        int num1=20;
        int num2=25;
        int num3=2;

        long startTime = System.currentTimeMillis(); //for measuring performance of code//
        //VERSION 1
        /*
        if (num1<num2){
            if (num2<num3){
                System.out.println("Biggest Number is " + num3);
            }
            else System.out.println("Biggest Number is " + num2);
        }
        else if (num1<num3) {
            System.out.println("Biggest Number is " + num3);
        }
        else System.out.println("Biggest Number is " + num1);
*/
        //VERSION 2
        /*

    boolean comp1 = num1<num2;
    boolean comp2 = num3<num2;
    boolean comp3 = num1<num3;
    if (comp1 && comp2 == true){
        System.out.println("Biggest Number is " + num2);
    } else if (comp3 == true && comp2 == false)  {
        System.out.println("Biggest Number is " + num3);
    }
    else System.out.println("Biggest Number is " + num1);
        */
        //VERSION 3

        int biggestNum =num1;
if (biggestNum < num2){
    biggestNum = num2;
}
if (biggestNum<num3){
    biggestNum = num3;
}
        System.out.println("Biggest Number is " + biggestNum);

    //for measuring performance of code

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(duration + " ms");
    }
}

