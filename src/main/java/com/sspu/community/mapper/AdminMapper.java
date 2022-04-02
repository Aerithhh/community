package com.sspu.community.mapper;

import com.sspu.community.dto.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Sun
 * @date 2022/4/1 20:45
 */
public interface AdminMapper {
    @Select("select * from admin where username = #{username} and password = #{password}")
    Admin selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
