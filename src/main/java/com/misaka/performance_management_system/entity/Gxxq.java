package com.misaka.performance_management_system.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Gxxq extends AbsSuperObject{


  /** 学期编号 */
  private String bh;
  /** 学期名称 */
  private String mc;
  /** 起始学年 */
  private Long qsxn;
  /** 结束学年 */
  private Long jsxn;
  /** 第几学期 */
  private String xq;
  /** 第一周日期 */
  private Date dyzrq;
  /**  总周数 */
  private Long zzs;
  /** 所属学校 */
  private Gxxx ssxx;



}
