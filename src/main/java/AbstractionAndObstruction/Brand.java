package AbstractionAndObstruction;

import java.util.ArrayList;

public class Brand{
    private String brandName;
    private FranchiseType type;
    private ArrayList<Branch> branchList;

    public Brand(String brandName, FranchiseType type) {
        this.brandName = brandName;
        this.type = type;
        branchList = new ArrayList<Branch>();
    }

    public String getBrandName() {
        return brandName;
    }

    public FranchiseType getType() {
        return type;
    }

    public int getBranchNumber() {
        return branchList.size();
    }

    public void addBranch(Branch branch) {
        branchList.add(branch);
    }

    public void deleteBranch(Branch branch) {
        branchList.remove(branch);
    }
}

