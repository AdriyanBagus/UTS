public class Instagram{
    public String Username;
    public String GambarVideo;
    public String caption;
    public int like;
    public int comment;

    public Instagram(String User, String Media,String caption, int like, int com){
        this.Username = User;
        this.GambarVideo = Media;
        this.like = like;
        this.comment = com;
    }
}