public class HighPoint {
    String highPointName;
    int maxElevation;

    public HighPoint(String highPointName, int maxElevation) {
        setName(highPointName);
        setElevation(maxElevation);
    }
    public void setName(String highPointName) {
        this.highPointName = highPointName;
    }
    public void setElevation(int maxElevation) {
        if (maxElevation >= 0) {
            this.maxElevation = maxElevation;
        } else {
            this.maxElevation = 0;
        }
    }
    public int getMaxElevation() {
        return(maxElevation);
    }
    public String getHighPointName() {
        return(highPointName);
    }
    public String toString() {
        return(String.format("Highest point name: %s Maximum elevation: %d",
                highPointName, maxElevation));
    }
}