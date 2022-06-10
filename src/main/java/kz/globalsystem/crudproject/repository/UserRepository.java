package kz.globalsystem.crudproject.repository;

import kz.globalsystem.crudproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>
{

}
