public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Alexandr";
        post.passport = "4008 " + "№" + " 787877";
        post.patronymic = "Михайлович";
        post.phone = "+7 " + "(" + "953" + ")-" + "342-" + "48-" + "02";
        post.surname = "Макеев";
        post.subscrition = true;
        Post.birthday = new FormDate();
        Post.birthday.day = 20;
        Post.birthday.month = 12;
        Post.birthday.year = 1989;
    }
}