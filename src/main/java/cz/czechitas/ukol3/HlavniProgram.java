package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac mujPocitac = new Pocitac();
        Pamet mojePamet = new Pamet();
        Disk mujDisk = new Disk();

        System.out.println(mujPocitac);
        mujPocitac.zapniSe();

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(2_900_000_000_000L);
        mujProcesor.setVyrobce("intel");

        mojePamet.setKapacita(12_000_000_000L);
        mujDisk.setKapacita(195_180_620_505L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);

        System.out.println(mujDisk);
        System.out.println(mujPocitac);

       mujPocitac.zapniSe();
        mujPocitac.zapniSe();

    }
    }

