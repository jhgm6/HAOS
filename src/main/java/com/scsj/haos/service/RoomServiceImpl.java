package com.scsj.haos.service;

import com.scsj.haos.common.domain.Room;
import com.scsj.haos.mapper.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomMapper roomMapper;

    @Override
    public Room findRoomById(String id) {
        return roomMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateRoomById(String id, Room room) {
        roomMapper.updateByPrimaryKey(room);
    }

    @Override
    public void deleteRoomById(String id) {
        roomMapper.deleteByPrimaryKey(id);
    }
}
