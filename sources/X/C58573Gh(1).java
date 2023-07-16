package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape420S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape48S0300000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3Gh  reason: invalid class name and case insensitive filesystem */
public final class C58573Gh {
    public final /* synthetic */ AnonymousClass1cR A00;

    public C58573Gh(AnonymousClass1cR r1) {
        this.A00 = r1;
    }

    public final void A00() {
        IDxCListenerShape48S0300000_1_I2 A0E;
        AnonymousClass1cR r4 = this.A00;
        UserSession userSession = r4.A06;
        C62383Zj.A01(AnonymousClass2A9.A07, AnonymousClass2A8.A04, userSession);
        C13330nS A02 = C13330nS.A02(r4.A06);
        long currentTimeMillis = System.currentTimeMillis();
        double A002 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A02, "register_avatar_clicked"), 2619);
        AnonymousClass0wJ.A1A(A0I, (double) currentTimeMillis, A002);
        AnonymousClass269.A05(A0I);
        A0I.A0T("app_device_id", C63683i7.A00());
        C18230wP.A1F(A0I, currentTimeMillis);
        C63683i7.A08(A0I);
        A0I.A0Q("is_internal_build", C18180wK.A0X());
        A0I.A0Q("is_standalone", Boolean.valueOf(r4.A09));
        C18240wQ.A15(A0I, "register_flow_add_profile_photo");
        C63683i7.A09(A0I, r4.A06);
        C18200wM.A1K(A0I, A002);
        C18190wL.A1I(A0I, "profile_photo");
        A0I.Bb4();
        C69794Ai r6 = r4.A01;
        Context context = r4.getContext();
        boolean A1W = AnonymousClass0wJ.A1W(r4.A00);
        Bundle bundle = r4.A05.A00.mArguments;
        if (bundle != null) {
            bundle.getBoolean("IS_SIGN_UP_FLOW");
        }
        boolean A022 = AnonymousClass3X6.A00.A02(r4.mArguments);
        AnonymousClass35U r2 = new AnonymousClass35U(this);
        IDxCListenerShape420S0100000_1_I2 iDxCListenerShape420S0100000_1_I2 = new IDxCListenerShape420S0100000_1_I2(this, 4);
        if (r6.A02 != null) {
            r6.A06 = A1W;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            A0v.add(context.getString(2131828973));
            A0v.add(context.getString(2131836608));
            A0v.add(context.getString(2131823285));
            if (r6.A06) {
                A0v.add(context.getString(2131834717));
            }
            CharSequence[] charSequenceArr = new CharSequence[A0v.size()];
            r6.A07 = charSequenceArr;
            A0v.toArray(charSequenceArr);
            CharSequence[] charSequenceArr2 = r6.A07;
            if (A022) {
                A0E = C18250wR.A0E(r6, context, r2, 5);
            } else {
                A0E = C18250wR.A0E(r6, context, r2, 4);
            }
            C25828Dsm A0W = C18190wL.A0W(r6.A02.requireActivity());
            int i = 2131823223;
            if (A1W) {
                i = 2131823224;
            }
            A0W.A0L(i);
            A0W.A0j(r6.A02, r6.A03);
            A0W.A0d(A0E, charSequenceArr2);
            A0W.A0r(true);
            A0W.A0M(iDxCListenerShape420S0100000_1_I2);
            AnonymousClass0wJ.A1K(A0W);
        }
    }

    public final void A01(boolean z) {
        AnonymousClass1cR r2 = this.A00;
        C002801h.A02(r2.A03, "Complete action is null.");
        if (r2.A02.A05) {
            r2.A03.A8p(Boolean.valueOf(z));
        }
        AnonymousClass1cR.A02(r2, true);
    }
}
