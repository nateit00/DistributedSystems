package com.acme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/products")
    public String getAllProducts(Model model) {
        Iterable<Product> products= productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }


}
