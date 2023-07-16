package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7;

/* renamed from: X.60S  reason: invalid class name */
public final class AnonymousClass60S extends AnonymousClass1lO {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final AnonymousClass0ZU A02;

    public AnonymousClass60S(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass0ZU r4) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r4;
    }

    public final Class modelClass() {
        return AnonymousClass5MI.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass5MI r12 = (AnonymousClass5MI) mfV;
        C88995Bm r13 = (C88995Bm) m5o;
        AnonymousClass0wJ.A1N(r12, r13);
        r13.A01.setText(r12.A01);
        r13.A02.setText(r12.A00);
        Context context = r13.A00.getContext();
        String A0k = AnonymousClass0wJ.A0k(context, 2131821423);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        TextView textView = r13.A03;
        String A0l = AnonymousClass0wJ.A0l(context, A0k, 2131821369);
        C04220Ms.A06(A0l);
        C171209wF r7 = C171209wF.A0k;
        KtLambdaShape27S0100000_I2_7 ktLambdaShape27S0100000_I2_7 = new KtLambdaShape27S0100000_I2_7(this, 48);
        C04220Ms.A0B(textView, 3);
        AnonymousClass3Zw.A03(new C18710xj(fragmentActivity, userSession, r7, "https://help.instagram.com/3219033311670546", AnonymousClass5xc.__redex_internal_original_name, ktLambdaShape27S0100000_I2_7), textView, A0k, A0l);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C88995Bm(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_insights_header, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
