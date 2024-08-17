package com.digitalaiartmuseum.website.controller;

import com.digitalaiartmuseum.website.dto.Image;
import com.digitalaiartmuseum.website.entity.ImageEntity;
import com.digitalaiartmuseum.website.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/image")
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @GetMapping(value = "/sref")
    public List<ImageEntity> getBySref(@RequestParam int id) {
        return imageService.getAllBySref(id);
    }

    @PostMapping
    public ImageEntity post(@RequestBody Image image) {
        return imageService.create(image);
    }

}
