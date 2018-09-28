package allenlee820202.org.data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.util.Date;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class Article {

    @Id
    private final Long articleId;

    private final String title;
    private final String content;

    private Date createdAt;

    @PrePersist
    public void createdAt() {
        this.createdAt = new Date();
    }
}
