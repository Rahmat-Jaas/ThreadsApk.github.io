package X;

import java.io.IOException;
import java.io.Writer;

/* renamed from: X.0Bh  reason: invalid class name */
public final class AnonymousClass0Bh extends Writer {
    public Writer A00;
    public int A01;
    public char[] A02;

    private void A00() {
        Writer writer = this.A00;
        if (writer != null) {
            int i = this.A01;
            if (i > 0) {
                writer.write(this.A02, 0, i);
            }
            this.A01 = 0;
            return;
        }
        throw new IOException("BufferedWriter is closed");
    }

    public final void close() {
        Writer writer = this.A00;
        if (writer != null) {
            try {
                A00();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            this.A02 = null;
            try {
                writer.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.A00 = null;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        Writer writer = this.A00;
        if (writer != null) {
            A00();
            writer.flush();
            return;
        }
        throw new IOException("BufferedWriter is closed");
    }

    public final void write(int i) {
        Writer writer = this.A00;
        if (writer != null) {
            char[] cArr = this.A02;
            int i2 = this.A01;
            int length = cArr.length;
            if (i2 >= length) {
                writer.write(cArr, 0, length);
                this.A01 = 0;
                i2 = 0;
            }
            this.A01 = i2 + 1;
            cArr[i2] = (char) i;
            return;
        }
        throw new IOException("BufferedWriter is closed");
    }

    public AnonymousClass0Bh(Writer writer, char[] cArr) {
        super(writer);
        this.A00 = writer;
        this.A02 = cArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r2 > 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(java.lang.String r8, int r9, int r10) {
        /*
            r7 = this;
            java.io.Writer r5 = r7.A00
            if (r5 == 0) goto L_0x0063
            if (r10 <= 0) goto L_0x0023
            if (r9 < 0) goto L_0x005e
            int r0 = r8.length()
            int r0 = r0 - r10
            if (r9 > r0) goto L_0x005e
            char[] r6 = r7.A02
            int r0 = r7.A01
            r4 = 0
            if (r0 != 0) goto L_0x0024
            int r1 = r6.length
            if (r10 < r1) goto L_0x0024
            char[] r1 = new char[r10]
            int r0 = r9 + r10
            r8.getChars(r9, r0, r1, r4)
            r5.write(r1, r4, r10)
        L_0x0023:
            return
        L_0x0024:
            int r3 = r6.length
            int r2 = r3 - r0
            if (r10 >= r2) goto L_0x0050
            r2 = r10
        L_0x002a:
            int r1 = r9 + r2
            r8.getChars(r9, r1, r6, r0)
            int r0 = r7.A01
            int r0 = r0 + r2
            r7.A01 = r0
        L_0x0034:
            if (r0 != r3) goto L_0x0023
            char[] r1 = r7.A02
            int r0 = r1.length
            r5.write(r1, r4, r0)
            r7.A01 = r4
            if (r10 <= r2) goto L_0x0023
            int r9 = r9 + r2
            int r2 = r10 - r2
            if (r2 < r3) goto L_0x0053
            char[] r1 = new char[r10]
            int r0 = r9 + r2
            r8.getChars(r9, r0, r1, r4)
            r5.write(r1, r4, r2)
            return
        L_0x0050:
            if (r2 <= 0) goto L_0x0034
            goto L_0x002a
        L_0x0053:
            int r0 = r9 + r2
            r8.getChars(r9, r0, r6, r4)
            int r0 = r7.A01
            int r0 = r0 + r2
            r7.A01 = r0
            return
        L_0x005e:
            java.lang.StringIndexOutOfBoundsException r0 = X.AnonymousClass0BM.A00(r8, r9, r10)
            throw r0
        L_0x0063:
            java.lang.String r1 = "BufferedWriter is closed"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Bh.write(java.lang.String, int, int):void");
    }

    public final void write(char[] cArr, int i, int i2) {
        Writer writer = this.A00;
        if (writer == null) {
            throw new IOException("BufferedWriter is closed");
        } else if (cArr != null) {
            AnonymousClass0BM.A01(cArr.length, i, i2);
            char[] cArr2 = this.A02;
            int i3 = this.A01;
            if (i3 != 0 || i2 < cArr2.length) {
                int length = cArr2.length - i3;
                if (i2 < length) {
                    length = i2;
                }
                if (length > 0) {
                    System.arraycopy(cArr, i, cArr2, i3, length);
                    i3 = this.A01 + length;
                    this.A01 = i3;
                }
                char[] cArr3 = this.A02;
                int length2 = cArr3.length;
                if (i3 == length2) {
                    writer.write(cArr3, 0, length2);
                    this.A01 = 0;
                    if (i2 > length) {
                        i += length;
                        i2 -= length;
                        char[] cArr4 = this.A02;
                        if (i2 < cArr4.length) {
                            System.arraycopy(cArr, i, cArr4, 0, i2);
                            this.A01 += i2;
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            writer.write(cArr, i, i2);
        } else {
            throw new NullPointerException("buffer == null");
        }
    }
}
