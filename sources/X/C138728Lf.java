package X;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;

/* renamed from: X.8Lf  reason: invalid class name and case insensitive filesystem */
public final class C138728Lf extends C02220Ah implements AnonymousClass0YY {
    public static final C138728Lf A00 = new C138728Lf();

    public C138728Lf() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass54T r6 = (AnonymousClass54T) obj;
        C04220Ms.A0B(r6, 0);
        if (r6.BZg()) {
            C111066mj r2 = r6.A04;
            if (r2 == null) {
                AnonymousClass54T.A06(r6);
            } else {
                C111066mj r3 = AnonymousClass54T.A0K;
                r3.A04 = r2.A04;
                r3.A05 = r2.A05;
                r3.A06 = r2.A06;
                r3.A07 = r2.A07;
                r3.A01 = r2.A01;
                r3.A02 = r2.A02;
                r3.A03 = r2.A03;
                r3.A00 = r2.A00;
                r3.A08 = r2.A08;
                AnonymousClass54T.A06(r6);
                if (!(r3.A04 == r2.A04 && r3.A05 == r2.A05 && r3.A06 == r2.A06 && r3.A07 == r2.A07 && r3.A01 == r2.A01 && r3.A02 == r2.A02 && r3.A03 == r2.A03 && r3.A00 == r2.A00 && r3.A08 == r2.A08)) {
                    AnonymousClass7Y3 r22 = r6.A0H;
                    C113976sU r1 = r22.A0Y;
                    if (r1.A00 > 0) {
                        r1.A08.A0F();
                    }
                    C147098nO r12 = r22.A0A;
                    if (r12 != null) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) r12;
                        androidComposeView.A0X.A05.A00.A0C(r22);
                        r22.A0O = true;
                        if (!androidComposeView.isLayoutRequested() && androidComposeView.isAttachedToWindow()) {
                            if (androidComposeView.getWidth() == 0 || androidComposeView.getHeight() == 0) {
                                androidComposeView.requestLayout();
                            } else {
                                androidComposeView.invalidate();
                            }
                        }
                    }
                }
            }
        }
        return Unit.A00;
    }
}
