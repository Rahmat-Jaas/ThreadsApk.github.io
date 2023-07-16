package X;

import android.view.View;

/* renamed from: X.4P6  reason: invalid class name */
public final class AnonymousClass4P6 implements Runnable {
    public final /* synthetic */ CTL A00;

    public AnonymousClass4P6(CTL ctl) {
        this.A00 = ctl;
    }

    public final void run() {
        CTL ctl = this.A00;
        if (ctl.getActivity() != null) {
            View view = ctl.A00;
            if (view != null) {
                int height = view.getHeight() >> 1;
                C25553Dnn A01 = AnonymousClass4DS.A01(ctl.requireActivity(), C18190wL.A0g(AnonymousClass0wJ.A0B(ctl), 2131828826));
                View view2 = ctl.A00;
                if (view2 != null) {
                    A01.A02(view2, 0, height, true);
                    A01.A03(D0f.BELOW_ANCHOR);
                    A01.A0A = true;
                    A01.A0D = true;
                    C18200wM.A1Q(A01);
                }
            }
            C04220Ms.A0E("toggleAspectRatioButton");
            throw null;
        }
        C04530Oa r2 = ctl.A08;
        AnonymousClass0wJ.A13(C28161tl.A03(AnonymousClass0wJ.A0X(r2)), "igtv_composer_aspect_ratio_nux_seen", true);
        C10300i6 A0U = AnonymousClass0wJ.A0U(r2);
        C04220Ms.A0B(A0U, 0);
        H1T A0O = AnonymousClass0wJ.A0O(A0U);
        A0O.A0J("nux/write_nux_type/");
        A0O.A0O("nux_type", "igtv_aspect_ratio");
        AnonymousClass0wJ.A0S(A0O).run();
    }
}
