package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.0Y5  reason: invalid class name */
public class AnonymousClass0Y5 {
    public static final byte[] A00 = new byte[100];
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void A01(File file, String str, String str2, Properties properties) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, AnonymousClass00U.A0L(str2, str));
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A02(File file, String str, List list, Properties properties, boolean z) {
        long length;
        File file2 = file;
        File file3 = new File(AnonymousClass00U.A0L(file2.getPath(), "_tmp"));
        String str2 = str;
        Properties properties2 = properties;
        if (str != null) {
            C04360Nh A002 = C04360Nh.A00(str2);
            synchronized (A002.A03) {
                C002801h.A02(A002.A02, AnonymousClass00U.A0L("Did you call FixedLengthFiles.init()? - pool: ", A002.A04));
                boolean z2 = false;
                if (!A002.A02.getPath().equals(file3.getParent())) {
                    z2 = true;
                }
                C002801h.A04(z2, "Destination file cannot be in the pool directory");
                File[] listFiles = A002.A02.listFiles();
                if (listFiles != null && listFiles.length > 0 && listFiles[0].renameTo(file3)) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                        try {
                            randomAccessFile.write("# ".getBytes("Ascii"));
                            randomAccessFile.write(str2.getBytes("Ascii"));
                            randomAccessFile.write("\n".getBytes("Ascii"));
                            Iterator it = properties2.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    String obj = entry.getKey().toString();
                                    String obj2 = entry.getValue().toString();
                                    byte[] bytes = A00(obj, true).getBytes("Ascii");
                                    byte[] bytes2 = A00(obj2, false).getBytes("Ascii");
                                    if (randomAccessFile.getFilePointer() + ((long) bytes.length) + ((long) bytes2.length) + 25 > randomAccessFile.length()) {
                                        randomAccessFile.write("trimmed_report=true\n#".getBytes("Ascii"));
                                        randomAccessFile.close();
                                        A01(file3, str2, " store (too large) ", properties2);
                                        break;
                                    }
                                    randomAccessFile.write(bytes);
                                    randomAccessFile.write("=".getBytes("Ascii"));
                                    randomAccessFile.write(bytes2);
                                    randomAccessFile.write("\n".getBytes("Ascii"));
                                } else {
                                    byte[] bytes3 = "# ".getBytes("Ascii");
                                    while (true) {
                                        randomAccessFile.write(bytes3);
                                        long filePointer = randomAccessFile.getFilePointer();
                                        bytes3 = A00;
                                        length = (long) bytes3.length;
                                        if (filePointer + length >= randomAccessFile.length()) {
                                            break;
                                        }
                                    }
                                    while (randomAccessFile.getFilePointer() + length < randomAccessFile.length()) {
                                        randomAccessFile.writeByte(0);
                                    }
                                    randomAccessFile.close();
                                }
                            }
                            randomAccessFile.close();
                        } catch (Throwable unused) {
                        }
                    } catch (FileNotFoundException e) {
                        C04790Pd.A00();
                        AnonymousClass0LU.A0G("lacrima", "Cannot reserve file", e);
                    }
                }
                A01(file3, str2, " store (reserve)", properties2);
            }
        } else {
            A01(file3, "", "no pool", properties2);
        }
        if (!file3.renameTo(file2)) {
            throw new IOException(AnonymousClass00U.A0L("Could not rename file: ", file2.getName()));
        }
        return;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r2 < r4) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r7, boolean r8) {
        /*
            int r4 = r7.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r2 = 0
            r1 = 32
            if (r8 != 0) goto L_0x001c
            if (r4 <= 0) goto L_0x0085
            char r0 = r7.charAt(r2)
            if (r0 != r1) goto L_0x001e
            java.lang.String r0 = "\\ "
            r3.append(r0)
            r2 = 1
        L_0x001c:
            if (r2 >= r4) goto L_0x0085
        L_0x001e:
            char r5 = r7.charAt(r2)
            switch(r5) {
                case 9: goto L_0x0079;
                case 10: goto L_0x007c;
                case 11: goto L_0x0025;
                case 12: goto L_0x007f;
                case 13: goto L_0x0076;
                default: goto L_0x0025;
            }
        L_0x0025:
            r6 = 92
            if (r8 == 0) goto L_0x002b
            if (r5 == r1) goto L_0x0072
        L_0x002b:
            if (r5 == r6) goto L_0x0072
            r0 = 35
            if (r5 == r0) goto L_0x0072
            r0 = 33
            if (r5 == r0) goto L_0x0072
            r0 = 58
            if (r5 == r0) goto L_0x0072
            r0 = 61
            if (r5 == r0) goto L_0x0072
            if (r5 < r1) goto L_0x0049
            r0 = 126(0x7e, float:1.77E-43)
            if (r5 > r0) goto L_0x0049
        L_0x0043:
            r3.append(r5)
        L_0x0046:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0049:
            java.lang.String r0 = "\\u"
            r3.append(r0)
            char[] r6 = A01
            int r0 = r5 >>> 12
            r0 = r0 & 15
            char r0 = r6[r0]
            r3.append(r0)
            int r0 = r5 >>> 8
            r0 = r0 & 15
            char r0 = r6[r0]
            r3.append(r0)
            int r0 = r5 >>> 4
            r0 = r0 & 15
            char r0 = r6[r0]
            r3.append(r0)
            int r0 = r5 >>> 0
            r0 = r0 & 15
            char r5 = r6[r0]
            goto L_0x0043
        L_0x0072:
            r3.append(r6)
            goto L_0x0043
        L_0x0076:
            java.lang.String r0 = "\\r"
            goto L_0x0081
        L_0x0079:
            java.lang.String r0 = "\\t"
            goto L_0x0081
        L_0x007c:
            java.lang.String r0 = "\\n"
            goto L_0x0081
        L_0x007f:
            java.lang.String r0 = "\\f"
        L_0x0081:
            r3.append(r0)
            goto L_0x0046
        L_0x0085:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y5.A00(java.lang.String, boolean):java.lang.String");
    }
}
