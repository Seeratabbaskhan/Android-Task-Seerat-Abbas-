package one.example.myapplication.Model;

public class TitleCategoryModel {
    private int iconImage,rating;
    private String distance,oldPrice,newPrice,discount,productName,productService;

    public TitleCategoryModel(int iconImage, int rating, String distance, String oldPrice, String newPrice, String discount, String productName, String productService) {
        this.iconImage = iconImage;
        this.rating = rating;
        this.distance = distance;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.discount = discount;
        this.productName = productName;
        this.productService = productService;
    }

    public int getIconImage() {
        return iconImage;
    }

    public void setIconImage(int iconImage) {
        this.iconImage = iconImage;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductService() {
        return productService;
    }

    public void setProductService(String productService) {
        this.productService = productService;
    }
}
