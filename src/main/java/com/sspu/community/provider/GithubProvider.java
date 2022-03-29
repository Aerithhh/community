package com.sspu.community.provider;

import com.alibaba.fastjson.JSON;
import com.sspu.community.dto.AccessTokenDTO;
import com.sspu.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author Sun
 * @date 2022/3/23 23:24
 */
@Component
public class GithubProvider {
    public String getAccessToken (AccessTokenDTO accessTokenDTO){
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
            Request request = new Request.Builder()
                    .url("https://github.com/login/oauth/access_token")
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                String string = response.body().string();
                String token = string.split("&")[0].split("=")[1];
                return token;

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
    }

        public GithubUser getUser(String accessToken){
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://api.github.com/user")
                    .header("Authorization", "token " + accessToken)
                    .build();
            try {
            Response response = client.newCall(request).execute();
                String string = response.body().string();
                GithubUser gitHubUser = JSON.parseObject(string, GithubUser.class);
                return gitHubUser;
            }catch (IOException e){
    }
            return null;


    }
}
