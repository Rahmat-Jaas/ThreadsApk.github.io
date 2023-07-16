package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.common.api.base.IDxACallbackShape0S3100000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3iU  reason: invalid class name and case insensitive filesystem */
public abstract class C63873iU {
    public static C58933Ih A05(C58933Ih r2, Class cls, Class cls2, String str) {
        return r2.A00(cls, str).A00(cls2, "page");
    }

    public static IDxACallbackShape111S0100000_1_I2 A06(Object obj, int i) {
        return new IDxACallbackShape111S0100000_1_I2(obj, i);
    }

    public static AnonymousClass2L8 A07(AnonymousClass3XX r1) {
        Object obj = r1.A00;
        if (obj != null) {
            C04220Ms.A0A(obj);
            return new AnonymousClass1j9((C146578mT) obj);
        }
        Throwable th = r1.A01;
        C04220Ms.A0A(th);
        return new AnonymousClass1j8(th);
    }

    public static C28161tl A08(IDxACallbackShape111S0100000_1_I2 iDxACallbackShape111S0100000_1_I2) {
        return AnonymousClass3WS.A01((UserSession) iDxACallbackShape111S0100000_1_I2.A00);
    }

    public static String A09(AnonymousClass3XX r1, String str) {
        Object obj = r1.A00;
        if (obj != null) {
            AnonymousClass1j3 r12 = (AnonymousClass1j3) obj;
            if (!TextUtils.isEmpty(r12.getErrorMessage())) {
                return r12.getErrorMessage();
            }
        }
        return str;
    }

    public static void A0B(AnonymousClass0A3 r2, C10300i6 r3, String str) {
        r2.A0T("event_name", str);
        r2.A0T("ig_account_type", C04660Oo.A02(r3));
    }

    public static void A0C(C34640IcN icN, C32165H8c h8c, int i) {
        h8c.A00 = new IDxACallbackShape111S0100000_1_I2((Object) icN, i);
        icN.schedule(h8c);
    }

    public static void A0D(C32165H8c h8c, UserSession userSession, int i) {
        h8c.A00 = new IDxACallbackShape111S0100000_1_I2(userSession, i);
        C31155GhB.A03(h8c);
    }

    public static void A0E(C32165H8c h8c, Object obj, int i) {
        h8c.A00 = new IDxACallbackShape111S0100000_1_I2(obj, i);
    }

    public static void A0F(C32165H8c h8c, Object obj, Object obj2, int i) {
        h8c.A00 = new IDxACallbackShape35S0200000_1_I2(i, obj, obj2);
    }

    public static void A0G(IDxACallbackShape111S0100000_1_I2 iDxACallbackShape111S0100000_1_I2, AnonymousClass3XX r3) {
        AnonymousClass1aN r2 = (AnonymousClass1aN) iDxACallbackShape111S0100000_1_I2.A00;
        if (r2.isResumed()) {
            Context requireContext = r2.requireContext();
            r2.A0B.getValue();
            C62973bE.A02(requireContext, r3);
        }
    }

    public static void A0H(C38039KHq kHq, Integer num) {
        kHq.CWx(new AnonymousClass46F(num));
    }

    public static int A02(IDxACallbackShape0S3100000_1_I2 iDxACallbackShape0S3100000_1_I2, AnonymousClass3XX r7, int i) {
        int A03 = C14030oh.A03(i);
        AnonymousClass1cM r4 = (AnonymousClass1cM) iDxACallbackShape0S3100000_1_I2.A00;
        String A032 = C63483hZ.A03(r7, r4.getString(2131834837));
        AnonymousClass1cM.A08(r4, iDxACallbackShape0S3100000_1_I2.A03, iDxACallbackShape0S3100000_1_I2.A01, A032, C63483hZ.A00(r7));
        C63813iO.A0D(r4.getContext(), A032, 1);
        return A03;
    }

    public static int A03(IDxACallbackShape111S0100000_1_I2 iDxACallbackShape111S0100000_1_I2, int i) {
        int A03 = C14030oh.A03(i);
        E2V.A03(((Fragment) iDxACallbackShape111S0100000_1_I2.A00).getActivity()).setIsLoading(true);
        return A03;
    }

    public static int A04(C24431ij r1, Object obj, int i) {
        int A03 = C14030oh.A03(i);
        r1.A02((C26641qy) obj);
        return A03;
    }

    public static Throwable A0A(Fragment fragment) {
        C63813iO.A02(fragment.requireContext(), fragment.getString(2131837145), (String) null, 0);
        return null;
    }

    public void onFail(AnonymousClass3XX r3) {
        C14030oh.A0A(-1443297937, C14030oh.A03(-716548392));
    }

    public void onFailInBackground(C26743EUq eUq) {
        C14030oh.A0A(-1908162203, C14030oh.A03(-841138601));
    }

    public void onFinish() {
        C14030oh.A0A(-1386281645, C14030oh.A03(-722328897));
    }

    public void onStart() {
        C14030oh.A0A(-195986231, C14030oh.A03(1083652329));
    }

    public void onSuccess(Object obj) {
        C14030oh.A0A(-1974142238, C14030oh.A03(-701331280));
    }

    public void onSuccessInBackground(Object obj) {
        C14030oh.A0A(-1422858925, C14030oh.A03(-1231892162));
    }
}
