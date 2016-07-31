package com.capgemini.chess.batch;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.capgemini.chess.service.ChallengeListManagementService;

@Component
public class ScheduledOverdueChallengesRemoval {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Autowired
	private ChallengeListManagementService challengeListManagementService;

	/**
	 * Deletes overdue challenges every day at 12PM
	 */
	@Scheduled(cron = "0 0 12 * * ?")
	public final void deleteOverdueChallenges() {
		challengeListManagementService.removeOverdueChallengesFromListOfChallengeTO();
		challengeListManagementService.readListOfChallengeTO();
		System.out.println(dateFormat.format(new Date()) + " Challenges updated");
	}
}