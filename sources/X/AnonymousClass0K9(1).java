package X;

import android.util.Log;
import java.io.PrintStream;

/* renamed from: X.0K9  reason: invalid class name */
public final class AnonymousClass0K9 {
    public static boolean A02;
    public C03600Jw A00;
    public final String A01;

    public static void A01(int i, String str, String str2, Throwable th, int i2) {
        String str3;
        String message;
        if (th != null && (i2 & 2) == 2) {
            String A0d = AnonymousClass00U.A0d("Err ", th.getClass().getName(), ": ", th.getMessage());
            th = null;
            if (A0d != null) {
                str2 = AnonymousClass00U.A0L(str2, A0d);
            }
        }
        if (!A02) {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    if (th != null) {
                        try {
                            Log.e(str, str2, th);
                            return;
                        } catch (RuntimeException e) {
                            if (!RuntimeException.class.equals(e.getClass()) || (message = e.getMessage()) == null || !message.equals("Stub!")) {
                                throw e;
                            }
                            if (!A02) {
                                try {
                                    Class.forName("org.junit.Test");
                                    A02 = true;
                                } catch (ClassNotFoundException e2) {
                                    throw new RuntimeException("We ain't running in no unit test bailing for safety", e2);
                                }
                            }
                            PrintStream printStream = System.err;
                            printStream.println(AnonymousClass00U.A0h("Warn", ": ", "MinLog-UT", ": ", "Detected we are running in a unit test"));
                            e.printStackTrace(printStream);
                        }
                    } else {
                        Log.e(str, str2);
                        return;
                    }
                } else if (th != null) {
                    Log.w(str, str2, th);
                    return;
                } else {
                    Log.w(str, str2);
                    return;
                }
            } else {
                return;
            }
        }
        PrintStream printStream2 = System.err;
        if (i == 3) {
            str3 = "Debug";
        } else if (i == 4) {
            str3 = "Info";
        } else if (i != 5) {
            str3 = "Error";
        } else {
            str3 = "Warn";
        }
        printStream2.println(AnonymousClass00U.A0h(str3, ": ", str, ": ", str2));
        if (th != null) {
            th.printStackTrace(printStream2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        if (r16 == false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0104 A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117 A[LOOP:3: B:85:0x0117->B:86:0x011e, LOOP_START, PHI: r1 
      PHI: (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:84:0x0115, B:86:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.lang.String r13, java.lang.String r14, java.lang.Throwable r15, java.lang.Object[] r16, int r17, int r18) {
        /*
            r11 = r15
            r5 = r16
            int r4 = r5.length
            r10 = r17
            r9 = r18
            r18 = r13
            if (r4 != 0) goto L_0x0010
            A01(r10, r13, r14, r15, r9)
        L_0x000f:
            return
        L_0x0010:
            X.0KC r3 = X.C04650On.A04
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            X.0KB r0 = r3.A03
            if (r0 == 0) goto L_0x002d
            r1 = 0
            r0 = 0
            X.0K4 r7 = X.AnonymousClass0KC.A01(r3, r2, r1, r0, r0)
        L_0x001e:
            X.0On r7 = (X.C04650On) r7
            int r13 = r4 + -1
            r17 = 0
            r6 = 0
            r2 = r17
            r12 = 0
            r3 = 0
            r15 = 0
            r16 = 0
            goto L_0x0036
        L_0x002d:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            X.0K4 r7 = X.AnonymousClass0KC.A02(r3, r0)
            goto L_0x001e
        L_0x0036:
            r0 = r5[r12]     // Catch:{ all -> 0x0121 }
            r8 = 0
            if (r13 != r12) goto L_0x003d
            r8 = 1
            r2 = r0
        L_0x003d:
            if (r0 == 0) goto L_0x006a
            if (r3 != 0) goto L_0x0046
            boolean r1 = r0 instanceof X.AnonymousClass0K4     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x0046
            r3 = 1
        L_0x0046:
            boolean r1 = r0 instanceof X.AnonymousClass0E2     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x006a
            X.0E2 r0 = (X.AnonymousClass0E2) r0     // Catch:{ all -> 0x0121 }
            int r1 = r0.A00     // Catch:{ all -> 0x0121 }
            int r15 = r15 + r1
            if (r8 == 0) goto L_0x006f
            if (r1 <= 0) goto L_0x006d
            int r2 = r1 + -1
            r8 = 1
            r1 = 0
            if (r2 < 0) goto L_0x005a
            r1 = 1
        L_0x005a:
            X.AnonymousClass0KW.A03(r1)     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r1 = r0.A01     // Catch:{ all -> 0x0121 }
            int r0 = r0.A00     // Catch:{ all -> 0x0121 }
            if (r2 < r0) goto L_0x0064
            r8 = 0
        L_0x0064:
            X.AnonymousClass0KW.A03(r8)     // Catch:{ all -> 0x0121 }
            r2 = r1[r2]     // Catch:{ all -> 0x0121 }
            goto L_0x006f
        L_0x006a:
            int r15 = r15 + 1
            goto L_0x0071
        L_0x006d:
            r2 = r17
        L_0x006f:
            r16 = 1
        L_0x0071:
            int r12 = r12 + 1
            r8 = 1
            if (r12 < r4) goto L_0x0036
            r7.A02 = r3     // Catch:{ all -> 0x0121 }
            r7.A03 = r8     // Catch:{ all -> 0x0121 }
            if (r11 != 0) goto L_0x00c9
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r2 instanceof java.lang.Throwable     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x008e
            int r15 = r15 + -1
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0121 }
            r0.getClass()     // Catch:{ all -> 0x0121 }
            r7.A01 = r0     // Catch:{ all -> 0x0121 }
            r16 = 1
        L_0x008e:
            boolean r0 = A02     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x0095
            r0 = 5
            if (r10 < r0) goto L_0x00c9
        L_0x0095:
            boolean r0 = r2 instanceof X.AnonymousClass0PV     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00c9
            X.0PV r2 = (X.AnonymousClass0PV) r2     // Catch:{ all -> 0x0121 }
            r0 = 6
            if (r10 < r0) goto L_0x00c0
            X.0Jx r1 = X.C03610Jx.HIGH     // Catch:{ all -> 0x0121 }
        L_0x00a0:
            X.0Jx r3 = r2.A00     // Catch:{ all -> 0x0121 }
            boolean r0 = r3.A01     // Catch:{ all -> 0x0121 }
            X.AnonymousClass0KW.A04(r0)     // Catch:{ all -> 0x0121 }
            boolean r0 = r1.A01     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00c9
            int r1 = r1.A00     // Catch:{ all -> 0x0121 }
            int r0 = r3.A00     // Catch:{ all -> 0x0121 }
            if (r1 < r0) goto L_0x00c9
            int r15 = r15 + -1
            java.lang.Throwable r1 = r2.A01     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "This class has been cleaned or is not inited"
            X.AnonymousClass0KW.A00(r1, r0)     // Catch:{ all -> 0x0121 }
            r1.getClass()     // Catch:{ all -> 0x0121 }
            r7.A01 = r1     // Catch:{ all -> 0x0121 }
            goto L_0x00cd
        L_0x00c0:
            r0 = 5
            if (r10 < r0) goto L_0x00c6
            X.0Jx r1 = X.C03610Jx.MEDIUM     // Catch:{ all -> 0x0121 }
            goto L_0x00a0
        L_0x00c6:
            X.0Jx r1 = X.C03610Jx.LOW     // Catch:{ all -> 0x0121 }
            goto L_0x00a0
        L_0x00c9:
            if (r16 != 0) goto L_0x00cd
        L_0x00cb:
            r13 = r5
            goto L_0x00fc
        L_0x00cd:
            if (r15 < 0) goto L_0x00cb
            java.lang.Object[] r13 = new java.lang.Object[r15]     // Catch:{ all -> 0x0121 }
            r12 = 0
            r17 = 0
        L_0x00d4:
            if (r12 >= r15) goto L_0x00fc
            r3 = r5[r12]     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x00f2
            boolean r0 = r3 instanceof X.AnonymousClass0E2     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00f2
            X.0E2 r3 = (X.AnonymousClass0E2) r3     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r2 = r3.A01     // Catch:{ all -> 0x0121 }
            r1 = 0
        L_0x00e3:
            int r0 = r3.A00     // Catch:{ all -> 0x0121 }
            if (r1 >= r0) goto L_0x00f7
            int r0 = r17 + r1
            if (r15 <= r0) goto L_0x00f7
            r16 = r2[r1]     // Catch:{ all -> 0x0121 }
            r13[r0] = r16     // Catch:{ all -> 0x0121 }
            int r1 = r1 + 1
            goto L_0x00e3
        L_0x00f2:
            r13[r17] = r3     // Catch:{ all -> 0x0121 }
            int r17 = r17 + 1
            goto L_0x00f9
        L_0x00f7:
            int r17 = r17 + r1
        L_0x00f9:
            int r12 = r12 + 1
            goto L_0x00d4
        L_0x00fc:
            java.lang.String r1 = java.lang.String.format(r14, r13)     // Catch:{ all -> 0x0121 }
            java.lang.Throwable r0 = r7.A01     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0105
            r11 = r0
        L_0x0105:
            r0 = r18
            A01(r10, r0, r1, r11, r9)     // Catch:{ all -> 0x0121 }
            r2 = 0
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0111
            boolean r2 = r7.A02
        L_0x0111:
            r1 = 0
            X.AnonymousClass0KC.A03(r7, r6)
            if (r2 == 0) goto L_0x000f
        L_0x0117:
            r0 = r5[r1]
            X.AnonymousClass0KC.A03(r0, r8)
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x000f
            goto L_0x0117
        L_0x0121:
            r3 = move-exception
            r1 = 0
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0129
            boolean r1 = r7.A02
        L_0x0129:
            r2 = 0
            X.AnonymousClass0KC.A03(r7, r6)
            if (r1 == 0) goto L_0x013a
            r1 = 1
        L_0x0130:
            r0 = r5[r2]
            X.AnonymousClass0KC.A03(r0, r1)
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x013a
            goto L_0x0130
        L_0x013a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0K9.A02(java.lang.String, java.lang.String, java.lang.Throwable, java.lang.Object[], int, int):void");
    }

    public final void A03(String str, Throwable th) {
        A09(th, str, new Object[0]);
    }

    public final void A04(String str, Throwable th) {
        A0B(th, str, new Object[0]);
    }

    public final void A06(String str, Object... objArr) {
        A05(str, (Throwable) null, objArr, 6, 0);
    }

    public final void A07(String str, Object... objArr) {
        A0B((Throwable) null, str, objArr);
    }

    public final void A08(String str, Object[] objArr, int i) {
        A05(str, (Throwable) null, objArr, i, 0);
    }

    public final void A09(Throwable th, String str, Object... objArr) {
        A05(str, th, objArr, 3, 2);
    }

    public final void A0A(Throwable th, String str, Object... objArr) {
        String str2 = this.A01;
        A02(str2, str, (Throwable) null, objArr, 5, 0);
        int i = 1;
        String str3 = "Error: ";
        while (true) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            do {
                sb.append(9);
                i2++;
            } while (i2 < i);
            String obj = sb.toString();
            String message = th.getMessage();
            String simpleName = th.getClass().getSimpleName();
            if (message == null || message.length() == 0) {
                message = "None Found";
            }
            A02(str2, "%s%s %s=%s", (Throwable) null, new Object[]{obj, str3, simpleName, message}, 5, 0);
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement obj2 : stackTrace) {
                A02(str2, "%s\t at %s", (Throwable) null, new Object[]{obj, obj2.toString()}, 5, 0);
            }
            th = th.getCause();
            if (th != null) {
                i = 2;
                str3 = "Cause: ";
            } else {
                return;
            }
        }
    }

    public final void A0B(Throwable th, String str, Object... objArr) {
        A05(str, th, objArr, 5, 0);
    }

    public final void A0C(Throwable th, String str, Object... objArr) {
        A05(str, th, objArr, 5, 2);
    }

    public static AnonymousClass0K9 A00(String str) {
        return new AnonymousClass0K9(str);
    }

    public final void A05(String str, Throwable th, Object[] objArr, int i, int i2) {
        A02(this.A01, str, th, objArr, i, i2);
    }

    public AnonymousClass0K9(String str) {
        this.A00 = null;
        this.A01 = str == null ? "FBMinLog" : str;
    }

    public AnonymousClass0K9() {
        this((String) null);
    }
}
