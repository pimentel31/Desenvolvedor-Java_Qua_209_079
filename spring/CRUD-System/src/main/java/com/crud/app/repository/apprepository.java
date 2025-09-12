package com.crud.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.crud.app.models.Pessoa;

public interface apprepository extends CrudRepository<Pessoa, String> {

}
