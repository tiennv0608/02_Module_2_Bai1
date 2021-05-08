import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to read(0-1000):");
        int x = sc.nextInt();
        String readNum = "";
        boolean check = true;
        if (x%100==0) {
            check = false;
        }
        if (x < 0 || x >= 1000) {
            System.out.println("out of ability");
        } else if (x == 0) {
            System.out.println("The number 0 is read as zero");
        } else {
            switch (x / 100) {
                case 1:
                    if (check){
                        readNum += "one hundreds and ";
                    } else {
                        readNum += "one hundreds";
                    }
                    break;
                case 2:
                    if (check){
                        readNum += "two hundreds and ";
                    } else {
                        readNum += "two hundreds";
                    }
                    break;
                case 3:
                    if (check){
                        readNum += "three hundreds and ";
                    } else {
                        readNum += "three hundreds";
                    }
                    break;
                case 4:
                    if (check){
                        readNum += "four hundreds and ";
                    } else {
                        readNum += "four hundreds";
                    }
                    break;
                case 5:
                    if (check){
                        readNum += "five hundreds and ";
                    } else {
                        readNum += "five hundreds";
                    }
                    break;
                case 6:
                    if (check){
                        readNum += "six hundreds and ";
                    } else {
                        readNum += "six hundreds";
                    }
                    break;
                case 7:
                    if (check){
                        readNum += "seven hundreds and ";
                    } else {
                        readNum += "seven hundreds";
                    }
                    break;
                case 8:
                    if (check){
                        readNum += "eight hundreds and ";
                    } else {
                        readNum += "eight hundreds";
                    }
                    break;
                case 9:
                    if (check){
                        readNum += "nine hundreds and ";
                    } else {
                        readNum += "nine hundreds";
                    }
                    break;
            }
            switch (x % 100 / 10) {
                case 2:
                    readNum += "twenty ";
                    break;
                case 3:
                    readNum += "thirty ";
                    break;
                case 4:
                    readNum += "forty ";
                    break;
                case 5:
                    readNum += "fifty ";
                    break;
                case 6:
                    readNum += "sixty ";
                    break;
                case 7:
                    readNum += "seventy ";
                    break;
                case 8:
                    readNum += "eighty ";
                    break;
                case 9:
                    readNum += "ninety ";
                    break;
                default:
                    break;
            }
            if (x % 100 > 20) {
                switch (x % 10) {
                    case 1:
                        readNum += "one";
                        break;
                    case 2:
                        readNum += "two";
                        break;
                    case 3:
                        readNum += "three";
                        break;
                    case 4:
                        readNum += "four";
                        break;
                    case 5:
                        readNum += "five";
                        break;
                    case 6:
                        readNum += "six";
                        break;
                    case 7:
                        readNum += "seven";
                        break;
                    case 8:
                        readNum += "eight";
                        break;
                    case 9:
                        readNum += "nine";
                        break;
                }
            }
            switch (x % 100) {
                case 1:
                    readNum += "one";
                    break;
                case 2:
                    readNum += "two";
                    break;
                case 3:
                    readNum += "three";
                    break;
                case 4:
                    readNum += "four";
                    break;
                case 5:
                    readNum += "five";
                    break;
                case 6:
                    readNum += "six";
                    break;
                case 7:
                    readNum += "seven";
                    break;
                case 8:
                    readNum += "eight";
                    break;
                case 9:
                    readNum += "nine";
                    break;
                case 10:
                    readNum += "ten";
                    break;
                case 11:
                    readNum += "eleven";
                    break;
                case 12:
                    readNum += "twelve";
                    break;
                case 13:
                    readNum += "thirteen";
                    break;
                case 14:
                    readNum += "fourteen";
                    break;
                case 15:
                    readNum += "fifteen";
                    break;
                case 16:
                    readNum += "sixteen";
                    break;
                case 17:
                    readNum += "seventeen";
                    break;
                case 18:
                    readNum += "eighteen";
                    break;
                case 19:
                    readNum += "nineteen";
                    break;
            }
            System.out.println("The number " + x + " is read as " + readNum);
        }
    }
}