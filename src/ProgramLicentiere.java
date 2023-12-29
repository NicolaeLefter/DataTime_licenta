import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;

public class ProgramLicentiere {

    private PlanLicenta planLicenta;
    private LocalDateTime dataExpirarii;

    public void setareLicenta(PlanLicenta planLicenta){
        this.planLicenta = planLicenta;
        this.dataExpirarii = LocalDateTime.now().plusMonths(6);
    }

    public boolean verificareLicenta(){
        LocalDateTime dataCurenta = LocalDateTime.now();
        String prelungesteLicenta = null;
        if (dataExpirarii == null){
            return false;
        }
        return !dataCurenta.isAfter(dataExpirarii);

    }

    public void afiseazaDurataLicentei() {
        LocalDateTime dataCurenta = LocalDateTime.now();
        long zileRamase = ChronoUnit.DAYS.between(dataCurenta, dataExpirarii);

        if (zileRamase > 0) {
            System.out.println("Licenta expira peste: " + zileRamase);
        } else {
            System.out.println("Licenta este expirata!");
        }
    }

    public void prelungesteLicenta( int numarLuni){
        dataExpirarii = dataExpirarii.plusMonths(numarLuni);
    }



}
