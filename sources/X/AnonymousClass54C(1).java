package X;

import java.util.List;

/* renamed from: X.54C  reason: invalid class name */
public final class AnonymousClass54C extends C104156bK {
    public Integer A00 = AnonymousClass006.A00;
    public final /* synthetic */ AnonymousClass7XO A01;

    public AnonymousClass54C(AnonymousClass7XO r2) {
        this.A01 = r2;
    }

    public static final void A00(C109656kM r6, AnonymousClass54C r7) {
        boolean z;
        List list = r6.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (C86124wJ.A0P(list, i).A02()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (r7.A00 == AnonymousClass006.A01) {
                C146508mM r2 = r7.A00;
                if (r2 != null) {
                    C98206Ep.A00(r6, C86154wM.A10(r7.A01, 27), r2.Bb0(AnonymousClass7KC.A03), true);
                } else {
                    throw C18180wK.A0a("layoutCoordinates not set");
                }
            }
            r7.A00 = AnonymousClass006.A0C;
            return;
        }
        C146508mM r22 = r7.A00;
        if (r22 != null) {
            long Bb0 = r22.Bb0(AnonymousClass7KC.A03);
            AnonymousClass7XO r3 = r7.A01;
            C98206Ep.A00(r6, C86164wN.A11(r3, r7, 10), Bb0, false);
            if (r7.A00 == AnonymousClass006.A01) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C86124wJ.A0P(list, i2).A01();
                }
                C112316pN r1 = r6.A02;
                if (r1 != null) {
                    r1.A00 = !r3.A02;
                    return;
                }
                return;
            }
            return;
        }
        throw C18180wK.A0a("layoutCoordinates not set");
    }
}
