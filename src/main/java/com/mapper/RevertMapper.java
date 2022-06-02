package com.mapper;

import com.pojo.Revert;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */
@Repository
public interface RevertMapper {

    /**
     * 添加拾取信息
     * @param revert 拾取
     * @return 是否成功
     */
    @Insert("INSERT INTO `revert` (`conId`, `userId`, `date`, `type`, `pickup_time`, `address`, `contant`, `image`, `description`) " +
            "VALUES " +
            "(#{revert.conId}, #{revert.userId}, #{revert.date}, #{revert.type}, #{revert.pickupTime}, " +
            "#{revert.address}, #{revert.contant}, #{revert.image}, #{revert.description})")
    int addRevert(@Param("revert") Revert revert);

    List<Revert> getRevert(HashMap map);

    @Select("SELECT count(conId) FROM revert")
    int getCount();

}
