package X;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Q1  reason: invalid class name */
public final class AnonymousClass0Q1 {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final String A00(String str) {
        Pattern compile;
        int indexOf;
        if (!this.A02) {
            return str;
        }
        if ("".isEmpty()) {
            compile = null;
        } else {
            compile = Pattern.compile("");
        }
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            String str2 = this.A01;
            if (!str2.isEmpty() && (indexOf = readLine.indexOf(61)) != -1 && str2.contains(readLine.substring(0, indexOf))) {
                readLine = "";
            }
            if (compile != null) {
                Matcher matcher = compile.matcher(readLine);
                while (matcher.find()) {
                    for (int i = 1; i <= matcher.groupCount(); i++) {
                        if (matcher.group(i) != null) {
                            readLine = readLine.replace(matcher.group(i), "");
                        }
                    }
                }
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.append(10);
            }
            stringBuffer.append(readLine);
        }
        if (str.endsWith("\n")) {
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }

    public AnonymousClass0Q1(String str, String str2, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = str2;
    }
}
