package AbstractionAndObstruction;

public class Franchising {
    private Brand brand;


    public String getName() {
        return brand.getBrandName();

    }

    public FranchiseType getType() {
        return brand.getType();
    }

    public void createBrand(Brand brand) {
        this.brand = brand;
    }
}
