package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.46l  reason: invalid class name and case insensitive filesystem */
public final class C690246l implements C82394pY {
    public final /* synthetic */ AnonymousClass1aA A00;

    public C690246l(AnonymousClass1aA r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        String str;
        String str2;
        int A03 = C14030oh.A03(568315871);
        AnonymousClass45S r9 = (AnonymousClass45S) obj;
        int A032 = C14030oh.A03(867191998);
        AnonymousClass1aA r6 = this.A00;
        Bundle bundle = r6.mArguments;
        if (!(bundle == null || bundle.getString("PHONE_NUMBER") == null)) {
            Bundle bundle2 = r6.mArguments;
            if (bundle2 != null) {
                str = bundle2.getString("PHONE_NUMBER");
            } else {
                str = null;
            }
            if (str.equals(r9.A02)) {
                UserSession userSession = r6.A0E;
                userSession.getClass();
                C38039KHq A002 = AnonymousClass3LY.A00(userSession);
                Context requireContext = r6.requireContext();
                C05030Qo.A04(r6.A0E);
                Bundle bundle3 = r6.mArguments;
                if (bundle3 != null) {
                    str2 = bundle3.getString("PHONE_NUMBER");
                } else {
                    str2 = null;
                }
                A002.CWx(new AnonymousClass46Y(requireContext, str2));
                C82654q3 r0 = (C82654q3) r6.getTargetFragment();
                if (r0 == null || !r0.BNR()) {
                    C18180wK.A12(r6);
                }
                i = -1180807015;
                C14030oh.A0A(i, A032);
                C14030oh.A0A(-1126752921, A03);
            }
        }
        i = 867291248;
        C14030oh.A0A(i, A032);
        C14030oh.A0A(-1126752921, A03);
    }
}
