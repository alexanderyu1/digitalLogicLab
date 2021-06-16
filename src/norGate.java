public class norGate {
    private int _inputA;
    private int _inputB;

    public norGate() {
    }

    public void setInputA (int newInputA) {
        if (newInputA != 0 && newInputA != 1) {
            System.out.print("Your input must be 0 or 1.");
            System.exit(1);
        }
        else {
            this._inputA = newInputA;
        }
    }

    public void setInputB (int newInputB) {
        if (newInputB != 0 && newInputB != 1) {
            System.out.print("Your input must be 0 or 1.");
            System.exit(1);
        }
        else {
            this._inputB = newInputB;
        }
    }

    public int nor() {
        if (_inputA == 0 && _inputB == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
