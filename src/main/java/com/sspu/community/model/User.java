package com.sspu.community.model;

import lombok.Data;

/**
 * @author Sun
 * @date 2022/3/25 1:13
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}