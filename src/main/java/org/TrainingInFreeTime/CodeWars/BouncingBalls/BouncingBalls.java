package org.TrainingInFreeTime.CodeWars.BouncingBalls;

public class BouncingBalls {
    public static void main(String[] args) {
        System.out.println("3? " + bouncingBall(3.0, 0.66, 1.5));
        System.out.println("15? " + bouncingBall(30.0, 0.66, 1.5));

    }

    public static int bouncingBall(double h, double bounce, double window) {
        if (h > 0 && (bounce > 0 && bounce < 1) && window < h) {
            int count = 0;

            while (true) {
                //fall down
                if (h > window){
                    count++;
                } else {
                    break;
                }
                //up
                h *= bounce;
//                System.out.println(h);

                if (h > window){
                    count++;
                } else {
                    break;
                }
            }


            return count ;
        } else {
            return -1;
        }


    }
}
