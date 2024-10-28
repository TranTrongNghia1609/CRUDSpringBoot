package vn.iotstar.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.iotstar.entity.Category;
import vn.iotstar.models.CategoryModel;
import vn.iotstar.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    //Trả về view
    @GetMapping("/home")
    public String all(ModelMap model){
        List<Category> list = categoryService.findAll();
        model.addAttribute("categories", list);
        return "index";
    }
    @GetMapping("/add")
    public String add(Model model){
        CategoryModel category= new CategoryModel();
        category.setIsEdit(false);
        model.addAttribute("categories", category);
        return "admin/category/category-add";
    }
}
