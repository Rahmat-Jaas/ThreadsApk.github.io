package com.facebook.superpack;

import X.C15020qa;
import java.io.InputStream;

public class ObiInputStream extends InputStream {
    public byte[] mOneByte;

    public static native void closeNative(long j, byte[] bArr);

    public static native long openBytesNative(byte[] bArr, int i, int i2);

    public static native long openInputStreamNative(InputStream inputStream, int i);

    public static native int readNative(long j, byte[] bArr, int i, int i2);

    public synchronized void close() {
        closeNative(0, (byte[]) null);
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    static {
        C15020qa.A0A("superpack-jni");
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        Throwable th;
        if (bArr != null) {
            if (i >= 0 && i2 >= 0) {
                if (i2 + i <= bArr.length) {
                    if (readNative(0, bArr, i, i2) <= 0) {
                        return -1;
                    }
                    return i2;
                }
            }
            th = new IndexOutOfBoundsException();
        } else {
            th = new NullPointerException();
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r3 = this;
            monitor-enter(r3)
            byte[] r0 = r3.mOneByte     // Catch:{ all -> 0x0026 }
            r2 = 1
            if (r0 != 0) goto L_0x000a
            byte[] r0 = new byte[r2]     // Catch:{ all -> 0x0026 }
            r3.mOneByte = r0     // Catch:{ all -> 0x0026 }
        L_0x000a:
            int r1 = r3.read(r0)     // Catch:{ all -> 0x0026 }
            r0 = -1
            if (r1 == r0) goto L_0x0024
            if (r1 != r2) goto L_0x001b
            byte[] r1 = r3.mOneByte     // Catch:{ all -> 0x0026 }
            r0 = 0
            byte r0 = r1[r0]     // Catch:{ all -> 0x0026 }
            if (r0 >= 0) goto L_0x0024
            goto L_0x0022
        L_0x001b:
            java.lang.String r0 = "Unexpected number of bytes read"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0022:
            int r0 = r0 + 256
        L_0x0024:
            monitor-exit(r3)
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.superpack.ObiInputStream.read():int");
    }
}
