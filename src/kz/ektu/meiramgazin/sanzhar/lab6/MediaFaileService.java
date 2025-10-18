package kz.ektu.meiramgazin.sanzhar.lab6;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface MediaFaileService {
    boolean addMediaFile(MediaFile mediaFile) throws IllegalArgumentException;
    boolean updateFileVisibility(String fileId, boolean isPublic) throws Exception;
    List<MediaFile> searchByFileType(String fileType);
    Map<String, Long> getFileSizeStatistics();
    List<MediaFile> filterFilesByUploadDate(LocalDate fromDate, LocalDate toDate);
    void printAllFiles();
}
