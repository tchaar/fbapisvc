package com.tjcm.web.service.facebook.mapper.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.tjcm.web.service.facebook.mapper.GroupMapper;
import com.tjcm.web.service.facebook.model.GroupDTO;

import facebook4j.Group;
import facebook4j.ResponseList;

@Component
public class GroupMapperImpl implements GroupMapper {

	@Override
	public List<GroupDTO> map(ResponseList<Group> groups) {

		return groups.stream().map(this::map)
				.collect(Collectors.toList());
	}

	@Override
	public GroupDTO map(Group fbGroup) {
		return GroupDTO.builder()	
				.name(fbGroup.getName())
				.build();
	}
	 	

}
