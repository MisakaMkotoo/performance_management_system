package com.misaka.performance_management_system.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Gxkc extends AbsSuperObject{


  /** 课程号 */
  private String kch;

  /** 课程名称 */
  private String kcmc;

  /** 学分 */
  private BigDecimal xf;

  /** 周学时 */
  private Long zhxs;

  /** 总学时 */
  private Long zxs;

  /** 理论学时 */
  private Long llxs;

  /** 实验学时 */
  private Long syxs;

  /** 课程简介 */
  private String kcjj;

  /** 教材 */
  private String jc;

  /** 参考书目 */
  private String cksm;

  /** 课程负责人 */
  private String kcfzr;

  /** 所属专业 */
  private Gxzy sszy;



}
