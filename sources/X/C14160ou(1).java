package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;

/* renamed from: X.0ou  reason: invalid class name and case insensitive filesystem */
public final class C14160ou {
    public final StringBuilder A00;

    public final void A00(int i) {
        StringBuilder sb = this.A00;
        sb.append('|');
        sb.append(i);
    }

    public final void A02(String str) {
        this.A00.append('|');
        A01(str);
    }

    public final void A03(String[] strArr, int i) {
        StringBuilder sb = this.A00;
        sb.append('|');
        for (int i2 = 1; i2 < i; i2 += 2) {
            String str = strArr[i2 - 1];
            String str2 = strArr[i2];
            sb.append(str);
            sb.append('=');
            sb.append(str2);
            if (i2 < i - 1) {
                sb.append(BasicHeaderValueParser.PARAM_DELIMITER);
            }
        }
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C14160ou(char c) {
        StringBuilder sb = new StringBuilder(1024);
        this.A00 = sb;
        sb.append(c);
    }

    public final void A01(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            StringBuilder sb = this.A00;
            char charAt = str.charAt(i);
            if (charAt == 0 || charAt == 13 || charAt == ';' || charAt == '|' || charAt == 9 || charAt == 10) {
                charAt = ' ';
            }
            sb.append(charAt);
        }
    }
}
