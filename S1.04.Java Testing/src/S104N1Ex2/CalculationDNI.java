package S104N1Ex2;

public class CalculationDNI {

    private String letter;

    public CalculationDNI(int numDni) {
        String allChar = "TRWAGMYFPDXBNJZSQVHLCKE";
        int module = numDni % 23;
        this.letter = allChar.charAt(module) + "";

    }

    public String getLetter(){
        return letter;
    }

}
