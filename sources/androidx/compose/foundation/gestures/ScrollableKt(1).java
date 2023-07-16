package androidx.compose.foundation.gestures;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4ZX;
import X.AnonymousClass7UW;
import X.AnonymousClass8JQ;
import X.C104176bM;
import X.C120417Am;
import X.C123337Wn;
import X.C142708fS;
import X.C142718fT;
import X.C146058lZ;
import X.C146258lv;
import X.C147258p3;
import X.C148818sE;
import X.C967266l;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.IDxLambdaShape0S0520000_2_I2;

public final class ScrollableKt {
    public static final C142718fT A00 = new AnonymousClass7UW();
    public static final C148818sE A01 = new C123337Wn();
    public static final C104176bM A02 = new C104176bM(AnonymousClass4ZX.A00);

    public static final Modifier A00(C146058lZ r11, C142708fS r12, C967266l r13, C146258lv r14, C147258p3 r15, Modifier modifier, boolean z, boolean z2) {
        AnonymousClass0YY r112;
        C967266l r5 = r13;
        Modifier modifier2 = modifier;
        AnonymousClass0wJ.A1M(modifier2, 0, r13);
        C146058lZ r3 = r11;
        C142708fS r4 = r12;
        C146258lv r6 = r14;
        C147258p3 r7 = r15;
        boolean z3 = z;
        boolean z4 = z2;
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r112 = new AnonymousClass8JQ(r3, r4, r5, r6, r7, z, z2);
        } else {
            r112 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier2, r112, new IDxLambdaShape0S0520000_2_I2(r3, r4, r5, r6, r7, 0, z4, z3));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d A[RETURN] */
    public static final java.lang.Object A01(X.C147828pz r6, X.C146958n9 r7) {
        /*
            r3 = 3
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x003e
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r2) goto L_0x0044
            java.lang.Object r0 = r5.A01
            X.8pz r6 = X.C86164wN.A0H(r0, r4)
        L_0x0026:
            X.6kM r4 = (X.C109656kM) r4
            int r1 = r4.A00
            r0 = 6
            if (r1 != r0) goto L_0x0031
            return r4
        L_0x002e:
            X.AnonymousClass0OU.A00(r4)
        L_0x0031:
            r5.A01 = r6
            r5.A00 = r2
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r4 = r6.AA5(r0, r5)
            if (r4 != r3) goto L_0x0026
            return r3
        L_0x003e:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r5.<init>(r3, r7)
            goto L_0x0015
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.A01(X.8pz, X.8n9):java.lang.Object");
    }
}
