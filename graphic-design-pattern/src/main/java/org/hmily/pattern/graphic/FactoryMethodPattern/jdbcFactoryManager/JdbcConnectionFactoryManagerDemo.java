package org.hmily.pattern.graphic.FactoryMethodPattern.jdbcFactoryManager;


public class JdbcConnectionFactoryManagerDemo {

    public static void main(String[] args) throws Exception {
           Class<?> clz=Class.forName("org.hmily.pattern.graphic.FactoryMethodPattern.jdbcFactoryManager.MySQLConnectionFactoryImpl");
           Connection connection=JdbcConnectionFactoryManager.getConnection("jdbc:mysql:localhost:3306/test","root","root");
           System.out.println("Create Start!!");
    }
}
