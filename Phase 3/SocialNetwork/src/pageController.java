public class PageController {

    private PageModel pageModel = new PageModel();

    public PageController(PageModel pageModel) {
        this.pageModel = pageModel;
    }

    public PageModel getPageModel() {
        return pageModel;
    }

    public void setPageModel(PageModel pageModel) {
        this.pageModel = pageModel;
    }

    public void createPage(Page page){}
    public void removePage(int pageID){}
    public void changeName(int pageID , String newName){}

    public void likePage(int pageID , User user){}
    public void dislikePage(int pageID , User user){}

    public void showPosts(int pageID){}
    public void addPost(int pageID , Post post){}
    public void deletePost(int pageID , Post post){}
    public void updatePost(int pageID , Post Post){}
}
