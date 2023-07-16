package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;

public class KtCSuperShape0S1000100_I2 extends AnonymousClass0Sf {
    public long A00;
    public String A01;
    public final int A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S1000100_I2() {
        this(3, "", 0);
        this.A02 = 3;
        this.A02 = 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r5.A00 == r6.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if ((r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r6.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r5.A00 != r6.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (X.C04220Ms.A0I(r5.A01, r6.A01) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r6.A02 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (X.C04220Ms.A0I(r5.A01, r6.A01) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x004a;
                case 2: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r5 == r6) goto L_0x004d
            r1 = 3
        L_0x0008:
            boolean r0 = r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2
            if (r0 == 0) goto L_0x0024
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2) r6
            int r0 = r6.A02
            if (r0 != r1) goto L_0x0024
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r6.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0024
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
        L_0x0024:
            r0 = 0
            return r0
        L_0x0026:
            if (r5 == r6) goto L_0x004d
            r1 = 0
            goto L_0x002d
        L_0x002a:
            if (r5 == r6) goto L_0x004d
            r1 = 2
        L_0x002d:
            boolean r0 = r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2
            if (r0 == 0) goto L_0x0024
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2) r6
            int r0 = r6.A02
            if (r0 != r1) goto L_0x0024
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r6.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0024
        L_0x004a:
            r1 = 1
            if (r5 != r6) goto L_0x0008
        L_0x004d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A022;
        int hashCode;
        switch (this.A02) {
            case 0:
            case 2:
                A022 = C18190wL.A02(this.A00) * 31;
                hashCode = this.A01.hashCode();
                break;
            default:
                A022 = C18180wK.A03(this.A01);
                hashCode = C18190wL.A02(this.A00);
                break;
        }
        return A022 + hashCode;
    }

    public final String toString() {
        if (2 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("DictionaryIdAndKey(dictionaryId=");
        A0s.append(this.A00);
        A0s.append(", dictionaryKey=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape0S1000100_I2(int i, String str, long j) {
        this.A02 = i;
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = j;
    }

    public KtCSuperShape0S1000100_I2(long j, String str, int i) {
        this.A02 = i;
        C04220Ms.A0B(str, 2);
        this.A00 = j;
        this.A01 = str;
    }
}
