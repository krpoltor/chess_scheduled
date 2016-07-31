package com.capgemini.chess.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.chess.dao.ChallengeDao;
import com.capgemini.chess.service.ChallengeListManagementService;

@Service
public class ChallengeListManagementServiceImpl implements ChallengeListManagementService {

	@Autowired
	private ChallengeDao challengeDao;

	@Override
	public final void removeOverdueChallengesFromListOfChallengeTO() {
		challengeDao.deleteOverdueChallengesFromListOfChallengeTO();
	}

	@Override
	public void readListOfChallengeTO() {
		challengeDao.readListOfChallengeTO();
	}

}
