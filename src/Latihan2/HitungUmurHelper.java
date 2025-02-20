package Latihan2;

import java.time.LocalDate;
import javax.swing.JTextArea;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

public class HitungUmurHelper {
    public String hitungUmurDetail(LocalDate lahir, LocalDate sekarang) {
        long tahun = ChronoUnit.YEARS.between(lahir, sekarang);
        long bulan = ChronoUnit.MONTHS.between(lahir, sekarang) % 12;
        long hari = ChronoUnit.DAYS.between(lahir, sekarang) % 30;
        
        return String.format("%d tahun %d bulan %d hari", tahun, bulan, hari);
    }
    
    public LocalDate hariUlangTahunBerikutnya(LocalDate lahir, LocalDate sekarang) {
        LocalDate ulangTahunTahunIni = lahir.withYear(sekarang.getYear());
        if (ulangTahunTahunIni.isBefore(sekarang) || ulangTahunTahunIni.isEqual(sekarang)) {
            return ulangTahunTahunIni.plusYears(1);
        }
        return ulangTahunTahunIni;
    }
    
    public String getDayOfWeekInIndonesian(LocalDate date) {
        switch (date.getDayOfWeek()) {
            case MONDAY: return "Senin";
            case TUESDAY: return "Selasa";
            case WEDNESDAY: return "Rabu";
            case THURSDAY: return "Kamis";
            case FRIDAY: return "Jumat";
            case SATURDAY: return "Sabtu";
            case SUNDAY: return "Minggu";
            default: return "";
        }
    }
    
    public void getPeristiwaBarisPerBaris(LocalDate tanggal, JTextArea area, Supplier<Boolean> shouldStop) {
        // Implementasi sesuai kebutuhan
        area.append("Peristiwa pada tanggal " + tanggal.format(DateTimeFormatter.ofPattern("dd MMMM")) + ":\n");
        area.append("- Ini adalah hari spesial Anda\n");
        area.append("- Saatnya merayakan moment bahagia\n");
    }
}