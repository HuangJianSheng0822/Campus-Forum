package com.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author 黄建胜
 */
@Data
@NoArgsConstructor
public class RewardMoney {
    private String conId;
    private String userId;
    private String title;
    private String image;
    private double price;
    private int kind;
    private String content;
    @JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss")
    private Date beginDate;
    private int correct;
    private String recipient;
    @JsonFormat(pattern="yyyy-MM-dd  HH:mm:ss")
    private Date endDate;
    public RewardMoney(String conId, String userId, String title, String image, double price, int kind, String content, Date beginDate, int correct){
        this.conId=conId;
        this.userId=userId;
        this.title=title;
        this.image=image;
        this.price=price;
        this.kind=kind;
        this.content=content;
        this.beginDate=beginDate;
        this.correct=correct;
    };
}
