package X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObjectShape277S0100000_1_I2;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.service.session.UserSession;
import java.util.Set;

/* renamed from: X.1k1  reason: invalid class name */
public abstract class AnonymousClass1k1 extends C19819BBt implements C28129Ez0 {
    public boolean A00;
    public final FragmentActivity A01;
    public final C34640IcN A02;
    public final BusinessFlowAnalyticsLogger A03;
    public final UserSession A04;
    public final Set A05 = C18200wM.A0u();
    public final C82394pY A06 = new IDxObjectShape277S0100000_1_I2(this, 1);

    public abstract void A00();

    public abstract void A01();

    public final void C6z(C24901Dbu dbu) {
    }

    public final void Bsd(View view) {
        AnonymousClass3LY.A00(this.A04).A01(this.A06, AnonymousClass46R.class);
    }

    public final void C6y(DY6 dy6, C24901Dbu dbu) {
        FragmentActivity activity;
        if (I17.A00(134).equals(dy6.A02)) {
            C09660ft.A00(this.A02.requireContext());
            A01();
        } else {
            Integer num = dy6.A01;
            if (num != AnonymousClass006.A01) {
                String str = dy6.A06;
                if (num == AnonymousClass006.A00 && !TextUtils.isEmpty(str)) {
                    Intent A0B = C18190wL.A0B(str);
                    C34640IcN icN = this.A02;
                    if (icN.isAdded() && (activity = icN.getActivity()) != null) {
                        C10650ih.A02(activity, A0B);
                    }
                } else {
                    return;
                }
            }
        }
        Integer num2 = dy6.A01;
        Integer num3 = AnonymousClass006.A01;
        if (num2 == num3) {
            A01();
        }
        String str2 = dy6.A02;
        if (str2 != null) {
            num3 = C25150Dgj.A00(str2);
        } else if (dy6.A01 == num3) {
            num3 = AnonymousClass006.A0C;
        }
        C25263Dik.A00(dbu, this.A04, num3, AnonymousClass006.A0Y);
    }

    public final void onDestroyView() {
        AnonymousClass3LY.A00(this.A04).A02(this.A06, AnonymousClass46R.class);
    }

    public final void onPause() {
        this.A05.clear();
    }

    public AnonymousClass1k1(FragmentActivity fragmentActivity, C34640IcN icN, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A02 = icN;
        this.A04 = userSession;
        this.A00 = AnonymousClass0wJ.A0Y(userSession).Apo();
        BusinessFlowAnalyticsLogger A012 = C37076Jk8.A01(C311924p.CONVERSION_FLOW, userSession, icN.getModuleName(), (String) null);
        A012.getClass();
        this.A03 = A012;
    }

    public final void C70(C24901Dbu dbu) {
        A01();
        C25263Dik.A00(dbu, this.A04, AnonymousClass006.A0C, AnonymousClass006.A0Y);
    }
}
