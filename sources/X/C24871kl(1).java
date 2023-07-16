package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1kl  reason: invalid class name and case insensitive filesystem */
public final class C24871kl extends AnonymousClass1lO {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C24871kl(FragmentActivity fragmentActivity, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final Class modelClass() {
        return AnonymousClass48K.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass48K r12 = (AnonymousClass48K) mfV;
        AnonymousClass13R r13 = (AnonymousClass13R) m5o;
        AnonymousClass0wJ.A1N(r12, r13);
        Context A0B = C18240wQ.A0B(r13);
        r13.A03.setText(r12.A01);
        r13.A01.setText(2131837592);
        r13.A00.setText(r12.A00);
        UserSession userSession = this.A01;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36314837546567872L)) {
            String A0k = AnonymousClass0wJ.A0k(A0B, 2131837596);
            FragmentActivity fragmentActivity = this.A00;
            TextView textView = r13.A02;
            String A0l = AnonymousClass0wJ.A0l(A0B, A0k, 2131837595);
            C04220Ms.A06(A0l);
            C171209wF r7 = C171209wF.A1m;
            C04220Ms.A0B(textView, 3);
            C04220Ms.A0B(r7, 7);
            AnonymousClass3Zw.A03(new C18710xj(fragmentActivity, userSession, r7, "https://help.instagram.com/907314980182940", C23431dp.__redex_internal_original_name, (AnonymousClass0ZU) null), textView, A0k, A0l);
            return;
        }
        r13.A02.setText(AnonymousClass0wJ.A0l(A0B, "", 2131837595));
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass13R(C18200wM.A0F(layoutInflater, viewGroup, R.layout.user_pay_earnings_header, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
