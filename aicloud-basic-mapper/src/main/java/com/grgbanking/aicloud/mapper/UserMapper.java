package com.grgbanking.aicloud.mapper;

import com.grgbanking.aicloud.entity.UserEntity;

import java.util.List;



public interface UserMapper {

	List<UserEntity> getAll();

	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}