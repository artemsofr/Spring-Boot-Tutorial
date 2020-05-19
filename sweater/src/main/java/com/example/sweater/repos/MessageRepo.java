package com.example.sweater.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.sweater.domain.Message;

// This will be AUTO IMPLEMENTED by Spring into a Bean called messageRepo
// CRUD refers Create, Read, Update, Delete

public interface MessageRepo extends CrudRepository<Message, Long> {

	List<Message> findByTag (String tag);
}