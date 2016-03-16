package Module6.File;


import java.util.List;


public class Directory extends File {
    private List<ImageFile> imageFiles;
    private List<AudioFile> audioFiles;
    private List<TextFile> textFiles;


    public List<ImageFile> getImageFiles() {
        return imageFiles;
    }

    public void setImageFiles(List<ImageFile> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public List<AudioFile> getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
    }

    public List<TextFile> getTextFiles() {
        return textFiles;
    }

    public void setTextFiles(List<TextFile> textFiles) {
        this.textFiles = textFiles;
    }


    public Directory(String name, List<AudioFile> audioFiles, List<ImageFile> imageFiles, List<TextFile> textFiles){
        super(name);
        this.audioFiles = audioFiles;
        this.imageFiles = imageFiles;
        this.textFiles = textFiles;

    }


}
