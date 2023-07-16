package androidx.compose.ui;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass7Kq;
import X.C04220Ms;
import X.C123327Wm;
import X.C147188nY;
import androidx.compose.ui.draw.DrawWithContentElement;

public interface Modifier {
    public static final C123327Wm A00 = C123327Wm.A00;

    static Modifier A06(Modifier modifier, Modifier modifier2) {
        C04220Ms.A0B(modifier, 0);
        return modifier.Cx6(modifier2);
    }

    static Modifier A08(Modifier modifier, AnonymousClass0YY r2) {
        C04220Ms.A0B(r2, 1);
        return modifier.Cx6(new DrawWithContentElement(r2));
    }

    boolean A8A(AnonymousClass0YY r1);

    Object ANM(Object obj, AnonymousClass0YP r2);

    Modifier Cx6(Modifier modifier);

    static Modifier A04(Modifier modifier) {
        return modifier.Cx6(AnonymousClass7Kq.A02);
    }

    static Modifier A05(Modifier modifier) {
        return modifier.Cx6(AnonymousClass7Kq.A01);
    }

    static C123327Wm A00(C147188nY r1) {
        r1.Cvb(-483455358);
        return A00;
    }

    static C123327Wm A01(C147188nY r1) {
        r1.Cvb(733328855);
        return A00;
    }

    static C123327Wm A02(C147188nY r0, int i) {
        r0.Cvb(i);
        return A00;
    }

    static Modifier A03(C147188nY r0, Modifier modifier, Modifier modifier2, int i) {
        r0.Cvb(i);
        return modifier.Cx6(modifier2);
    }

    static Modifier A07(Modifier modifier, Modifier modifier2, Modifier modifier3) {
        return modifier.Cx6(modifier2).Cx6(modifier3);
    }
}
