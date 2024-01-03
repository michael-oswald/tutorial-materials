import org.apache.commons.lang3.StringUtils;

public class StringUtilsTutorial {
    public static void main(String[] args) {
        String s = null;
        if (StringUtils.isNotBlank(s)) {
            System.out.println("not blank");
        }

        if (StringUtils.isBlank(s)) {
            System.out.println("blank!");
        }


        String blankStr = "";

        if (StringUtils.isNotBlank(blankStr)) {
            System.out.println("not blank");
        }

        if (StringUtils.isBlank(blankStr)) {
            System.out.println("blank!");
        }


        String nonBlankStr = " a ";

        if (StringUtils.isNotBlank(nonBlankStr)) {
            System.out.println("not blank!");
        }

        if (StringUtils.isBlank(nonBlankStr)) {
            System.out.println("blank!");
        }
    }
}
