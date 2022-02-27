package io.github.alphabet;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字母表聚合
 *
 * @author 13570326865@139.com
 * @version 1.0
 */
public class AggregationAlphabetFactory implements AlphabetFactory {

    @Override
    public void createAlphabet(String alphabet) {
        String newAlphabet = Optional.ofNullable(alphabet).orElse("");
        Pattern pattern = Pattern.compile("(.)\\1{2,}");
        Matcher matcher = pattern.matcher(newAlphabet);
        StringBuffer sb = new StringBuffer();
        if (matcher.find()) {
            String targetLetter = getTargetLetter(matcher);
            matcher.appendReplacement(sb, targetLetter);
            matcher.appendTail(sb);
            newAlphabet = sb.toString();
            if (!targetLetter.equals("")) {
                System.out.printf("-> %s, %s is replaced by %s\n", newAlphabet, matcher.group(0), targetLetter);
            } else {
                System.out.printf("-> %s\n", newAlphabet);
            }
        }
        if (pattern.matcher(newAlphabet).find()) {
            createAlphabet(newAlphabet);
        }
    }

    private String getTargetLetter(Matcher matcher) {
        String targetLetter = String.valueOf((char) (matcher.group(1).charAt(0) - 1));
        targetLetter = targetLetter.equals("`") ? "" : targetLetter;
        return targetLetter;
    }
}
