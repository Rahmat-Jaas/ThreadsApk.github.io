package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.instagram.service.session.UserSession;

/* renamed from: X.4AZ  reason: invalid class name */
public final class AnonymousClass4AZ implements C82444pd {
    public final /* synthetic */ C26218E4i A00;

    public AnonymousClass4AZ(C26218E4i e4i) {
        this.A00 = e4i;
    }

    public final void BlU(AnonymousClass252 r7) {
        int i;
        Drawable A01;
        C26218E4i e4i = this.A00;
        e4i.A07 = r7;
        if (!(e4i.A01 == null || (A01 = C59573Li.A01(e4i.A0F.requireContext(), e4i.A07, true)) == null)) {
            e4i.A01.setImageDrawable(A01);
        }
        TextView textView = e4i.A02;
        if (textView != null) {
            C18180wK.A10(textView, e4i.A0F, C59573Li.A00(e4i.A0O, e4i.A07, true));
        }
        UserSession userSession = e4i.A0O;
        if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36325235662005252L)) {
            C63733iD A012 = C63733iD.A01();
            Resources A0B = AnonymousClass0wJ.A0B(e4i.A0F);
            switch (r7.ordinal()) {
                case 0:
                    i = 2131828662;
                    break;
                case 1:
                    i = 2131828659;
                    break;
                case 2:
                    i = 2131828667;
                    break;
                case 3:
                    i = 2131828650;
                    break;
                case 4:
                    i = 2131828652;
                    break;
                case 5:
                    i = 2131828655;
                    break;
                default:
                    throw new UnsupportedOperationException("Cannot get title for unsupported audience mode");
            }
            A012.A0A = A0B.getString(i);
            C63733iD.A09(C38040KHr.A01, A012);
        }
    }
}
