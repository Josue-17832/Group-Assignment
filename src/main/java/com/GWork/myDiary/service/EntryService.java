package com.GWork.myDiary.service;


import com.GWork.myDiary.entity.Entry;
import com.GWork.myDiary.repository.EntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {
    private final EntryRepository entryRepository;
    public EntryService(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    public Entry createEntry(Entry entry) {
        return entryRepository.save(entry);
    }
    public List<Entry> FindEntriesbyUserId(Long userId) {
        return entryRepository.findByUserIdOrderByCreatedOnDesc(userId);
    }
}
