package S104N1Ex1;


import java.util.Arrays;
import java.util.List;

public class Months {
    private List<String> listMonths;

    public Months() {
        listMonths = Arrays.asList("January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December");

    }
    public int getSize() {
        return this.listMonths.size();
    }
    public String getElement(int pos) {
        return listMonths.get(pos);
    }
    public List<String> getList() {
        return listMonths;
    }


}

