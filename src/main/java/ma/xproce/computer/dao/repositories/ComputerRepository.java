package ma.xproce.computer.dao.repositories;

import ma.xproce.computer.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer,Long> {
    public List<Computer> findByProce(String proce);
}
