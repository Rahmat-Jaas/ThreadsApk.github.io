package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.widget.ImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Fi  reason: invalid class name and case insensitive filesystem */
public final class C58393Fi {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final C19818BBs A03;

    public final void A00(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass3TC r0;
        String str7 = str5;
        C04220Ms.A0B(str7, 4);
        ImageView imageView = this.A03.A00;
        if (imageView != null) {
            boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, this.A00, 36315224093493724L);
            Rect bounds = imageView.getDrawable().getBounds();
            C04220Ms.A06(bounds);
            Context context = imageView.getContext();
            C04220Ms.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            C04220Ms.A06(context);
            String str8 = str;
            C25553Dnn dnn = new C25553Dnn((Activity) context, new C26401qa(context, str));
            dnn.A02(imageView, 0, bounds.height() >> 1, true);
            dnn.A03(D0f.BELOW_ANCHOR);
            dnn.A0D = true;
            if (A0E) {
                r0 = AnonymousClass3TC.A05;
            } else {
                r0 = AnonymousClass3TC.A06;
            }
            dnn.A04(r0);
            dnn.A05 = new AnonymousClass625(imageView, this, str2, str7, str3, str6, str4, str8);
            dnn.A0A = true;
            C18200wM.A1Q(dnn);
        }
    }

    public C58393Fi(UserSession userSession, C19818BBs bBs, String str, String str2) {
        this.A03 = bBs;
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }
}
