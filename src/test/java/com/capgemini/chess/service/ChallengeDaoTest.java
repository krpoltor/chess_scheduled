package com.capgemini.chess.service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.capgemini.chess.dao.ChallengeDao;
import com.capgemini.chess.dao.impl.ChallengeDaoImpl;
import com.capgemini.chess.dataaccess.enums.ChallengeStatus;
import com.capgemini.chess.service.to.ChallengeTO;

/**
 * Test class for testing {@link ChallengeDao}<br>
 * 
 * Due to all methods being type void I only test calling them.<br>
 * Moreover ChallengeDao stubs data from database which will be handled by SQL Queries.<br>
 * 
 * Checklist:<br>
 * 1. Call createListOfChallenge method.<br>
 * 2. Call readListOfChallenge method.<br>
 * 3. Call updateListOfChallenge method.<br>
 * 4. Call deleteListOfChallenge method.<br>
 * 
 * @author KRPOLTOR
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ChallengeDaoTest {

	@Mock
	ChallengeDaoImpl challengeDaoImpl;

	private List<ChallengeTO> testList = new LinkedList<ChallengeTO>();
	
	/**
	 * Test for calling void method createListOfChallenge.
	 * 
	 */
	@Test(expected = RuntimeException.class)
	public void shouldCreateListOfChallenges() {
		// given
		challengeDaoImpl.createListOfChallengeTO();
		// when
		Mockito.doThrow(new RuntimeException()).when(challengeDaoImpl).createListOfChallengeTO();
		// then
		challengeDaoImpl.createListOfChallengeTO();
	}

	/**
	 * Test for calling void method readListOfChallenge.
	 */
	@Test(expected = RuntimeException.class)
	public void shouldReadListOfChallenges() {
		// given
		challengeDaoImpl.createListOfChallengeTO();
		// when
		Mockito.doThrow(new RuntimeException()).when(challengeDaoImpl).readListOfChallengeTO();
		// then
		challengeDaoImpl.readListOfChallengeTO();
	}

	/**
	 * Test for calling void method updateListOfChallenge.
	 */
	@Test(expected = RuntimeException.class)
	public void shouldUpdateListOfChallenges() {
		// given
		challengeDaoImpl.createListOfChallengeTO();
		// when
		Mockito.doThrow(new RuntimeException()).when(challengeDaoImpl).deleteOverdueChallengesFromListOfChallengeTO();
		// then
		challengeDaoImpl.deleteOverdueChallengesFromListOfChallengeTO();
	}

	/**
	 * Test for calling void method deleteListOfChallenge.
	 */
	@Test(expected = RuntimeException.class)
	public void shouldDeleteListOfChallenges() {
		// given
		challengeDaoImpl.createListOfChallengeTO();
		// when
		Mockito.doThrow(new RuntimeException()).when(challengeDaoImpl).deleteListOfChallengeTO();
		// then
		challengeDaoImpl.deleteListOfChallengeTO();
	}
	
	@Ignore
	@Test
	public void shouldCheckIfChallengeListContainsChallengeTO() {
		// given
		Date startDate = new Date();
		Date endDate1 = new Date(startDate.getTime() + 20000);
		Date endDate2 = new Date(startDate.getTime() + 30000);
		// when
		challengeDaoImpl.createListOfChallengeTO();
		setTestList(ChallengeDaoImpl.getMockingChallengeTableList());
		// then
		Assert.assertTrue(testList.contains(new ChallengeTO(0, 1, 2, startDate, endDate1, ChallengeStatus.WAITING_FOR_REPLY)));
		Assert.assertTrue(testList.contains(new ChallengeTO(1, 1, 2, startDate, endDate2, ChallengeStatus.WAITING_FOR_REPLY)));
	}

	public List<ChallengeTO> getTestList() {
		return testList;
	}

	public void setTestList(List<ChallengeTO> testList) {
		this.testList = testList;
	}

}
