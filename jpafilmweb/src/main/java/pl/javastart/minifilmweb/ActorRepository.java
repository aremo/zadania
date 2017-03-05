package pl.javastart.minifilmweb;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aremo on 3/5/2017.
 */
public interface ActorRepository extends JpaRepository<Actor, Long> {
}
