package com.example.redixte.repository;

import com.example.redixte.model.Comment;
import com.example.redixte.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
}
