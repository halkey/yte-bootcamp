package practice_8;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String category;
    private List<String> subcategories;
    private double price;

    public Product(String name, String category, List<String> subcategories, double price) {
        this.name = name;
        this.category = category;
        this.subcategories = subcategories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<String> subcategories) {
        this.subcategories = subcategories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class ProductTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", Arrays.asList("Computers", "Gaming"), 1200));
        products.add(new Product("Smartphone", "Electronics", Arrays.asList("Phones", "Accessories"), 800));
        products.add(new Product("Mouse", "Electronics", Arrays.asList("Peripherals", "Wireless"), 150));
        products.add(new Product("T-Shirt", "Fashion", Arrays.asList("Clothing", "Summer Wear"), 25));
        products.add(new Product("Sneakers", "Fashion", Arrays.asList("Shoes", "Running"), 80));
        products.add(new Product("Keyboard", "Electronics", Arrays.asList("Peripherals", "Wireless"), 150));
        products.add(new Product("Headphones", "Electronics", Arrays.asList("Audio", "Wireless"), 150));
        products.add(new Product("Dress", "Fashion", Arrays.asList("Clothing", "Summer Wear"), 45));
        products.add(new Product("Desktop PC", "Electronics", Arrays.asList("Computers", "Gaming"), 1000));
        products.add(new Product("Phone", "Electronics", Arrays.asList("Phones", "Accessories"), 800));

        // 1. Tüm alt kategorilerden benzersiz alt kategori listesi oluşturma
        List<String> uniqueSubcategories = products.stream()
                .flatMap(product -> product.getSubcategories().stream()) // FlatMap ile alt kategorileri alıyoruz
                .distinct() // Benzersiz alt kategorileri elde ediyoruz
                .toList();

        System.out.println("Benzersiz Alt Kategoriler: " + uniqueSubcategories);

        // 2. Her bir ürünün alt kategorileriyle birlikte kategoriye göre gruplandırılması
        Map<String, List<String>> categoriesWithSubcategories = products.stream()
                .collect(Collectors.toMap(Product::getCategory, Product::getSubcategories,
                        (existingSubcategories, newSubcategories) -> {
                            Set<String> allSubcategories = new HashSet<>(existingSubcategories);
                            allSubcategories.addAll(newSubcategories);
                            return allSubcategories.stream().toList();
                        }));

        System.out.println("Kategoriye Göre Alt Kategoriler: " + categoriesWithSubcategories);
    }
}
