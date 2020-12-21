package com.sy.service;

import com.sy.vo.ResponseResult;
import org.springframework.data.redis.core.ZSetOperations;

import java.util.List;
import java.util.Set;

public interface HotPanService {
    Set<ZSetOperations.TypedTuple<Object>> selectHotList(String key);
//    String test(String msg);
}
