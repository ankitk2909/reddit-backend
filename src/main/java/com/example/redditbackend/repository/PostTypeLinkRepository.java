package com.example.redditbackend.repository;

import com.example.redditbackend.entity.PostTypeLink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostTypeLinkRepository extends JpaRepository<PostTypeLink, Integer> {
}