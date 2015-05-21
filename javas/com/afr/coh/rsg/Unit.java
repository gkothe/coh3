package com.afr.coh.rsg;

public class Unit
{
  private String name;
  private int points;
  private String nationality;
  
  public Unit() {}
  
  public Unit(String name, int points, String nationality)
  {
    this.name = name;
    this.points = points;
    this.nationality = nationality;
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
}
