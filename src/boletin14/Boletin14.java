package boletin14;

public class Boletin14 {

    public static void main(String[] args) throws TemperaturaErradaExcepcion {
        ConversorTemperaturas obx = new ConversorTemperaturas();
        obx.centigradosAFharenheit(obx.introduceTa());
        obx.centígradosAReamur(obx.introduceTa());
    }
}
