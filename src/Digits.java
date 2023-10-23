import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        if(num < 0) throw new IllegalArgumentException("The number passed to the constructor (-1984) cannot be negative!");

        digitList = new ArrayList<>();
        String digit = "" + num;
        for(int i = 0; i < digit.length(); i++) {
            digitList.add((int) digit.charAt(i) - 48); //why do i have to - 48, this makes no logical sense to me
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for(int i = 1; i < digitList.size();i++) {
            if(digitList.get(i) <= digitList.get(i-1)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }
}
