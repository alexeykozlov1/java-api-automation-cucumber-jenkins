package com.api.project.model.medicalPojo;

/**
 * Created by alexeykozlov on 1/16/19.
 */
public class AssociatedDrug2 {

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

