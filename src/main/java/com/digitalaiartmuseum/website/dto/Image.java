package com.digitalaiartmuseum.website.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    private String imageUrl;
    private String imagePrompt;
    private int srefNumber;
}
