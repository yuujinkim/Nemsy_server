package com.nemsy.nemsy_server.domain.comment_law;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommentLaw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
