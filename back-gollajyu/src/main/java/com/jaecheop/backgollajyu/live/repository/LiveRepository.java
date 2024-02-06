package com.jaecheop.backgollajyu.live.repository;

import com.jaecheop.backgollajyu.live.entity.Live;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LiveRepository extends JpaRepository<Live, Long> {

}

