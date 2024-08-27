package com.tjcm.web.service.facebook.controller;

import facebook4j.FacebookException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tjcm.web.service.facebook.model.GroupDTO;
import com.tjcm.web.service.facebook.service.GroupService;

@RestController
@RequestMapping("/query/group")
public class GroupSearchController {
	@Autowired
	GroupService groupService;
	
	@GetMapping("/id/{id}")
	public GroupDTO GetGroupById(@PathVariable("id") String id) throws FacebookException
	{
		return groupService.GetGroupById(id);
	}
	@GetMapping(value="/name/{name}")
	public List<GroupDTO> GetGroupByName(@PathVariable("name") String name) throws FacebookException
	{ 
		return groupService.GetGroupsByName(name);
	}
}
