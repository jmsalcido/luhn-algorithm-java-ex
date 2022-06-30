package dev.test;

/*
 https://www.wikiwand.com/en/Luhn_algorithm

 sample input: 79927398713
 7 9 9 2 7 3 9 8 7 1 3
 7 18 9 4 7 6 9 16 7 2 3
 7 (1+8) 9 4 7 6 9 (1+6) 7 2 3
 7 9 9 4 7 6 9 7 7 2 3
 the sum of all the digits is: 70
 */
public class LuhnAlgorithm {

    public boolean check(String input) {
        int length = input.length();
        int sum = 0;
        int position = 1;
        for (int i = length-1; i >= 0; i--) {
            int num = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (position % 2 == 0) {
                num = num * 2;
                if (num >= 10) {
                    num = (num % 10) + 1;
                }
            }
            sum += num;
            position++;
        }
        return (sum % 10) == 0;
    }

}
