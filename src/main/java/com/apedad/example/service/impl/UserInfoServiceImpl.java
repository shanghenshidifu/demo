package com.apedad.example.service.impl;

import com.apedad.example.annotation.TargetDataSource;
import com.apedad.example.commons.DataSourceKey;
import com.apedad.example.dao.UserInfoMapper;
import com.apedad.example.entity.UserInfo;
import com.apedad.example.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**配置
 * @author RocLiu [apedad@qq.com]
 * @version 1.0e
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    private static final Logger LOG = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Resource
    private UserInfoMapper userInfoMapper;

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_OTHER)
    @Override
    public List<UserInfo> listAll() {
        return userInfoMapper.listAll();
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_OTHER)
    @Override
    public int insert(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }
}
