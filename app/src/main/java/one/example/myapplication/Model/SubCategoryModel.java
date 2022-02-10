package one.example.myapplication.Model;

public class SubCategoryModel {
    private int iconImage;
    private String categoryName;

    public SubCategoryModel(int iconImage, String categoryName) {
        this.iconImage = iconImage;
        this.categoryName = categoryName;
    }

    public int getIconImage() {
        return iconImage;
    }

    public void setIconImage(int iconImage) {
        this.iconImage = iconImage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
