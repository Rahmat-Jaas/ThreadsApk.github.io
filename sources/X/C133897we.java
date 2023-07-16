package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.7we  reason: invalid class name and case insensitive filesystem */
public final class C133897we implements C83724rs {
    public final /* synthetic */ C131497s9 A00;

    public final void C1l(C121247Ez r6, C57253Ai r7) {
        C131497s9 r3 = this.A00;
        C131497s9.A00(r3);
        FrameLayout frameLayout = r3.A00;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        r3.A02 = r6;
        LLF llf = r3.A01;
        if (llf != null) {
            llf.setVisibility(8);
            C121247Ez r0 = r3.A02;
            if (r0 != null) {
                r0.A06(llf);
            }
            llf.measure(C86134wK.A04(C09860go.A08(llf.getContext())), View.MeasureSpec.makeMeasureSpec(0, 0));
            llf.setTranslationY((float) llf.getMeasuredHeight());
            llf.setVisibility(0);
        }
        C25812DsR dsR = r3.A03;
        dsR.A09(-1.0d);
        dsR.A0A(0.0d);
        r7.A02.CEB(r7.A01);
    }

    public C133897we(C131497s9 r1) {
        this.A00 = r1;
    }

    public final void C54(String str) {
        C86154wM.A1H(this.A00.A00);
    }
}
