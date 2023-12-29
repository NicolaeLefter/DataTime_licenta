import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.time.LocalDateTime;

enum PlanLicenta {

  BASIC("Plan basic", 20, "6 luni"),
    STANDART("Plan standart", 30, "12 luni"),
    PREMIUM("Plan premium", 50, "18 luni");

    private String descriere;
  private int pretPlan;
  private String durata;

  private PlanLicenta(String descriere, int pretPlan, String durata){
      this.descriere = descriere;
      this.pretPlan = pretPlan;
      this.durata = durata;

  }

  public String getDescriere(){
      return descriere;
  }
  public int getPretPlan(){
      return pretPlan;
  }
  public String getDurata(){
      return  durata;
  }


}


