package org.hmily.pattern.graphic.FactoryMethodPattern.jdbcFactory;

import java.util.Properties;

public interface ConnectionFactory {

    Connection create(Properties info);

}
