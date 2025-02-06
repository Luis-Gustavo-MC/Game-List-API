package com.example.dslist.repositories;

import org.aspectj.weaver.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dslist.entities.GameList;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId ")
    void updateBelogingPosition(Long listId, Long gameId, Integer newPosition);
}
