package com.leisure.entity.dto.Team;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateTeamResource {
    private Long parentId;
    private Long childId;
    private Date created_date;
    private Boolean isActive;
}
