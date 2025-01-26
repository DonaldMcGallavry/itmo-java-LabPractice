package lab5;

public class Main {
    public static void main(String[] args) {
        String text = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        strMethods lab5 = new strMethods();
        System.out.println(lab5.findLongestWord(text));
        System.out.println("===========================");
        String polin = "топот";
        System.out.println(lab5.isPoli(polin));
        System.out.println("===========================");
        String text2 = "Являясь всего лишь  бЯка частью общей картины, непосредственные участники технического прогресса освещают чрезвычайно " + '\n' +
                "интересные особенности картины в целом, однако конкретные выводы, разумеется, преданы социально-демократической анафеме.";
        System.out.println("Оригинальный текст: "+ text2);
        System.out.println("Отредактированный текст: "+ lab5.censore(text2));
        System.out.println("===========================");
        String parent = "Принимая во внимание показатели успешности, курс на социально-ориентированный национальный проект способствует " + '\n' +
                "подготовке и реализации экономической целесообразности в курс принимаемых решений.";
        String sub = "курс";
        System.out.println(lab5.occurrence(parent,sub));
        System.out.println("===========================");
        String text3 = "младая поросль матереет";
        System.out.println("The given string is: " + text3);
        System.out.println("The string reversed word by word is: " + '\n' + lab5.reverse(text3));
    }
}
