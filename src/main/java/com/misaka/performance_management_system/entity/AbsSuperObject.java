package com.misaka.performance_management_system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public abstract class AbsSuperObject {

   private String oldId;
   @TableId
   private String id;

   private String name;

   private String moduleCode;

   private String moduleName;

   private String statusCode;

   private Date createDate;

   private Date businessDate;

   private Date updateDate;

   private Date deleteDate;

   private Boolean canDeleted;

   private String status;



}
