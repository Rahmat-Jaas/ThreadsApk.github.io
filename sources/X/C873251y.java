package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.51y  reason: invalid class name and case insensitive filesystem */
public final class C873251y extends PopupWindow implements C27927Evd {
    public final Context A00;
    public final C11630kW A01;
    public final BKU A02;
    public final UserSession A03;
    public final Integer A04;
    public final ArrayList A05 = AnonymousClass0wJ.A0v();

    public final void CLg(C25812DsR dsR) {
        C04220Ms.A0B(dsR, 0);
        if (dsR.A01 == 0.0d) {
            dismiss();
            throw C18250wR.A0V("Redex: Unreachable code after no-return invoke");
        }
        Iterator it = this.A05.iterator();
        if (it.hasNext()) {
            it.next();
            throw C18210wN.A0W("saveOriginalImagePosition");
        }
    }

    public final void CLh(C25812DsR dsR) {
    }

    public final void CLi(C25812DsR dsR) {
        C04220Ms.A0B(dsR, 0);
        float f = (float) dsR.A09.A00;
        double d = dsR.A01;
        if (d == 0.0d || d == 1.0d) {
            Integer num = this.A04;
            if (num == AnonymousClass006.A0C || num == AnonymousClass006.A00 || num == AnonymousClass006.A01) {
                C04220Ms.A0C(AnonymousClass7L4.A01(f, 0, 0), "null cannot be cast to non-null type kotlin.Int");
            }
            throw C18210wN.A0W("setAlpha");
        }
    }

    public final void CLf(C25812DsR dsR) {
        throw C18210wN.A0W("getX");
    }

    public C873251y(Context context, C11630kW r3, BKU bku, UserSession userSession, Integer num) {
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = bku;
        this.A04 = num;
        this.A01 = r3;
        C04220Ms.A0E("instance");
        throw null;
    }

    public final void dismiss() {
        super.dismiss();
        this.A05.clear();
        C04220Ms.A0E("spring");
        throw null;
    }
}
