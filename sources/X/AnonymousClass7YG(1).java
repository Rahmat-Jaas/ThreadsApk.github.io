package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7YG  reason: invalid class name */
public abstract class AnonymousClass7YG implements C147778pt {
    public int A00;
    public int A01;
    public AnonymousClass7YG A02;
    public AnonymousClass7YG A03 = this;
    public AnonymousClass7YG A04;
    public AnonymousClass7YN A05;
    public AnonymousClass54T A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public final void A04() {
        if (this instanceof C875353d) {
            C875353d r2 = (C875353d) this;
            AnonymousClass6Av r1 = r2.A00;
            if (r1 == AnonymousClass6Av.Active || r1 == AnonymousClass6Av.Captured) {
                ((C123407Wu) ((AndroidComposeView) C121847Ik.A03(r2)).A0Q).ADB(true, true);
            } else if (r1 == AnonymousClass6Av.ActiveParent) {
                r2.A08();
                r2.A00 = AnonymousClass6Av.Inactive;
            } else if (r1 == AnonymousClass6Av.Inactive) {
                r2.A08();
            }
        }
    }

    public final void A05() {
        if (!this.A08) {
            throw C18180wK.A0a("Check failed.");
        } else if (this.A06 != null) {
            if (this instanceof AnonymousClass53X) {
                AnonymousClass53X.A01((AnonymousClass53X) this);
            } else if (this instanceof C875053a) {
                C875053a r1 = (C875053a) this;
                r1.A00.A00.A0E(r1);
            }
            this.A08 = false;
        } else {
            throw C18180wK.A0a("Check failed.");
        }
    }
}
