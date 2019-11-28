package com.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.entities.PostAttachment;

@Repository
public interface PostAttachmentRepository extends JpaRepository<PostAttachment, Integer> {
}