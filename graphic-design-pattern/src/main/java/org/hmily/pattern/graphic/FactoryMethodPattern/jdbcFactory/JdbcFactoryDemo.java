package org.hmily.pattern.graphic.FactoryMethodPattern.jdbcFactory;

import java.util.Properties;

public class JdbcFactoryDemo {

    public static void main(String[] args) throws Exception {
           Class<?> clz=Class.forName("org.hmily.pattern.graphic.FactoryMethodPattern.jdbcFactory.MySQLConnectionFactoryImpl");
           ConnectionFactory factory= (ConnectionFactory) clz.newInstance();
           Properties info=new Properties();
           info.put("host","localhost");
           info.put("port","3306");
           info.put("database","test");
           info.put("username","root");
           info.put("password","root");
           Connection connection=factory.create(info);
    }
}
