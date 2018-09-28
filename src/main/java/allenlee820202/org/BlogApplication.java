package allenlee820202.org;

import allenlee820202.org.data.Article;
import allenlee820202.org.data.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

    private static ArticleRepository articleRepository;

    @Autowired
    BlogApplication(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
        Article testA = new Article(1L,
                "First Article",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!");
        articleRepository.save(testA);
        articleRepository.save(new Article(2L,
                "Second Article",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
        articleRepository.save(new Article(3L,
                "Third Article",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!"));
    }
}
