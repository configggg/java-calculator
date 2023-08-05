import java.util.*;

public class calculator {
    public static void main(String[] args) {
        System.out.println("""
                           ^
                         .5#BPY7^.
                        ^B&&#B#&&BPJ!^.
                       7#Y7JPBB&&#####G5?~:
                     .YB?777777?5PB####&##BPJ!:
                    :5#BP577!7?7~!!7?YG#&##GG&B:
                   !GGGGPGBGPYY7^7?77!^^!J5#&B!
                 .JBPPGGPPPPPGGGGP?7?^^~^.~#G~
                ^PBGBGPPGPPPP555PPGBGYY!.7#P:
               7GGBBG5GGBGPGBG5PPPPY5PPGP#Y.
             .JGGGBP5GGBPPGBG5PGBP5PPP5YG?
            ^5GPPPY5GBBPPPBP5GBB5YPGB55G!
           7G5YP5YPBGG5PGGPPPGPYYBGGYPP^
         .YBGPP5YGGB55GGBY5PGPJ5PG5JPY.
        .GBGGGP55GG5PGGPJ5PG5?5PP5JP?
         ^?5PPYP555GGPYJPPG??5GBYJP~
            :7Y55JYPPY5PP5?YG#G7Y5:
               .~?Y5Y?Y5Y!Y#BBJ5J.
                   :!JY5YJYP5757
                       :~?JYJJ^
                           .^.
           """);

        Scanner s = new Scanner(System.in);
        System.out.print("num1 -> ");
        int number1 = s.nextInt();
        System.out.print("num2 -> ");
        int number2 = s.nextInt();
        System.out.println("opt: \n[01] addition \n[02] subtraction \n[03] multiplication \n[04] division");
        int option = s.nextInt();

        switch (option) {
            case 1:
                int addition = number1 + number2;
                System.out.println("Addition: " + addition);
                break;
            case 2:
                int subtraction = number1 - number2;
                System.out.println("Subtraction: " + subtraction);
                break;
            case 3:
                int multiplication = number1 * number2;
                System.out.println("Multiplication: " + multiplication);
                break;
            case 4:
                int division = number1 / number2;
                System.out.println("Division: " + division);
                break;
            default:
                System.out.println("Only integer!");
        }
    }
}
