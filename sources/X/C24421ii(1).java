package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxOTaskShape113S0300000_1_I2;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1ii  reason: invalid class name and case insensitive filesystem */
public final class C24421ii extends C63873iU {
    public AnonymousClass1w1 A00;
    public final Context A01;
    public final C12560m7 A02;
    public final C82824qK A03;
    public final C07530bf A04;
    public final C313625r A05;
    public final /* synthetic */ C313625r A06;
    public final /* synthetic */ Handler A07;
    public final /* synthetic */ C34640IcN A08;
    public final /* synthetic */ C10300i6 A09;
    public final /* synthetic */ BusinessInfo A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public C24421ii(Context context, Handler handler, C12560m7 r3, C34640IcN icN, C10300i6 r5, BusinessInfo businessInfo, C82824qK r7, C07530bf r8, C313625r r9, C313625r r10, String str, String str2) {
        this.A08 = icN;
        this.A09 = r5;
        this.A0C = str;
        this.A0A = businessInfo;
        this.A07 = handler;
        this.A06 = r10;
        this.A0B = str2;
        this.A01 = context;
        this.A04 = r8;
        this.A02 = r3;
        this.A03 = r7;
        this.A05 = r9;
    }

    public static void A00(C24421ii r4, C22241Ty r5, UserSession userSession) {
        AnonymousClass1w1 r0 = r4.A00;
        if (r0 != null) {
            r0.A07();
        }
        if (r5.A05) {
            synchronized (AnonymousClass3VH.A00()) {
            }
            C34640IcN icN = r4.A08;
            FragmentActivity activity = icN.getActivity();
            if (activity instanceof C84654td) {
                C18230wP.A1P((C84654td) activity);
            }
            C67323zM.A05(icN.getActivity(), C15430rJ.A01(AnonymousClass00U.A0L("instagram://professional_signup_nux?entry_point=", r4.A0B)), icN, userSession);
            AnonymousClass3RH.A00 = null;
            AnonymousClass3Y3.A01(icN.getContext());
            return;
        }
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        A0Y.A29(C18220wO.A0d());
        C18210wN.A1K(A0Y);
        r4.A07.post(new AnonymousClass4R6(r4, userSession));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = C14030oh.A03(1940633790);
        C22241Ty r5 = (C22241Ty) obj;
        int A033 = C14030oh.A03(493414084);
        User user = r5.A01;
        user.A2E(r5.A02);
        boolean z = r5.A05;
        C07530bf r2 = this.A04;
        if (z) {
            String id = user.getId();
            String str2 = this.A05.A00;
            C04220Ms.A0B(r2, 0);
            str = null;
            C54182z2.A00(r2, (AnonymousClass3V1) null, "done", id, str2, "business", (String) null);
        } else {
            String id2 = user.getId();
            String str3 = this.A05.A00;
            AnonymousClass0wJ.A1N(r2, str3);
            AnonymousClass0wJ.A1Q("business", id2);
            str = null;
            String str4 = id2;
            C54252z9.A00(r2, (Integer) null, str3, "business", str4, (String) null).Bb4();
        }
        String id3 = user.getId();
        FragmentActivity activity = this.A08.getActivity();
        String str5 = null;
        if (activity instanceof C84654td) {
            C84654td r10 = (C84654td) activity;
            C10300i6 r7 = this.A09;
            Bundle A012 = AnonymousClass3z8.A01(this.A0A, this.A0C, id3, str, str);
            if (r10 != null) {
                C67223zB.A02(A012, C67223zB.A01(r7), C67293zJ.A02(r10), "submit", "create_business_account");
            }
        }
        C10300i6 r8 = this.A09;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, r8, 36319123923473305L)) {
            BusinessFlowAnalyticsLogger A013 = C37076Jk8.A01(C311924p.BUSINESS_SIGNUP_FLOW, r8, "business_account_creation", C18180wK.A0e());
            BusinessInfo businessInfo = this.A0A;
            String str6 = businessInfo.A0J;
            PublicPhoneContact publicPhoneContact = businessInfo.A01;
            if (publicPhoneContact != null) {
                str5 = publicPhoneContact.A02;
            }
            String str7 = businessInfo.A0B;
            String str8 = this.A0C;
            String str9 = businessInfo.A09;
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("email", str7);
            A0y.put("phone", str5);
            C18250wR.A1E(str6, A0y);
            A0y.put(C62983bG.A01(), str8);
            A0y.put("category_id", str9);
            A0y.put("personal_ig_id", C05030Qo.A04(r8));
            A0y.put("new_created_business_ig_id", id3);
            if (A013 != null) {
                AnonymousClass3VH.A00();
                AnonymousClass3VH.A00();
                A013.Bdx(new C37408JrQ((String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, A0y, (Map) null));
            }
        } else {
            AnonymousClass3VH.A00();
            AnonymousClass3VH.A00();
            String str10 = this.A0C;
            BusinessInfo businessInfo2 = this.A0A;
            String str11 = businessInfo2.A0J;
            PublicPhoneContact publicPhoneContact2 = businessInfo2.A01;
            if (publicPhoneContact2 != null) {
                str5 = publicPhoneContact2.A02;
            }
            String str12 = businessInfo2.A0B;
            String str13 = businessInfo2.A09;
            String A042 = C05030Qo.A04(r8);
            C15730rn A002 = C34512Jv.A00(AnonymousClass006.A01);
            C18250wR.A19(A002, (String) null);
            A002.A0D("entry_point", (String) null);
            A002.A0D("fb_user_id", (String) null);
            A002.A0D("personal_ig_id", A042);
            A002.A0D("new_created_business_ig_id", id3);
            C15680ri r1 = new C15680ri();
            r1.A0D("email", str12);
            r1.A0D("phone", str5);
            r1.A0D("address", (String) null);
            r1.A0D("page_id", str11);
            r1.A0D(C62983bG.A01(), str10);
            r1.A0D("category_id", str13);
            r1.A0D("date_of_birth", (String) null);
            A002.A05(r1, "selected_values");
            if (r8 != null) {
                C18180wK.A1K(A002, r8);
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        UserSession A034 = C67323zM.A03(this.A01, (C11630kW) null, r2, user, (String) null, false);
        if (r5.A06) {
            C31155GhB.A03(new IDxOTaskShape113S0300000_1_I2(0, this, r5, A034));
        } else {
            A00(this, r5, A034);
        }
        C14030oh.A0A(-1369955861, A033);
        C14030oh.A0A(-658391784, A032);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r18) {
        /*
            r17 = this;
            r0 = 1303638659(0x4db3f283, float:3.77376864E8)
            int r3 = X.C14030oh.A03(r0)
            r4 = r17
            X.1w1 r0 = r4.A00
            if (r0 == 0) goto L_0x0010
            r0.A07()
        L_0x0010:
            r0 = r18
            java.lang.Object r1 = r0.A00
            if (r1 == 0) goto L_0x0159
            X.1Ty r1 = (X.C22241Ty) r1
            X.3SQ r0 = r1.A00
            if (r0 == 0) goto L_0x0156
            java.lang.String r13 = r0.A01
        L_0x001e:
            if (r0 == 0) goto L_0x0153
            java.lang.String r12 = r0.A00
        L_0x0022:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x002a
            java.lang.String r12 = r1.mErrorSource
        L_0x002a:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x0034
            java.lang.String r12 = r1.getErrorMessage()
        L_0x0034:
            boolean r0 = r1.isFeedbackRequired()
            if (r0 != 0) goto L_0x0145
            X.4qK r1 = r4.A03
            java.lang.Integer r0 = X.AnonymousClass006.A01
        L_0x003e:
            r1.Cth(r12, r0)
        L_0x0041:
            X.IcN r0 = r4.A08
            androidx.fragment.app.FragmentActivity r8 = r0.getActivity()
            boolean r0 = r8 instanceof X.C84654td
            r5 = 0
            if (r0 == 0) goto L_0x0069
            X.4td r8 = (X.C84654td) r8
            X.0i6 r2 = r4.A09
            java.lang.String r1 = r4.A0C
            com.instagram.model.business.BusinessInfo r0 = r4.A0A
            android.os.Bundle r7 = X.AnonymousClass3z8.A01(r0, r1, r5, r13, r12)
            java.lang.String r6 = "create_business_account"
            if (r8 == 0) goto L_0x0069
            X.3zB r2 = X.C67223zB.A01(r2)
            java.lang.String r1 = X.C67293zJ.A02(r8)
            java.lang.String r0 = "submit_error"
            X.C67223zB.A02(r7, r2, r1, r0, r6)
        L_0x0069:
            X.0i6 r2 = r4.A09
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36319123923276694(0x81080d00001396, double:3.0316984422291944E-306)
            boolean r0 = X.C63803iN.A0E(r6, r2, r0)
            if (r0 == 0) goto L_0x00ce
            X.24p r6 = X.C311924p.BUSINESS_SIGNUP_FLOW
            java.lang.String r1 = X.C18180wK.A0e()
            java.lang.String r0 = "business_account_creation"
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r7 = X.C37076Jk8.A01(r6, r2, r0, r1)
            com.instagram.model.business.BusinessInfo r1 = r4.A0A
            java.lang.String r8 = r1.A0J
            com.instagram.model.business.PublicPhoneContact r0 = r1.A01
            if (r0 == 0) goto L_0x008e
            java.lang.String r5 = r0.A02
        L_0x008e:
            java.lang.String r6 = r1.A0B
            java.lang.String r2 = r4.A0C
            java.lang.String r1 = r1.A09
            java.util.HashMap r15 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "email"
            r15.put(r0, r6)
            java.lang.String r0 = "phone"
            r15.put(r0, r5)
            X.C18250wR.A1E(r8, r15)
            java.lang.String r0 = X.C62983bG.A01()
            r15.put(r0, r2)
            java.lang.String r0 = "category_id"
            r15.put(r0, r1)
            if (r7 == 0) goto L_0x00c7
            X.AnonymousClass3VH.A00()
            r9 = 0
            X.AnonymousClass3VH.A00()
            X.JrQ r8 = new X.JrQ
            r10 = r9
            r11 = r9
            r14 = r9
            r16 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r7.Bdy(r8)
        L_0x00c7:
            r0 = 141071645(0x868951d, float:6.9990242E-34)
            X.C14030oh.A0A(r0, r3)
            return
        L_0x00ce:
            X.AnonymousClass3VH.A00()
            r6 = r5
            X.AnonymousClass3VH.A00()
            com.instagram.model.business.BusinessInfo r1 = r4.A0A
            java.lang.String r8 = r1.A0J
            com.instagram.model.business.PublicPhoneContact r0 = r1.A01
            if (r0 == 0) goto L_0x00df
            java.lang.String r5 = r0.A02
        L_0x00df:
            java.lang.String r9 = r1.A0B
            java.lang.String r7 = r1.A09
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            X.0rn r1 = X.C34512Jv.A00(r0)
            X.C18250wR.A19(r1, r6)
            java.lang.String r0 = "entry_point"
            r1.A0D(r0, r6)
            java.lang.String r0 = "fb_user_id"
            r1.A0D(r0, r6)
            X.0ri r4 = new X.0ri
            r4.<init>()
            java.lang.String r0 = "email"
            r4.A0D(r0, r9)
            java.lang.String r0 = "phone"
            r4.A0D(r0, r5)
            java.lang.String r0 = "address"
            r4.A0D(r0, r6)
            java.lang.String r0 = "page_id"
            r4.A0D(r0, r8)
            java.lang.String r0 = X.C62983bG.A01()
            r4.A0D(r0, r6)
            java.lang.String r0 = "category_id"
            r4.A0D(r0, r7)
            java.lang.String r0 = "date_of_birth"
            r4.A0D(r0, r6)
            java.lang.String r0 = "selected_values"
            r1.A05(r4, r0)
            if (r13 == 0) goto L_0x0132
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = "error_identifier"
            r1.A0D(r0, r12)
        L_0x0132:
            if (r12 == 0) goto L_0x013f
            int r0 = r12.length()
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = "error_message"
            r1.A0D(r0, r12)
        L_0x013f:
            if (r2 == 0) goto L_0x016f
            X.C18180wK.A1K(r1, r2)
            goto L_0x00c7
        L_0x0145:
            X.KHr r2 = X.C38040KHr.A01
            java.lang.Integer r1 = X.AnonymousClass006.A01
            X.45L r0 = new X.45L
            r0.<init>(r12, r1)
            r2.CWx(r0)
            goto L_0x0041
        L_0x0153:
            r12 = 0
            goto L_0x0022
        L_0x0156:
            r13 = 0
            goto L_0x001e
        L_0x0159:
            android.content.Context r1 = r4.A01
            r0 = 2131831662(0x7f112b6e, float:1.9296356E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131837305(0x7f114179, float:1.9307801E38)
            java.lang.String r13 = r1.getString(r0)
            X.4qK r1 = r4.A03
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x003e
        L_0x016f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24421ii.onFail(X.3XX):void");
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(959819418);
        super.onFinish();
        C14030oh.A0A(2115904256, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(858135810);
        int A033 = C14030oh.A03(-2123151724);
        super.onStart();
        AnonymousClass1w1 r2 = new AnonymousClass1w1();
        this.A00 = r2;
        r2.A0A(this.A02, "ProgressDialog");
        C14030oh.A0A(-1645178011, A033);
        C14030oh.A0A(-1821353380, A032);
    }
}
