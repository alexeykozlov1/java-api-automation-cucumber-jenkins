package com.api.project.model.medicalPojo;

/**
 * Created by alexeykozlov on 1/16/19.
 */
public class Diabetes
{
  private Labs[] labs;

  private Medications[] medications;

  public Labs[] getLabs ()
  {
    return labs;
  }

  public void setLabs (Labs[] labs)
  {
    this.labs = labs;
  }

  public Medications[] getMedications ()
  {
    return medications;
  }

  public void setMedications (Medications[] medications)
  {
    this.medications = medications;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [labs = "+labs+", medications = "+medications+"]";
  }
}