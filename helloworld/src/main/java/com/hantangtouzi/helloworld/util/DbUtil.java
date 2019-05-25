package com.hantangtouzi.helloworld.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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

    public static SqlSession getSqlSession() {
        return getSessionFactory().openSession();
    }

    public static void initDb() {
        String resources = "db/schema.sql";

        Connection connection = getSessionFactory().openSession().getConnection();

        String sql = "runscript from 'classpath:/db/schema.sql'";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
