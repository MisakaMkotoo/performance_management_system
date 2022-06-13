package com.misaka.performance_management_system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Gxyh extends AbsSuperObject{

//  private String zh;
  /** 昵称 */
  private String nc;

  /** 密码 */
  private String mm;

  /** 注册时间 */
  private Date zcsj;

  /** 状态 */
  private String zt;


}
