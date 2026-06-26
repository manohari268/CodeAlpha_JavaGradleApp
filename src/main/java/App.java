import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        String time = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

        System.out.println("==============================================");
        System.out.println("        CODEALPHA DEVOPS AUTOMATION APP       ");
        System.out.println("==============================================");
        System.out.println("Project      : Java Application using Gradle");
        System.out.println("Developer    : Manohari M");
        System.out.println("Build Tool   : Gradle");
        System.out.println("Language     : Java");
        System.out.println("Version      : 1.0.0");
        System.out.println("Build Status : SUCCESS");
        System.out.println("Build Time   : " + time);
        System.out.println("----------------------------------------------");
        System.out.println("Features:");
        System.out.println("1. Automated build using Gradle");
        System.out.println("2. Clean project structure");
        System.out.println("3. CI/CD ready application");
        System.out.println("4. Easy execution using Gradle Wrapper");
        System.out.println("----------------------------------------------");
        System.out.println("DevOps Pipeline Flow:");
        System.out.println("Code -> Build -> Test -> Package -> Deploy");
        System.out.println("==============================================");
        System.out.println("Thank you CodeAlpha!");
    }
}