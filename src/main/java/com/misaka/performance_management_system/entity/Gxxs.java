package com.misaka.performance_management_system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class Gxxs extends AbsSuperObject{


  /** 学号 */
  private String xh;
  /** 单位号，与学校代码关联 */
  private String dwh;
  /** 姓名 */
  private String xm;
  /** 英文姓名 */
  private String ywxm;
  /** 姓名拼音 */
  private String xmpy;
  /** 曾用名 */
  private String cym;
  /** 性别 */
  private String xb;
  /** 出生日期 */
  private Date csrq;
  /** 出生地 */
  private String csd;
  /** 籍贯 */
  private String jg;
  /** 民族 */
  private String mz;
  /** 国籍 */
  private String gj;
  /** 身份证件类型 */
  private String sfzjlx;
  /** 身份证件号 */
  private String sfzjh;
  /** 婚姻状况 */
  private String hyzk;
  /** 政治面貌 */
  private String zzmm;
  /** 健康状况 */
  private String jkzk;
  /** 信仰宗教 */
  private String xyzj;
  /** 血型 */
  private String xx;
  /** 个人照片 */
  private String zp;
  /** 证件有效期 */
  private Date zjyxq;
  @TableField(exist = false)
  /** 所属部门 */
  private Gxbm ssbm;
  @TableField(exist = false)
  /** 所属班级 */
  private Gxbj ssbj;



}
