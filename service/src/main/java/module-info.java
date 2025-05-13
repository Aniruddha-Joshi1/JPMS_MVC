module example.service {
    requires example.persistence;

    requires spring.context;
    requires spring.beans;

    exports com.example.service;
    exports com.example.service.impl;
//    opens com.example.service.impl to spring.beans;
//    opens com.example.service to spring.beans;
}