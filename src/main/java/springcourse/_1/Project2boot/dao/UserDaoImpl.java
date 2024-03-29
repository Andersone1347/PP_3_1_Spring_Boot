package springcourse._1.Project2boot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import springcourse._1.Project2boot.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private EntityManager em;

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<User> getListUsers() {
        return em.createQuery("select u from User u").getResultList();
    }

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public User getUser(Long id) {
        return em.find(User.class, id);
    }


    @Override
    public void updateUser(User user) {
        em.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
        Query query = em.createQuery ("delete from User " +
                "where id=:userID");
        query.setParameter("userID", id).executeUpdate();
    }

}