package main.java.calculation;

public class Iteration {

    public void multiple_iteration(int A, int X) {
        int start = A;
        if (A>0){
            for (int i=start; i<X; i=i+A){
                System.out.println("Value of i="+i);
                start = i;
            }

            int Y = 2 * X;
            for (int i=start+A+1; i<Y; i=i+A+1){
                System.out.println("Value of i="+i);
                start = i;
            }

            int Z = 3 * X;
            for (int i=start+A+2; i<Z; i=i+A+2){
                System.out.println("Value of i="+i);
                start = i;
            }
        }  else {
            System.out.println("Value of A should be greater than 0");
        }
    }
}
