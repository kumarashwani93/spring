package com.ashwani.spring.springPropertySourceExample;


public class FileServiceImpl implements FileService {

	private String source;
	private String name;
	
	public void getEnvDetails() {
		
		System.out.println("Surce :: " + source + "  Name ::" +name);
		
	}

	public FileServiceImpl(String source, String name) {
		super();
		this.source = source;
		this.name = name;
	}
	
	

	
	
	
	

}
