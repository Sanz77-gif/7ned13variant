package kz.ektu.meiramgazin.sanzhar.lab6;
import java.time.LocalDate;
import java.util.*;


public class MediaFileServiceImpl implements MediaFaileService {
    private Map<String, MediaFile> files = new HashMap<>();

    public boolean addMediaFile(MediaFile mediaFile) throws IllegalArgumentException {
        if (mediaFile == null || mediaFile.getFileId() == null || mediaFile.getFileId().isEmpty())
            throw new IllegalArgumentException("Некорректные данные файла");
        if (files.containsKey(mediaFile.getFileId()))
            throw new IllegalArgumentException("Файл с таким ID уже существует");
        if (mediaFile.getFileSize() <= 0)
            throw new IllegalArgumentException("Размер файла должен быть положительным");
        files.put(mediaFile.getFileId(), mediaFile);
        return true;
    }

    public boolean updateFileVisibility(String fileId, boolean isPublic) throws Exception {
        if (fileId == null || fileId.isEmpty()) throw new IllegalArgumentException("Неверный ID");
        MediaFile file = files.get(fileId);
        if (file == null) throw new Exception("Файл не найден");
        file.setPublic(isPublic);
        return true;
    }

    public List<MediaFile> searchByFileType(String fileType) {
        List<MediaFile> result = new ArrayList<>();
        if (fileType == null || fileType.isEmpty()) return result;
        for (MediaFile f : files.values()) {
            if (f.getFileType().equalsIgnoreCase(fileType)) result.add(f);
        }
        return result;
    }

    public Map<String, Long> getFileSizeStatistics() {
        Map<String, Long> stats = new HashMap<>();
        for (MediaFile f : files.values()) {
            stats.put(f.getFileType(),
                    stats.getOrDefault(f.getFileType(), 0L) + f.getFileSize());
        }
        return stats;
    }

    public List<MediaFile> filterFilesByUploadDate(LocalDate fromDate, LocalDate toDate) {
        List<MediaFile> result = new ArrayList<>();
        for (MediaFile f : files.values()) {
            if ((f.getUploadDate().isAfter(fromDate) || f.getUploadDate().isEqual(fromDate)) &&
                    (f.getUploadDate().isBefore(toDate) || f.getUploadDate().isEqual(toDate))) {
                result.add(f);
            }
        }
        return result;
    }

    public void printAllFiles() {
        for (MediaFile f : files.values()) System.out.println(f);
    }
}