package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2;
import com.facebook.redex.IDxCSpanShape1S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.60M  reason: invalid class name */
public final class AnonymousClass60M extends AnonymousClass1lO {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass60M(FragmentActivity fragmentActivity, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final Class modelClass() {
        return AnonymousClass5MJ.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass5MJ r13 = (AnonymousClass5MJ) mfV;
        AnonymousClass5BF r14 = (AnonymousClass5BF) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r13, r14);
        r14.A01.setText(r13.A01);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        TextView textView = r14.A00;
        String str = r13.A00;
        List<KtCSuperShape0S2200000_I2> list = r13.A02;
        C04220Ms.A0B(textView, 3);
        SpannableStringBuilder A0E = C18200wM.A0E(str);
        for (KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I2 : list) {
            String str2 = ktCSuperShape0S2200000_I2.A02;
            int A0I = AnonymousClass8bP.A0I(str, str2);
            if (A0I >= 0) {
                A0E.setSpan(new IDxCSpanShape1S0300000_1_I2(1, fragmentActivity, ktCSuperShape0S2200000_I2, userSession), A0I, AnonymousClass0hA.A01(str2) + A0I, 33);
            }
        }
        textView.setText(A0E);
        C18180wK.A0z(textView);
        textView.setHighlightColor(A1Y ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BF(C18180wK.A0D(layoutInflater, viewGroup, R.layout.appreciation_creator_insights_info_row, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
