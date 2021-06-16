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

        System.out.println("\nAND gate output: " + andGateObj.and());

        //NAND GATE OUTPUT

        nandGate nandGateObj = new nandGate();
        nandGateObj.setInputA(inputA);
        nandGateObj.setInputB(inputB);

        System.out.println("NAND gate output: " + nandGateObj.nand());

        //OR GATE OUTPUT
        orGate orGateObj = new orGate();
        orGateObj.setInputA(inputA);
        orGateObj.setInputB(inputB);

        System.out.println("OR gate output: " + orGateObj.or());

        //NOR GATE OUTPUT
        norGate norGateObj = new norGate();
        norGateObj.setInputA(inputA);
        norGateObj.setInputB(inputB);

        System.out.println("NOR gate output: " + norGateObj.nor());

        //XOR GATE OUTPUT
        xorGate xorGateObj = new xorGate();
        xorGateObj.setInputA(inputA);
        xorGateObj.setInputB(inputB);

        System.out.println("XOR gate output: " + xorGateObj.xor());

        //XNOR GATE OUTPUT
        xnorGate xnorGateObj = new xnorGate();
        xnorGateObj.setInputA(inputA);
        xnorGateObj.setInputB(inputB);

        System.out.println("XNOR gate output: " + xnorGateObj.xnor());

        //NOT GATE OUTPUT
        notGate notGateObj = new notGate();
        notGateObj.setInput(inputA);

        System.out.println("NOT gate output (uses first input): " + notGateObj.not());

        //FIRST IMAGE CODE
        notGate notGateAFirstImage = new notGate();
        notGate notGateBFirstImage = new notGate();
        andGate andGateTopFirstImage = new andGate();
        andGate andGateBottomFirstImage = new andGate();
        orGate orGateFirstImage = new orGate();

            //first layer
            notGateAFirstImage.setInput(inputA);
            notGateBFirstImage.setInput(inputB);

            //second layer
            andGateTopFirstImage.setInputA(notGateAFirstImage.not());
            andGateTopFirstImage.setInputB(inputB);

            andGateBottomFirstImage.setInputA(inputA);
            andGateBottomFirstImage.setInputB(notGateBFirstImage.not());

            //third layer
            orGateFirstImage.setInputA(andGateTopFirstImage.and());
            orGateFirstImage.setInputB(andGateBottomFirstImage.and());

            //output
            System.out.println("\nFirst image output: " + orGateFirstImage.or());

        //SECOND IMAGE CODE
        xnorGate xnorGateSecondImage = new xnorGate();
        nandGate nandGateSecondImage = new nandGate();

            //only layer
            xnorGateSecondImage.setInputA(inputA);
            xnorGateSecondImage.setInputB(inputB);

            nandGateSecondImage.setInputA(inputA);
            nandGateSecondImage.setInputB(inputB);

            //output
            System.out.println("Second image S output: " + xnorGateSecondImage.xnor());
            System.out.println("Second image C output: " + nandGateSecondImage.nand());
    }
}
