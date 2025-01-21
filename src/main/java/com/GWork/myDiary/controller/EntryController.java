package com.GWork.myDiary.controller;

import com.GWork.myDiary.entity.Entry;
import com.GWork.myDiary.service.EntryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {

    private final EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    // Method to create a new entry
    @PostMapping
    public ResponseEntity<Entry> createEntry(@RequestBody Entry entry) {
        Entry newEntry = entryService.createEntry(entry);
        return ResponseEntity.status(201).body(newEntry); // Return newly created entry with 201 status
    }

    // Method to fetch all entries for a user by user ID
    @GetMapping
    public ResponseEntity<List<Entry>> getEntries(@RequestParam Long userId) {
        List<Entry> entries = entryService.FindEntriesbyUserId(userId); // Corrected method name
        return ResponseEntity.status(200).body(entries); // Return entries with 200 status
    }
}
