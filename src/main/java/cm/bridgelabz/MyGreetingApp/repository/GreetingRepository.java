package cm.bridgelabz.MyGreetingApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository  extends JpaRepository<User, Integer> {

}
