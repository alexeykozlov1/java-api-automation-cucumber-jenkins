package com.api.project.model.medicalPojo;

public class Problems
{
  private Diabetes[] Diabetes;

  public Diabetes[] getDiabetes ()
  {
    return Diabetes;
  }

  public void setDiabetes (Diabetes[] Diabetes)
  {
    this.Diabetes = Diabetes;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [Diabetes = "+Diabetes+"]";
  }
}
