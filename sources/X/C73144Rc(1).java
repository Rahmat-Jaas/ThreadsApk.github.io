package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.4Rc  reason: invalid class name and case insensitive filesystem */
public final class C73144Rc implements Runnable {
    public final /* synthetic */ AnonymousClass1U1 A00;
    public final /* synthetic */ C22761Zj A01;

    public C73144Rc(AnonymousClass1U1 r1, C22761Zj r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        Bundle bundle;
        AnonymousClass1U1 r2 = this.A00;
        C22761Zj r4 = this.A01;
        r4.A00 = r2.A00();
        if (!r4.requireArguments().getBoolean("skip_landing_screen") && !r2.A08 && !r2.A07) {
            ViewStub viewStub = r4.A02;
            if (viewStub != null) {
                if (viewStub.getParent() != null) {
                    ViewStub viewStub2 = r4.A02;
                    if (viewStub2 != null) {
                        View inflate = viewStub2.inflate();
                        if (inflate != null) {
                            inflate.setVisibility(0);
                            IgdsHeadline A0S = C18240wQ.A0S(inflate, R.id.two_factor_headline);
                            A0S.A08(R.drawable.ig_illustrations_illo_2fac_off, false);
                            A0S.setHeadline(2131837082);
                            A0S.setBody(2131837081);
                            A0S.A09((View.OnClickListener) r4.A05.getValue(), 2131837083);
                            C18230wP.A0W(inflate, R.id.start_bottom_button).setPrimaryActionOnClickListener((View.OnClickListener) r4.A06.getValue());
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            C04220Ms.A0E("successViewStub");
            throw null;
        } else if (r4.isResumed() && (bundle = r4.A00) != null) {
            bundle.putBoolean("direct_launch_backup_codes", C62653aT.A00(r4).getBoolean("direct_launch_backup_codes"));
            C29231xY r22 = new C29231xY();
            C25786Drz A0Q = C18180wK.A0Q(C18210wN.A0F(bundle, r22, r4), AnonymousClass0wJ.A0U(r4.A07));
            A0Q.A03 = r22;
            A0Q.A07 = C63833iQ.A07(446, 41, 85);
            A0Q.A05();
        }
    }
}
