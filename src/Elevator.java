import javax.swing.*;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int maxFlr = 5;
        int Floor;
        int desFlr = 0;
        int minFlr = 1;
        int curFlr = 0;
        int maxP = 15;
        int minP = 1;

        for(int i = 0; i < 100; i++){

            JOptionPane.showMessageDialog(null,"Welcome! \nThis Elevator can only cater 5 Floors and can hold until 15 persons only.","Elevaor",JOptionPane.PLAIN_MESSAGE);
            int curFlr1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Current Floor: "));
            Floor = curFlr1;

            if(Floor > maxFlr){
                JOptionPane.showMessageDialog(null,"Floor out of reach \nThis Elevator can only cater 5 Floors","Warning",2);
                curFlr1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Current Floor: "));
                Floor = curFlr1;
            }

            String desFlr1 = JOptionPane.showInputDialog(null,"Enter destination Floor: ");
            desFlr = Integer.parseInt(desFlr1);
            if(desFlr > maxFlr){
                JOptionPane.showMessageDialog(null,"Floor out of reach \nThis Elevator can only cater 5 Floors","Warning",2);
                desFlr1 = JOptionPane.showInputDialog(null,"Enter destination Floor: ");
                desFlr = Integer.parseInt(desFlr1);
            }

            switch(desFlr){
                case 2:
                    String maxP1 = JOptionPane.showInputDialog(null,"How many passengers are there: ");
                    int Pass1 = Integer.parseInt(maxP1);
                    if(Pass1 > maxP){
                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
                        maxP1 = JOptionPane.showInputDialog(null,"How many passengers are there: ");
                        Pass1 = Integer.parseInt(maxP1);
                    }

                    JOptionPane.showMessageDialog(null, "Going to floor "+ desFlr1,"Elevator",1);
                    JOptionPane.showMessageDialog(null, "Floor 2 \nDoor opening... ","Elevator",1);
                    JOptionPane.showMessageDialog(null, "You're now in Floor 2","Elevator",1);
                    break;

                case 3:
                    maxP1 = JOptionPane.showInputDialog(null,"How many passengers are there: ");
                    Pass1 = Integer.parseInt(maxP1);
                    if(Pass1 > maxP){
                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
                        maxP1 = JOptionPane.showInputDialog(null,"How many passengers are there: ");
                        Pass1 = Integer.parseInt(maxP1);
                    }

                    JOptionPane.showMessageDialog(null, "Going to floor "+ desFlr1,"Elevator",1);
                    JOptionPane.showMessageDialog(null, "Floor 2 \nDoor opening... ","Elevator",1);

                    String maxP2 = JOptionPane.showInputDialog(null,"How many passengers entered: ");
                    int Pass2 = Integer.parseInt(maxP2);

                    int sumA = Pass1 + Pass2;
                    if(sumA > maxP){
                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
                        maxP2 = JOptionPane.showInputDialog(null,"How many passengers remaining: ");
                        Pass2 = Integer.parseInt(maxP2);
                    }
                        /*
                        int sum = Pass1 + Pass2;
                        if(sum > maxP){
                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
                        }*/

                    JOptionPane.showMessageDialog(null, "Floor 3 \nDoor opening... ","Elevator",1);
                    JOptionPane.showMessageDialog(null, "You're now in Floor 3","Elevator",1);
                    break;

                case 4:
                    maxP1 = JOptionPane.showInputDialog(null,"How many passengers are there: ");
                    Pass1 = Integer.parseInt(maxP1);
                    if(Pass1 > maxP){
                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
                        maxP1 = JOptionPane.showInputDialog(null,"How many passengers are there: ");
                        Pass1 = Integer.parseInt(maxP1);
                    }

                    JOptionPane.showMessageDialog(null, "Going to floor "+ desFlr1,"Elevator",1);
                    JOptionPane.showMessageDialog(null, "Floor \nDoor opening... ","Elevator",1);

                    maxP2 = JOptionPane.showInputDialog(null,"How many passengers entered: ");
                    Pass2 = Integer.parseInt(maxP2);

                    sumA = Pass1 + Pass2;
                    if(Pass2 > maxP){
                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
                        maxP2 = JOptionPane.showInputDialog(null,"How many passengers remaining: ");
                        Pass2 = Integer.parseInt(maxP2);
                    }

                    JOptionPane.showMessageDialog(null, "Floor 3 \nDoor opening... ","Elevator",1);
                    String maxP3 = JOptionPane.showInputDialog(null,"How many passengers entered: ");
                    int Pass3 = Integer.parseInt(maxP3);

                    int sumB = sumA + Pass3;
                    if(sumB > maxP){
                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
                        maxP3 = JOptionPane.showInputDialog(null,"How many passengers remaining: ");
                        Pass3 = Integer.parseInt(maxP3);
                    }

                    JOptionPane.showMessageDialog(null, "Floor 4 \nDoor opening... ","Elevator",1);
                    JOptionPane.showMessageDialog(null, "You're now in Floor 4","Elevator",1);
                    break;

                case 5:
                    maxP1 = JOptionPane.showInputDialog(null,"How many passengers are there: ");
                    Pass1 = Integer.parseInt(maxP1);
                    int totalPassengers = Pass1;

                    if(Pass1 > maxP){
                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
                        maxP1 = JOptionPane.showInputDialog(null,"How many passengers are there: ");
                        Pass1 = Integer.parseInt(maxP1);
                    }

                    JOptionPane.showMessageDialog(null, "Going to floor "+ desFlr1,"Elevator",1);

                    for (i = 0; curFlr1 < 5; i++) {
                        curFlr1 += 1;
                        JOptionPane.showMessageDialog(null, "Floor " + curFlr1 + " \nDoor opening... ","Elevator",1);

                        maxP2 = JOptionPane.showInputDialog(null,"How many passengers entered: ");
                        Pass2 = Integer.parseInt(maxP2);

                        totalPassengers += Pass2;

                        JOptionPane.showMessageDialog(null, "Number of passengers: " + totalPassengers);

                        if(Pass2 > maxP){
                            JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
                            maxP2 = JOptionPane.showInputDialog(null,"How many passengers remaining: ");
                            Pass2 = Integer.parseInt(maxP2);
                        }
                    }

                    JOptionPane.showMessageDialog(null, "You're now in Floor 5","Elevator",1);

//                    curFlr1 += 1;
//
//                    JOptionPane.showMessageDialog(null, "Going to floor "+ desFlr1,"Elevator",1);
//                    JOptionPane.showMessageDialog(null, "Floor " + curFlr1 + " \nDoor opening... ","Elevator",1);
//
//                    maxP2 = JOptionPane.showInputDialog(null,"How many passengers entered: ");
//                    Pass2 = Integer.parseInt(maxP2);
//
//                    sumA = Pass1 + Pass2;
//                    if(Pass2 > maxP){
//                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
//                        maxP2 = JOptionPane.showInputDialog(null,"How many passengers remaining: ");
//                        Pass2 = Integer.parseInt(maxP2);
//                    }
//
//                    curFlr1 += 1;
//
//                    JOptionPane.showMessageDialog(null, "Floor " + curFlr1 + " \nDoor opening... ","Elevator",1);
//                    maxP3 = JOptionPane.showInputDialog(null,"How many passengers entered: ");
//                    Pass3 = Integer.parseInt(maxP3);
//
//                    sumB = sumA + Pass3;
//                    if(sumB > maxP){
//                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
//                        maxP3 = JOptionPane.showInputDialog(null,"How many passengers remaining: ");
//                        Pass3 = Integer.parseInt(maxP3);
//                    }
//
//                    curFlr1 += 1;
//
//                    JOptionPane.showMessageDialog(null, "Floor " + curFlr1 + " \nDoor opening... ","Elevator",1);
//
//                    String maxP4 = JOptionPane.showInputDialog(null,"How many passengers entered: ");
//                    int Pass4 = Integer.parseInt(maxP4);
//
//                    int sumC = sumB + Pass4;
//                    if(sumC > maxP){
//                        JOptionPane.showMessageDialog(null,"please kindly give courtesy and alight the elevator because of overload","Warning",2);
//                        maxP4 = JOptionPane.showInputDialog(null,"How many passengers remaining: ");
//                        Pass4 = Integer.parseInt(maxP4);
//                    }
//
//                    curFlr1 += 1;
//
//                    JOptionPane.showMessageDialog(null, "Floor " + curFlr1 + " \nDoor opening... ","Elevator",1);
//                    JOptionPane.showMessageDialog(null, "You're now in Floor 5","Elevator",1);
            }

        }

    }}
