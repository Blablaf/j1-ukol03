package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk druhyDisk;

    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }

    public void vytvorSouborOVelikosti2Disky(long velikost) {
        if (jeZapnuty) {

            if ((pevnyDisk.getVyuziteMisto() + velikost) <= pevnyDisk.getKapacita()) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
                System.out.println("Disk má volné místo: " + (pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto()));
            } else if ((druhyDisk.getVyuziteMisto() + velikost) <= druhyDisk.getKapacita()) {
                druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() + velikost);
                System.out.println("Druhý disk má volné místo: " + (druhyDisk.getKapacita() - druhyDisk.getVyuziteMisto()));
            } else {
                System.out.println("Oba disky je plné");
            }

        } else {
            System.out.println("Počítač je již vypnutý");
        }
    }

    public void vymazSouborOVelikosti2Disky(long velikost) {
        if (jeZapnuty) {
            if ((druhyDisk.getVyuziteMisto() - velikost) >= 0) {
                druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() - velikost);
                System.out.println("Druhý disk má volné místo: " + (druhyDisk.getKapacita() - druhyDisk.getVyuziteMisto()));
            } else if ((pevnyDisk.getVyuziteMisto() - velikost) >= 0) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
                System.out.println("Disk má volné místo: " + (pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto()));
            } else {
                System.out.println("Oba disky jsou prázdné");
            }

        } else {
            System.out.println("Počítač je již vypnutý");
        }

    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            if ((pevnyDisk.getVyuziteMisto() + velikost) <= pevnyDisk.getKapacita()) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
                System.out.println("Disk má volné místo: " + (pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto()));
            } else {
                System.out.println("Disk je plný");
            }
        } else {
            System.out.println("Počítač je již vypnutý");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            if ((pevnyDisk.getVyuziteMisto() - velikost) >= 0) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
                System.out.println("Disk má volné místo: " + (pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto()));
            } else {
                System.out.println("Disk je prázdný");
                pevnyDisk.setVyuziteMisto(0);
            }

        } else {
            System.out.println("Počítač je již vypnutý");
        }
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač je již zapnutý");

        } else {
            System.out.println("Počítač je vypnutý, ale zapíná se");
            if (cpu == null || ram == null || pevnyDisk == null) {
                System.out.println("Počítač nelze zapnout, zkontrolujte CPU, RAM a Pevny disk ");
            } else {
                System.out.println("Počítač je zapnutý");
                jeZapnuty = true;
            }
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
        } else {
            System.out.println("Počítač je vypnutý");
        }
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }
}
