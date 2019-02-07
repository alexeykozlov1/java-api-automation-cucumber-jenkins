package com.api.project.model.medicalPojo;

public class ClassName
{
  private AssociatedDrug2[] associatedDrug2;

  private AssociatedDrug[] associatedDrug;

  public AssociatedDrug2[] getAssociatedDrug2 ()
  {
    return associatedDrug2;
  }

  public void setAssociatedDrug2 (AssociatedDrug2[] associatedDrug2)
  {
    this.associatedDrug2 = associatedDrug2;
  }

  public AssociatedDrug[] getAssociatedDrug ()
  {
    return associatedDrug;
  }

  public void setAssociatedDrug (AssociatedDrug[] associatedDrug)
  {
    this.associatedDrug = associatedDrug;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [associatedDrug#2 = "+associatedDrug2+", associatedDrug = "+associatedDrug+"]";
  }
}

