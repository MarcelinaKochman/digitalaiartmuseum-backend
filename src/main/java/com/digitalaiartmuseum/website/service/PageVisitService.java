package com.digitalaiartmuseum.website.service;

import com.digitalaiartmuseum.website.entity.PageVisitEntity;
import com.digitalaiartmuseum.website.repository.PageVisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PageVisitService {

    private final PageVisitRepository pageVisitRepository;

    public long getNumber() {
        return pageVisitRepository.count();
    }

    public long create() {
        pageVisitRepository.save(new PageVisitEntity());
        return pageVisitRepository.count();
    }
}
