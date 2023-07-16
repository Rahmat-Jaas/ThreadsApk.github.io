package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* renamed from: X.0Bi  reason: invalid class name and case insensitive filesystem */
public final class C02430Bi extends Reader {
    public InputStream A00;
    public CharsetDecoder A01;
    public boolean A02 = false;
    public final ByteBuffer A03;

    public final void close() {
        synchronized (this.lock) {
            CharsetDecoder charsetDecoder = this.A01;
            if (charsetDecoder != null) {
                charsetDecoder.reset();
            }
            this.A01 = null;
            InputStream inputStream = this.A00;
            if (inputStream != null) {
                inputStream.close();
                this.A00 = null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:20|21|(1:25)|26|27|(1:(1:49))(1:29)) */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c2, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(char[] r12, int r13, int r14) {
        /*
            r11 = this;
            java.lang.Object r2 = r11.lock
            monitor-enter(r2)
            java.lang.Object r3 = r11.lock     // Catch:{ all -> 0x00ce }
            monitor-enter(r3)     // Catch:{ all -> 0x00ce }
            java.io.InputStream r6 = r11.A00     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x00c3
            monitor-exit(r3)     // Catch:{ all -> 0x00cb }
            int r0 = r12.length     // Catch:{ all -> 0x00ce }
            X.AnonymousClass0BM.A01(r0, r13, r14)     // Catch:{ all -> 0x00ce }
            r5 = 0
            if (r14 != 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x00ce }
            return r5
        L_0x0014:
            java.nio.CharBuffer r3 = java.nio.CharBuffer.wrap(r12, r13, r14)     // Catch:{ all -> 0x00ce }
            java.nio.charset.CoderResult r7 = java.nio.charset.CoderResult.UNDERFLOW     // Catch:{ all -> 0x00ce }
            java.nio.ByteBuffer r8 = r11.A03     // Catch:{ all -> 0x00ce }
            boolean r0 = r8.hasRemaining()     // Catch:{ all -> 0x00ce }
            r4 = 1
            r9 = 0
            if (r0 != 0) goto L_0x0026
            goto L_0x00bf
        L_0x0026:
            boolean r0 = r3.hasRemaining()     // Catch:{ all -> 0x00ce }
            r1 = -1
            if (r0 == 0) goto L_0x005a
            if (r9 == 0) goto L_0x009c
            int r0 = r6.available()     // Catch:{ IOException -> 0x003c }
            if (r0 != 0) goto L_0x003c
            int r0 = r3.position()     // Catch:{ IOException -> 0x003c }
            if (r0 <= r13) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            int r10 = r8.capacity()     // Catch:{ all -> 0x00ce }
            int r0 = r8.limit()     // Catch:{ all -> 0x00ce }
            int r10 = r10 - r0
            int r9 = r8.arrayOffset()     // Catch:{ all -> 0x00ce }
            int r0 = r8.limit()     // Catch:{ all -> 0x00ce }
            int r9 = r9 + r0
            byte[] r0 = r8.array()     // Catch:{ all -> 0x00ce }
            int r9 = r6.read(r0, r9, r10)     // Catch:{ all -> 0x00ce }
            if (r9 != r1) goto L_0x0092
            r11.A02 = r4     // Catch:{ all -> 0x00ce }
        L_0x005a:
            java.nio.charset.CoderResult r5 = java.nio.charset.CoderResult.UNDERFLOW     // Catch:{ all -> 0x00ce }
            if (r7 != r5) goto L_0x0075
            boolean r0 = r11.A02     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0075
            java.nio.charset.CharsetDecoder r0 = r11.A01     // Catch:{ all -> 0x00ce }
            java.nio.charset.CoderResult r7 = r0.decode(r8, r3, r4)     // Catch:{ all -> 0x00ce }
            if (r7 != r5) goto L_0x0070
            java.nio.charset.CharsetDecoder r0 = r11.A01     // Catch:{ all -> 0x00ce }
            java.nio.charset.CoderResult r7 = r0.flush(r3)     // Catch:{ all -> 0x00ce }
        L_0x0070:
            java.nio.charset.CharsetDecoder r0 = r11.A01     // Catch:{ all -> 0x00ce }
            r0.reset()     // Catch:{ all -> 0x00ce }
        L_0x0075:
            boolean r0 = r7.isMalformed()     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x0081
            boolean r0 = r7.isUnmappable()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0084
        L_0x0081:
            r7.throwException()     // Catch:{ all -> 0x00ce }
        L_0x0084:
            int r0 = r3.position()     // Catch:{ all -> 0x00ce }
            int r0 = r0 - r13
            if (r0 == 0) goto L_0x0090
            int r1 = r3.position()     // Catch:{ all -> 0x00ce }
            int r1 = r1 - r13
        L_0x0090:
            monitor-exit(r2)     // Catch:{ all -> 0x00ce }
            goto L_0x00c2
        L_0x0092:
            if (r9 == 0) goto L_0x005a
            int r0 = r8.limit()     // Catch:{ all -> 0x00ce }
            int r0 = r0 + r9
            r8.limit(r0)     // Catch:{ all -> 0x00ce }
        L_0x009c:
            java.nio.charset.CharsetDecoder r0 = r11.A01     // Catch:{ all -> 0x00ce }
            java.nio.charset.CoderResult r7 = r0.decode(r8, r3, r5)     // Catch:{ all -> 0x00ce }
            boolean r0 = r7.isUnderflow()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x005a
            int r1 = r8.limit()     // Catch:{ all -> 0x00ce }
            int r0 = r8.capacity()     // Catch:{ all -> 0x00ce }
            if (r1 != r0) goto L_0x00bf
            r8.compact()     // Catch:{ all -> 0x00ce }
            int r0 = r8.position()     // Catch:{ all -> 0x00ce }
            r8.limit(r0)     // Catch:{ all -> 0x00ce }
            r8.position(r5)     // Catch:{ all -> 0x00ce }
        L_0x00bf:
            r9 = 1
            goto L_0x0026
        L_0x00c2:
            return r1
        L_0x00c3:
            java.lang.String r1 = "InputStreamReader is closed"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00cb }
            r0.<init>(r1)     // Catch:{ all -> 0x00cb }
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00cb }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ce }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02430Bi.read(char[], int, int):int");
    }

    public final boolean ready() {
        InputStream inputStream;
        boolean z;
        synchronized (this.lock) {
            synchronized (this.lock) {
                inputStream = this.A00;
                if (inputStream == null) {
                    throw new IOException("InputStreamReader is closed");
                }
            }
            z = false;
            try {
                if (this.A03.hasRemaining() || inputStream.available() > 0) {
                    z = true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
        return z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C02430Bi(InputStream inputStream, ByteBuffer byteBuffer) {
        super(inputStream);
        Charset defaultCharset = Charset.defaultCharset();
        this.A03 = byteBuffer;
        this.A00 = inputStream;
        CharsetDecoder newDecoder = defaultCharset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.A01 = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        byteBuffer.limit(0);
    }

    public final int read() {
        char c;
        synchronized (this.lock) {
            if (this.A00 != null) {
                char[] cArr = new char[1];
                c = 65535;
                if (read(cArr, 0, 1) != -1) {
                    c = cArr[0];
                }
            } else {
                throw new IOException("InputStreamReader is closed");
            }
        }
        return c;
    }
}
