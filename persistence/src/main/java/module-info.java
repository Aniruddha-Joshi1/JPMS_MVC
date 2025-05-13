module example.persistence {
    requires java.persistence;
    requires java.sql;

    requires java.xml.bind;
    requires net.bytebuddy;

    requires spring.context;
    requires spring.data.jpa;
    requires spring.jdbc;
    requires spring.orm;
    requires spring.tx;

    exports com.example.entity;
    exports com.example.repository to example.service;

    opens com.example.repository to spring.core, spring.beans, spring.data.jpa;
    opens com.example.entity to org.hibernate.orm.core, spring.core, spring.data.jpa, spring.beans;
}