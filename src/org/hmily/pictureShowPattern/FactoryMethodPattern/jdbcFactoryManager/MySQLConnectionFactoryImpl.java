package org.hmily.pictureShowPattern.FactoryMethodPattern.jdbcFactoryManager;

public class MySQLConnectionFactoryImpl implements ConnectionFactory {

    static {
        JdbcConnectionFactoryManager.registerFactory(new MySQLConnectionFactoryImpl());
    }

    @Override
    public Connection create(String url, String userName, String pwd) {
        if (acceptURL(url)){
            // do something
        }
        return null;
    }

    @Override
    public boolean acceptURL(String url) {
        return url.startsWith("jdbc:mysql");
    }
}
