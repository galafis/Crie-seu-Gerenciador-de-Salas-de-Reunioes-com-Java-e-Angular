package com.gerenciadorsalas.service;

import com.gerenciadorsalas.model.MeetingRoom;
import com.gerenciadorsalas.repository.MeetingRoomRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MeetingRoomService {
    private final MeetingRoomRepository repository;

    public List<MeetingRoom> listAll() {
        return repository.findAll();
    }

    public MeetingRoom getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public MeetingRoom save(MeetingRoom room) {
        return repository.save(room);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}