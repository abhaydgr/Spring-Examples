package com.studytrails.tutorials.springexpressionlanguagereferencingbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringExpressionLanguageReferenceBeans {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Mp3Player mp3Player = (Mp3Player)context.getBean("mp3Player");
		System.out.println("The songs in the current playlist in Mp3Player are : " + mp3Player.getSongsInPlayList());
		System.out.println("The first song in the Mp3Player is : " + mp3Player.getFirstSong());
		
		
		System.out.println("************** ENDING PROGRAM **************");
	}
}
