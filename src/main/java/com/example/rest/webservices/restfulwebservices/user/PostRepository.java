package com.example.rest.webservices.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interface that extends JpaRepository<Entity, Primary_key>
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    
}
