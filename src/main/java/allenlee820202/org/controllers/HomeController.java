package allenlee820202.org.controllers;

import allenlee820202.org.data.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomeController {

    private ArticleRepository articleRepository;

    @Autowired
    HomeController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping
    public String getIndexPage(Model model) {
        model.addAttribute("articles", articleRepository.findAll());
        return "index";
    }
}
