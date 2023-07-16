package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2;

/* renamed from: X.3FP  reason: invalid class name */
public final class AnonymousClass3FP {
    public final Context A00;
    public final C11630kW A01;
    public final UserSession A02;

    public AnonymousClass3FP(Context context, C11630kW r2, UserSession userSession) {
        AnonymousClass0wJ.A1O(context, userSession);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void A00(KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2, AnonymousClass12D r10) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r10, ktCSuperShape0S0100000_I2);
        UserSession userSession = this.A02;
        Context context = this.A00;
        C11630kW r7 = this.A01;
        TextView textView = r10.A00;
        int i = 2131830244;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36317917037465645L)) {
            i = 2131830245;
        }
        SpannableStringBuilder A0E = C18200wM.A0E(context.getString(i));
        A0E.setSpan(new IDxCSpanShape63S0200000_1_I2(C18210wN.A01(context), 4, (Object) r7, (Object) ktCSuperShape0S0100000_I2), A1Y ? 1 : 0, A0E.length(), 18);
        C18180wK.A0z(textView);
        C18230wP.A16(textView, context);
        textView.setText(C18190wL.A0D(context.getString(2131824193), A0E));
        C18210wN.A0y(textView);
    }
}
