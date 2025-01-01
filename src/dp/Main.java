package dp;

import dp.nth_catalan_number.CatalanNumber;
import dp.nth_catalan_number.CatalanNumberMemoization;
import dp.nth_catalan_number.CatalanNumberTabular;

public class Main {
    public static void main(String[] args) {

        int n = 4;

        CatalanNumber catalanNumber = new CatalanNumberTabular();
        System.out.println(catalanNumber.getCatalan(n));

    }
}
