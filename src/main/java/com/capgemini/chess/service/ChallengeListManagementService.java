package com.capgemini.chess.service;

public interface ChallengeListManagementService {

	/**
	 * Removes overdue challenges from challenges list simulating Database.
	 */
	void removeOverdueChallengesFromListOfChallengeTO();

	/**
	 * Prints content of list simulating Database.
	 */
	void readListOfChallengeTO();

}
