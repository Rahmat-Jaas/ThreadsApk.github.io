package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vB  reason: invalid class name and case insensitive filesystem */
public final class C17580vB {
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass0PW A0A;
    public final AnonymousClass0NR A0B;
    public final C12350lk A0C;
    public final C13030mt A0D;
    public final C17910vk A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final Map A0I;
    public final Map A0J;
    public final AtomicInteger A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b1, code lost:
        throw new X.C17600vD();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        throw new X.C17600vD();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17580vB(X.AnonymousClass0PW r10, X.AnonymousClass0NR r11, X.C12350lk r12, X.C17910vk r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List r19, java.util.Map r20, java.util.Map r21, java.util.concurrent.atomic.AtomicInteger r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, boolean r31, boolean r32, boolean r33) {
        /*
            r9 = this;
            java.lang.String r4 = " "
            r9.<init>()
            r9.A00 = r14
            r9.A01 = r15
            r0 = r23
            r9.A06 = r0
            r0 = r24
            r9.A02 = r0
            r0 = r31
            r9.A0N = r0
            r9.A0C = r12
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.0mt r2 = new X.0mt
            r3 = r17
            r7 = r16
            r2.<init>(r7, r3, r0)
            r9.A0D = r2
            r0 = r18
            r9.A0F = r0
            r9.A0B = r11
            r0 = r22
            r9.A0K = r0
            r0 = r25
            r9.A03 = r0
            r0 = r26
            r9.A08 = r0
            r0 = r27
            r9.A04 = r0
            r0 = r28
            r9.A07 = r0
            r0 = r29
            r9.A05 = r0
            r0 = r30
            r9.A09 = r0
            r9.A0A = r10
            r0 = r19
            r9.A0H = r0
            r0 = r32
            r9.A0M = r0
            r0 = r33
            r9.A0L = r0
            r0 = r21
            r9.A0J = r0
            java.lang.String r3 = r11.A01()     // Catch:{ 0vD -> 0x00b8 }
            java.lang.Object r5 = r12.second     // Catch:{ 0vD -> 0x00b8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ 0vD -> 0x00b8 }
            r6 = r4
            r8 = r4
            java.lang.String r1 = X.AnonymousClass00U.A0i(r3, r4, r5, r6, r7, r8)     // Catch:{ 0vD -> 0x00b8 }
            java.lang.String r0 = "utf-8"
            byte[] r3 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            r1 = 0
            int r0 = r3.length     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            r2.update(r3, r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            byte[] r8 = r2.digest()     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            if (r8 == 0) goto L_0x00a9
            int r7 = r8.length     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            if (r7 == 0) goto L_0x00a9
            int r0 = r7 << 1
            char[] r6 = new char[r0]     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            r5 = 0
            r4 = 0
        L_0x0089:
            byte r3 = r8[r5]     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            int r2 = r4 + 1
            char[] r1 = X.C12700mL.A00     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            r0 = r3 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >>> 4
            char r0 = r1[r0]     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            r6[r4] = r0     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            int r4 = r2 + 1
            r0 = r3 & 15
            char r0 = r1[r0]     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            r6[r2] = r0     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x0089
            java.lang.String r0 = new java.lang.String     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            r0.<init>(r6)     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            goto L_0x00b9
        L_0x00a9:
            java.lang.String r0 = ""
            goto L_0x00b9
        L_0x00ac:
            X.0vD r0 = new X.0vD     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            throw r0     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
        L_0x00b2:
            X.0vD r0 = new X.0vD     // Catch:{ 0vD -> 0x00b8 }
            r0.<init>()     // Catch:{ 0vD -> 0x00b8 }
            throw r0     // Catch:{ 0vD -> 0x00b8 }
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            r9.A0G = r0
            r0 = r20
            r9.A0I = r0
            r9.A0E = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17580vB.<init>(X.0PW, X.0NR, X.0lk, X.0vk, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, java.util.Map, java.util.concurrent.atomic.AtomicInteger, int, int, int, int, int, int, int, int, boolean, boolean, boolean):void");
    }
}
