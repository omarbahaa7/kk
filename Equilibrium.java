public class Equilibrium {
    String equilibrium(int n, int[] inputs) {
        boolean isEquilibrium = true;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < n*3; j+=3) {
                sum += inputs[j];
            }
            if (sum != 0) {
                isEquilibrium = false;
                break;
            }
        }
        if (isEquilibrium) {
            return("YES");
        }
        else {
            return("NO");
        }
    }
}
