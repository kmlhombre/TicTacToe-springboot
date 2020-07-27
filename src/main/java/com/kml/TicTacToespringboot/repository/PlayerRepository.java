package com.kml.TicTacToespringboot.repository;

import com.kml.TicTacToespringboot.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    Player findOneByUserName(String userName);
}
