package com.GWork.myDiary.repository;

import com.GWork.myDiary.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Long> {
    List<Entry> findByUserIdOrderByCreatedOnDesc(Long diaryId);
}
