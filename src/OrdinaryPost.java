
import java.sql.SQLException;
import java.util.Date;

public class OrdinaryPost extends Post{
    boolean isprivate;
    OrdinaryPost(){}
    OrdinaryPost(String postcode, String text, OrdinaryUser user, Date time1, boolean Isprivate) throws SQLException {
        this.Kind=false;
        this.userposter=user;
        this.PostCode=postcode;
        this.Caption=text;
        this.PosterName=user.UserName;
        this.date=time1;
        this.isprivate=Isprivate;
        this.NumberOfLikes=0;
        this.NumberOfRetwiets=0;
        Post.PostsCodesList1.add(postcode);
        user.addPostToPosts(this);
    }
}
