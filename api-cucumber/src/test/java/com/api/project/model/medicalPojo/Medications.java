package com.api.project.model.medicalPojo;

/**
 * Created by alexeykozlov on 1/16/19.
 */

  public class Medications
  {
    private MedicationsClasses[] medicationsClasses;

    public MedicationsClasses[] getMedicationsClasses ()
    {
      return medicationsClasses;
    }

    public void setMedicationsClasses (MedicationsClasses[] medicationsClasses)
    {
      this.medicationsClasses = medicationsClasses;
    }

    @Override
    public String toString()
    {
      return "ClassPojo [medicationsClasses = "+medicationsClasses+"]";
    }
  }

