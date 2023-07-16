package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2;
import com.instagram.barcelona.R;
import com.instagram.user.model.User;

/* renamed from: X.2Jc  reason: invalid class name and case insensitive filesystem */
public final class C34322Jc {
    public static final void A00(KtCSuperShape0S0120000_I2 ktCSuperShape0S0120000_I2, C82194pE r8, AnonymousClass3Fb r9, User user) {
        C04220Ms.A0B(ktCSuperShape0S0120000_I2, 1);
        AnonymousClass0wJ.A1Q(user, r8);
        if (!ktCSuperShape0S0120000_I2.A02 || !user.equals(ktCSuperShape0S0120000_I2.A00)) {
            C09860go.A0J(r9.A00());
            return;
        }
        View A00 = r9.A00();
        Resources resources = r9.A00().getResources();
        int i = 2131822644;
        if (ktCSuperShape0S0120000_I2.A01) {
            i = 2131822645;
        }
        C04530Oa r1 = r9.A01;
        String A0h = C18190wL.A0h(resources, r1.getValue(), i);
        C04220Ms.A06(A0h);
        String A0q = C18200wM.A0q(r1);
        SpannableStringBuilder A0E = C18200wM.A0E(A0h);
        C18720xk.A00(A0E, r8, A0q, A00.getContext().getColor(R.color.igds_icon_on_color), 1);
        C04530Oa r12 = r9.A02;
        C18180wK.A0z((TextView) r12.getValue());
        ((TextView) r12.getValue()).setText(A0E);
        r9.A00().setVisibility(0);
    }
}
