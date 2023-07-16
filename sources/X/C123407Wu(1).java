package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7Wu  reason: invalid class name and case insensitive filesystem */
public final class C123407Wu implements C147548pW {
    public C875353d A00 = new C875353d();
    public AnonymousClass69J A01;
    public final Modifier A02;
    public final AnonymousClass76Z A03;

    public final void ADB(boolean z, boolean z2) {
        AnonymousClass6Av r0;
        C875353d r3 = this.A00;
        AnonymousClass6Av r1 = r3.A00;
        if (AnonymousClass7FL.A03(r3, z, z2)) {
            int ordinal = r1.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                r0 = AnonymousClass6Av.Active;
            } else if (ordinal == 3) {
                r0 = AnonymousClass6Av.Inactive;
            } else {
                throw AnonymousClass4VZ.A00();
            }
            C04220Ms.A0B(r0, 0);
            r3.A00 = r0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0075, code lost:
        if (r5 != null) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0198 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Bgd(int r11) {
        /*
            r10 = this;
            X.53d r4 = r10.A00
            X.53d r5 = X.AnonymousClass7FM.A00(r4)
            r2 = 0
            if (r5 == 0) goto L_0x0198
            X.69J r6 = r10.A01
            if (r6 == 0) goto L_0x0191
            r3 = 1
            X.8n8 r1 = r5.A06()
            if (r11 != r3) goto L_0x00d8
            X.7Wv r1 = (X.C123417Wv) r1
            X.77X r6 = r1.A03
        L_0x0018:
            X.77X r0 = X.AnonymousClass77X.A01
            boolean r0 = X.C04220Ms.A0I(r6, r0)
            if (r0 != 0) goto L_0x0198
            X.77X r0 = X.AnonymousClass77X.A02
            boolean r0 = X.C04220Ms.A0I(r6, r0)
            if (r0 == 0) goto L_0x0179
            X.69J r7 = r10.A01
            if (r7 == 0) goto L_0x0191
            r0 = 20
            kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2 r6 = X.C86154wM.A10(r5, r0)
            r5 = r4
            r1 = r11
            if (r11 != r3) goto L_0x0051
            boolean r0 = X.C121647Hd.A03(r4, r6)
        L_0x003a:
            if (r0 != 0) goto L_0x016b
        L_0x003c:
            X.6Av r0 = r4.A00
            int r5 = r0.ordinal()
            r1 = 2
            if (r5 == r1) goto L_0x0150
            if (r5 == r2) goto L_0x0150
            if (r5 == r3) goto L_0x0150
            r0 = 3
            if (r5 == r0) goto L_0x0198
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0051:
            r0 = 2
            if (r11 != r0) goto L_0x0059
            boolean r0 = X.C121647Hd.A02(r4, r6)
            goto L_0x003a
        L_0x0059:
            r0 = 3
            if (r11 == r0) goto L_0x0077
            r0 = 4
            if (r11 == r0) goto L_0x0077
            r0 = 5
            if (r11 == r0) goto L_0x0077
            r0 = 6
            if (r11 == r0) goto L_0x0077
            r0 = 7
            if (r11 != r0) goto L_0x0084
            int r0 = r7.ordinal()
            if (r0 == r2) goto L_0x0082
            if (r0 != r3) goto L_0x016d
            r1 = 3
        L_0x0071:
            X.53d r5 = X.AnonymousClass7FM.A00(r4)
            if (r5 == 0) goto L_0x003c
        L_0x0077:
            java.lang.Boolean r0 = X.AnonymousClass7KH.A02(r5, r6, r1)
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.booleanValue()
            goto L_0x003a
        L_0x0082:
            r1 = 4
            goto L_0x0071
        L_0x0084:
            X.53d r5 = X.AnonymousClass7FM.A00(r4)
            if (r5 == 0) goto L_0x003c
            r9 = 1024(0x400, float:1.435E-42)
            X.7YG r1 = r5.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0172
            X.7YG r8 = r1.A04
            X.7Y3 r7 = X.C121847Ik.A01(r5)
        L_0x0098:
            r5 = 0
            X.7IW r0 = r7.A0a
            X.7YG r0 = r0.A02
            int r0 = r0.A00
            r0 = r0 & r9
            if (r0 == 0) goto L_0x00c9
        L_0x00a2:
            if (r8 == 0) goto L_0x00c9
            int r0 = r8.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r8 instanceof X.C875353d
            if (r0 == 0) goto L_0x00c6
            r1 = r8
            X.53d r1 = (X.C875353d) r1
            boolean r0 = X.C146948n8.A00(r1)
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x003c
            java.lang.Object r0 = r6.invoke(r1)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            goto L_0x003a
        L_0x00c6:
            X.7YG r8 = r8.A04
            goto L_0x00a2
        L_0x00c9:
            X.7Y3 r7 = r7.A09()
            if (r7 == 0) goto L_0x003c
            X.7IW r0 = r7.A0a
            if (r0 == 0) goto L_0x00d6
            X.7YG r8 = r0.A05
            goto L_0x0098
        L_0x00d6:
            r8 = r5
            goto L_0x0098
        L_0x00d8:
            r0 = 2
            if (r11 != r0) goto L_0x00e1
            X.7Wv r1 = (X.C123417Wv) r1
            X.77X r6 = r1.A04
            goto L_0x0018
        L_0x00e1:
            r0 = 5
            if (r11 != r0) goto L_0x00ea
            X.7Wv r1 = (X.C123417Wv) r1
            X.77X r6 = r1.A07
            goto L_0x0018
        L_0x00ea:
            r0 = 6
            if (r11 != r0) goto L_0x00f3
            X.7Wv r1 = (X.C123417Wv) r1
            X.77X r6 = r1.A00
            goto L_0x0018
        L_0x00f3:
            r0 = 3
            if (r11 != r0) goto L_0x0113
            int r0 = r6.ordinal()
            if (r0 == r2) goto L_0x010e
            if (r0 != r3) goto L_0x0180
            X.7Wv r1 = (X.C123417Wv) r1
            X.77X r6 = r1.A01
        L_0x0102:
            X.77X r0 = X.AnonymousClass77X.A02
            boolean r0 = X.C04220Ms.A0I(r6, r0)
            if (r0 == 0) goto L_0x0018
            X.77X r6 = r1.A02
            goto L_0x0018
        L_0x010e:
            X.7Wv r1 = (X.C123417Wv) r1
            X.77X r6 = r1.A06
            goto L_0x0102
        L_0x0113:
            r0 = 4
            if (r11 != r0) goto L_0x0133
            int r0 = r6.ordinal()
            if (r0 == r2) goto L_0x012e
            if (r0 != r3) goto L_0x0185
            X.7Wv r1 = (X.C123417Wv) r1
            X.77X r6 = r1.A06
        L_0x0122:
            X.77X r0 = X.AnonymousClass77X.A02
            boolean r0 = X.C04220Ms.A0I(r6, r0)
            if (r0 == 0) goto L_0x0018
            X.77X r6 = r1.A05
            goto L_0x0018
        L_0x012e:
            X.7Wv r1 = (X.C123417Wv) r1
            X.77X r6 = r1.A01
            goto L_0x0122
        L_0x0133:
            r0 = 7
            if (r11 != r0) goto L_0x0147
            X.7Wv r1 = (X.C123417Wv) r1
            X.0YY r1 = r1.A08
        L_0x013a:
            X.6sl r0 = new X.6sl
            r0.<init>(r11)
            java.lang.Object r6 = r1.invoke(r0)
            X.77X r6 = (X.AnonymousClass77X) r6
            goto L_0x0018
        L_0x0147:
            r0 = 8
            if (r11 != r0) goto L_0x018a
            X.7Wv r1 = (X.C123417Wv) r1
            X.0YY r1 = r1.A09
            goto L_0x013a
        L_0x0150:
            boolean r0 = r0.BUK()
            if (r0 != 0) goto L_0x0198
            if (r11 == r3) goto L_0x015a
            if (r11 != r1) goto L_0x0198
        L_0x015a:
            r10.ADB(r2, r3)
            X.6Av r0 = r4.A00
            boolean r0 = r0.BUK()
            if (r0 == 0) goto L_0x0198
            boolean r0 = r10.Bgd(r11)
            if (r0 == 0) goto L_0x0198
        L_0x016b:
            r2 = 1
            return r2
        L_0x016d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0172:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0179:
            X.8LT r0 = X.AnonymousClass8LT.A00
            boolean r0 = r6.A00(r0)
            return r0
        L_0x0180:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0185:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x018a:
            java.lang.String r0 = "invalid FocusDirection"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0191:
            java.lang.String r0 = "layoutDirection"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0198:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123407Wu.Bgd(int):boolean");
    }

    public C123407Wu(AnonymousClass0YY r2) {
        this.A03 = new AnonymousClass76Z(r2);
        this.A02 = new FocusOwnerImpl$modifier$1(this);
    }

    public static AnonymousClass76Z A00(C147778pt r0) {
        return ((C123407Wu) ((AndroidComposeView) C121847Ik.A03(r0)).A0Q).A03;
    }
}
