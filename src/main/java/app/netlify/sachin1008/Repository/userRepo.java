package app.netlify.sachin1008.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.netlify.sachin1008.Entity.Users;


@Repository
public interface userRepo extends JpaRepository<Users, Long> {
	
	public List<Users> findByChatId(String ChatId);
	public String deleteByChatId(String ChatId);

}
