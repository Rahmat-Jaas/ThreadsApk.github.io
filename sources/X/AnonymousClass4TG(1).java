package X;

import android.os.Handler;
import android.text.TextUtils;
import com.instagram.model.business.BusinessInfo;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;

/* renamed from: X.4TG  reason: invalid class name */
public final class AnonymousClass4TG implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ C10300i6 A02;
    public final /* synthetic */ BusinessInfo A03;
    public final /* synthetic */ C82824qK A04;
    public final /* synthetic */ RegFlowExtras A05;
    public final /* synthetic */ C313625r A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public AnonymousClass4TG(Handler handler, C34640IcN icN, C10300i6 r3, BusinessInfo businessInfo, C82824qK r5, RegFlowExtras regFlowExtras, C313625r r7, String str, String str2, String str3) {
        this.A02 = r3;
        this.A01 = icN;
        this.A05 = regFlowExtras;
        this.A00 = handler;
        this.A09 = str;
        this.A07 = str2;
        this.A03 = businessInfo;
        this.A06 = r7;
        this.A08 = str3;
        this.A04 = r5;
    }

    public final void run() {
        Integer num;
        C07530bf A002;
        String str;
        C10300i6 r10 = this.A02;
        C34640IcN icN = this.A01;
        RegFlowExtras regFlowExtras = this.A05;
        Handler handler = this.A00;
        String str2 = this.A09;
        String str3 = this.A07;
        BusinessInfo businessInfo = this.A03;
        C313625r r6 = this.A06;
        if (r6 == C313625r.PHONE) {
            num = AnonymousClass006.A01;
        } else {
            num = AnonymousClass006.A00;
        }
        String str4 = this.A08;
        C82824qK r5 = this.A04;
        boolean z = r10 instanceof UserSession;
        if (z) {
            A002 = AnonymousClass0RA.A0C.A05((AnonymousClass0RJ) icN.getActivity());
        } else {
            A002 = C05030Qo.A00(r10);
        }
        if (num == AnonymousClass006.A00) {
            str = "accounts/create_business/";
        } else {
            str = "accounts/create_business_validated/";
        }
        H1T h1t = new H1T(A002);
        RegFlowExtras.A00(icN.getContext(), h1t, r10, regFlowExtras, true);
        C18250wR.A16(h1t);
        h1t.A0J(str);
        String str5 = str2;
        if (str2 == null) {
            str5 = "";
        }
        h1t.A0O(C62983bG.A01(), str5);
        String str6 = regFlowExtras.A08;
        if (str6 == null) {
            str6 = "";
        }
        h1t.A0O("email", str6);
        String str7 = regFlowExtras.A0Q;
        if (str7 == null) {
            str7 = "";
        }
        h1t.A0O(C62983bG.A00(), str7);
        String str8 = businessInfo.A0J;
        if (str8 == null) {
            str8 = "";
        }
        h1t.A0O("page_id", str8);
        String str9 = businessInfo.A09;
        if (str9 == null) {
            str9 = "";
        }
        h1t.A0O("category_id", str9);
        boolean z2 = businessInfo.A0R;
        String str10 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str11 = "0";
        String str12 = str11;
        if (z2) {
            str12 = str10;
        }
        h1t.A0O("should_show_public_contacts", str12);
        if (!businessInfo.A0P) {
            str10 = str11;
        }
        C18180wK.A1J(h1t, A002, "should_show_category", str10);
        h1t.A0O("jazoest", AnonymousClass3E4.A00.A00(C18190wL.A0l(A002)));
        h1t.A0O("entry_point", str3);
        C62663aU r2 = new C62663aU(A002);
        String str13 = regFlowExtras.A0P;
        if (str13 == null) {
            str13 = "";
        }
        h1t.A0O("enc_password", r2.A02(str13));
        C18240wQ.A1A(h1t, C22241Ty.class, AnonymousClass3OC.class);
        AnonymousClass266 r1 = businessInfo.A02;
        if (r1 != null) {
            h1t.A0O("to_account_type", String.valueOf(r1.A00));
        }
        String str14 = businessInfo.A0I;
        if (TextUtils.isEmpty(str14)) {
            str14 = "instagram";
        }
        h1t.A0O("professional_signup_source_user_type", str14);
        String str15 = businessInfo.A0H;
        if (!TextUtils.isEmpty(str15)) {
            h1t.A0O("professional_signup_source_page_id", str15);
        }
        String str16 = businessInfo.A0G;
        if (!TextUtils.isEmpty(str16)) {
            h1t.A0O("professional_signup_source_account_id", str16);
        } else {
            if (str4 != null) {
                str11 = str4;
            } else if (z) {
                str11 = C05030Qo.A04(r10);
            }
            h1t.A0O("professional_signup_source_account_id", str11);
        }
        C18190wL.A1M(h1t, regFlowExtras);
        C32165H8c A022 = h1t.A02();
        Handler handler2 = handler;
        C12560m7 r15 = icN.mFragmentManager;
        C34640IcN icN2 = icN;
        A022.A00 = new C24421ii(icN.getContext(), handler2, r15, icN2, r10, businessInfo, r5, A002, r6, r6, str2, str3);
        icN.schedule(A022);
    }
}
