package tests;

import AbstractionAndObstruction.Branch;
import AbstractionAndObstruction.Brand;
import AbstractionAndObstruction.FranchiseType;
import AbstractionAndObstruction.Franchising;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FranchasingTest {

    Franchising franchising;
    Brand brand;
    Branch branch;
    String brandName = "Apple";
    FranchiseType franchiseType = FranchiseType.Electronic;
    String branchName= "Akasya";
    String chargingArea= "Anatolia Area of Istanbul";

    @Before
    public void setUp() throws Exception {
        franchising = new Franchising();
        brand = new Brand(brandName,franchiseType);
        branch= new Branch(branchName,chargingArea);

    }

    @Test
    public void CreateFranchasingTest() {
        String brandName = "Ocakoglu";
        FranchiseType franchiseType = FranchiseType.Jeweler;
        Brand brand = new Brand(brandName, franchiseType);
        franchising.createBrand(brand);

        Assert.assertEquals(brandName,franchising.getName());
        Assert.assertEquals(franchiseType,franchising.getType());

    }

    @Test
    public void CreateBrandTest() {
        Assert.assertEquals(brandName,brand.getBrandName());
        Assert.assertEquals(franchiseType,brand.getType());

    }

    @Test
    public void CreateBranchTest() {
        Assert.assertEquals(branchName,branch.getBranchName());
        Assert.assertEquals(chargingArea,branch.getChargingArea());

    }

    @Test
    public void BranchNumberTest() {
        Branch b2 = new Branch("2","2");
        Branch b3 = new Branch( "3","3");
        brand.addBranch(branch);
        brand.addBranch(b2);
        brand.addBranch(b3);

        Assert.assertEquals(3,brand.getBranchNumber());
    }


    @Test
    public void BranchAdderStressTest() {
        int stressNumber =1000000;
        Brand b = new Brand("brand",FranchiseType.Optics);


        for (int i = 0; i <stressNumber  ; i++) {
            Branch branch = new Branch("1","1");
            brand.addBranch(branch);

        }

        Assert.assertEquals(stressNumber,brand.getBranchNumber());
    }

    @Test
    public void DeleteBranchTest() {
        brand.deleteBranch(branch);

        Assert.assertEquals(0,brand.getBranchNumber());


    }
}

