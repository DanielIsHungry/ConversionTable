public class m_k {
    public static void main(String[] args) {
        int FEET_IN_MILE = 5280;
        double KM_IN_MILE = 1.609;

        System.out.printf("%-10s%-12s%-12s    %-10s%-12s%-12s\n",
                "Feet", "Miles", "Km", "Miles", "Feet", "Km");
        for (int i = 1000, j = 1; i <= 10000; i += 1000, j++) {
            double milesFromFeet = (double) i / FEET_IN_MILE;
            double kmFromFeet = milesFromFeet * KM_IN_MILE;

            double feetFromMiles = j * FEET_IN_MILE;
            double kmFromMiles = j * KM_IN_MILE;

            System.out.printf("%-10d%-12.3f%-12.3f    %-10d%-12d%-12.3f\n",
                    i, milesFromFeet, kmFromFeet,
                    j, (int) feetFromMiles, kmFromMiles);
        }
    }
}
