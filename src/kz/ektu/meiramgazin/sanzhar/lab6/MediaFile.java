package kz.ektu.meiramgazin.sanzhar.lab6;
import java.time.LocalDate;


public class MediaFile {
    private String fileId;
    private String fileName;
    private String fileType;
    private long fileSize;
    private LocalDate uploadDate;
    private String uploader;
    private boolean isPublic;

    public MediaFile(String fileId, String fileName, String fileType, long fileSize,
                     LocalDate uploadDate, String uploader, boolean isPublic) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.uploadDate = uploadDate;
        this.uploader = uploader;
        this.isPublic = isPublic;
    }

    public String getFileId() { return fileId; }
    public String getFileName() { return fileName; }
    public String getFileType() { return fileType; }
    public long getFileSize() { return fileSize; }
    public LocalDate getUploadDate() { return uploadDate; }
    public String getUploader() { return uploader; }
    public boolean isPublic() { return isPublic; }

    public void setFileId(String fileId) { this.fileId = fileId; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setFileType(String fileType) { this.fileType = fileType; }
    public void setFileSize(long fileSize) { this.fileSize = fileSize; }
    public void setUploadDate(LocalDate uploadDate) { this.uploadDate = uploadDate; }
    public void setUploader(String uploader) { this.uploader = uploader; }
    public void setPublic(boolean aPublic) { isPublic = aPublic; }

    public String toString() {
        return fileId + " | " + fileName + " | " + fileType + " | " + fileSize + "KB | " + uploadDate + " | " + uploader + " | " + (isPublic ? "Public" : "Private");
    }
}
