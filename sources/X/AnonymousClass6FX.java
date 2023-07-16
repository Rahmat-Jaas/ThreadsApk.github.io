package X;

/* renamed from: X.6FX  reason: invalid class name */
public final class AnonymousClass6FX {
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableString A00(X.C134747yH r28, X.C143078g4 r29, X.C147168nV r30) {
        /*
            r10 = 1
            r1 = r29
            r23 = r30
            r0 = r23
            X.AnonymousClass0wJ.A1M(r0, r10, r1)
            r11 = r28
            java.lang.String r0 = r11.A00
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            java.util.List r8 = r11.A03
            r7 = 0
            if (r8 == 0) goto L_0x00f2
            int r21 = r8.size()
            r6 = 0
        L_0x001d:
            r0 = r21
            if (r6 >= r0) goto L_0x00f2
            X.7HE r0 = X.C86154wM.A0H(r8, r6)
            java.lang.Object r14 = r0.A02
            X.7F0 r14 = (X.AnonymousClass7F0) r14
            int r5 = r0.A01
            int r4 = r0.A00
            X.8nH r0 = r14.A0D
            r20 = r0
            long r18 = r20.AYH()
            long r0 = r14.A01
            r29 = r0
            X.7yQ r12 = r14.A09
            X.6su r15 = r14.A07
            X.7Ei r13 = r14.A0E
            X.83Y r0 = r14.A0A
            r28 = r0
            long r2 = r14.A00
            X.79I r14 = r14.A0C
            long r16 = r20.AYH()
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0053
            X.8nH r20 = X.AnonymousClass7CC.A00(r18)
        L_0x0053:
            long r0 = r20.AYH()
            X.AnonymousClass7As.A00(r9, r5, r4, r0)
            r22 = r9
            r24 = r5
            r25 = r4
            r26 = r29
            X.AnonymousClass7As.A02(r22, r23, r24, r25, r26)
            r1 = 33
            if (r12 != 0) goto L_0x00ed
            if (r15 == 0) goto L_0x0091
            X.7yQ r12 = X.C134817yQ.A04
        L_0x006d:
            int r15 = r15.A00
        L_0x006f:
            X.C04220Ms.A0B(r12, r7)
            X.7yQ r0 = X.C134817yQ.A08
            X.C04220Ms.A0B(r0, r7)
            int r12 = r12.A00
            r0 = 600(0x258, float:8.41E-43)
            int r0 = X.C04220Ms.A00(r12, r0)
            boolean r0 = X.C86114wI.A1S(r0)
            if (r15 != r10) goto L_0x00e8
            r12 = 2
            if (r0 == 0) goto L_0x0089
            r12 = 3
        L_0x0089:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r12)
            r9.setSpan(r0, r5, r4, r1)
        L_0x0091:
            if (r14 == 0) goto L_0x00c1
            X.79I r0 = X.AnonymousClass79I.A03
            X.C04220Ms.A0B(r0, r7)
            int r12 = r14.A00
            r0 = r12 | 1
            boolean r0 = X.AnonymousClass0wJ.A1T(r0, r12)
            if (r0 == 0) goto L_0x00aa
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r9.setSpan(r0, r5, r4, r1)
        L_0x00aa:
            X.79I r0 = X.AnonymousClass79I.A01
            X.C04220Ms.A0B(r0, r7)
            int r12 = r14.A00
            r0 = r12 | 2
            boolean r0 = X.AnonymousClass0wJ.A1T(r0, r12)
            if (r0 == 0) goto L_0x00c1
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r9.setSpan(r0, r5, r4, r1)
        L_0x00c1:
            if (r13 == 0) goto L_0x00cd
            float r12 = r13.A00
            android.text.style.ScaleXSpan r0 = new android.text.style.ScaleXSpan
            r0.<init>(r12)
            r9.setSpan(r0, r5, r4, r1)
        L_0x00cd:
            r0 = r28
            X.AnonymousClass7As.A01(r9, r0, r5, r4)
            long r12 = X.AnonymousClass7KE.A06
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00e4
            int r2 = X.C121657He.A01(r2)
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r2)
            r9.setSpan(r0, r5, r4, r1)
        L_0x00e4:
            int r6 = r6 + 1
            goto L_0x001d
        L_0x00e8:
            r12 = 0
            if (r0 == 0) goto L_0x0089
            r12 = 1
            goto L_0x0089
        L_0x00ed:
            if (r15 != 0) goto L_0x006d
            r15 = 0
            goto L_0x006f
        L_0x00f2:
            int r10 = r11.length()
            java.util.List r11 = r11.A01
            if (r11 == 0) goto L_0x0118
            java.util.ArrayList r6 = X.C18200wM.A0t(r11)
            int r4 = r11.size()
            r3 = 0
        L_0x0103:
            if (r3 >= r4) goto L_0x011a
            java.lang.Object r2 = r11.get(r3)
            r1 = r2
            X.7HE r1 = (X.AnonymousClass7HE) r1
            java.lang.Object r0 = r1.A02
            boolean r0 = r0 instanceof X.AnonymousClass6FO
            if (r0 == 0) goto L_0x0115
            X.AnonymousClass7HE.A00(r1, r2, r6, r7, r10)
        L_0x0115:
            int r3 = r3 + 1
            goto L_0x0103
        L_0x0118:
            X.0ZV r6 = X.AnonymousClass0ZV.A00
        L_0x011a:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>"
            X.C04220Ms.A0C(r6, r0)
            int r5 = r6.size()
            r4 = 0
        L_0x0124:
            r8 = 33
            if (r4 >= r5) goto L_0x0159
            X.7HE r0 = X.C86154wM.A0H(r6, r4)
            java.lang.Object r1 = r0.A02
            X.6FO r1 = (X.AnonymousClass6FO) r1
            int r3 = r0.A01
            int r2 = r0.A00
            X.C04220Ms.A0B(r1, r7)
            boolean r0 = r1 instanceof X.AnonymousClass55L
            if (r0 == 0) goto L_0x0154
            X.55L r1 = (X.AnonymousClass55L) r1
            X.C04220Ms.A0B(r1, r7)
            java.lang.String r1 = r1.A00
            android.text.style.TtsSpan$VerbatimBuilder r0 = new android.text.style.TtsSpan$VerbatimBuilder
            r0.<init>(r1)
            android.text.style.TtsSpan r0 = r0.build()
            X.C04220Ms.A06(r0)
            r9.setSpan(r0, r3, r2, r8)
            int r4 = r4 + 1
            goto L_0x0124
        L_0x0154:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0159:
            r6 = 0
            if (r11 == 0) goto L_0x017a
            java.util.ArrayList r5 = X.C18200wM.A0t(r11)
            int r4 = r11.size()
            r3 = 0
        L_0x0165:
            if (r3 >= r4) goto L_0x017c
            java.lang.Object r2 = r11.get(r3)
            r1 = r2
            X.7HE r1 = (X.AnonymousClass7HE) r1
            java.lang.Object r0 = r1.A02
            boolean r0 = r0 instanceof X.C114226st
            if (r0 == 0) goto L_0x0177
            X.AnonymousClass7HE.A00(r1, r2, r5, r7, r10)
        L_0x0177:
            int r3 = r3 + 1
            goto L_0x0165
        L_0x017a:
            X.0ZV r5 = X.AnonymousClass0ZV.A00
        L_0x017c:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>"
            X.C04220Ms.A0C(r5, r0)
            int r4 = r5.size()
        L_0x0185:
            if (r7 >= r4) goto L_0x01a3
            X.7HE r1 = X.C86154wM.A0H(r5, r7)
            java.lang.Object r0 = r1.A02
            X.6st r0 = (X.C114226st) r0
            int r3 = r1.A01
            int r2 = r1.A00
            X.C04220Ms.A0B(r0, r6)
            java.lang.String r1 = r0.A00
            android.text.style.URLSpan r0 = new android.text.style.URLSpan
            r0.<init>(r1)
            r9.setSpan(r0, r3, r2, r8)
            int r7 = r7 + 1
            goto L_0x0185
        L_0x01a3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FX.A00(X.7yH, X.8g4, X.8nV):android.text.SpannableString");
    }
}
