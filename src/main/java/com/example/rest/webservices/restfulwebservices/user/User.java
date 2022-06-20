package com.example.rest.webservices.restfulwebservices.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity // from JPA Java Persistence API
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    
    @Size(min = 2, message = "Name should have atleast 2 characters")
    private String name;
    
    @Past
    private Date birthDate;

    // A post has one to many relationship. 
    @OneToMany(mappedBy = "user") // I would actually just create the relationship column of user in post, the name of the field in post.
    private List<Post> posts;

    public User() {
    }

    public User(Integer id, String name, Date birthDate) {

        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }


    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", birthDate='" + getBirthDate() + "'" +
                "}";
    }

}
