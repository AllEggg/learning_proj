package com.letscode.learning_proj.repo;

import com.letscode.learning_proj.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
