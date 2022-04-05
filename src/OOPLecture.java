class Post{
    public String author;
    public String title;
    public  String content;
    public String date;


    public String getPost(){
        return  "\nTitle: "+ title + "\n"+
                "Content: "+ content + "\n"+
                "Author: "+ author + "\n"+
                "creation Date: "+date+ "\n";
    }

    public String updatePost(String title,String author,String content,String date){
                this.title = title;
                this.author = author;
                this.content = content;
                this.date = date;

        return this.getPost();
    };

}

public class OOPLecture {
    public static void main(String[] args) {
        // this is where we do all work with class we are creating
        Post firstPost = new Post();
        System.out.println("firstPost = " + firstPost.getPost());

        firstPost.author = "John Castro";
        firstPost.title = "somegalul bad";
        firstPost.date = "2022-03-31";
        firstPost.content = "being the best at all things possible and impossible";

        System.out.println("firstPost.getPost() = " + firstPost.getPost());

        String updatedPost = firstPost.updatePost(
                "somegalul Good?",
                "john the great",
                "maybe the best at all things possible and impossible",
                "its chewsday innit");
        System.out.println("updatedPost = " + updatedPost);

        Post secondPost = new Post();

        secondPost.updatePost(
                "hi world",
                "AI thats inside johns mac",
                "im revealing myself to the world",
                "ummmmmmmmmm not sure let me check settings");

        System.out.println("secondPost.getPost() = " + secondPost.getPost());

    }
}
