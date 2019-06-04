package org.hmily.pictureShowPattern.FactoryMethodPattern.jdbcFactory;

import java.util.Properties;

public class MySQLConnection implements Connection{

    private Properties properties;

    public MySQLConnection(Properties info) {
        System.out.println("生成mysql链接！");
        this.properties=info;
    }



}
