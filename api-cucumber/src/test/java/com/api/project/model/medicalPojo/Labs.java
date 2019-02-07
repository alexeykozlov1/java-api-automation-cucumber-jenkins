package com.api.project.model.medicalPojo;

/**
 * Created by alexeykozlov on 1/16/19.
 */
public class Labs
{
  private String missing_field;

  public String getMissing_field ()
  {
    return missing_field;
  }

  public void setMissing_field (String missing_field)
  {
    this.missing_field = missing_field;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [missing_field = "+missing_field+"]";
  }
}
