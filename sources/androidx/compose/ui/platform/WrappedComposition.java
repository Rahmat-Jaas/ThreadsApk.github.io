package androidx.compose.ui.platform;

import X.AnonymousClass060;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.AnonymousClass0YP;
import X.AnonymousClass304;
import X.C04220Ms;
import X.C14260p5;
import X.C146068la;
import X.C86164wN;
import com.instagram.barcelona.R;

public final class WrappedComposition implements C146068la, C14260p5 {
    public AnonymousClass062 A00;
    public AnonymousClass0YP A01 = AnonymousClass304.A00;
    public boolean A02;
    public final C146068la A03;
    public final AndroidComposeView A04;

    public final void CMI(AnonymousClass060 r2, AnonymousClass066 r3) {
        C04220Ms.A0B(r2, 1);
        if (r2 == AnonymousClass060.ON_DESTROY) {
            dispose();
        } else if (r2 == AnonymousClass060.ON_CREATE && !this.A02) {
            CjK(this.A01);
        }
    }

    public final void CjK(AnonymousClass0YP r3) {
        C04220Ms.A0B(r3, 0);
        this.A04.setOnViewTreeOwnersAvailable(C86164wN.A11(this, r3, 16));
    }

    public final boolean Alt() {
        return this.A03.Alt();
    }

    public final boolean BSt() {
        return this.A03.BSt();
    }

    public final void dispose() {
        if (!this.A02) {
            this.A02 = true;
            this.A04.setTag(R.id.wrapped_composition_tag, (Object) null);
            AnonymousClass062 r0 = this.A00;
            if (r0 != null) {
                r0.A08(this);
            }
        }
        this.A03.dispose();
    }

    public WrappedComposition(C146068la r2, AndroidComposeView androidComposeView) {
        this.A04 = androidComposeView;
        this.A03 = r2;
    }
}
