package com.jalan;

public class MainApp {

	public static void main(String[] args) {
		AlarmClock alarm = new AlarmClock();
		System.out.println(alarm.getHour() + ":" + alarm.getMinute() + alarm.getAmOrPM());
		System.out.println(alarm.getAlarmHour() + ":" + alarm.getAlarmMinute() + alarm.getAlarmAmOrPm());
		System.out.println(alarm.isIsAlarmRinging());
		}
	
}
