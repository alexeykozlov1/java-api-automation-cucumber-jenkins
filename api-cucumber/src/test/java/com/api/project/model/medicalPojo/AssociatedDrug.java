package com.api.project.model.medicalPojo;

public class AssociatedDrug
{
  private String strength;

  private String name;

  private String dose;

  public String getStrength ()
  {
    return strength;
  }

  public void setStrength (String strength)
  {
    this.strength = strength;
  }

  public String getName ()
  {
    return name;
  }

  public void setName (String name)
  {
    this.name = name;
  }

  public String getDose ()
  {
    return dose;
  }

  public void setDose (String dose)
  {
    this.dose = dose;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [strength = "+strength+", name = "+name+", dose = "+dose+"]";
  }
}

