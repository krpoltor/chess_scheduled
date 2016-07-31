package com.capgemini.chess.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.chess.ChessApplication;

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
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ChessApplication.class)
public class ChallengeManagementServiceTest {

	@Mock
	ChallengeListManagementService challengeManagementService;

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
