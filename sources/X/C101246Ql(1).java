package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawWithContentElement;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape0S0000002_I2;

/* renamed from: X.6Ql  reason: invalid class name and case insensitive filesystem */
public final class C101246Ql {
    public static final void A00(C147188nY r22, List list, float f, float f2, float f3, int i, int i2) {
        float f4 = f3;
        float f5 = f;
        List list2 = list;
        C04220Ms.A0B(list2, 0);
        C147188nY r15 = r22;
        r15.Cvd(-1236984418);
        if ((i2 & 2) != 0) {
            f5 = (float) 18;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.4f;
        }
        if ((i2 & 8) != 0) {
            f4 = (float) 2;
        }
        float f6 = f5 * f2;
        C147268p4 A01 = AnonymousClass7J3.A01(-f6);
        C123327Wm A02 = Modifier.A02(r15, 693286680);
        int i3 = 0;
        C146288ly A00 = AnonymousClass72N.A00(A01, r15, AnonymousClass7KV.A05);
        Object A0p = C147188nY.A0p(r15);
        Object A0n = C147188nY.A0n(r15);
        Object A0m = C147188nY.A0m(r15);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A02);
        AnonymousClass7W3 r3 = (AnonymousClass7W3) r15;
        C147188nY.A0w(r15, r3, r1);
        AnonymousClass7W3.A0a(r15, r3, A00, A0p);
        AnonymousClass7KP.A07(r15, A0n, A0m, A002);
        r15.Cvb(899622402);
        for (Object next : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C06750aI.A1A();
                throw null;
            }
            C115286uo r2 = (C115286uo) next;
            Modifier A09 = AnonymousClass7Kq.A09(A02, f5);
            C874352s r10 = AnonymousClass7G5.A00;
            Modifier A012 = C115826vy.A01(A09, r10);
            if (i3 > 0) {
                KtLambdaShape0S0000002_I2 ktLambdaShape0S0000002_I2 = new KtLambdaShape0S0000002_I2(6, f4, f6);
                C18200wM.A1S(A012, ktLambdaShape0S0000002_I2);
                A012 = A012.Cx6(new DrawWithContentElement(ktLambdaShape0S0000002_I2));
            }
            C97846Dc.A00(r15, (Alignment) null, AnonymousClass7Ac.A02(A012, r10, (float) 0.5d, C120537Bh.A00(r15).A0W), (C104136bI) null, r2, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            i3 = i4;
        }
        AnonymousClass7W3.A0f(r3);
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8Rg(list2, f5, f2, f4, i, i2));
        }
    }
}
