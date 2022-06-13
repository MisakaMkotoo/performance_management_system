package com.misaka.performance_management_system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Gxkb extends AbsSuperObject{

  private long jnm;
  /** 关联学期 */
  private Gxxq gxxq;
  /** 关联课程 */
  private Gxkc gxkc;
  /** 关联教室 */
  private Gxjs gxjs;
  /** 关联教职工 */
  private Gxjzg gxjzg;

  /** 关联班级单位 */
  private Gxbm gxbm;
  /** 班级 */
  private String bjjnm;

  /** 星期 */
  private String xq;

  /** 节次 */
  private String jc;

  /** 创建时间 */
  private Date cjsj;

  /** 学校编号 */
  private Gxxx gxxx;

  /** 课表状态 */
  private String zt;

  /** 操作用户 */
  private String czyh;



}
