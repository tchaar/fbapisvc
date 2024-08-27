package com.tjcm.web.service.facebook.service;

import java.util.List;

import com.tjcm.web.service.facebook.model.GroupDTO;

import facebook4j.FacebookException;

public interface GroupService {
	GroupDTO GetGroupById(String id) throws FacebookException;
	List<GroupDTO> GetGroupsByName(String name) throws FacebookException;
}
