package com.hantangtouzi.helloworld.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @author WilliamChang.
 * Created on 2019-05-26 06:50:33
 */

public class DbUtil {
    public static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resources = "configuration.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resources));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sessionFactory;
    }
}
