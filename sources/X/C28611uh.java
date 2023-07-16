package X;

import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;

/* renamed from: X.1uh  reason: invalid class name and case insensitive filesystem */
public final class C28611uh extends C37354Jq3 {
    public AnonymousClass2BF A00;
    public boolean A01;

    public final void A0L(C81684oC r5) {
        C04220Ms.A0B(r5, 0);
        if (r5 instanceof KSH) {
            C18210wN.A0l(C71694Ju.class);
            throw new NullPointerException(QuickExperimentDumperPlugin.CLEAR_CMD);
        }
        AnonymousClass19S r0 = null;
        if (r5 instanceof C71694Ju) {
            if (this.A01) {
                throw new NullPointerException("getValue");
            }
        } else if (r5 instanceof C71684Jt) {
            AnonymousClass2BF r1 = this.A00;
            if (r1 != null) {
                r1.A00.CEA(r1.A01);
            }
            this.A00 = null;
        } else if (r5 instanceof C38245KSe) {
            AnonymousClass19S r12 = (AnonymousClass19S) this.A01;
            if (r12 != null) {
                r0 = new AnonymousClass19S(r12.A01, r12.A02, ((C38245KSe) r5).A00);
            }
            A0K(r0);
        }
    }

    public final /* bridge */ /* synthetic */ C39586KwJ A0I() {
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0J(C81664oA r6) {
        AnonymousClass19P r62 = (AnonymousClass19P) r6;
        C04220Ms.A0B(r62, 0);
        boolean z = r62.A00;
        if (!z || this.A01 || (r62.A01 && !C63803iN.A0E(AnonymousClass0TJ.A06, (C10300i6) null, 36315872633228147L))) {
            this.A01 = z;
            return;
        }
        throw new NullPointerException("getValue");
    }

    public final AnonymousClass0W7[] A0O() {
        return new AnonymousClass0W7[]{C18210wN.A0l(KSG.class), C18210wN.A0l(KSH.class), C18210wN.A0l(C71694Ju.class), C18210wN.A0l(C71684Jt.class), C18210wN.A0l(C38245KSe.class)};
    }
}
