package module8.homewrok;




import java.util.List;


public class Directory extends Files {
    private List<PictureFiles> pictureFiles;
    private List<MusicFiles> musicFiles;
    private List<DocFiles> docFiles;



    public Directory(String name, List<MusicFiles> musicFiles, List<PictureFiles> pictureFiles, List<DocFiles> docFiles){

        this.musicFiles = musicFiles;
        this.pictureFiles = pictureFiles;
        this.docFiles = docFiles;

    }


}
