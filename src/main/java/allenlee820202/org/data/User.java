package allenlee820202.org.data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * JPA(Java persistence API) based user data schema.
 */
@Entity
@Data
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@RequiredArgsConstructor
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;

    private final String username;
    private final String password;
    private final String fullname;

    @OneToMany(targetEntity = Article.class)
    private List<Article> articleList = new ArrayList<>();

    public void addArticle(Article article) {
        articleList.add(article);
    }
}
