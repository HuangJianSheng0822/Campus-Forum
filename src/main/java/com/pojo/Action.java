package com.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 黄建胜
 * @description 需要修改
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Action {

  private String conId;
  private String userId;
  @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
  private Date beginTime;
  private String people;
  @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
  private Date peopleTime;
  @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
  private Date endTime;
  private String kind;
  private String description;
  private double money;
  private String expectedTime;
  private String addressCount;
  private String userName;
  private String userNumber;
  private String userAddress;

  public Action(String conId, String userId, Date beginTime, String kind, String description, double money, String expectedTime, String addressCount) {
    this.conId = conId;
    this.userId = userId;
    this.beginTime = beginTime;
    this.kind = kind;
    this.description = description;
    this.money = money;
    this.expectedTime = expectedTime;
    this.addressCount = addressCount;
  }

}
