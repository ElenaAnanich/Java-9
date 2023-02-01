public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.passport = "11 11 № 111 111";
        post.patronymic = "Ivanovich";
        post.phone = "phone";
        post.surname = "Ivanov";
        post.subscription = Boolean.parseBoolean("true");
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
