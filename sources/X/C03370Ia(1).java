package X;

import android.system.Int64Ref;
import android.system.Os;
import android.system.StructStat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.0Ia  reason: invalid class name and case insensitive filesystem */
public final class C03370Ia {
    public static boolean A00 = true;
    public static final boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r3 == 3) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r7 = true;
     */
    static {
        /*
            r7 = 0
            java.lang.String r0 = "os.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            if (r1 == 0) goto L_0x003a
            boolean r0 = r1.isEmpty()     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "\\."
            java.lang.String[] r6 = r1.split(r0)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            r5 = 3
            r2 = 2
            r1 = 6
            r0 = 33
            int[] r4 = new int[]{r2, r1, r0}     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            int r0 = r6.length     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            int r3 = java.lang.Math.min(r0, r5)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            r2 = 0
        L_0x0024:
            if (r2 >= r3) goto L_0x0037
            r0 = r6[r2]     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            r0 = r4[r2]     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            if (r1 < r0) goto L_0x003a
            r0 = r4[r2]     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x003a }
            if (r1 > r0) goto L_0x0039
            int r2 = r2 + 1
            goto L_0x0024
        L_0x0037:
            if (r3 != r5) goto L_0x003a
        L_0x0039:
            r7 = 1
        L_0x003a:
            A01 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03370Ia.<clinit>():void");
    }

    public static int A02(InputStream inputStream, byte[] bArr, int i) {
        int min = Math.min(bArr.length, i);
        int i2 = 0;
        while (i2 < min) {
            int read = inputStream.read(bArr, i2, min - i2);
            if (read >= 0) {
                i2 += read;
            } else if (read == -1 && i2 == 0) {
                return -1;
            } else {
                return i2;
            }
        }
        return i2;
    }

    public static int A00(FileInputStream fileInputStream, FileOutputStream fileOutputStream, int i) {
        int i2;
        int i3;
        if (A01 && A00) {
            FileDescriptor fd = fileOutputStream.getFD();
            FileDescriptor fd2 = fileInputStream.getFD();
            try {
                StructStat fstat = Os.fstat(fd2);
                if (fstat == null) {
                    i2 = -1;
                } else {
                    i2 = (int) fstat.st_size;
                }
                if (i2 >= 0) {
                    int min = Math.min(i2, i);
                    long j = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < min) {
                        try {
                            i3 = (int) Os.sendfile(fd, fd2, new Int64Ref(j), (long) (min - i4));
                            if (i3 >= 0) {
                                j = (long) i3;
                                i4 += i3;
                                int i6 = i5 + 1;
                                if (i5 <= 50) {
                                    i5 = i6;
                                } else {
                                    throw new IOException(String.format("Tried %d times to send file. Progress %d / %d sent: %d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i4), Integer.valueOf(min), Integer.valueOf(i3)}));
                                }
                            } else {
                                throw new IOException(String.format("Failed to send file. Ret: %d", new Object[]{Integer.valueOf(i3)}));
                            }
                        } catch (IllegalAccessError | NoClassDefFoundError | NoSuchFieldError | NoSuchMethodError e) {
                            Log.w("CopyUtils", "Failed to call send file for copy utils", e);
                            A00 = false;
                            i3 = -1;
                        } catch (Exception e2) {
                            throw new IOException(e2);
                        }
                    }
                    if (i4 > 0) {
                        return i4;
                    }
                }
            } catch (IllegalAccessError | NoClassDefFoundError | NoSuchFieldError | NoSuchMethodError e3) {
                Log.w("CopyUtils", "Failed to call fstat st.size for copy utils", e3);
                A00 = false;
                i2 = -1;
            } catch (Exception e4) {
                throw new IOException(e4);
            }
            throw new IOException(String.format("fstat st_size failed with value %d", new Object[]{Integer.valueOf(i2)}));
        }
        return A01(fileInputStream, fileOutputStream, i);
    }

    public static int A01(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[32768];
        int i2 = 0;
        while (i2 < i) {
            int A02 = A02(inputStream, bArr, i - i2);
            if (A02 == -1) {
                break;
            }
            outputStream.write(bArr, 0, A02);
            i2 += A02;
        }
        return i2;
    }
}
