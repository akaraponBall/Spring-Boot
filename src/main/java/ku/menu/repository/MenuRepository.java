package ku.menu.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ku.menu.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
    public Menu findByName(String name);
    List<Menu> findByCategory(String category);

}
