package X;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.7yq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135077yq implements Runnable {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public /* synthetic */ C135077yq(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x025f, code lost:
        if (r7 != false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a8, code lost:
        if (r7 == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0241, code lost:
        if (r7 == false) goto L_0x0243;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r0 = r26
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = r0.A00
            r5 = 0
            androidx.compose.ui.platform.AndroidComposeView r0 = r6.A0M
            r25 = r0
            r23 = 1
            r1 = r0
            r0 = r23
            r1.Bg5(r0)
            X.6o7 r0 = r1.A0i
            r24 = r0
            X.7HT r1 = r24.A00()
            X.6ia r0 = r6.A07
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A09(r0, r6, r1)
            java.util.Map r22 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)
            r0 = r22
            X.C04220Ms.A0B(r0, r5)
            java.util.List r4 = r6.A0O
            java.util.ArrayList r21 = X.C18200wM.A0s(r4)
            r4.clear()
            java.util.Iterator r20 = X.C18220wO.A0x(r22)
        L_0x0034:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x04db
            java.lang.Object r0 = r20.next()
            int r3 = X.AnonymousClass0wJ.A04(r0)
            java.util.Map r0 = r6.A0C
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r0.get(r1)
            X.6ia r2 = (X.C108576ia) r2
            if (r2 == 0) goto L_0x0034
            r0 = r22
            java.lang.Object r0 = r0.get(r1)
            X.6fi r0 = (X.C106846fi) r0
            if (r0 == 0) goto L_0x04d8
            X.7HT r1 = r0.A01
        L_0x005c:
            X.C04220Ms.A0A(r1)
            X.7yX r0 = r1.A05
            java.util.Iterator r19 = r0.iterator()
        L_0x0065:
            r18 = 0
        L_0x0067:
            boolean r7 = r19.hasNext()
            if (r7 == 0) goto L_0x049a
            java.util.Map$Entry r14 = X.C18180wK.A0o(r19)
            java.lang.Object r7 = r14.getKey()
            X.77Z r11 = X.C103986b3.A08
            boolean r7 = X.C04220Ms.A0I(r7, r11)
            if (r7 != 0) goto L_0x0089
            java.lang.Object r8 = r14.getKey()
            X.77Z r7 = X.C103986b3.A0R
            boolean r7 = X.C04220Ms.A0I(r8, r7)
            if (r7 == 0) goto L_0x00aa
        L_0x0089:
            int r9 = r21.size()
            r8 = 0
        L_0x008e:
            if (r8 >= r9) goto L_0x0492
            r7 = r21
            java.lang.Object r7 = r7.get(r8)
            X.7YM r7 = (X.AnonymousClass7YM) r7
            int r7 = r7.A04
            if (r7 != r3) goto L_0x048e
            r7 = r21
            java.lang.Object r8 = r7.get(r8)
            if (r8 == 0) goto L_0x0492
            r7 = 0
        L_0x00a5:
            r4.add(r8)
            if (r7 != 0) goto L_0x00c1
        L_0x00aa:
            java.lang.Object r9 = r14.getValue()
            X.7yX r8 = r2.A00
            java.lang.Object r7 = r14.getKey()
            X.77Z r7 = (X.AnonymousClass77Z) r7
            java.lang.Object r7 = X.C115946wA.A01(r8, r7)
            boolean r7 = X.C04220Ms.A0I(r9, r7)
            if (r7 == 0) goto L_0x00c1
            goto L_0x0067
        L_0x00c1:
            java.lang.Object r8 = r14.getKey()
            X.77Z r10 = X.C103986b3.A0G
            boolean r7 = X.C04220Ms.A0I(r8, r10)
            r9 = 8
            if (r7 == 0) goto L_0x00e4
            java.lang.Object r8 = r14.getValue()
            X.C18240wQ.A1I(r8)
            java.lang.String r8 = (java.lang.String) r8
            X.7yX r7 = r2.A00
            boolean r7 = r7.A01(r10)
            if (r7 == 0) goto L_0x0067
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0C(r6, r8, r3, r9)
            goto L_0x0067
        L_0x00e4:
            X.77Z r7 = X.C103986b3.A0M
            boolean r7 = X.C04220Ms.A0I(r8, r7)
            if (r7 != 0) goto L_0x0366
            X.77Z r7 = X.C103986b3.A0Q
            boolean r7 = X.C04220Ms.A0I(r8, r7)
            if (r7 != 0) goto L_0x0366
            X.77Z r7 = X.C103986b3.A0I
            boolean r7 = X.C04220Ms.A0I(r8, r7)
            if (r7 != 0) goto L_0x0366
            X.77Z r12 = X.C103986b3.A0L
            boolean r7 = X.C04220Ms.A0I(r8, r12)
            r10 = 4
            if (r7 == 0) goto L_0x017d
            X.7yX r8 = r1.A07()
            X.77Z r7 = X.C103986b3.A0J
            java.lang.Object r7 = X.C115946wA.A01(r8, r7)
            X.799 r7 = (X.AnonymousClass799) r7
            if (r7 == 0) goto L_0x0366
            int r7 = r7.A00
            if (r7 != r10) goto L_0x0366
            X.7yX r7 = r1.A07()
            java.lang.Object r8 = X.C115946wA.A01(r7, r12)
            r7 = r23
            boolean r7 = X.C18190wL.A1Z(r8, r7)
            if (r7 == 0) goto L_0x0177
            int r7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            android.view.accessibility.AccessibilityEvent r9 = r6.A0Q(r7, r10)
            X.8pp r10 = r1.A04
            X.7Y3 r8 = X.C121847Ik.A01(r10)
            X.7HT r11 = new X.7HT
            r7 = r23
            r11.<init>(r8, r10, r7)
            X.7yX r8 = r11.A07()
            X.77Z r7 = X.C103986b3.A02
            java.lang.Object r7 = X.C115946wA.A01(r8, r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0175
            java.lang.String r10 = X.AnonymousClass6ET.A00(r7)
        L_0x014e:
            X.7yX r8 = r11.A07()
            X.77Z r7 = X.C103986b3.A0O
            java.lang.Object r7 = X.C115946wA.A01(r8, r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0173
            java.lang.String r8 = X.AnonymousClass6ET.A00(r7)
        L_0x0160:
            if (r10 == 0) goto L_0x0165
            r9.setContentDescription(r10)
        L_0x0165:
            if (r8 == 0) goto L_0x016e
            java.util.List r7 = r9.getText()
            r7.add(r8)
        L_0x016e:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r9, r6)
            goto L_0x0067
        L_0x0173:
            r8 = 0
            goto L_0x0160
        L_0x0175:
            r10 = 0
            goto L_0x014e
        L_0x0177:
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            goto L_0x0340
        L_0x017d:
            X.77Z r7 = X.C103986b3.A02
            boolean r7 = X.C04220Ms.A0I(r8, r7)
            if (r7 == 0) goto L_0x01b5
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            java.lang.Object r11 = r14.getValue()
            r7 = 9
            java.lang.String r7 = X.C18170wI.A00(r7)
            X.C04220Ms.A0C(r11, r7)
            java.util.List r11 = (java.util.List) r11
            r8 = 2048(0x800, float:2.87E-42)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r7) goto L_0x0067
            boolean r7 = r6.A0S()
            if (r7 == 0) goto L_0x0067
            android.view.accessibility.AccessibilityEvent r9 = r6.A0Q(r9, r8)
            r9.setContentChangeTypes(r10)
            if (r11 == 0) goto L_0x016e
            java.lang.String r7 = X.AnonymousClass6ET.A00(r11)
            r9.setContentDescription(r7)
            goto L_0x016e
        L_0x01b5:
            X.77Z r13 = X.C103986b3.A04
            boolean r7 = X.C04220Ms.A0I(r8, r13)
            java.lang.String r10 = ""
            if (r7 == 0) goto L_0x02bf
            X.77Z r12 = X.C103976b2.A0J
            boolean r7 = r0.A01(r12)
            if (r7 == 0) goto L_0x0345
            X.7yX r7 = r2.A00
            java.lang.Object r11 = X.C115946wA.A01(r7, r13)
            X.7yH r11 = (X.C134747yH) r11
            if (r11 != 0) goto L_0x01d2
            r11 = r10
        L_0x01d2:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Object r13 = X.C115946wA.A01(r0, r13)
            X.7yH r13 = (X.C134747yH) r13
            if (r13 != 0) goto L_0x01dd
            r13 = r10
        L_0x01dd:
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.CharSequence r17 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A03(r13)
            int r10 = r11.length()
            int r9 = r13.length()
            r16 = r10
            if (r10 <= r9) goto L_0x01f1
            r16 = r9
        L_0x01f1:
            r8 = 0
        L_0x01f2:
            r7 = r16
            if (r8 >= r7) goto L_0x0203
            char r14 = r11.charAt(r8)
            char r7 = r13.charAt(r8)
            if (r14 != r7) goto L_0x0203
            int r8 = r8 + 1
            goto L_0x01f2
        L_0x0203:
            r15 = 0
        L_0x0204:
            int r7 = r16 - r8
            if (r15 >= r7) goto L_0x021b
            int r7 = r10 + -1
            int r7 = r7 - r15
            char r14 = r11.charAt(r7)
            int r7 = r9 + -1
            int r7 = r7 - r15
            char r7 = r13.charAt(r7)
            if (r14 != r7) goto L_0x021b
            int r15 = r15 + 1
            goto L_0x0204
        L_0x021b:
            int r10 = r10 - r15
            int r10 = r10 - r8
            int r13 = r9 - r15
            int r13 = r13 - r8
            X.7HT r7 = r2.A01
            r16 = r7
            X.7yX r15 = r7.A05
            boolean r7 = r15.A01(r12)
            if (r7 == 0) goto L_0x0243
            X.7yX r7 = r16.A07()
            X.77Z r14 = X.C103986b3.A0H
            boolean r7 = r7.A01(r14)
            if (r7 != 0) goto L_0x0243
            X.7yX r7 = r1.A07()
            boolean r7 = r7.A01(r14)
            r14 = 1
            if (r7 != 0) goto L_0x0244
        L_0x0243:
            r14 = 0
        L_0x0244:
            boolean r7 = r15.A01(r12)
            if (r7 == 0) goto L_0x0261
            X.7yX r7 = r16.A07()
            X.77Z r12 = X.C103986b3.A0H
            boolean r7 = r7.A01(r12)
            if (r7 == 0) goto L_0x0261
            X.7yX r7 = r1.A07()
            boolean r7 = r7.A01(r12)
            r12 = 1
            if (r7 == 0) goto L_0x0262
        L_0x0261:
            r12 = 0
        L_0x0262:
            if (r14 != 0) goto L_0x02ab
            if (r12 != 0) goto L_0x02ab
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            r7 = 16
            android.view.accessibility.AccessibilityEvent r9 = r6.A0Q(r9, r7)
            r9.setFromIndex(r8)
            r9.setRemovedCount(r10)
            r9.setAddedCount(r13)
            r9.setBeforeText(r11)
            java.util.List r8 = r9.getText()
            r7 = r17
            r8.add(r7)
        L_0x0285:
            java.lang.String r7 = "android.widget.EditText"
            r9.setClassName(r7)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r9, r6)
            if (r14 != 0) goto L_0x0291
            if (r12 == 0) goto L_0x0067
        L_0x0291:
            X.77Z r7 = X.C103986b3.A0P
            java.lang.Object r7 = r0.A00(r7)
            X.7Ia r7 = (X.C121767Ia) r7
            long r7 = r7.A00
            int r10 = X.C86104wH.A07(r7)
            r9.setFromIndex(r10)
            int r7 = X.C86104wH.A08(r7)
            r9.setToIndex(r7)
            goto L_0x016e
        L_0x02ab:
            int r11 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r7 = r17
            r9 = r8
            android.view.accessibility.AccessibilityEvent r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A01(r6, r7, r8, r9, r10, r11)
            goto L_0x0285
        L_0x02bf:
            X.77Z r12 = X.C103986b3.A0P
            boolean r7 = X.C04220Ms.A0I(r8, r12)
            if (r7 == 0) goto L_0x0308
            java.lang.Object r7 = X.C115946wA.A01(r0, r13)
            X.7yH r7 = (X.C134747yH) r7
            if (r7 == 0) goto L_0x02d1
            java.lang.String r10 = r7.A00
        L_0x02d1:
            java.lang.Object r7 = r0.A00(r12)
            X.7Ia r7 = (X.C121767Ia) r7
            long r7 = r7.A00
            int r14 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            int r9 = X.C86104wH.A07(r7)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            int r7 = X.C86104wH.A08(r7)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            int r7 = r10.length()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            java.lang.CharSequence r10 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A03(r10)
            r9 = r6
            android.view.accessibility.AccessibilityEvent r7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A01(r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r7, r6)
            int r7 = r1.A02
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0A(r6, r7)
            goto L_0x0067
        L_0x0308:
            boolean r7 = X.C04220Ms.A0I(r8, r11)
            if (r7 != 0) goto L_0x0433
            X.77Z r7 = X.C103986b3.A0R
            boolean r7 = X.C04220Ms.A0I(r8, r7)
            if (r7 != 0) goto L_0x0433
            X.77Z r7 = X.C103986b3.A06
            boolean r7 = X.C04220Ms.A0I(r8, r7)
            if (r7 == 0) goto L_0x0397
            java.lang.Object r8 = r14.getValue()
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C04220Ms.A0C(r8, r7)
            boolean r7 = X.AnonymousClass0wJ.A1X(r8)
            if (r7 == 0) goto L_0x033a
            int r7 = r1.A02
            int r7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r7)
            android.view.accessibility.AccessibilityEvent r7 = r6.A0Q(r7, r9)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r7, r6)
        L_0x033a:
            int r7 = r1.A02
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r7)
        L_0x0340:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            goto L_0x034d
        L_0x0345:
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            java.lang.Integer r10 = X.C86154wM.A0X()
        L_0x034d:
            r8 = 2048(0x800, float:2.87E-42)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r7) goto L_0x0067
            boolean r7 = r6.A0S()
            if (r7 == 0) goto L_0x0067
            android.view.accessibility.AccessibilityEvent r9 = r6.A0Q(r9, r8)
            int r7 = r10.intValue()
            r9.setContentChangeTypes(r7)
            goto L_0x016e
        L_0x0366:
            int r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            r10 = 2048(0x800, float:2.87E-42)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r9) goto L_0x0382
            boolean r7 = r6.A0S()
            if (r7 == 0) goto L_0x0382
            android.view.accessibility.AccessibilityEvent r8 = r6.A0Q(r8, r10)
            r7 = 64
            r8.setContentChangeTypes(r7)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r8, r6)
        L_0x0382:
            int r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            if (r8 == r9) goto L_0x0067
            boolean r7 = r6.A0S()
            if (r7 == 0) goto L_0x0067
            android.view.accessibility.AccessibilityEvent r9 = r6.A0Q(r8, r10)
            r9.setContentChangeTypes(r5)
            goto L_0x016e
        L_0x0397:
            X.77Z r9 = X.C103976b2.A02
            boolean r7 = X.C04220Ms.A0I(r8, r9)
            if (r7 == 0) goto L_0x03e4
            java.lang.Object r8 = r0.A00(r9)
            java.util.List r8 = (java.util.List) r8
            X.7yX r7 = r2.A00
            java.lang.Object r10 = X.C115946wA.A01(r7, r9)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x0429
            java.util.LinkedHashSet r9 = X.C86134wK.A0u()
            int r7 = r8.size()
            if (r5 >= r7) goto L_0x03c3
            r8.get(r5)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x03c3:
            java.util.LinkedHashSet r8 = X.C86134wK.A0u()
            int r7 = r10.size()
            if (r5 >= r7) goto L_0x03d7
            r10.get(r5)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x03d7:
            boolean r7 = r9.containsAll(r8)
            if (r7 == 0) goto L_0x042f
            boolean r7 = r8.containsAll(r9)
            if (r7 != 0) goto L_0x0065
            goto L_0x042f
        L_0x03e4:
            java.lang.Object r7 = r14.getValue()
            boolean r7 = r7 instanceof X.AnonymousClass79M
            if (r7 == 0) goto L_0x042f
            java.lang.Object r10 = r14.getValue()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            X.C04220Ms.A0C(r10, r7)
            X.79M r10 = (X.AnonymousClass79M) r10
            X.7yX r8 = r2.A00
            java.lang.Object r7 = r14.getKey()
            X.77Z r7 = (X.AnonymousClass77Z) r7
            java.lang.Object r9 = X.C115946wA.A01(r8, r7)
            if (r10 == r9) goto L_0x0427
            boolean r7 = r9 instanceof X.AnonymousClass79M
            if (r7 == 0) goto L_0x041d
            java.lang.String r8 = r10.A00
            X.79M r9 = (X.AnonymousClass79M) r9
            java.lang.String r7 = r9.A00
            boolean r7 = X.C04220Ms.A0I(r8, r7)
            if (r7 == 0) goto L_0x041d
            kotlin.Function r7 = r10.A01
            if (r7 != 0) goto L_0x0422
            kotlin.Function r7 = r9.A01
            if (r7 == 0) goto L_0x0427
        L_0x041d:
            r7 = 0
        L_0x041e:
            r18 = r7 ^ 1
            goto L_0x0067
        L_0x0422:
            kotlin.Function r7 = r9.A01
            if (r7 != 0) goto L_0x0427
            goto L_0x041d
        L_0x0427:
            r7 = 1
            goto L_0x041e
        L_0x0429:
            boolean r7 = X.C18190wL.A1a(r8)
            if (r7 == 0) goto L_0x0067
        L_0x042f:
            r18 = 1
            goto L_0x0067
        L_0x0433:
            X.7Y3 r8 = r1.A03
            X.00m r7 = r6.A0L
            boolean r7 = r7.add(r8)
            if (r7 == 0) goto L_0x0444
            X.4wD r8 = r6.A0Q
            kotlin.Unit r7 = kotlin.Unit.A00
            r8.D7w(r7)
        L_0x0444:
            int r9 = r4.size()
            r8 = 0
        L_0x0449:
            if (r8 >= r9) goto L_0x048c
            java.lang.Object r7 = r4.get(r8)
            X.7YM r7 = (X.AnonymousClass7YM) r7
            int r7 = r7.A04
            if (r7 != r3) goto L_0x0489
            java.lang.Object r10 = r4.get(r8)
            X.7YM r10 = (X.AnonymousClass7YM) r10
        L_0x045b:
            X.C04220Ms.A0A(r10)
            java.lang.Object r7 = X.C115946wA.A01(r0, r11)
            X.6pO r7 = (X.C112326pO) r7
            r10.A00 = r7
            X.77Z r7 = X.C103986b3.A0R
            java.lang.Object r7 = X.C115946wA.A01(r0, r7)
            X.6pO r7 = (X.C112326pO) r7
            r10.A01 = r7
            java.util.List r7 = r10.A05
            boolean r7 = r7.contains(r10)
            if (r7 == 0) goto L_0x0067
            r7 = r25
            X.6qT r9 = r7.A0Y
            X.0YY r8 = r6.A0P
            r7 = 22
            kotlin.jvm.internal.KtLambdaShape16S0200000_I2 r7 = X.C86164wN.A0v(r10, r6, r7)
            r9.A00(r10, r7, r8)
            goto L_0x0067
        L_0x0489:
            int r8 = r8 + 1
            goto L_0x0449
        L_0x048c:
            r10 = 0
            goto L_0x045b
        L_0x048e:
            int r8 = r8 + 1
            goto L_0x008e
        L_0x0492:
            X.7YM r8 = new X.7YM
            r8.<init>(r4, r3)
            r7 = 1
            goto L_0x00a5
        L_0x049a:
            if (r18 != 0) goto L_0x04bc
            X.7yX r0 = r2.A00
            java.util.Iterator r7 = r0.iterator()
        L_0x04a2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0034
            java.util.Map$Entry r0 = X.C18180wK.A0o(r7)
            X.7yX r2 = r1.A07()
            java.lang.Object r0 = r0.getKey()
            X.77Z r0 = (X.AnonymousClass77Z) r0
            boolean r0 = r2.A01(r0)
            if (r0 != 0) goto L_0x04a2
        L_0x04bc:
            int r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A00(r6, r3)
            r1 = 2048(0x800, float:2.87E-42)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x0034
            boolean r0 = r6.A0S()
            if (r0 == 0) goto L_0x0034
            android.view.accessibility.AccessibilityEvent r0 = r6.A0Q(r2, r1)
            r0.setContentChangeTypes(r5)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A08(r0, r6)
            goto L_0x0034
        L_0x04d8:
            r1 = 0
            goto L_0x005c
        L_0x04db:
            X.00m r4 = new X.00m
            r4.<init>(r5)
            X.00m r7 = r6.A03
            java.util.Iterator r9 = r7.iterator()
        L_0x04e6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0533
            java.lang.Object r8 = r9.next()
            java.lang.Number r8 = (java.lang.Number) r8
            java.util.Map r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)
            java.lang.Object r1 = r0.get(r8)
            X.6fi r1 = (X.C106846fi) r1
            r0 = 0
            if (r1 == 0) goto L_0x050d
            X.7HT r1 = r1.A01
            X.7yX r2 = r1.A07()
            X.77Z r1 = X.C103986b3.A0G
            boolean r1 = r2.A01(r1)
            if (r1 != 0) goto L_0x04e6
        L_0x050d:
            r4.add(r8)
            X.C04220Ms.A04(r8)
            int r3 = r8.intValue()
            r2 = 32
            java.util.Map r1 = r6.A0C
            java.lang.Object r1 = r1.get(r8)
            X.6ia r1 = (X.C108576ia) r1
            if (r1 == 0) goto L_0x052f
            X.7yX r1 = r1.A00
            if (r1 == 0) goto L_0x052f
            X.77Z r0 = X.C103986b3.A0G
            java.lang.Object r0 = X.C115946wA.A01(r1, r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x052f:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0C(r6, r0, r3, r2)
            goto L_0x04e6
        L_0x0533:
            int r2 = r4.A00
            r1 = 0
        L_0x0536:
            if (r1 >= r2) goto L_0x0542
            java.lang.Object[] r0 = r4.A02
            r0 = r0[r1]
            r7.remove(r0)
            int r1 = r1 + 1
            goto L_0x0536
        L_0x0542:
            java.util.Map r4 = r6.A0C
            r4.clear()
            java.util.Map r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)
            java.util.Iterator r9 = X.AnonymousClass0wJ.A0z(r0)
        L_0x054f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x05ad
            java.util.Map$Entry r8 = X.C18180wK.A0o(r9)
            java.lang.Object r0 = r8.getValue()
            X.6fi r0 = (X.C106846fi) r0
            X.7HT r0 = r0.A01
            X.7yX r0 = r0.A07()
            X.77Z r3 = X.C103986b3.A0G
            boolean r0 = r0.A01(r3)
            if (r0 == 0) goto L_0x0594
            java.lang.Object r0 = r8.getKey()
            boolean r0 = r7.add(r0)
            if (r0 == 0) goto L_0x0594
            java.lang.Object r0 = r8.getKey()
            int r2 = X.AnonymousClass0wJ.A04(r0)
            r1 = 16
            java.lang.Object r0 = r8.getValue()
            X.6fi r0 = (X.C106846fi) r0
            X.7HT r0 = r0.A01
            X.7yX r0 = r0.A05
            java.lang.Object r0 = r0.A00(r3)
            java.lang.String r0 = (java.lang.String) r0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0C(r6, r0, r2, r1)
        L_0x0594:
            java.lang.Object r3 = r8.getKey()
            java.lang.Object r0 = r8.getValue()
            X.6fi r0 = (X.C106846fi) r0
            X.7HT r2 = r0.A01
            java.util.Map r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)
            X.6ia r0 = new X.6ia
            r0.<init>(r2, r1)
            r4.put(r3, r0)
            goto L_0x054f
        L_0x05ad:
            X.7HT r2 = r24.A00()
            java.util.Map r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A06(r6)
            X.6ia r0 = new X.6ia
            r0.<init>(r2, r1)
            r6.A07 = r0
            r6.A0D = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135077yq.run():void");
    }
}
