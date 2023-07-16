package X;

import java.io.Writer;

/* renamed from: X.05c  reason: invalid class name and case insensitive filesystem */
public final class C011105c extends Writer {
    public StringBuilder A00 = new StringBuilder(128);

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                StringBuilder sb = this.A00;
                if (sb.length() > 0) {
                    sb.delete(0, sb.length());
                }
            } else {
                this.A00.append(c);
            }
        }
    }

    public final void close() {
        StringBuilder sb = this.A00;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
    }

    public final void flush() {
        StringBuilder sb = this.A00;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
    }
}
