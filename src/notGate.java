public class notGate {
    private int _inputA;

    public notGate() {
    }

    public void setInput (int newInputA) {
        if (newInputA != 0 && newInputA != 1) {
            System.out.print("Your input must be 0 or 1.");
            System.exit(1);
        }
        else {
            this._inputA = newInputA;
        }
    }

    public int not() {
        if (_inputA == 1) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
