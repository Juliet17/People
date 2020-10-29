package web.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public abstract class AbstractDao {

    
    @PersistenceContext
    EntityManager entityManager;

    protected EntityManager getEntityManager(){
        return this.entityManager;
    }


}
