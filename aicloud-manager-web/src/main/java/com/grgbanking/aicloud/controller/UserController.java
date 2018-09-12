package com.grgbanking.aicloud.controller;

import com.grgbanking.aicloud.entity.UserEntity;
import com.grgbanking.aicloud.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value="用户API",tags={"用户操作接口"})
public class UserController {
	
	@Autowired
	private UserService userService;

    @ApiOperation(value = "根据查询所有User的信息",notes = "查询数据库中所有User的信息")
	@PostMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userService.getAll();
		return users;
	}

    /**
     * Restful Get请求测试
     */
    @ApiOperation(value = "根据id查询User的信息",notes = "查询数据库中某个User的信息")
    @ApiImplicitParam(name ="id",value = "user id",required = true,dataType = "String")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",dataType = "String",paramType = "query",example = "1112")
    })
    @ApiResponses({
            @ApiResponse(code=400,message = "请求参数没有填好"),
            @ApiResponse(code=404,message="请求路径没有找到")
    })
    @PostMapping("/getUser")
    public UserEntity getUser(Long id) {
    	UserEntity user=userService.getOne(id);
        return user;
    }

    @ApiOperation(value = "增加User的信息",notes = "增加User的信息到数据库")
    @PostMapping("/add")
    public void save(UserEntity user) {
        userService.insert(user);
    }

    @ApiOperation(value = "更新User的信息",notes = "查更新User的信息到数据库")
    @PostMapping(value="update")
    public void update(UserEntity user) {
        userService.update(user);
    }

    @ApiOperation(value = "根据id删除User的信息",notes = "删除数据库中某个User的信息")
    @PostMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }

    
}