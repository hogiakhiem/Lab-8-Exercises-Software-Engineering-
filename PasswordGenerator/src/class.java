//
// Name: Ho Gia Khiem
// Student ID: 520K0341
// A basic Java project: Password Generator
//
public String generatePassword() {
    PasswordGenerator gen = new PasswordGenerator();
    CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
    CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
    lowerCaseRule.setNumberOfCharacters(2);

    CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
    CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
    uppereCaseRule.setNumberOfCharacters(2);

    CharacterData digitChars = EnglishCharacterData.Digit;
    CharacterRule digitRule = new CharacterRule(digitChars);
    digitRule.setNumberOfCharacters(2);

    CharacterData specialChars = new CharacterData() {
        public String getErrorCode() {
            return ERROR_CODE;
        }

        public String getCharacters() {
            return "!@#$%^&*()_+";
        }
    };

    CharacterRule splCharRule = new CharacterRule(specialChars);
    splCharRule.setNumberOfCharacters(2);

    String password = gen.generatePassword(10, splCharRule, lowerCaseRule, upperCaseRule, digitRule);
    return password;
}