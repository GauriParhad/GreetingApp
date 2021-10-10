package cm.bridgelabz.MyGreetingApp.repository;


import cm.bridgelabz.MyGreetingApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository <User, Integer> {

}
