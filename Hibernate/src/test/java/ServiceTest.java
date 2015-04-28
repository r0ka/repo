import com.test.dao.AutorDao;
import com.test.dao.BookDao;
import com.test.entities.Autor;
import com.test.services.Service;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.transaction.Transactional;

/**
 * Created by roka on 20.09.14.
 */

@ContextConfiguration(locations = "/spring-config-test.xml")
public class ServiceTest extends AbstractTransactionalTestNGSpringContextTests {


    @Autowired
    private AutorDao autorDao;

    @Autowired
    private BookDao bookDao;

    @Autowired
    private Service service;

    @Autowired
    private SessionFactory sessionFactory;


    @Test

    public void testA(){
        service.oneToMany();

//        sessionFactory.getCurrentSession().clear();

        Autor autor = autorDao.getByName("Roka");
        System.out.println(autor.getCars());
        System.out.println(autor.getBooks());

        System.out.println("asd");
    }

}
