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
public class LostProperty {
    private String id;
    private String userId;
    private String description;
    @JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss")
    private Date date;
    private int status;
    private String type;
    private String address;
    private String contant;
    private String lostTime;
}
