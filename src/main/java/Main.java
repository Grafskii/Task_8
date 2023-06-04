import javax.crypto.KeyAgreement;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Мутул";
        post.surname = "Ханинов";
        post.patronymic = "Владимирович";
        post.phone = "+7(999)-555-22-33";
        post.passport = "8515 № 12131415";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 16;
        post.birthday.month = 12;
        post.birthday.year = 1980;
    }
}