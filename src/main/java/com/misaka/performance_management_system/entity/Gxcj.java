package com.misaka.performance_management_system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Gxcj extends AbsSuperObject {

  @TableId
  private Long jnm;

  @TableField(exist = false)
  private Gxxs gxxs;
  @TableField(exist = false)
  private Gxkc gxkc;
  @TableField(exist = false)
  private Gxjzg gxjzg;
  @TableField(exist = false)
  private Gxxq gxxq;

  /** 成绩 */
  private Double cj;


  private String lx;

  /** 考试时间 */
  private Date kssj;

  /** 数据采集时间 */
  private Date sjcjsj;
  @TableField(exist = false)
  /** 用户账号 */
  private Gxyh gxyh;



}
