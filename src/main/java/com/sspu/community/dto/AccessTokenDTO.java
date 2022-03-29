package com.sspu.community.dto;

import lombok.Data;

/**
 * @author Sun
 * @date 2022/3/23 23:27
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;


}
