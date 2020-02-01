package AbstractionAndObstruction;

public class Branch{
    private String branchName;
    private String chargingArea;

    public Branch(String branchName, String chargingArea) {
        this.branchName = branchName;
        this.chargingArea = chargingArea;
    }


    public String getBranchName() {
        return branchName;
    }

    public String getChargingArea() {
        return chargingArea;
    }


}
