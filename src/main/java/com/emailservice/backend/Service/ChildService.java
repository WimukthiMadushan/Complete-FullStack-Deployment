package com.emailservice.backend.Service;

import com.emailservice.backend.Models.Child;
import com.emailservice.backend.Repository.ChildRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {
    private ChildRepository childRepository;

    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    public List<Child> getChild() {
        return childRepository.findAll();

    }
}
