package com.digitalaiartmuseum.website.repository;

import com.digitalaiartmuseum.website.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<ImageEntity, Integer> {

    List<ImageEntity> findAllBySrefNumber(int srefNumber);
}
