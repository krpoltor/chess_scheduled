package com.capgemini.chess.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.SpringApplicationConfiguration;

import com.capgemini.chess.ChessApplication;
import com.capgemini.chess.dao.ChallengeDao;

/**
 * Test class for testing {@link ChallengeLisManagementService}<br>
 * 
 * Checklist:<br>
 * 1. Test calling print() method.<br>
 * 2. Test calling remove() method.<br>
 * 
 * @author KRPOLTOR
 *
 */
@RunWith(MockitoJUnitRunner.class)
@SpringApplicationConfiguration(classes = ChessApplication.class)
public class ChallengeManagementServiceTest {

	@Mock
	ChallengeDao challengeDao;
	
	@InjectMocks
	ChallengeListManagementService challengeManagementService;

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test(expected = RuntimeException.class)
	public void shouldTestCallingMethodPrint() {
		// given
		// when
		Mockito.doThrow(new RuntimeException()).when(challengeManagementService).readListOfChallengeTO();
		// then
	}

	@Test(expected = RuntimeException.class)
	public void shouldTestCallingMethodRemove() {
		// given
		// when
		Mockito.doThrow(new RuntimeException()).when(challengeManagementService)
				.removeOverdueChallengesFromListOfChallengeTO();
		// then
	}
}
