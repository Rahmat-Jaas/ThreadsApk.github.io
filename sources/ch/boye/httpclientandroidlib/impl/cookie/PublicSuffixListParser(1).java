package ch.boye.httpclientandroidlib.impl.cookie;

import X.AnonymousClass0wJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class PublicSuffixListParser {
    public static final int MAX_LINE_LEN = 256;
    public final PublicSuffixFilter filter;

    private boolean readLine(Reader reader, StringBuilder sb) {
        sb.setLength(0);
        boolean z = false;
        do {
            int read = reader.read();
            if (read == -1) {
                return false;
            }
            char c = (char) read;
            if (c == 10) {
                return read != -1;
            }
            if (Character.isWhitespace(c)) {
                z = true;
            } else if (!z) {
                sb.append(c);
            }
        } while (sb.length() <= 256);
        throw new IOException("Line too long");
    }

    public PublicSuffixListParser(PublicSuffixFilter publicSuffixFilter) {
        this.filter = publicSuffixFilter;
    }

    public void parse(Reader reader) {
        boolean readLine;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder(256);
        do {
            readLine = readLine(bufferedReader, sb);
            String obj = sb.toString();
            if (obj.length() != 0 && !obj.startsWith("//")) {
                if (obj.startsWith(".")) {
                    obj = obj.substring(1);
                }
                if (obj.startsWith("!")) {
                    A0v2.add(obj.substring(1));
                    continue;
                } else {
                    A0v.add(obj);
                    continue;
                }
            }
        } while (readLine);
        this.filter.setPublicSuffixes(A0v);
        this.filter.setExceptions(A0v2);
    }
}
