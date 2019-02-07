package com.api.project.model.medicalPojo;

/**
 * Created by alexeykozlov on 1/16/19.
 */
public class MedicationsClasses
{
  private ClassName2[] className2;

  private ClassName[] className;

  public ClassName2[] getClassName2 ()
  {
    return className2;
  }

  public void setClassName2 (ClassName2[] className2)
  {
    this.className2 = className2;
  }

  public ClassName[] getClassName ()
  {
    return className;
  }

  public void setClassName (ClassName[] className)
  {
    this.className = className;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [className2 = "+className2+", className = "+className+"]";
  }
}
