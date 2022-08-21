package practiceoop;

public  class Product {
    private int ProductIndex;
    private String ProductName;
    private String ProductType;
    private String ScopeOfUse;

    public Product (int index, String name, String type, String scope) {
        this.ProductIndex = index;
        this.ProductName = name;
        this.ProductType = type;
        this.ScopeOfUse = scope;
    }

    int getProductIndex () {
        return this.ProductIndex;
    }
    String getProductName () {
        return this.ProductName;
    }
    String getProductType () {
        return this.ProductType;
    }
    String getScopeOfUse () {
        return this.ScopeOfUse;
    }
    void setProductIndex (int index) {
        this.ProductIndex = index;
    }
    void setProductName (String ProductName) {
        this.ProductName = ProductName;
    }
    void setProductType (String ProductType) {
        this.ProductType = ProductType;
    }
    void setScopeOfUse (String ScopeOfUse) {
        this.ScopeOfUse = ScopeOfUse;
    }
    void printInfoAboutProduct () {
        System.out.println("Information about Product of production : ");
        System.out.println("Product index : " + this.ProductIndex);
        System.out.println("Product name : " + this.ProductName);
        System.out.println("Product type : " + this.ProductType);
        System.out.println("Product scope of use : " + this.ScopeOfUse);
    }
}
