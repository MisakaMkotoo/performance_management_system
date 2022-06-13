package com.misaka.performance_management_system.entity;

import lombok.Data;

@Data
public class Gxzy extends AbsSuperObject{


  /** 专业号 */
  private String zyh;
  /** 专业名称 */
  private String zymc;
  /** 专业简称 */
  private String zyjc;
  /** 专业英文名称 */
  private String zyywmc;
  /** 专业方向 */
  private String zyfx;
  /** 学制，年为单位 */
  private String xz;
  /** 开设年月 **/
  private String ksny;
  /** 起始学期 */
  private String qsxq;
  /** 执行部门 */
  private Gxbm zxbm;
  /** 所属学校 */
  private Gxxx ssxx;


}
