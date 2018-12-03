package com.ramesh.controller;

import com.ramesh.model.Product;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
@ComponentScan
public class ProductController {

    @ApiOperation(value="get all products")
    @GetMapping("/getProducts")
    @RequestMapping(value = "/getProducts", method = RequestMethod.GET)
    public List<Product> getProducts(){

        List<Product> products = new ArrayList<>();
        Product p1 = new Product("Mobile", 1, "Mobile Phone");
        Product p2 = new Product("speakers", 2, "Speakers");
        products.add(p1);
        products.add(p2);

        return products;
    }

    @ApiOperation(value="get product by name")
    @GetMapping("/getProducts/{name}")
    @RequestMapping(value = "/getProducts/{name}", method = RequestMethod.GET)
    public List<Product> getProducts(@PathVariable String name){

        List<Product> products = new ArrayList<>();
        Product p1 = new Product("Mobile", 1, "Mobile Phone");
        Product p2 = new Product("speakers", 2, "Speakers");
        products.add(p1);
        products.add(p2);

        return products;
    }

    @ApiOperation(value="store the product")
    @PostMapping("/save")
    @RequestMapping(value = "/save", method = RequestMethod.PUT)
    public String saveProduct(@RequestBody Product prod){

        return "product has saved successfully";
    }

    @ApiOperation(value="remove the product")
    @DeleteMapping("/delete")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String delete(@RequestBody Product prod){

        return "Product has deleted successfully";
    }
    @ApiOperation(value="upload product file.")
    @PostMapping("/upload")
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String fileUpload(@RequestParam MultipartFile fileName){

        String status="File is uploaded successfully";
        return status;

    }
}
