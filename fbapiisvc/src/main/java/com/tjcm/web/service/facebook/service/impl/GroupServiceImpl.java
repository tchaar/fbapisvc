package com.tjcm.web.service.facebook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tjcm.web.service.facebook.config.FacebookClient;
import com.tjcm.web.service.facebook.mapper.GroupMapper;

import com.tjcm.web.service.facebook.model.GroupDTO;
import com.tjcm.web.service.facebook.service.GroupService;

import facebook4j.FacebookException;
@Component
public class GroupServiceImpl implements GroupService {
	@Autowired
	FacebookClient facebookCfg;

	@Autowired
	GroupMapper groupMapper;

	@Override
	public GroupDTO GetGroupById(String id) throws FacebookException {
		return groupMapper
				.map(facebookCfg.facebook()
						.groups()
						.getGroup(id));
	}

	@Override
	public List<GroupDTO> GetGroupsByName(String name) throws FacebookException 
	{
		try
		{
			return groupMapper.map(facebookCfg.facebook()
					.groups()
					.getGroups(name));
		}
		catch (FacebookException e) {
            e.getErrorMessage();
        }
		return null;
	}

}
