public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance() {
        int max = 31;
        int min = -8;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public boolean simulate() {
        int turn = 0;
        int pos = 0;
        while (turn < maxHops) {
            pos += hopDistance();
            if (pos >= goalDistance) {
                return true;
            }
            if (pos < 0) {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num) {
        double numtrue = 0.0;
        for (int i = 0; i < num; i++) {
            if (simulate()) {
                numtrue++;
            }
        }
        return numtrue/num;
    }
}
