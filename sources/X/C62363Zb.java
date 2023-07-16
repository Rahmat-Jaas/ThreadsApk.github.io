package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape5S1300000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.3Zb  reason: invalid class name and case insensitive filesystem */
public final class C62363Zb {
    public static final void A02(Context context, FragmentActivity fragmentActivity, C11630kW r14, BKU bku, UserSession userSession) {
        Integer num;
        String str;
        C04220Ms.A0B(r14, 3);
        BKU bku2 = bku;
        boolean A4R = bku.A4R();
        BKN bkn = bku.A0f;
        AnonymousClass18N r0 = bkn.A05;
        if (r0 != null && (num = r0.A00) != null) {
            int intValue = num.intValue();
            C28991Ffc Aup = bku.Aup();
            if (Aup != null) {
                int i = Aup.A00;
                AnonymousClass18N r02 = bkn.A05;
                if (r02 != null && (str = r02.A01) != null) {
                    UserSession userSession2 = userSession;
                    AnonymousClass3In r5 = new AnonymousClass3In(r14, userSession2, AnonymousClass006.A05);
                    C58963Iu r2 = new C58963Iu(userSession2);
                    int i2 = 2131824373;
                    if (A4R) {
                        i2 = 2131824374;
                    }
                    FragmentActivity fragmentActivity2 = fragmentActivity;
                    r2.A03(new C64613rD(fragmentActivity, bku, userSession2, i), i2);
                    r2.A03(new C64703rW(fragmentActivity2, r5, bku2, userSession2, str, intValue, A4R), 2131824378);
                    Context context2 = context;
                    BKU bku3 = bku;
                    UserSession userSession3 = userSession2;
                    String str2 = str;
                    r2.A03(new IDxCListenerShape5S1300000_1_I2(bku3, context2, userSession3, str2, 0), 2131824390);
                    r2.A01(new C64653rM(context2, bku2, userSession3, str2, A4R), 2131824870);
                    new C62763ag(r2).A02(fragmentActivity2);
                }
            }
        }
    }

    public static final boolean A03(UserSession userSession, boolean z) {
        AnonymousClass0TJ r2;
        C04220Ms.A0B(userSession, 0);
        if (!C63483hZ.A07(userSession)) {
            return false;
        }
        if (z) {
            r2 = AnonymousClass0TJ.A05;
        } else {
            r2 = AnonymousClass0TJ.A06;
        }
        return C63803iN.A0E(r2, userSession, 36319965736867365L);
    }

    public static final C19233Asv A00(Context context, String str, String str2, String str3) {
        boolean A1Z = AnonymousClass0wJ.A1Z(context, str);
        AnonymousClass0wJ.A1Q(str2, str3);
        IgFragmentFactoryImpl.A00();
        C19233Asv asv = new C19233Asv();
        asv.A03 = "SCHEDULED_CONTENT";
        asv.A04 = context.getString(2131824384);
        asv.A05 = str;
        asv.A08 = C06750aI.A14(str);
        asv.A06 = str2;
        asv.A02 = str3;
        asv.A09 = A1Z;
        return asv;
    }

    public static final void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0r(true);
        A0W.A0L(2131824389);
        A0W.A0K(2131824386);
        A0W.A0P(onClickListener, 2131824387);
        A0W.A0O(onClickListener2, 2131824388);
        AnonymousClass0wJ.A1K(A0W);
    }
}
