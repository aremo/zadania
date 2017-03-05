package pl.javastart.minifilmweb;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aremo on 2/28/2017.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
