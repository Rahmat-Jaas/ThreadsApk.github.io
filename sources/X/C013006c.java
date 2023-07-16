package X;

import android.content.res.AssetManager;
import android.os.Build;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.06c  reason: invalid class name and case insensitive filesystem */
public final class C013006c {
    public boolean A00 = false;
    public byte[] A01;
    public C013106d[] A02;
    public final AssetManager A03;
    public final C013606i A04;
    public final File A05;
    public final String A06;
    public final Executor A07;
    public final byte[] A08;

    /* JADX WARNING: Missing exception handler attribute for start block: B:202:0x038f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:214:0x03b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x019f */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0200 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0201  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:193:0x0382=Splitter:B:193:0x0382, B:145:0x02bd=Splitter:B:145:0x02bd, B:202:0x038f=Splitter:B:202:0x038f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:61:0x018d=Splitter:B:61:0x018d, B:70:0x019f=Splitter:B:70:0x019f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C013006c A00() {
        /*
            r32 = this;
            r8 = r32
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x03d8
            byte[] r0 = r8.A08
            r20 = r0
            if (r0 == 0) goto L_0x03d7
            android.content.res.AssetManager r0 = r8.A03
            r31 = r0
            java.lang.String r1 = "dexopt/baseline.prof"
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r1)     // Catch:{ FileNotFoundException -> 0x01d2 }
            java.io.FileInputStream r7 = r0.createInputStream()     // Catch:{ FileNotFoundException -> 0x01d2 }
            if (r7 == 0) goto L_0x01f3
            r6 = 7
            byte[] r1 = X.C014506r.A00     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            int r0 = r1.length     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            byte[] r0 = X.C013206e.A03(r7, r0)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            if (r0 == 0) goto L_0x01a3
            byte[] r2 = X.C014806w.A05     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            int r0 = r2.length     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            byte[] r1 = X.C013206e.A03(r7, r0)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            java.lang.String r0 = r8.A06     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            r17 = r0
            boolean r0 = java.util.Arrays.equals(r1, r2)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            if (r0 == 0) goto L_0x01ab
            r0 = 1
            byte[] r0 = X.C013206e.A03(r7, r0)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            r18 = 0
            r5 = 0
            byte r0 = r0[r5]     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r0     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            long r2 = r2 << r5
            long r0 = r18 + r2
            int r15 = (int) r0     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            long r2 = X.C013206e.A01(r7)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            long r0 = X.C013206e.A01(r7)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            int r4 = (int) r0     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            int r0 = (int) r2     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            byte[] r1 = X.C013206e.A04(r7, r4, r0)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            int r0 = r7.read()     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            if (r0 > 0) goto L_0x01a0
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            int r0 = r4.available()     // Catch:{ all -> 0x019b }
            r3 = 0
            if (r0 != 0) goto L_0x0070
            X.06d[] r2 = new X.C013106d[r5]     // Catch:{ all -> 0x019b }
            goto L_0x018d
        L_0x0070:
            X.06d[] r2 = new X.C013106d[r15]     // Catch:{ all -> 0x019b }
            r11 = 0
        L_0x0073:
            if (r11 >= r15) goto L_0x00b5
            int r12 = X.C013206e.A00(r4)     // Catch:{ all -> 0x019b }
            int r16 = X.C013206e.A00(r4)     // Catch:{ all -> 0x019b }
            long r9 = X.C013206e.A01(r4)     // Catch:{ all -> 0x019b }
            long r29 = X.C013206e.A01(r4)     // Catch:{ all -> 0x019b }
            long r0 = X.C013206e.A01(r4)     // Catch:{ all -> 0x019b }
            byte[] r13 = X.C013206e.A03(r4, r12)     // Catch:{ all -> 0x019b }
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x019b }
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x019b }
            r14.<init>(r13, r12)     // Catch:{ all -> 0x019b }
            int r12 = (int) r9     // Catch:{ all -> 0x019b }
            int r9 = (int) r0     // Catch:{ all -> 0x019b }
            r0 = r16
            int[] r0 = new int[r0]     // Catch:{ all -> 0x019b }
            java.util.TreeMap r24 = new java.util.TreeMap     // Catch:{ all -> 0x019b }
            r24.<init>()     // Catch:{ all -> 0x019b }
            X.06d r21 = new X.06d     // Catch:{ all -> 0x019b }
            r22 = r17
            r23 = r14
            r25 = r0
            r26 = r16
            r27 = r12
            r28 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x019b }
            r2[r11] = r21     // Catch:{ all -> 0x019b }
            int r11 = r11 + 1
            goto L_0x0073
        L_0x00b5:
            if (r3 >= r15) goto L_0x018d
            r13 = r2[r3]     // Catch:{ all -> 0x019b }
            int r12 = r4.available()     // Catch:{ all -> 0x019b }
            int r0 = r13.A03     // Catch:{ all -> 0x019b }
            int r12 = r12 - r0
            r17 = 0
        L_0x00c2:
            int r0 = r4.available()     // Catch:{ all -> 0x019b }
            if (r0 <= r12) goto L_0x0117
            int r0 = X.C013206e.A00(r4)     // Catch:{ all -> 0x019b }
            int r17 = r17 + r0
            java.util.TreeMap r9 = r13.A08     // Catch:{ all -> 0x019b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x019b }
            r11 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x019b }
            r9.put(r1, r0)     // Catch:{ all -> 0x019b }
            int r16 = X.C013206e.A00(r4)     // Catch:{ all -> 0x019b }
        L_0x00e0:
            if (r16 <= 0) goto L_0x00c2
            X.C013206e.A00(r4)     // Catch:{ all -> 0x019b }
            byte[] r0 = X.C013206e.A03(r4, r11)     // Catch:{ all -> 0x019b }
            byte r0 = r0[r5]     // Catch:{ all -> 0x019b }
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0     // Catch:{ all -> 0x019b }
            long r0 = r0 << r5
            long r9 = r18 + r0
            int r14 = (int) r9     // Catch:{ all -> 0x019b }
            r0 = 6
            if (r14 == r0) goto L_0x00f7
            if (r14 != r6) goto L_0x00fa
        L_0x00f7:
            int r16 = r16 + -1
            goto L_0x00e0
        L_0x00fa:
            if (r14 <= 0) goto L_0x00f7
            X.C013206e.A03(r4, r11)     // Catch:{ all -> 0x019b }
            byte[] r0 = X.C013206e.A03(r4, r11)     // Catch:{ all -> 0x019b }
            byte r0 = r0[r5]     // Catch:{ all -> 0x019b }
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0     // Catch:{ all -> 0x019b }
            long r0 = r0 << r5
            long r9 = r18 + r0
            int r0 = (int) r9     // Catch:{ all -> 0x019b }
        L_0x010c:
            if (r0 <= 0) goto L_0x0114
            X.C013206e.A00(r4)     // Catch:{ all -> 0x019b }
            int r0 = r0 + -1
            goto L_0x010c
        L_0x0114:
            int r14 = r14 + -1
            goto L_0x00fa
        L_0x0117:
            int r0 = r4.available()     // Catch:{ all -> 0x019b }
            if (r0 != r12) goto L_0x0185
            int r11 = r13.A00     // Catch:{ all -> 0x019b }
            int[] r10 = new int[r11]     // Catch:{ all -> 0x019b }
            r9 = 0
            r1 = 0
        L_0x0123:
            if (r9 >= r11) goto L_0x012f
            int r0 = X.C013206e.A00(r4)     // Catch:{ all -> 0x019b }
            int r1 = r1 + r0
            r10[r9] = r1     // Catch:{ all -> 0x019b }
            int r9 = r9 + 1
            goto L_0x0123
        L_0x012f:
            r13.A02 = r10     // Catch:{ all -> 0x019b }
            int r12 = r13.A04     // Catch:{ all -> 0x019b }
            int r0 = r12 << 1
            int r0 = r0 + 8
            int r0 = r0 + -1
            r0 = r0 & -8
            int r0 = r0 >> 3
            byte[] r0 = X.C013206e.A03(r4, r0)     // Catch:{ all -> 0x019b }
            java.util.BitSet r11 = java.util.BitSet.valueOf(r0)     // Catch:{ all -> 0x019b }
            r10 = 0
        L_0x0146:
            if (r10 >= r12) goto L_0x0181
            r14 = 2
            boolean r0 = r11.get(r10)     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x0150
            r14 = 0
        L_0x0150:
            int r0 = r10 + r12
            boolean r0 = r11.get(r0)     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x015a
            r14 = r14 | 4
        L_0x015a:
            if (r14 == 0) goto L_0x017e
            java.util.TreeMap r9 = r13.A08     // Catch:{ all -> 0x019b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x019b }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x019b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x016e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x019b }
        L_0x016e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x019b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x019b }
            r14 = r14 | r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x019b }
            r9.put(r1, r0)     // Catch:{ all -> 0x019b }
        L_0x017e:
            int r10 = r10 + 1
            goto L_0x0146
        L_0x0181:
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x0185:
            java.lang.String r1 = "Read too much data during profile line parse"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x019b }
            r0.<init>(r1)     // Catch:{ all -> 0x019b }
            throw r0     // Catch:{ all -> 0x019b }
        L_0x018d:
            r4.close()     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            r7.close()     // Catch:{ IOException -> 0x0194 }
            goto L_0x01f1
        L_0x0194:
            r1 = move-exception
            X.06i r0 = r8.A04
            r0.CHE(r6, r1)
            goto L_0x01f1
        L_0x019b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x019f }
        L_0x019f:
            throw r0     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
        L_0x01a0:
            java.lang.String r1 = "Content found after the end of file"
            goto L_0x01ad
        L_0x01a3:
            java.lang.String r1 = "Invalid magic"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            goto L_0x01b2
        L_0x01ab:
            java.lang.String r1 = "Unsupported version"
        L_0x01ad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
        L_0x01b2:
            throw r0     // Catch:{ IOException -> 0x01bc, IllegalStateException -> 0x01b3 }
        L_0x01b3:
            r2 = move-exception
            X.06i r1 = r8.A04     // Catch:{ all -> 0x01c6 }
            r0 = 8
            r1.CHE(r0, r2)     // Catch:{ all -> 0x01c6 }
            goto L_0x01c2
        L_0x01bc:
            r0 = move-exception
            X.06i r1 = r8.A04     // Catch:{ all -> 0x01c6 }
            r1.CHE(r6, r0)     // Catch:{ all -> 0x01c6 }
        L_0x01c2:
            r7.close()     // Catch:{ IOException -> 0x01ec }
            goto L_0x01f0
        L_0x01c6:
            r2 = move-exception
            r7.close()     // Catch:{ IOException -> 0x01cb }
            throw r2
        L_0x01cb:
            r1 = move-exception
            X.06i r0 = r8.A04
            r0.CHE(r6, r1)
            throw r2
        L_0x01d2:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01df }
            if (r1 == 0) goto L_0x01f3
            java.lang.String r0 = "compressed"
            r1.contains(r0)     // Catch:{ FileNotFoundException -> 0x01e4, IOException -> 0x01df }
            goto L_0x01f3
        L_0x01df:
            r2 = move-exception
            X.06i r1 = r8.A04
            r0 = 7
            goto L_0x01e8
        L_0x01e4:
            r2 = move-exception
            X.06i r1 = r8.A04
            r0 = 6
        L_0x01e8:
            r1.CHE(r0, r2)
            goto L_0x01f3
        L_0x01ec:
            r0 = move-exception
            r1.CHE(r6, r0)
        L_0x01f0:
            r2 = 0
        L_0x01f1:
            r8.A02 = r2
        L_0x01f3:
            X.06d[] r5 = r8.A02
            if (r5 == 0) goto L_0x03d7
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 > r0) goto L_0x03d7
            switch(r1) {
                case 31: goto L_0x0201;
                case 32: goto L_0x0201;
                case 33: goto L_0x0201;
                default: goto L_0x0200;
            }
        L_0x0200:
            return r32
        L_0x0201:
            r3 = 0
            java.lang.String r1 = "dexopt/baseline.profm"
            r0 = r31
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r1)     // Catch:{ FileNotFoundException -> 0x03b5 }
            java.io.FileInputStream r4 = r0.createInputStream()     // Catch:{ FileNotFoundException -> 0x03b5 }
            if (r4 == 0) goto L_0x03d7
            byte[] r1 = X.C014506r.A01     // Catch:{ all -> 0x03b0 }
            int r0 = r1.length     // Catch:{ all -> 0x03b0 }
            byte[] r0 = X.C013206e.A03(r4, r0)     // Catch:{ all -> 0x03b0 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x03a0
            byte[] r0 = X.C014806w.A05     // Catch:{ all -> 0x03b0 }
            int r0 = r0.length     // Catch:{ all -> 0x03b0 }
            byte[] r6 = X.C013206e.A03(r4, r0)     // Catch:{ all -> 0x03b0 }
            byte[] r2 = X.C014806w.A00     // Catch:{ all -> 0x03b0 }
            boolean r0 = java.util.Arrays.equals(r6, r2)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x02d8
            byte[] r1 = X.C014806w.A06     // Catch:{ all -> 0x03b0 }
            r0 = r20
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x03b0 }
            if (r0 != 0) goto L_0x02d4
            boolean r0 = java.util.Arrays.equals(r6, r2)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x02d0
            r0 = 1
            byte[] r6 = X.C013206e.A03(r4, r0)     // Catch:{ all -> 0x03b0 }
            r0 = 0
            r2 = 0
            byte r6 = r6[r2]     // Catch:{ all -> 0x03b0 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            long r6 = (long) r6     // Catch:{ all -> 0x03b0 }
            long r6 = r6 << r2
            long r0 = r0 + r6
            int r10 = (int) r0     // Catch:{ all -> 0x03b0 }
            long r6 = X.C013206e.A01(r4)     // Catch:{ all -> 0x03b0 }
            long r0 = X.C013206e.A01(r4)     // Catch:{ all -> 0x03b0 }
            int r9 = (int) r0     // Catch:{ all -> 0x03b0 }
            int r0 = (int) r6     // Catch:{ all -> 0x03b0 }
            byte[] r1 = X.C013206e.A04(r4, r9, r0)     // Catch:{ all -> 0x03b0 }
            int r0 = r4.read()     // Catch:{ all -> 0x03b0 }
            if (r0 > 0) goto L_0x03a8
            java.io.ByteArrayInputStream r11 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x03b0 }
            r11.<init>(r1)     // Catch:{ all -> 0x03b0 }
            int r0 = r11.available()     // Catch:{ all -> 0x02ca }
            r14 = 0
            if (r0 != 0) goto L_0x026f
            X.06d[] r5 = new X.C013106d[r2]     // Catch:{ all -> 0x02ca }
            goto L_0x02bd
        L_0x026f:
            int r0 = r5.length     // Catch:{ all -> 0x02ca }
            if (r10 != r0) goto L_0x02c2
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ all -> 0x02ca }
            int[] r12 = new int[r10]     // Catch:{ all -> 0x02ca }
            r6 = 0
        L_0x0277:
            if (r6 >= r10) goto L_0x0293
            int r1 = X.C013206e.A00(r11)     // Catch:{ all -> 0x02ca }
            int r0 = X.C013206e.A00(r11)     // Catch:{ all -> 0x02ca }
            r12[r6] = r0     // Catch:{ all -> 0x02ca }
            byte[] r2 = X.C013206e.A03(r11, r1)     // Catch:{ all -> 0x02ca }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x02ca }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x02ca }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x02ca }
            r13[r6] = r0     // Catch:{ all -> 0x02ca }
            int r6 = r6 + 1
            goto L_0x0277
        L_0x0293:
            if (r14 >= r10) goto L_0x02bd
            r9 = r5[r14]     // Catch:{ all -> 0x02ca }
            java.lang.String r1 = r9.A07     // Catch:{ all -> 0x02ca }
            r0 = r13[r14]     // Catch:{ all -> 0x02ca }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02ca }
            if (r0 == 0) goto L_0x02ba
            r7 = r12[r14]     // Catch:{ all -> 0x02ca }
            r9.A00 = r7     // Catch:{ all -> 0x02ca }
            int[] r6 = new int[r7]     // Catch:{ all -> 0x02ca }
            r2 = 0
            r1 = 0
        L_0x02a9:
            if (r2 >= r7) goto L_0x02b5
            int r0 = X.C013206e.A00(r11)     // Catch:{ all -> 0x02ca }
            int r1 = r1 + r0
            r6[r2] = r1     // Catch:{ all -> 0x02ca }
            int r2 = r2 + 1
            goto L_0x02a9
        L_0x02b5:
            r9.A02 = r6     // Catch:{ all -> 0x02ca }
            int r14 = r14 + 1
            goto L_0x0293
        L_0x02ba:
            java.lang.String r1 = "Order of dexfiles in metadata did not match baseline"
            goto L_0x02c4
        L_0x02bd:
            r11.close()     // Catch:{ all -> 0x03b0 }
            goto L_0x0385
        L_0x02c2:
            java.lang.String r1 = "Mismatched number of dex files found in metadata"
        L_0x02c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02ca }
            r0.<init>(r1)     // Catch:{ all -> 0x02ca }
            throw r0     // Catch:{ all -> 0x02ca }
        L_0x02ca:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x038f }
            goto L_0x038f
        L_0x02d0:
            java.lang.String r1 = "Unsupported meta version"
            goto L_0x03aa
        L_0x02d4:
            java.lang.String r1 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            goto L_0x039a
        L_0x02d8:
            byte[] r0 = X.C014806w.A01     // Catch:{ all -> 0x03b0 }
            boolean r0 = java.util.Arrays.equals(r6, r0)     // Catch:{ all -> 0x03b0 }
            if (r0 == 0) goto L_0x0398
            int r9 = X.C013206e.A00(r4)     // Catch:{ all -> 0x03b0 }
            long r6 = X.C013206e.A01(r4)     // Catch:{ all -> 0x03b0 }
            long r0 = X.C013206e.A01(r4)     // Catch:{ all -> 0x03b0 }
            int r2 = (int) r0     // Catch:{ all -> 0x03b0 }
            int r0 = (int) r6     // Catch:{ all -> 0x03b0 }
            byte[] r1 = X.C013206e.A04(r4, r2, r0)     // Catch:{ all -> 0x03b0 }
            int r0 = r4.read()     // Catch:{ all -> 0x03b0 }
            if (r0 > 0) goto L_0x0390
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x03b0 }
            r10.<init>(r1)     // Catch:{ all -> 0x03b0 }
            int r0 = r10.available()     // Catch:{ all -> 0x038b }
            r11 = 0
            if (r0 != 0) goto L_0x0307
            X.06d[] r5 = new X.C013106d[r11]     // Catch:{ all -> 0x038b }
            goto L_0x0382
        L_0x0307:
            int r7 = r5.length     // Catch:{ all -> 0x038b }
            if (r9 == r7) goto L_0x0314
            java.lang.String r1 = "Mismatched number of dex files found in metadata"
        L_0x030c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x038b }
            r0.<init>(r1)     // Catch:{ all -> 0x038b }
            throw r0     // Catch:{ all -> 0x038b }
        L_0x0312:
            int r11 = r11 + 1
        L_0x0314:
            if (r11 >= r9) goto L_0x0382
            X.C013206e.A00(r10)     // Catch:{ all -> 0x038b }
            int r0 = X.C013206e.A00(r10)     // Catch:{ all -> 0x038b }
            byte[] r1 = X.C013206e.A03(r10, r0)     // Catch:{ all -> 0x038b }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x038b }
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x038b }
            r15.<init>(r1, r0)     // Catch:{ all -> 0x038b }
            long r0 = X.C013206e.A01(r10)     // Catch:{ all -> 0x038b }
            int r6 = X.C013206e.A00(r10)     // Catch:{ all -> 0x038b }
            if (r7 <= 0) goto L_0x037b
            r14 = r15
            java.lang.String r2 = "!"
            int r2 = r15.indexOf(r2)     // Catch:{ all -> 0x038b }
            if (r2 >= 0) goto L_0x0341
            java.lang.String r2 = ":"
            int r2 = r15.indexOf(r2)     // Catch:{ all -> 0x038b }
        L_0x0341:
            if (r2 <= 0) goto L_0x0349
            int r2 = r2 + 1
            java.lang.String r14 = r15.substring(r2)     // Catch:{ all -> 0x038b }
        L_0x0349:
            r13 = 0
        L_0x034a:
            r2 = r5[r13]     // Catch:{ all -> 0x038b }
            java.lang.String r12 = r2.A07     // Catch:{ all -> 0x038b }
            boolean r12 = r12.equals(r14)     // Catch:{ all -> 0x038b }
            if (r12 == 0) goto L_0x035b
            r2.A01 = r0     // Catch:{ all -> 0x038b }
            int[] r12 = new int[r6]     // Catch:{ all -> 0x038b }
            r13 = 0
            r1 = 0
            goto L_0x0360
        L_0x035b:
            int r13 = r13 + 1
            if (r13 >= r7) goto L_0x037b
            goto L_0x034a
        L_0x0360:
            if (r13 >= r6) goto L_0x036c
            int r0 = X.C013206e.A00(r10)     // Catch:{ all -> 0x038b }
            int r1 = r1 + r0
            r12[r13] = r1     // Catch:{ all -> 0x038b }
            int r13 = r13 + 1
            goto L_0x0360
        L_0x036c:
            byte[] r1 = X.C014806w.A02     // Catch:{ all -> 0x038b }
            r0 = r20
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ all -> 0x038b }
            if (r0 == 0) goto L_0x0312
            r2.A00 = r6     // Catch:{ all -> 0x038b }
            r2.A02 = r12     // Catch:{ all -> 0x038b }
            goto L_0x0312
        L_0x037b:
            java.lang.String r0 = "Missing profile key: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r15)     // Catch:{ all -> 0x038b }
            goto L_0x030c
        L_0x0382:
            r10.close()     // Catch:{ all -> 0x03b0 }
        L_0x0385:
            r8.A02 = r5     // Catch:{ all -> 0x03b0 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x03ca, IOException -> 0x03d0, IllegalStateException -> 0x03c2 }
            return r32
        L_0x038b:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x038f }
        L_0x038f:
            throw r0     // Catch:{ all -> 0x03b0 }
        L_0x0390:
            java.lang.String r1 = "Content found after the end of file"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x03b0 }
            goto L_0x03af
        L_0x0398:
            java.lang.String r1 = "Unsupported meta version"
        L_0x039a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x03b0 }
            goto L_0x03af
        L_0x03a0:
            java.lang.String r1 = "Invalid magic"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x03b0 }
            goto L_0x03af
        L_0x03a8:
            java.lang.String r1 = "Content found after the end of file"
        L_0x03aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x03b0 }
        L_0x03af:
            throw r0     // Catch:{ all -> 0x03b0 }
        L_0x03b0:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x03b4 }
        L_0x03b4:
            throw r0     // Catch:{ FileNotFoundException -> 0x03ca, IOException -> 0x03d0, IllegalStateException -> 0x03c2 }
        L_0x03b5:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ FileNotFoundException -> 0x03ca, IOException -> 0x03d0, IllegalStateException -> 0x03c2 }
            if (r1 == 0) goto L_0x03d7
            java.lang.String r0 = "compressed"
            r1.contains(r0)     // Catch:{ FileNotFoundException -> 0x03ca, IOException -> 0x03d0, IllegalStateException -> 0x03c2 }
            return r32
        L_0x03c2:
            r2 = move-exception
            r8.A02 = r3
            X.06i r1 = r8.A04
            r0 = 8
            goto L_0x03d4
        L_0x03ca:
            r2 = move-exception
            X.06i r1 = r8.A04
            r0 = 9
            goto L_0x03d4
        L_0x03d0:
            r2 = move-exception
            X.06i r1 = r8.A04
            r0 = 7
        L_0x03d4:
            r1.CHE(r0, r2)
        L_0x03d7:
            return r32
        L_0x03d8:
            java.lang.String r0 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013006c.A00():X.06c");
    }

    public final boolean A01() {
        int i;
        Integer num;
        if (this.A08 == null) {
            i = 3;
            num = Integer.valueOf(Build.VERSION.SDK_INT);
        } else if (!this.A05.canWrite()) {
            i = 4;
            num = null;
        } else {
            this.A00 = true;
            return true;
        }
        this.A07.execute(new C012906b(this, num, i));
        return false;
    }

    public C013006c(AssetManager assetManager, C013606i r5, File file, String str, Executor executor) {
        this.A03 = assetManager;
        this.A07 = executor;
        this.A04 = r5;
        this.A06 = str;
        this.A05 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 33) {
            switch (i) {
                case 28:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                case 30:
                    bArr = C014806w.A05;
                    break;
                default:
                    bArr = C014806w.A06;
                    break;
            }
        }
        this.A08 = bArr;
    }
}
