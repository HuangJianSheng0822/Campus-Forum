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
public class Love {
    private String userId;
    private String loveId;
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date date;
    private int isAnonymous;
    private String description;
}
