package X;

import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape217S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.1iR  reason: invalid class name */
public final class AnonymousClass1iR extends C63873iU {
    public C11630kW A00;
    public C61113Ry A01;
    public AnonymousClass3CN A02;
    public C07530bf A03;
    public final Uri A04;
    public final FragmentActivity A05;
    public final C18330wh A06;
    public final String A07;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1100643335);
        C26641qy r6 = (C26641qy) obj;
        int A033 = C14030oh.A03(-1810184901);
        User user = r6.A00;
        C18210wN.A1K(user);
        AnonymousClass269 r3 = AnonymousClass269.LogIn;
        C07530bf r13 = this.A03;
        r3.A0B(r13).A05().A0D("instagram_id", user.getId());
        AnonymousClass3V1 r14 = new AnonymousClass3V1();
        r14.A01();
        r14.A00.putString(C18240wQ.A0g("RECOVERY_TYPE"), C18240wQ.A0g("EMAIL_LINK_ONETAP"));
        C54182z2.A00(r13, r14, "", user.getId(), (String) null, (String) null, (String) null);
        FragmentActivity fragmentActivity = this.A05;
        String str = r6.A06;
        C11630kW r7 = this.A00;
        UserSession A034 = C67323zM.A03(fragmentActivity, r7, r13, user, str, false);
        C67323zM.A07(fragmentActivity, this.A04, r7, A034, C18200wM.A00(), true, false, true, false);
        AnonymousClass3CN r4 = this.A02;
        r4.A04 = true;
        String BK7 = AnonymousClass0wJ.A0Y(A034).BK7();
        r4.A03 = BK7;
        C61113Ry.A00(this.A01, r4.A00, r4.A01, r4.A02, BK7, r4.A04);
        AnonymousClass0wJ.A13(C18200wM.A0C().edit(), "has_one_clicked_logged_in", true);
        C14030oh.A0A(1700754649, A033);
        C14030oh.A0A(-1265239319, A032);
    }

    public AnonymousClass1iR(Uri uri, FragmentActivity fragmentActivity, C11630kW r5, C07530bf r6, String str, String str2) {
        C18330wh r1 = new C18330wh(fragmentActivity);
        this.A06 = r1;
        C18330wh.A02(fragmentActivity, r1, 2131830126);
        this.A04 = uri;
        this.A07 = str;
        this.A03 = r6;
        this.A00 = r5;
        this.A05 = fragmentActivity;
        this.A01 = new C61113Ry(r5, r6);
        AnonymousClass3CN r12 = new AnonymousClass3CN();
        r12.A01 = str2;
        r12.A00 = AnonymousClass265.A0t;
        r12.A02 = str;
        this.A02 = r12;
    }

    public final void onFail(AnonymousClass3XX r10) {
        int i;
        IDxCListenerShape217S0100000_1_I2 iDxCListenerShape217S0100000_1_I2;
        IDxCListenerShape217S0100000_1_I2 iDxCListenerShape217S0100000_1_I22;
        int A032 = C14030oh.A03(-1844434898);
        AnonymousClass269 r0 = AnonymousClass269.A0V;
        C07530bf r5 = this.A03;
        C63313hF A0B = r0.A0B(r5);
        AnonymousClass265 r02 = AnonymousClass265.A0r;
        C15730rn A052 = A0B.A05();
        C18250wR.A19(A052, r02.A01);
        A052.A0D("event_type", "one_click");
        A052.A0D("uid_encoded", this.A07);
        C18180wK.A1K(A052, r5);
        AnonymousClass3CN r03 = this.A02;
        r03.A04 = false;
        C61113Ry.A00(this.A01, r03.A00, r03.A01, r03.A02, r03.A03, false);
        Object obj = r10.A00;
        C26641qy r3 = (C26641qy) obj;
        if (r3 == null) {
            i = 1260321144;
        } else if (obj == null || !((AnonymousClass1TP) obj).A02) {
            String str = r3.mErrorTitle;
            String errorMessage = r3.getErrorMessage();
            ArrayList arrayList = r3.A09;
            FragmentActivity fragmentActivity = this.A05;
            C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
            if (TextUtils.isEmpty(str)) {
                str = fragmentActivity.getString(2131826851);
            }
            A0W.A02 = str;
            if (TextUtils.isEmpty(errorMessage)) {
                errorMessage = fragmentActivity.getString(2131834837);
            }
            A0W.A0p(errorMessage);
            if (arrayList == null || arrayList.isEmpty()) {
                A0W.A0P((DialogInterface.OnClickListener) null, 2131826195);
            } else {
                AnonymousClass3BW r04 = (AnonymousClass3BW) arrayList.get(0);
                String str2 = r04.A01;
                C307922z r52 = C307922z.SWITCH_TO_SIGNUP_FLOW;
                if (r52 == r04.A00) {
                    iDxCListenerShape217S0100000_1_I2 = C18220wO.A0O(this, 118);
                } else {
                    iDxCListenerShape217S0100000_1_I2 = null;
                }
                A0W.A0b(iDxCListenerShape217S0100000_1_I2, str2);
                if (arrayList.size() > 1) {
                    AnonymousClass3BW r05 = (AnonymousClass3BW) arrayList.get(1);
                    String str3 = r05.A01;
                    if (r52 == r05.A00) {
                        iDxCListenerShape217S0100000_1_I22 = C18220wO.A0O(this, 118);
                    } else {
                        iDxCListenerShape217S0100000_1_I22 = null;
                    }
                    A0W.A0c(iDxCListenerShape217S0100000_1_I22, str3);
                }
            }
            if (!fragmentActivity.isFinishing()) {
                C63643hy.A04(new AnonymousClass4QN(A0W));
            }
            i = -1192893977;
        } else {
            AnonymousClass3DR r4 = r3.A01;
            C18250wR.A08().post(new AnonymousClass4SX(r3.A00, r4, this));
            i = -1251728385;
        }
        C14030oh.A0A(i, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(427358625);
        super.onFinish();
        C18330wh r1 = this.A06;
        if (r1.isShowing()) {
            r1.hide();
        }
        C14030oh.A0A(881896084, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(-508739484);
        super.onStart();
        C18330wh r1 = this.A06;
        if (!r1.isShowing()) {
            C13950oZ.A00(r1);
        }
        C14030oh.A0A(875489093, A032);
    }
}
