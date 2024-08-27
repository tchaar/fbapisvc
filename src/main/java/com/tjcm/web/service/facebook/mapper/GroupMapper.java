package com.tjcm.web.service.facebook.mapper;	

import java.util.List;

import com.tjcm.web.service.facebook.model.GroupDTO;

import facebook4j.Group;
import facebook4j.ResponseList;

public interface GroupMapper {
	List<GroupDTO> map(ResponseList<Group> groups);
	GroupDTO map(Group fbGroup);
}
