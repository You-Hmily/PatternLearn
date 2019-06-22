package org.hmily.pattern.graphic.FactoryMethodPattern.jdbcFactoryManager;

import java.util.ArrayList;
import java.util.List;

public class JdbcConnectionFactoryManager {

    public static List<ConnectionFactory> factories=new ArrayList<>();

    public static Connection getConnection(String url,String userName,String pwd){
        for (ConnectionFactory connectionFactory:factories){
            Connection conn=connectionFactory.create(url,userName,pwd);
            if (conn!=null){
                return conn;
            }
        }
        throw new RuntimeException("No DataBase!!");
    }

    public static void registerFactory(ConnectionFactory connectionFactory){
        factories.add(connectionFactory);
    }

}
