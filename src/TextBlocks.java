public class TextBlocks {
    public static void main(String[] args) {
        String jsonOldStyle = "{\n" +
                "   \"firstname\": \"Sander\",\n" +
                "   \"lastname\": \"Mak\"\n" +
                "}";
        System.out.println("Old Style: ");
        System.out.println(jsonOldStyle);

        System.out.println("======================");
        System.out.println("Text Blocks: ");
        String jsonString = """
                {
                    "firstName": "Sander",
                    "lastName": "Mak"
                }
                """;
        System.out.println(jsonString);

        System.out.println("===========================");
        System.out.println("Essential Whitespace: ");
        String essentialWhitespace = """
               {
                    "firstName": "Sander",
                    "lastName": "Mak"
               }
            """;
        System.out.println(essentialWhitespace);

        System.out.println("===========================");
        System.out.println("Backslash: ");
        String backslash = """
            {\
                    "firstName": "Sander",\
                    "lastName": "Mak"\
            }""";
        System.out.println(backslash);
        // {        "firstName": "Sander",        "lastName": "Mak"}
        // the string is now printed as a single line.
        // essential whitespace is still preserved

        System.out.println("===========================");
        System.out.println("Multiple double quotes: ");
        String multipleDoubleQuotes = """
            {\
                    \"""firstName": "Sander",\
                    "lastName": "Mak"\
            }""";
        System.out.println(multipleDoubleQuotes);

        System.out.println("===================");
        System.out.println("Formatting: ");
        String formatting = """
                {
                    "firstName": "Sander",
                    "lastName": "%s"
                }
                """.formatted("Mak");
        System.out.println(formatting);

    }
}
