package edu.hm.cs.iua.repositories;

import edu.hm.cs.iua.models.Token;
import org.springframework.data.repository.CrudRepository;

public interface TokenRepository extends CrudRepository<Token, Long> {

}