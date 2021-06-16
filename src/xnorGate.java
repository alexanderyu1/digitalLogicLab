public class xnorGate {
    private int _inputA;
    private int _inputB;

    public xnorGate() {
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

    public int xnor() {
        if (_inputA == _inputB) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
