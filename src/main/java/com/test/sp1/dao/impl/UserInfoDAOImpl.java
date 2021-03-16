package com.test.sp1.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.test.sp1.dao.UserInfoDAO;
import com.test.sp1.entity.UserInfo;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<UserInfo> findUserInfos() {
		List<UserInfo> uiList = em.createQuery("from UserInfo ui", UserInfo.class).getResultList();
		return uiList;
	}

	@Override
	public UserInfo findUserInfoByUiId(int uiId) {
		return em.find(UserInfo.class, uiId);
	}

	@Override
	public void saveUserInfo(UserInfo userInfo) {
		em.persist(userInfo);
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		em.merge(userInfo);
	}

	@Override
	public void deleteUserInfo(int uiId) {
		UserInfo userInfo = findUserInfoByUiId(uiId);
		em.remove(userInfo); 
	}

}
