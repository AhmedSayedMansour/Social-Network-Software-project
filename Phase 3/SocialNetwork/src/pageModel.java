import java.util.ArrayList;

public class pageModel {
    private ArrayList<Page> pages = new ArrayList<>();

    public void createPage(Page newPage){pages.add(newPage);}
    public void deletePage(Page page){pages.remove(page);}
    public Page readPage(int pageID)
    {
        Page ret = new Page();
        return ret;
    }
    public void updateNumberOfLikes(Page page , int number){}
    public void updatePage(int pageID , Page updatedPage){}

}
