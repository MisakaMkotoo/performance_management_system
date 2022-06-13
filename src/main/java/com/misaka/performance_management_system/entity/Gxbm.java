package com.misaka.performance_management_system.entity;

import lombok.Data;

@Data
public class Gxbm extends AbsSuperObject {


  /** 部门编号 */
  private String bh;
  /** 部门名称 */
  private String mc;
  /** 部门负责人 */
  private String fzr;
  /** 联系电话 */
  private String lxdh;
  /** 性质，例如：行政部门、教学部门、后勤部门 */
  private String xz;
  /** 关联学校代码 */
  private Gxxx gxdm;

}
