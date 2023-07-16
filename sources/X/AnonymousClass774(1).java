package X;

import com.instagram.compose.ui.bouncy.BouncyClickableState$updateAnimation$1;

/* renamed from: X.774  reason: invalid class name */
public final class AnonymousClass774 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass7JH A03 = AnonymousClass6DU.A00(1.0f);
    public final C81784oM A04;
    public final C81784oM A05;
    public final C81784oM A06;
    public final C81784oM A07;
    public final C81784oM A08;
    public final C81784oM A09;
    public final C83224qz A0A;

    public static final void A00(AnonymousClass774 r6) {
        boolean z;
        float A002;
        if (r6.A01 || r6.A00) {
            z = true;
            A002 = C18240wQ.A00(r6.A07.getValue());
        } else {
            z = false;
            A002 = 1.0f;
        }
        AnonymousClass7JH r1 = r6.A03;
        if (C18240wQ.A00(r1.A0A.getValue()) != A002) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new BouncyClickableState$updateAnimation$1(r6, (C146958n9) null, A002, z), r6.A0A, 3);
        } else if (!C86104wH.A1X(r1.A09) && r6.A00) {
            r6.A00 = false;
            A00(r6);
            C18240wQ.A1G(r6.A06.getValue());
        }
    }

    public AnonymousClass774(C81784oM r2, C81784oM r3, C81784oM r4, C81784oM r5, C81784oM r6, C81784oM r7, C83224qz r8) {
        this.A0A = r8;
        this.A07 = r2;
        this.A08 = r3;
        this.A09 = r4;
        this.A05 = r5;
        this.A04 = r6;
        this.A06 = r7;
    }
}
