package com.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/**
 * @author 黄建胜
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
  private String conId;
  private String userId;
  @JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss")
  private Date date;
  private String title;
  private String image;
  private String content;
}
