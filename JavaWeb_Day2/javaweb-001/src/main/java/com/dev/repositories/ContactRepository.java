package com.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dev.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
