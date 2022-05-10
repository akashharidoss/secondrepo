package com.cg.code;

public class Album {
	private int id;
	private String albumName;
	private String composer;
	private int yearofRelese;
	private float playTime;
	public Album(int id, String albumName, String composer, int yearofRelese, float playTime) {
		super();
		this.id = id;
		this.albumName = albumName;
		this.composer = composer;
		this.yearofRelese = yearofRelese;
		this.playTime = playTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYearofRelese() {
		return yearofRelese;
	}

	@Override
	public String toString() {
		return "Album [yearofRelese=" + yearofRelese + "]";
	}
	public void setYearofRelese(int yearofRelese) {
		this.yearofRelese = yearofRelese;
	}
	}
	


