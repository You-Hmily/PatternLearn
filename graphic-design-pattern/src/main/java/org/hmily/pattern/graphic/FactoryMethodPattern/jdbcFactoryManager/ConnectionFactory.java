package org.hmily.pattern.graphic.FactoryMethodPattern.jdbcFactoryManager;

public interface ConnectionFactory {

    Connection create(String url,String userName,String pwd);

    boolean acceptURL(String url);

}
