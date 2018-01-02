package cn.name.ssh.common;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * Created by Nominal on 2017/12/29 0029.
 * 微博：@李明易DY
 */
@Component
public class BaseDao extends HibernateDaoSupport {

    @Autowired
    public final void setSF(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
