package io.github.alphabet;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字母表去重
 *
 * @author 13570326865@139.com
 * @version 1.0
 */
public class UnRepeatAlphabetFactory implements AlphabetFactory {
    @Override
    public void createAlphabet(String alphabet) {
        String newAlphabet = Optional.ofNullable(alphabet).orElse("");
        Pattern pattern = Pattern.compile("(.)\\1{2,}");
        newAlphabet = deleteRepeatLetters(pattern, newAlphabet);
        System.out.println("-> " + newAlphabet);
        if (pattern.matcher(newAlphabet).find()) {
            createAlphabet(newAlphabet);
        }
    }

    private String deleteRepeatLetters(Pattern pattern, String newAlphabet) {
        Matcher matcher = pattern.matcher(newAlphabet);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "");
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
