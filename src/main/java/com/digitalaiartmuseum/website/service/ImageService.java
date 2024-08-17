package com.digitalaiartmuseum.website.service;

import com.digitalaiartmuseum.website.dto.Image;
import com.digitalaiartmuseum.website.entity.ImageEntity;
import com.digitalaiartmuseum.website.entity.PageVisitEntity;
import com.digitalaiartmuseum.website.repository.ImageRepository;
import com.digitalaiartmuseum.website.repository.PageVisitRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;
    private final ModelMapper modelMapper;

    public ImageEntity create(Image image) {
        return imageRepository.save(modelMapper.map(image, ImageEntity.class));
    }

    public List<ImageEntity> getAllBySref(int srefNumber) {
        return imageRepository.findAllBySrefNumber(srefNumber);
    }
}

