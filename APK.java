public class APK {
    public static void main(String[] args) {
        String User;
        String Password;

        User = "Adriyan26";
        Password = "12345";
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukan User = ");
        System.out.println("Masukan Password = ");
       
        public void post(){
            System.out.println();
            System.out.println(this.user);
            System.out.println("-------------------");
            System.out.println(this.Media);
            System.out.println("-------------------");
            System.out.println(this.com);
            System.out.println("[1]Like: " + this.like + "  [2]Comment: " + this.com.size() + "  [3]Show Comment" + "  [4]Copy Link");
            System.out.println();
        }
        public void postingan(){
            System.out.println();
            System.out.println(this.user);
            System.out.println("-------------------");
            System.out.println(this.Media);
            System.out.println("-------------------");
            System.out.println(this.com);
            System.out.println("[1]Like: " + this.like + "  [2]Comment: " + this.com.size() + "  [3]Show Comment" + "  [4]Copy Link");
            System.out.println("[0]Pilih Postingan Lain");
            System.out.println();
        }

        public int likes(int suka){
            like = like + 1;
            return like;
        }

        public ArrayList Comments(String komentar){
            for (int i = 0; i < 1; i++){
                com.add(komentar);
            }
            return komen;
        }

        public void showComment(){
            for (int i = 0; i < com.size(); i++)
                System.out.println(com.get(i));
        }

    }
}
