import { Component, OnInit } from '@angular/core';
import { RoomService, Room } from '../room.service';

@Component({
  selector: 'app-room-list',
  templateUrl: './room-list.component.html',
  styleUrls: ['./room-list.component.css']
})
export class RoomListComponent implements OnInit {
  rooms: Room[] = [];
  newRoom: Room = { name: '', location: '', capacity: 0 };

  constructor(private roomService: RoomService) { }

  ngOnInit(): void {
    this.loadRooms();
  }

  loadRooms() {
    this.roomService.getRooms().subscribe(data => this.rooms = data);
  }

  addRoom() {
    if (this.newRoom.name && this.newRoom.location && this.newRoom.capacity > 0) {
      this.roomService.createRoom(this.newRoom).subscribe(() => {
        this.loadRooms();
        this.newRoom = { name: '', location: '', capacity: 0 };
      });
    }
  }

  deleteRoom(id: number) {
    this.roomService.deleteRoom(id).subscribe(() => this.loadRooms());
  }
}