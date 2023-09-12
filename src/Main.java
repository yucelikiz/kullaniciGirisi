import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Sınıflar
        String userName, password, answer, newPassword;

        //Scanner Sınıfı
        Scanner inpt = new Scanner(System.in);

        //Kullanıcı verilerini al
        System.out.print("Kullanici Adınız: ");
        userName = inpt.nextLine();
        System.out.print("Şifreniz: ");
        password = inpt.nextLine();

        //Kullanıcı adı ve şifreyi kontrol et
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız!");

        //Kullanıcı adı yanlışsa
        } else if (!(userName.equals("patika"))) {
            System.out.print("Kullanıcı adı yanlış!");

        //Şifre yanlışsa
        } else if (!password.equals("java123")) {
            System.out.println("Şifreniz yanlış!");

            //Kullanıcı tercihini öğren
            System.out.print("Şifrenizi değiştirmek ister misiniz? E / H?: ");
            answer = inpt.nextLine();

            //Cevap evet ise
            if (answer.equals("E") || answer.equals("e")) {
                System.out.print("Lütfen yeni şifrenizi giriniz (Yeni şifreniz önceki şifrenizden farklı olmalı.): ");
                newPassword = inpt.nextLine();

                //Şifre sonucunu bildir
                if (newPassword.equals("java123")) {
                System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                } else {
                    System.out.print("Şifre başarıyla oluşturuldu!");
                }

            //Cevap hayır ise
            }else if (answer.equals("H") || answer.equals("h")) {
                System.out.print("Kullanıcı giriş sayfasından ayrılıyorsunuz...");

            //Evet ya da hayır dışında bir tercihte bulunulduğunda
            }else {
                System.out.print("Hatalı giriş yaptınız, lütfen tekrar deneyiniz!");
            }
        }
    }
}