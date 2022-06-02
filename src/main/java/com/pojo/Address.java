package com.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 黄建胜
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

  private String addressCount;
  private String userId;
  private String userName;
  private String userNumber;
  private String userAddress;

  public Address(String userName, String userNumber, String userAddress) {
    this.userName = userName;
    this.userNumber = userNumber;
    this.userAddress = userAddress;
  }
}
