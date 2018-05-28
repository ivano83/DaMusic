package it.fivano.damusic.core.batch;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;

public class MassiveReleaseSearchJob implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {

		JobKey key = context.getJobDetail().getKey();

		JobDataMap dataMap = context.getJobDetail().getJobDataMap();

		String jobSays = dataMap.getString("jobSays");

		System.out.println(jobSays+"... FINE");
	}


	public static void main(String[] args) throws InterruptedException {

		JobDetail job = JobBuilder.newJob(MassiveReleaseSearchJob.class)
			      .withIdentity("myJob", "group1") // name "myJob", group "group1"
			      .usingJobData("jobSays","Hello!!!")
			      .build();

		Trigger trigger = TriggerBuilder
				.newTrigger()
				.withIdentity("dummyTriggerName", "group1")
				.withSchedule(
					SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(5).repeatForever())
				.build();

		try {

			Scheduler scheduler = new StdSchedulerFactory().getScheduler();
			scheduler.start();
			scheduler.scheduleJob(job, trigger);


			System.out.println("end");
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
