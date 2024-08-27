package com.tjcm.web.service.facebook.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupDTO {
	Integer version;
    String name;
    String id;
    Integer bookmarkOrder;
}
