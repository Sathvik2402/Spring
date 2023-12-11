package com.nt.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;
@Component
public class LobsTesterRunner implements CommandLineRunner {

	@Autowired
	IJobSeekerMgmtService serv;
	@Override
	public void run(String... args) throws Exception {
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter jsName");
				String name=s.next();
				System.out.println("Enter Qualification");
				String qlfy=s.next();
				System.out.println("Enter Photo file path");
				String ppath=s.next();
				System.out.println("Enter Resume path");
				String rpath=s.next();
				
				//converting into arrays
				File file=new File(rpath);
				try (FileInputStream fis = new FileInputStream(ppath)) {
					byte[] photoData=fis.readAllBytes();
					try (FileReader reader = new FileReader(file)) {
						char[] resumeData=new char[(int)file.length()];
						reader.read(resumeData);
						
						JobSeeker js=new JobSeeker(null,name,qlfy,photoData,resumeData,true);
						String msg=serv.registerJobSeeker(js);
						System.out.println(msg);
					}
				}
			}
	}

}
