module example.web {
    requires example.persistence;
    requires example.service;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.web;
    requires spring.data.jpa;

    opens com.example.web to spring.core, spring.beans, spring.context;
    opens com.example.web.controller to spring.beans, spring.web;
}