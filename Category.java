package groupwork.demo;

public class Category {
    private Long id;
    private String categoryName;
    private String subcategory;

    public Category(String categoryName, String subcategory) {
        this.categoryName = categoryName;
        this.subcategory = subcategory;
    }

    private Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", subcategory='" + subcategory + '\'' +
                '}';
    }
}