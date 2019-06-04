package org.hmily.pictureShowPattern.FactoryMethodPattern.jdbcFactoryManager;

public interface ConnectionFactory {

    Connection create(String url,String userName,String pwd);

    boolean acceptURL(String url);

}
