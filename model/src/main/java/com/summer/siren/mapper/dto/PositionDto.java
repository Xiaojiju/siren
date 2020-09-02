package com.summer.siren.mapper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
  *@date 2020/8/6 22:42
  *@author moyang
  * 描述详细职位信息
  **/
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PositionDto {

    private Long positionId;
    private String positionName;
    private String departmentName;
    private String departmentId;
    private Integer subjectTotal;
    private String description;
    private Long parentPositionId;

}
