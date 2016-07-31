package com.capgemini.chess.dao;

public interface ChallengeDao {
	/**
	 * Generate list simulating DB.
	 */
	void createListOfChallengeTO();

	/**
	 * Delete overdue challenges.
	 */
	void deleteOverdueChallengesFromListOfChallengeTO();

	/**
	 * Print all data from the list.
	 */
	void readListOfChallengeTO();

	/**
	 * Clear list.
	 */
	void deleteListOfChallengeTO();

}
