package com.example.demo1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppCli {

    public static void main(String[] args) throws Exception {
	log.info("Hello world!");
	log.info("Sleeping for 3 min...");
	Thread.sleep(1000 * 60 * 3);
    }

}
