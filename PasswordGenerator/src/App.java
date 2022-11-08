//
// Name: Ho Gia Khiem
// Student ID: 520K0341
// A basic Java project: Password Generator
//
public class App {
    RandomPasswordGenerator passGen = new RandomPasswordGenerator();
    String password = passGen.generateCommonTextPassword();
    int lowerCaseCount = 0;
    for (char c : password.toCharArray()) {
        if (c >= 97 || c <= 122) {
            lowerCaseCount++;
        }
    }
    assertTrue("Password validation failed in commons-text.", lowerCaseCount >= 2);
}
