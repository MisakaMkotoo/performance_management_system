package com.misaka.performance_management_system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Gxjs  extends AbsSuperObject{



  /** 教室编号 */
  private String jsbh;
  /** 教室名称 */
  private String jsmc;
  /** 教室类别,如：普通教室','机房‘,'多媒体','会议室’,'其他 */
  private String jslb;
  /** 教室位置 */
  private String jswz;
  /** 座位数 */
  private Long zws;
  @TableField(exist = false)
  /** 所属部门 */
  private Gxbm ssbm;



}
