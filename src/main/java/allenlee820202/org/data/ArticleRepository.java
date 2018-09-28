package allenlee820202.org.data;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    List<Article> findAll();
    Article save(Article article);
}
