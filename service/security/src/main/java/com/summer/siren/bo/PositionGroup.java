package com.summer.siren.bo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
  *@date 2020/8/8 0:26
  *@author moyang
  * 职位树
  **/
@Setter
@Getter
public class PositionGroup implements Serializable {

    private Long positionId;
    private String positionName;
    private String departmentName;
    private String departmentId;
    private Integer subjectTotal;
    private String description;
    private Long parentPositionId;
    private List<PositionGroup> positionGroups;

    public static PositionGroup init() {
        PositionGroup positionGroup = new PositionGroup();
        positionGroup.setPositionGroups(new ArrayList<>());
        return positionGroup;
    }
}
