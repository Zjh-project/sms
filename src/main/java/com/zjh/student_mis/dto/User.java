package com.zjh.student_mis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description 登陆信息
 * Author: zjh
 * Date2019/10/21 20:58
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  /**
   * id
   */
  private Integer id;
  /**
   * 用户名
   */
  private String username;
  /**
   * 密码
   */
  private String password;
  /**
   * 真实姓名
   */
  private String realname;
  /**
   * 等级
   */
  private Integer level;
}
