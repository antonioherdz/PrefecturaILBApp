package com.example.prefecturailb.moduleAccount.model.dataAccess;

import com.example.prefecturailb.common.pojo.User;

public interface UserCallBack {

    void getUserByEmail(int type, User user);

    void onError(int type, int resMsg);

}
