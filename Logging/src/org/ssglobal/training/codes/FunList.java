package org.ssglobal.training.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.stream.Collectors;

public class FunList {
	
	private BufferedReader bufferedReader;
	private Word word; 
	//setting up a logger, dapat private static
	//step 1: create a logger
	private static Logger logger = Logger.getLogger(FunList.class.getName());
	{
		// Step 1B: Set the logging level
		logger.setLevel(Level.INFO); // Only done once
				
		// Step 2: Creating another handler
		// Step 3: Format the message
		try {
			FileHandler fileHandler = new FileHandler("./src/log/funlist.log");//pwede dagdagan ng true kung append append
			fileHandler.setEncoding("UTF-8");
			fileHandler.setLevel(Level.WARNING);
			XMLFormatter formatter = new XMLFormatter();
			fileHandler.setFormatter(formatter);
			//per filehandler dapat may own formatter
			logger.addHandler(fileHandler);
			
		} catch (SecurityException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	public FunList() {
		
	}
	
	
	//logger is private
	public FunList(String fileName) {
		Path p = Paths.get(fileName);

		
		logger.setLevel(Level.ALL);
		try {
			this.bufferedReader = Files.newBufferedReader(p);
		} catch (IOException e) {//lahat ng may catch may severe
			//Step 1c: Apply logging
			logger.severe("Error message:" + e.getMessage());
		}
	
	}
	

	public long countWords() {
		logger.info("execute countwords");
		long temp = this.bufferedReader.lines().map((str) -> 
		{ return str.split("");}).count();
		logger.info("exit without countWords showLines");
		return temp;
		}
	
	@SuppressWarnings("deprecation")
	public boolean enableDisplay() {
		logger.info("execute enable Display");
		logger.warning("custom date is deprecated");//parang nakaoff kasi nakasevere
		Date xmas = new Date(121,11,25);
	
		try {
		if (this.bufferedReader.lines().toArray(String[]::new).length >0) {
			showLines();
			logger.info("exit without error enable Display");
			return true;
		}
		}catch (Exception e) {
			//Step 1c: Apply logging
			logger.severe("Error message:" + e.getMessage());
		}
		logger.info("execute with error enable Display");//pag dun sa divide kahit wala nang ganto since understood nang may error
		return false;
	}

	public void showLines() {
		logger.info("execute enable showlines");
		this.bufferedReader.lines().forEach((line)-> {
			System.out.println(line);
		});
		logger.info("exit without error enable Display");
	}
	
	public List<String> getContentList(){
		return this.bufferedReader.lines().collect(Collectors.toList());
	}
	
	public String[] getContentArray() {
		//return this.bufferedReader.lines().toArray(String[]::new);
		return (String[]) this.bufferedReader.lines().toArray();
	}
		
}	
class Word { //HAS-A relationship
		
	}



