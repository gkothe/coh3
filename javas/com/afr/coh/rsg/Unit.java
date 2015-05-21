package com.afr.coh.rsg;

public class Unit
{
  private String name;
  private int points;
  private String nationality;
  private int available;  
  public Unit() {}
  
  public Unit(String name, int points, String nationality, int available)
  {
    this.name = name;
    this.points = points;
    this.nationality = nationality;
    this.available = available;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public int getPoints()
  {
    return this.points;
  }
  
  public void setPoints(int points)
  {
    this.points = points;
  }
  
  public String getNationality()
  {
    return this.nationality;
  }
  
  public void setNationality(String nationality)
  {
    this.nationality = nationality;
  }

public int getAvailable() {
	return available;
}

public void setAvailable(int available) {
	this.available = available;
}
}
