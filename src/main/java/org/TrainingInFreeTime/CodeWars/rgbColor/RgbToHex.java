package org.TrainingInFreeTime.CodeWars.rgbColor;
/*
    The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.

    Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

    The following are examples of expected output values:
    RgbToHex.rgb(255, 255, 255) // returns FFFFFF
    RgbToHex.rgb(255, 255, 300) // returns FFFFFF
    RgbToHex.rgb(0, 0, 0)       // returns 000000
    RgbToHex.rgb(148, 0, 211)   // returns 9400D3

    https://www.codewars.com/kata/513e08acc600c94f01000001/train/java

 */

public class RgbToHex {
    public static void main(String[] args) {
        String rgbTest = rgb(20, 0, 0);
        System.out.println(rgbTest);

    }

    public static String rgb(int r, int g, int b) {
        int[] rgbElements = {r, g, b};

        String result = "";
        //20
        int minNumbRgbRange = 0;
        int maxNumberRgbRange = 9;
        int count = 0;
        int i = 0;
        while (i < 3) {
            if ((rgbElements[i] >= minNumbRgbRange) && (rgbElements[i] <= maxNumberRgbRange)) {
                int index = rgbElements[i] - minNumbRgbRange;

                result += count + "" + index;
                i++;
                //reset
                minNumbRgbRange = 0;
                maxNumberRgbRange = 9;
                count = 0;
            } else {
                minNumbRgbRange += 16;
                maxNumberRgbRange += 16;
                count += 1;
            }
        }


        return result;
    }
}
