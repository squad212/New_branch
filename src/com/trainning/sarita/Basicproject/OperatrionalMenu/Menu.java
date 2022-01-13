package com.trainning.sarita.Basicproject.OperatrionalMenu;

public class Menu {
    public void option(int number1,int number2, int choice){


        performOperationUsingIfEsle(number1, number2, choice);

    }

    private void performOperationUsingIfEsle(int number1, int number2, int choice) {
        if(choice == 1) {
             System.out.println("The sum is: " + (number1 + number2));
        } else if(choice == 2){
             System.out.println("the difference is: " + (number1 - number2));
        } else if(choice == 3){
            System.out.println("The division is: " + (number1 / number2));
        } else if(choice == 4) {
            System.out.println("The multiplication is: " + (number1 * number2));
        }else if( choice == 5)  {
            System.out.println("The percentage is: " + ((number1/number2) * 100));
        }else {
            System.out.println("Invalid Operation");
        }
    }

    private void performOperationUsingSwitch(int number1, int number2, int choice) {
        switch (choice) {
            case 1 :
                System.out.println("The sum is: " + (number1 + number2));
                break;
            case 2 :
                System.out.println("the difference is: " + (number1 - number2));
                break;
            case 3 :
                System.out.println("The division is: " + (number1 / number2));
                break;
            case 4 :
                System.out.println("The multiplication is: " + (number1 * number2));
                break;
            case 5 :
                System.out.println("The percentage is: " + ((number1 / number2)) * 100);
                break;
            default :
                System.out.println("Invalid Operation");
                break;



        }
    }
}


