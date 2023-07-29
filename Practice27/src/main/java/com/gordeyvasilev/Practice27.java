package com.gordeyvasilev;

import java.util.Scanner;

/**
 * The program receives an integer as input from the keyboard.
 * This number represents the current time of the day as the number of seconds since midnight.
 * The program then prints the time on the screen in digital clock format.
 * <br>
 * <br>
 * The input value is set via <code>System.in</code>. The output value must be published to <code>System.out</code>.
 * <br>
 * <br>
 * It is guaranteed that the input value is non-negative.
 * <br>
 * <br>
 * Output format: h:mm:ss (possible values: [0:00:00; 23:59:59]).
 * <br>
 * <br>
 *
 * @Task <a href="https://stepik.org/lesson/731261/step/2?unit=732798">#2.7</a>
 */
public class Practice27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long seconds = scanner.nextLong(); // 1337L;

        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;

        seconds = seconds % 60;

        String hoursStr = (hours < 24) ? "" + hours : (hours == 24) ? "0" : Long.toString(hours);

        System.out.printf(hoursStr + ":" + "%02d:%02d", minutes, seconds);
    }
}