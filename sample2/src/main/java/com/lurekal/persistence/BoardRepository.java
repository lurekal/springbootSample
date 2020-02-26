package com.lurekal.persistence;

import org.springframework.data.repository.CrudRepository;

import com.lurekal.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}
