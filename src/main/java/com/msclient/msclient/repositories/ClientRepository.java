package com.msclient.msclient.repositories;

import com.msclient.msclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Long> {
}
