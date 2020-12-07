package com.sy.service;

import com.sy.vo.ResponseResult;

public interface ClassInfoService {
    ResponseResult selectAllByPage(int currPage, int pageSize);

    ResponseResult selectByclassName(String className);
}
