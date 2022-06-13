package com.misaka.performance_management_system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class Gxbj extends AbsSuperObject{


  /** 班号 */
  private String bh;
  /** 班级名称 */
  private String bjmc;
  /** 建班年月，格式200009，表示2000年9月 */
  private String jbny;
  @TableField(exist = false)
  /** 所属专业 */
  private Gxzy gxzy;
  /** 班主任姓名 */
  private String bzrxm;
  /** 班长姓名 */
  private String bzxm;
  @TableField(exist = false)
  private List<Gxkb> gxkbList;



}
