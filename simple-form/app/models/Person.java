package models;

import javax.persistence.Entity;


@Entity
public class Person extends com.avaje.ebean.Model{


    public long id;
    public String name;
}
