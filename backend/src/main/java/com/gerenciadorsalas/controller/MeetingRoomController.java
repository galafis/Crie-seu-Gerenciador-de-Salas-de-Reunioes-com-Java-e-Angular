package com.gerenciadorsalas.controller;

import com.gerenciadorsalas.model.MeetingRoom;
import com.gerenciadorsalas.service.MeetingRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
@RequiredArgsConstructor
public class MeetingRoomController {
    private final MeetingRoomService service;

    @GetMapping
    public List<MeetingRoom> all() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MeetingRoom> get(@PathVariable Long id) {
        MeetingRoom room = service.getById(id);
        return room != null ? ResponseEntity.ok(room) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public MeetingRoom create(@RequestBody MeetingRoom room) {
        return service.save(room);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}