package allenlee820202.org.data;

import org.springframework.data.repository.CrudRepository;

/**
 * JPA style repository. JAP automatically generates the repository implementation of this interface.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserId(Long userId);
}
