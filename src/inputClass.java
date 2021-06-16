import java.util.Scanner;

public class inputClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First input: ");
        int inputA = in.nextInt();
        System.out.print("Second input: ");
        int inputB = in.nextInt();

        in.close();

        //AND GATE OUTPUT
        andGate andGateObj = new andGate();
        andGateObj.setInputA(inputA);
        andGateObj.setInputB(inputB);

        System.out.println("\nAnd gate output: " + andGateObj.and());

        //OR GATE OUTPUT
        orGate orGateObj = new orGate();
        orGateObj.setInputA(inputA);
        orGateObj.setInputB(inputB);

        System.out.println("Or gate output: " + andGateObj.and());
    }
}
