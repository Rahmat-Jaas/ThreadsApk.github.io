package X;

import com.facebook.forker.Process;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Nk  reason: invalid class name and case insensitive filesystem */
public final class C04390Nk implements C04050Mb {
    public byte A00;
    public byte A01;
    public byte A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public short A07;
    public boolean A08;
    public final int A09;
    public final List A0A = new ArrayList();
    public final Map A0B = new HashMap();
    public final File A0C;

    private short A02(C04130Mj r5) {
        int i = 0;
        short s = 0;
        int i2 = 8;
        do {
            s = (short) (s + ((A00(r5) & 255) << i2));
            i2 -= 8;
            i++;
        } while (i < 2);
        return s;
    }

    private byte A00(C04130Mj r4) {
        int i = r4.A00;
        if (i >= 4096) {
            i = A01();
            r4.A00 = i;
        }
        byte[] bArr = r4.A01;
        r4.A00 = i + 1;
        return bArr[i];
    }

    private int A01() {
        switch (this.A02) {
            case -7:
                return 19;
            case -6:
            case Process.SD_STDOUT /*-5*/:
            case Process.SD_PIPE /*-4*/:
            case Process.SD_BLACK_HOLE /*-3*/:
                return 18;
            case -2:
                return 15;
            case -1:
                return 11;
            default:
                return Integer.MAX_VALUE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:315:0x059e, code lost:
        if (r0 == null) goto L_0x05c7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00ac */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05d9  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x018a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0192  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x00a3=Splitter:B:39:0x00a3, B:44:0x00ac=Splitter:B:44:0x00ac} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWp(X.C04170Mn r33, X.AnonymousClass0ND r34) {
        /*
            r32 = this;
            r7 = r32
            java.io.File r5 = r7.A0C
            if (r5 == 0) goto L_0x00d8
            java.lang.String r0 = "hist.bin"
            java.io.File r2 = new java.io.File
            r2.<init>(r5, r0)
            boolean r0 = r2.exists()
            r6 = r33
            if (r0 == 0) goto L_0x00ad
            long r8 = r2.length()
            r3 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00ad
            java.lang.String r1 = "state.txt_entity"
            java.io.File r0 = new java.io.File
            r0.<init>(r5, r1)
            java.util.Properties r8 = new java.util.Properties
            r8.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003c }
            r1.<init>(r0)     // Catch:{ IOException -> 0x003c }
            r8.load(r1)     // Catch:{ all -> 0x0037 }
            r1.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003f
        L_0x0037:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            X.C04790Pd.A00()
        L_0x003f:
            java.util.Set r0 = r8.stringPropertyNames()
            java.util.Iterator r5 = r0.iterator()
        L_0x0047:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r4 = r5.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = r8.getProperty(r4)
            if (r3 == 0) goto L_0x0047
            java.util.Map r1 = r7.A0B
            r0 = 0
            char r0 = r3.charAt(r0)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r1.put(r0, r4)
            goto L_0x0047
        L_0x0068:
            java.util.Map r5 = r7.A0B
            r31 = 32
            java.lang.Character r1 = java.lang.Character.valueOf(r31)
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "None"
            r5.put(r1, r0)
        L_0x007b:
            r30 = 4096(0x1000, float:5.74E-42)
            r0 = r30
            byte[] r0 = new byte[r0]
            X.0Mj r4 = new X.0Mj
            r4.<init>(r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x05a1 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x05a1 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x05a1 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x05a1 }
            r2 = 0
        L_0x0091:
            byte[] r1 = r4.A01     // Catch:{ all -> 0x00a8 }
            int r0 = 4096 - r2
            int r1 = r3.read(r1, r2, r0)     // Catch:{ all -> 0x00a8 }
            r0 = -1
            if (r1 == r0) goto L_0x00a3
            int r2 = r2 + r1
            if (r1 == r0) goto L_0x00a3
            r0 = r30
            if (r2 != r0) goto L_0x0091
        L_0x00a3:
            r3.close()     // Catch:{ IOException -> 0x05a1 }
            goto L_0x05aa
        L_0x00a8:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            throw r0     // Catch:{ IOException -> 0x05a1 }
        L_0x00ad:
            X.0OO r1 = X.AnonymousClass0MU.A1s
            r0 = 1
            goto L_0x00d5
        L_0x00b1:
            r28 = 0
            r0 = r28
            r4.A00 = r0
            byte r8 = r7.A00(r4)
            r7.A02 = r8
            r1 = -6
            r10 = -7
            r0 = -1
            if (r8 == r0) goto L_0x0123
            r0 = -2
            if (r8 == r0) goto L_0x0123
            r0 = -3
            if (r8 == r0) goto L_0x0123
            r0 = -4
            if (r8 == r0) goto L_0x0123
            r0 = -5
            if (r8 == r0) goto L_0x0123
            if (r8 == r1) goto L_0x00d9
            if (r8 == r10) goto L_0x00d9
        L_0x00d2:
            X.0OO r1 = X.AnonymousClass0MU.A1s
            r0 = 3
        L_0x00d5:
            r6.A01(r1, r0)
        L_0x00d8:
            return
        L_0x00d9:
            byte r0 = r7.A00(r4)
            r7.A00 = r0
            short r9 = r7.A02(r4)
            r7.A04 = r9
            r2 = 0
            r12 = 56
            r11 = 0
        L_0x00ea:
            byte r0 = r7.A00(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r0 = r0 << r12
            long r2 = r2 + r0
            int r12 = r12 + -8
            int r11 = r11 + 1
            r0 = 8
            if (r11 < r0) goto L_0x00ea
            r7.A06 = r2
            r12 = 0
            r11 = 0
            r1 = 24
        L_0x0101:
            byte r0 = r7.A00(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r1
            int r11 = r11 + r0
            int r1 = r1 + -8
            int r12 = r12 + 1
            r0 = 4
            if (r12 < r0) goto L_0x0101
            long r0 = (long) r11
            long r2 = r2 + r0
            r7.A05 = r2
            short r0 = r7.A02(r4)
            r7.A07 = r0
            if (r8 != r10) goto L_0x015c
            byte r0 = r7.A00(r4)
            r7.A01 = r0
            goto L_0x015c
        L_0x0123:
            r2 = 0
            r10 = 56
            r9 = 0
        L_0x0128:
            byte r0 = r7.A00(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r0 = r0 << r10
            long r2 = r2 + r0
            int r10 = r10 + -8
            int r9 = r9 + 1
            r0 = 8
            if (r9 < r0) goto L_0x0128
            r7.A06 = r2
            short r9 = r7.A02(r4)
            r7.A04 = r9
            r12 = -5
            r11 = -4
            r10 = -3
            r0 = -2
            if (r8 == r0) goto L_0x0583
            if (r8 == r10) goto L_0x0583
            if (r8 == r11) goto L_0x0583
            if (r8 == r12) goto L_0x0583
            r2 = 0
        L_0x014f:
            r7.A05 = r2
            if (r8 == r10) goto L_0x0575
            if (r8 == r11) goto L_0x0575
            if (r8 == r12) goto L_0x0575
            r0 = -1
            r7.A00 = r0
            r7.A07 = r0
        L_0x015c:
            int r0 = r7.A01()
            if (r9 < r0) goto L_0x00d2
            r0 = r30
            if (r9 >= r0) goto L_0x00d2
            r0 = r28
            r7.A08 = r0
            r4.A00 = r9
            r18 = 0
            r9 = 1
            r16 = 0
            r10 = 0
            r27 = 1
        L_0x0174:
            byte r13 = r7.A00(r4)
            r0 = r28
            if (r13 == r0) goto L_0x018a
            byte r0 = r7.A01
            r0 = r0 & 1
            if (r0 != r9) goto L_0x0201
            r0 = -6
            if (r13 == r0) goto L_0x01fb
            r7.A08 = r9
            r0 = 4
        L_0x0188:
            r7.A03 = r0
        L_0x018a:
            java.util.List r4 = r7.A0A
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x05c7
            long r0 = r7.A05
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b0
            boolean r2 = r7.A08
            if (r2 != 0) goto L_0x01b0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ",last"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.add(r0)
        L_0x01b0:
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x01bb
            X.0OO r1 = X.AnonymousClass0MU.A1s
            int r0 = r7.A03
            r6.A01(r1, r0)
        L_0x01bb:
            int r0 = r7.A09
            if (r0 < 0) goto L_0x01c6
            int r3 = r4.size()
            int r3 = r3 - r0
            if (r3 >= 0) goto L_0x01c7
        L_0x01c6:
            r3 = 0
        L_0x01c7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01f9
            if (r3 <= 0) goto L_0x01f9
            r0 = r28
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
        L_0x01df:
            r1 = 0
        L_0x01e0:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x059a
            if (r1 != 0) goto L_0x01ed
            r0 = 124(0x7c, float:1.74E-43)
            r2.append(r0)
        L_0x01ed:
            java.lang.Object r0 = r4.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            int r3 = r3 + 1
            goto L_0x01df
        L_0x01f9:
            r1 = 1
            goto L_0x01e0
        L_0x01fb:
            byte r13 = r7.A00(r4)
            int r10 = r10 + 1
        L_0x0201:
            int r10 = r10 + 1
            int r11 = r4.A00
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            long r2 = r7.A06
            r1 = 0
            r0 = 0
            r15 = 24
        L_0x0210:
            byte r12 = r7.A00(r4)
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << r15
            int r0 = r0 + r12
            int r15 = r15 + -8
            int r1 = r1 + 1
            r14 = 4
            if (r1 < r14) goto L_0x0210
            long r0 = (long) r0
            long r2 = r2 + r0
            java.lang.String r12 = "Other"
            r1 = 44
            if (r13 != r9) goto L_0x02f0
            byte r0 = r7.A00(r4)
            char r13 = (char) r0
            byte r0 = r7.A00(r4)
            char r0 = (char) r0
            r22 = r0
            java.lang.Character r0 = java.lang.Character.valueOf(r13)
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0240
            r12 = r0
        L_0x0240:
            r0 = 12
            java.lang.Integer[] r13 = X.AnonymousClass006.A00(r0)
            int r0 = r13.length
            r21 = r0
            r14 = 0
        L_0x024a:
            r0 = r21
            if (r14 >= r0) goto L_0x0272
            r20 = r13[r14]
            char r15 = X.C019909g.A00(r20)
            r0 = r22
            if (r15 != r0) goto L_0x02ec
            if (r20 == 0) goto L_0x0272
            r8.append(r2)
            r8.append(r1)
            r8.append(r12)
            r8.append(r1)
            int r0 = r20.intValue()
            switch(r0) {
                case 1: goto L_0x02cb;
                case 2: goto L_0x02ce;
                case 3: goto L_0x02d1;
                case 4: goto L_0x02d4;
                case 5: goto L_0x02d7;
                case 6: goto L_0x02da;
                case 7: goto L_0x02dd;
                case 8: goto L_0x02e0;
                case 9: goto L_0x02e3;
                case 10: goto L_0x02e6;
                case 11: goto L_0x02e9;
                default: goto L_0x026d;
            }
        L_0x026d:
            java.lang.String r0 = "ActivityResumed"
        L_0x026f:
            r8.append(r0)
        L_0x0272:
            byte r0 = r7.A01
            r0 = r0 & 1
            if (r0 != r9) goto L_0x0285
            byte r1 = r7.A00(r4)
            r0 = -50
            if (r1 == r0) goto L_0x0285
            r0 = 5
        L_0x0281:
            r7.A03 = r0
            r2 = -1
        L_0x0285:
            int r1 = r4.A00
            if (r1 > r11) goto L_0x0290
            int r0 = 4096 - r11
            int r10 = r10 + r0
            int r11 = r7.A01()
        L_0x0290:
            int r1 = r1 - r11
            int r10 = r10 + r1
            java.lang.String r11 = ",start"
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x02a0
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0536
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0536
        L_0x02a0:
            if (r27 == 0) goto L_0x02b8
            java.util.List r5 = r7.A0A
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r0 = r7.A06
            r4.append(r0)
            r4.append(r11)
            java.lang.String r0 = r4.toString()
            r5.add(r0)
        L_0x02b8:
            java.util.List r1 = r7.A0A
            java.lang.String r0 = r8.toString()
            r1.add(r0)
            r7.A08 = r9
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x018a
            r0 = 8
            goto L_0x0188
        L_0x02cb:
            java.lang.String r0 = "InForeground"
            goto L_0x026f
        L_0x02ce:
            java.lang.String r0 = "ActivityStarted"
            goto L_0x026f
        L_0x02d1:
            java.lang.String r0 = "ActivityCreated"
            goto L_0x026f
        L_0x02d4:
            java.lang.String r0 = "ActivityPaused"
            goto L_0x026f
        L_0x02d7:
            java.lang.String r0 = "ActivityStopped"
            goto L_0x026f
        L_0x02da:
            java.lang.String r0 = "ActivityDestroyed"
            goto L_0x026f
        L_0x02dd:
            java.lang.String r0 = "InBackground"
            goto L_0x026f
        L_0x02e0:
            java.lang.String r0 = "InBackgroundLowImportance"
            goto L_0x026f
        L_0x02e3:
            java.lang.String r0 = "InitialState"
            goto L_0x026f
        L_0x02e6:
            java.lang.String r0 = "ByteNotPresent"
            goto L_0x026f
        L_0x02e9:
            java.lang.String r0 = "ByteNotUsed"
            goto L_0x026f
        L_0x02ec:
            int r14 = r14 + 1
            goto L_0x024a
        L_0x02f0:
            r0 = r29
            if (r13 != r0) goto L_0x02fe
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "home/task switch"
            goto L_0x026f
        L_0x02fe:
            r15 = 3
            if (r13 != r15) goto L_0x034a
            byte r0 = r7.A00(r4)
            char r0 = (char) r0
            byte r14 = r7.A00(r4)
            byte r13 = r7.A00(r4)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x031b
            r12 = r0
        L_0x031b:
            if (r14 == 0) goto L_0x0347
            if (r14 == r9) goto L_0x0344
            r0 = r29
            if (r14 == r0) goto L_0x0341
            if (r14 == r15) goto L_0x033e
            java.lang.String r0 = "Unknown"
        L_0x0327:
            r8.append(r2)
            r8.append(r1)
            r8.append(r12)
            r8.append(r1)
        L_0x0333:
            r8.append(r0)
            r8.append(r1)
        L_0x0339:
            r8.append(r13)
            goto L_0x0272
        L_0x033e:
            java.lang.String r0 = "ON_BACK_PRESSED_AND_FINISH_CALLED"
            goto L_0x0327
        L_0x0341:
            java.lang.String r0 = "ON_BACK_PRESSED_CALLED"
            goto L_0x0327
        L_0x0344:
            java.lang.String r0 = "FINISH_CALLED"
            goto L_0x0327
        L_0x0347:
            java.lang.String r0 = "NEITHER_ON_BACK_PRESSED_NOR_FINISH_CALLED"
            goto L_0x0327
        L_0x034a:
            if (r13 != r14) goto L_0x0356
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "screen on"
            goto L_0x026f
        L_0x0356:
            r0 = 5
            if (r13 != r0) goto L_0x0363
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "screen off"
            goto L_0x026f
        L_0x0363:
            r0 = 6
            java.lang.String r26 = "lacrima"
            java.lang.String r14 = "importance "
            r15 = -1
            if (r13 != r0) goto L_0x03b1
            byte r12 = r7.A00(r4)
            switch(r12) {
                case 0: goto L_0x03ae;
                case 1: goto L_0x03ab;
                case 2: goto L_0x03a8;
                case 3: goto L_0x03a5;
                case 4: goto L_0x03a2;
                case 5: goto L_0x039f;
                case 6: goto L_0x039c;
                case 7: goto L_0x0399;
                case 8: goto L_0x0396;
                case 9: goto L_0x0393;
                case 10: goto L_0x0390;
                case 11: goto L_0x038d;
                default: goto L_0x0372;
            }
        L_0x0372:
            r0 = -1
        L_0x0373:
            r8.append(r2)
            if (r0 != r15) goto L_0x0513
            r8.append(r1)
            java.lang.String r0 = "unknown importance,"
            r8.append(r0)
            r8.append(r12)
            java.lang.String r1 = "Unknown importance value"
            r0 = r26
            X.AnonymousClass0LU.A0C(r0, r1)
            r0 = 6
            goto L_0x0281
        L_0x038d:
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0373
        L_0x0390:
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x0373
        L_0x0393:
            r0 = 400(0x190, float:5.6E-43)
            goto L_0x0373
        L_0x0396:
            r0 = 350(0x15e, float:4.9E-43)
            goto L_0x0373
        L_0x0399:
            r0 = 325(0x145, float:4.55E-43)
            goto L_0x0373
        L_0x039c:
            r0 = 300(0x12c, float:4.2E-43)
            goto L_0x0373
        L_0x039f:
            r0 = 230(0xe6, float:3.22E-43)
            goto L_0x0373
        L_0x03a2:
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x0373
        L_0x03a5:
            r0 = 150(0x96, float:2.1E-43)
            goto L_0x0373
        L_0x03a8:
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x0373
        L_0x03ab:
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x0373
        L_0x03ae:
            r0 = 100
            goto L_0x0373
        L_0x03b1:
            r0 = 7
            if (r13 != r0) goto L_0x03c3
            short r13 = r7.A02(r4)
            r8.append(r2)
            r8.append(r1)
            r8.append(r14)
            goto L_0x0339
        L_0x03c3:
            r0 = 8
            if (r13 != r0) goto L_0x03f6
            byte r14 = r7.A00(r4)
            short r13 = r7.A02(r4)
            short r12 = r7.A02(r4)
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "oom score ("
            r8.append(r0)
            r8.append(r14)
            r0 = r31
            r8.append(r0)
            r8.append(r13)
            r8.append(r0)
            r8.append(r12)
            r0 = 41
            r8.append(r0)
            goto L_0x0272
        L_0x03f6:
            r0 = 9
            if (r13 != r0) goto L_0x0404
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "fg"
            goto L_0x026f
        L_0x0404:
            r0 = 10
            if (r13 != r0) goto L_0x0412
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "bg"
            goto L_0x026f
        L_0x0412:
            r0 = 11
            java.lang.String r25 = ",true,"
            java.lang.String r15 = ",early onPause received,"
            r24 = -7
            r23 = -6
            r22 = -5
            java.lang.String r21 = "None"
            r14 = -4
            if (r13 == r0) goto L_0x049b
            r0 = 12
            java.lang.String r20 = ",false,"
            if (r13 == r0) goto L_0x04d5
            r0 = 13
            java.lang.String r15 = ",early onPause execution,"
            if (r13 == r0) goto L_0x049b
            r0 = 14
            if (r13 == r0) goto L_0x04d5
            r0 = 15
            if (r13 != r0) goto L_0x0441
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "SIGQUIT"
            goto L_0x026f
        L_0x0441:
            r0 = 16
            if (r13 != r0) goto L_0x044f
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "SIGQUIT traces"
            goto L_0x026f
        L_0x044f:
            r0 = 17
            if (r13 != r0) goto L_0x045d
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "ANR process error"
            goto L_0x026f
        L_0x045d:
            r0 = 18
            if (r13 != r0) goto L_0x046b
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "ANR process error cleared"
            goto L_0x026f
        L_0x046b:
            r0 = 19
            if (r13 != r0) goto L_0x0489
            byte r13 = r7.A00(r4)
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "Process state update"
            r8.append(r0)
            r8.append(r1)
            r0 = 127(0x7f, float:1.78E-43)
            if (r13 < r0) goto L_0x0339
            java.lang.String r14 = ">="
            goto L_0x0516
        L_0x0489:
            r0 = 20
            if (r13 != r0) goto L_0x051e
            byte r13 = r7.A00(r4)
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "Bg Startup Detector"
            goto L_0x0333
        L_0x049b:
            byte r1 = r7.A02
            if (r1 == r14) goto L_0x04ba
            r0 = r22
            if (r1 == r0) goto L_0x04ba
            r0 = r23
            if (r1 == r0) goto L_0x04ba
            r0 = r24
            if (r1 == r0) goto L_0x04ba
            r12 = r21
        L_0x04ad:
            r13 = -1
        L_0x04ae:
            r8.append(r2)
            r8.append(r15)
            r8.append(r12)
            r0 = r25
            goto L_0x04f3
        L_0x04ba:
            byte r0 = r7.A00(r4)
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x04cc
            r12 = r0
        L_0x04cc:
            byte r0 = r7.A02
            if (r0 == r14) goto L_0x04ad
            byte r13 = r7.A00(r4)
            goto L_0x04ae
        L_0x04d5:
            byte r1 = r7.A02
            if (r1 == r14) goto L_0x04f8
            r0 = r22
            if (r1 == r0) goto L_0x04f8
            r0 = r23
            if (r1 == r0) goto L_0x04f8
            r0 = r24
            if (r1 == r0) goto L_0x04f8
            r12 = r21
        L_0x04e7:
            r13 = -1
        L_0x04e8:
            r8.append(r2)
            r8.append(r15)
            r8.append(r12)
            r0 = r20
        L_0x04f3:
            r8.append(r0)
            goto L_0x0339
        L_0x04f8:
            byte r0 = r7.A00(r4)
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x050a
            r12 = r0
        L_0x050a:
            byte r0 = r7.A02
            if (r0 == r14) goto L_0x04e7
            byte r13 = r7.A00(r4)
            goto L_0x04e8
        L_0x0513:
            r8.append(r1)
        L_0x0516:
            r8.append(r14)
            r8.append(r0)
            goto L_0x0272
        L_0x051e:
            java.lang.String r12 = "Unknown event type"
            r0 = r26
            X.AnonymousClass0LU.A0C(r0, r12)
            r8.append(r2)
            r8.append(r1)
            java.lang.String r0 = "unknown event,"
            r8.append(r0)
            r8.append(r13)
            r0 = 7
            goto L_0x0281
        L_0x0536:
            if (r27 == 0) goto L_0x0550
            java.util.List r12 = r7.A0A
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            long r0 = r7.A06
            r13.append(r0)
            r13.append(r11)
            java.lang.String r0 = r13.toString()
            r12.add(r0)
            r27 = 0
        L_0x0550:
            java.util.List r1 = r7.A0A
            java.lang.String r0 = r8.toString()
            r1.add(r0)
            int r1 = r4.A00
            r0 = r30
            if (r1 < r0) goto L_0x0565
            int r1 = r7.A01()
            r4.A00 = r1
        L_0x0565:
            int r0 = r7.A04
            if (r1 == r0) goto L_0x0571
            r0 = r30
            if (r10 > r0) goto L_0x0571
            r16 = r2
            goto L_0x0174
        L_0x0571:
            r16 = r2
            goto L_0x018a
        L_0x0575:
            short r0 = r7.A02(r4)
            r7.A07 = r0
            byte r0 = r7.A00(r4)
            r7.A00 = r0
            goto L_0x015c
        L_0x0583:
            r13 = 0
            r1 = 0
            r14 = 24
        L_0x0587:
            byte r0 = r7.A00(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r14
            int r1 = r1 + r0
            int r14 = r14 + -8
            int r13 = r13 + 1
            r0 = 4
            if (r13 < r0) goto L_0x0587
            long r0 = (long) r1
            long r2 = r2 + r0
            goto L_0x014f
        L_0x059a:
            java.lang.String r0 = r2.toString()
            if (r0 == 0) goto L_0x05c7
            goto L_0x05b7
        L_0x05a1:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Error reading lifecycle history"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            r4 = 0
        L_0x05aa:
            r29 = 2
            if (r4 != 0) goto L_0x00b1
            X.0OO r1 = X.AnonymousClass0MU.A1s
            r0 = r29
            r6.A01(r1, r0)
            java.lang.String r0 = "0,IO error"
        L_0x05b7:
            X.0ON r1 = X.AnonymousClass0MU.A64
            r6.A03(r1, r0)
            X.0OO r1 = X.AnonymousClass0MU.A1v
            java.util.List r0 = r7.A0A
            int r0 = r0.size()
            r6.A01(r1, r0)
        L_0x05c7:
            short r0 = r7.A07
            r2 = -1
            if (r0 == r2) goto L_0x05d5
            X.0ON r1 = X.AnonymousClass0MU.A66
            java.lang.String r0 = java.lang.Short.toString(r0)
            r6.A03(r1, r0)
        L_0x05d5:
            byte r0 = r7.A00
            if (r0 == r2) goto L_0x00d8
            X.0ON r1 = X.AnonymousClass0MU.A63
            java.lang.String r0 = java.lang.Byte.toString(r0)
            r6.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04390Nk.CWp(X.0Mn, X.0ND):void");
    }

    public C04390Nk(File file, int i) {
        this.A0C = file;
        this.A09 = i;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0w;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
