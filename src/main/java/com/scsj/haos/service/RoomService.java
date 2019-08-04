package com.scsj.haos.service;

import com.scsj.haos.common.domain.Room;

public interface RoomService {

    public Room findRoomById(String id);
    public void updateRoomById(String id, Room room);
    public void deleteRoomById(String id);
}
