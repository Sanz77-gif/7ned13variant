package kz.ektu.meiramgazin.sanzhar.lab6;
import java.time.LocalDate;


public class Main1 {
    public static void main(String[] args) {
        MediaFileServiceImpl service = new MediaFileServiceImpl();

        try {
            service.addMediaFile(new MediaFile("1", "photo1", "jpg", 5, LocalDate.of(2025, 10, 10), "Sanzhar", true));
            service.addMediaFile(new MediaFile("2", "video1", "mp4", 100, LocalDate.of(2025, 10, 11), "Sanzhar", false));
            service.addMediaFile(new MediaFile("3", "doc1", "pdf", 2, LocalDate.of(2025, 10, 12), "Sanzhar", true));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("All files:");
        service.printAllFiles();

        System.out.println("\nFilter by type (mp4):");
        service.searchByFileType("mp4").forEach(System.out::println);

        System.out.println("\nStatistics:");
        System.out.println(service.getFileSizeStatistics());

        System.out.println("\nFiles uploaded from 2025-10-10 to 2025-10-11:");
        service.filterFilesByUploadDate(LocalDate.of(2025, 10, 10), LocalDate.of(2025, 10, 11)).forEach(System.out::println);

        try {
            service.updateFileVisibility("2", true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAfter update:");
        service.printAllFiles();
    }
}
