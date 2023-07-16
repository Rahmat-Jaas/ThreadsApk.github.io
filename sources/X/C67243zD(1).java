package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.3zD  reason: invalid class name and case insensitive filesystem */
public final class C67243zD implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67243zD.class);
    public static final String __redex_internal_original_name = "FacebookPageClaimHelper";

    static {
        String.format((Locale) null, "%s/auth/token?next=", new Object[]{AnonymousClass2LB.A00()});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r0.A00 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        if (X.C34562Ka.A00(r13) != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cb, code lost:
        if (X.C34562Ka.A00(r13) != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01fe, code lost:
        if (r1.A3Z() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0215, code lost:
        if (r1.A3Z() == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r18, androidx.fragment.app.Fragment r19, X.C11630kW r20, com.instagram.service.session.UserSession r21, java.lang.String r22) {
        /*
            r11 = r19
            java.lang.String r0 = "setting"
            r13 = r21
            r14 = r22
            if (r14 == r0) goto L_0x0012
            if (r22 == 0) goto L_0x0202
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0202
        L_0x0012:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36327284361144267(0x810f79000027cb, double:3.0368591359960934E-306)
            boolean r0 = X.C63803iN.A0E(r2, r13, r0)
            if (r0 == 0) goto L_0x0202
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r13)
            com.facebook.common.callercontext.CallerContext r3 = A00
            java.lang.String r4 = "ig_android_ig_business_asset_ig_business_settings"
            java.lang.String r5 = "ig_settings_business"
            java.lang.String r6 = "settings_business"
            java.lang.String r7 = "loading"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2
            r2.<init>((com.facebook.common.callercontext.CallerContext) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)
            X.4sb r0 = X.AnonymousClass3LA.A01(r13)
            java.lang.Object r0 = r0.AbO(r2)
            X.3BJ r0 = (X.AnonymousClass3BJ) r0
            r15 = 1
            if (r0 == 0) goto L_0x01fa
            X.3EH r0 = r0.A00
            if (r0 == 0) goto L_0x01fa
        L_0x0043:
            r15 = 0
        L_0x0044:
            r7 = 0
            java.lang.String r1 = "claim_page"
            java.lang.String r0 = "claim_page_row"
            A03(r13, r14, r1, r0)
            r0 = 2131493364(0x7f0c01f4, float:1.8610206E38)
            X.3ZB r1 = new X.3ZB
            r10 = r18
            r1.<init>(r10, r0, r7)
            r6 = 1
            X.I1U r0 = r1.A0E
            r0.setCancelable(r6)
            r0.setCanceledOnTouchOutside(r6)
            android.app.Dialog r9 = r1.A00()
            r0 = 2131304722(0x7f092112, float:1.8227595E38)
            android.view.View r1 = r9.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.0Ok r8 = X.C06810aP.A01
            com.instagram.user.model.User r0 = r8.A01(r13)
            r2 = r20
            X.C18220wO.A1L(r2, r1, r0)
            r0 = 2131299634(0x7f090d32, float:1.8217275E38)
            android.view.View r5 = r9.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.0TJ r2 = X.C18180wK.A0J(r13)
            r0 = 36324986553639761(0x810d6200002351, double:3.0354059932777156E-306)
            boolean r2 = X.C63803iN.A0E(r2, r13, r0)
            if (r2 != 0) goto L_0x0098
            boolean r3 = X.C34562Ka.A00(r13)
            r2 = 2131829285(0x7f112225, float:1.9291535E38)
            if (r3 == 0) goto L_0x009b
        L_0x0098:
            r2 = 2131832113(0x7f112d31, float:1.929727E38)
        L_0x009b:
            java.lang.String r4 = r10.getString(r2)
            if (r15 == 0) goto L_0x01e9
            r2 = 2131299644(0x7f090d3c, float:1.8217295E38)
            android.view.View r8 = r9.findViewById(r2)
            android.widget.TextView r8 = (android.widget.TextView) r8
            X.0TJ r2 = X.C18180wK.A0J(r13)
            boolean r2 = X.C63803iN.A0E(r2, r13, r0)
            if (r2 == 0) goto L_0x01db
            r3 = 2131824294(0x7f110ea6, float:1.9281412E38)
        L_0x00b7:
            r8.setText(r3)
            X.0TJ r2 = X.C18180wK.A0J(r13)
            boolean r2 = X.C63803iN.A0E(r2, r13, r0)
            if (r2 != 0) goto L_0x00cd
            boolean r2 = X.C34562Ka.A00(r13)
            r3 = 2131824555(0x7f110fab, float:1.9281941E38)
            if (r2 == 0) goto L_0x00d0
        L_0x00cd:
            r3 = 2131824556(0x7f110fac, float:1.9281943E38)
        L_0x00d0:
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
        L_0x00d4:
            java.lang.String r2 = r10.getString(r3, r2)
            android.text.SpannableStringBuilder r3 = X.C18200wM.A0E(r2)
            java.lang.String r2 = "https://www.facebook.com/page_guidelines.php"
            java.lang.String r8 = X.AnonymousClass3W8.A01(r10, r2)
            r2 = 2130971027(0x7f040993, float:1.755078E38)
            int r21 = X.C121907Is.A00(r10, r2)
            X.AnonymousClass0wJ.A1Q(r13, r8)
            r19 = 0
            X.1xz r2 = new X.1xz
            r17 = r10
            r18 = r13
            r20 = r8
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            X.AnonymousClass3Zw.A01(r3, r2, r4)
            r5.setText(r3)
            X.C18180wK.A0z(r5)
            r2 = 2131303781(0x7f091d65, float:1.8225686E38)
            android.view.View r3 = r9.findViewById(r2)
            com.facebook.redex.IDxCListenerShape5S1300000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape5S1300000_1_I2
            r16 = r2
            r17 = r11
            r18 = r9
            r19 = r13
            r20 = r14
            r21 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            r3.setOnClickListener(r2)
            r2 = 2131298394(0x7f09085a, float:1.821476E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r15 == 0) goto L_0x0187
            boolean r4 = X.C34562Ka.A00(r13)
            r3 = 2131824553(0x7f110fa9, float:1.9281937E38)
            if (r4 == 0) goto L_0x0136
            r3 = 2131824554(0x7f110faa, float:1.928194E38)
        L_0x0136:
            r2.setText(r3)
            boolean r4 = X.C34562Ka.A00(r13)
            r3 = 2131303225(0x7f091b39, float:1.8224558E38)
            if (r4 == 0) goto L_0x0145
            r3 = 2131308337(0x7f092f31, float:1.8234927E38)
        L_0x0145:
            android.view.View r3 = r9.findViewById(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r3.inflate()
            r3 = 2131298957(0x7f090a8d, float:1.8215902E38)
            android.view.View r5 = r9.requireViewById(r3)
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r3 = X.C34562Ka.A00(r13)
            r4 = 2131824279(0x7f110e97, float:1.9281381E38)
            if (r3 == 0) goto L_0x0163
            r4 = 2131824280(0x7f110e98, float:1.9281383E38)
        L_0x0163:
            X.0TJ r3 = X.C18180wK.A0J(r13)
            boolean r3 = X.C63803iN.A0E(r3, r13, r0)
            if (r3 == 0) goto L_0x0170
            r4 = 2131824395(0x7f110f0b, float:1.9281617E38)
        L_0x0170:
            r5.setText(r4)
            X.3rN r3 = new X.3rN
            r16 = r3
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r13
            r21 = r14
            r16.<init>(r17, r18, r19, r20, r21)
            r5.setOnClickListener(r3)
        L_0x0187:
            X.0TJ r3 = X.C18180wK.A0J(r13)
            boolean r1 = X.C63803iN.A0E(r3, r13, r0)
            r0 = 2131298396(0x7f09085c, float:1.8214764E38)
            android.view.View r0 = r9.requireViewById(r0)
            if (r1 == 0) goto L_0x01cd
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131298395(0x7f09085b, float:1.8214762E38)
            android.view.View r0 = r9.requireViewById(r0)
            r0.setVisibility(r1)
        L_0x01a7:
            X.1f4 r12 = new X.1f4
            r16 = r12
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r11
            r21 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.3rX r8 = new X.3rX
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r2.setOnClickListener(r8)
            boolean r0 = r11 instanceof android.content.DialogInterface.OnCancelListener
            if (r0 == 0) goto L_0x01c9
            android.content.DialogInterface$OnCancelListener r11 = (android.content.DialogInterface.OnCancelListener) r11
            r9.setOnCancelListener(r11)
        L_0x01c9:
            X.C13950oZ.A00(r9)
            return
        L_0x01cd:
            r0.setVisibility(r7)
            r0 = 2131298395(0x7f09085b, float:1.8214762E38)
            android.view.View r0 = r9.requireViewById(r0)
            r0.setVisibility(r7)
            goto L_0x01a7
        L_0x01db:
            boolean r2 = X.C34562Ka.A00(r13)
            r3 = 2131824293(0x7f110ea5, float:1.928141E38)
            if (r2 == 0) goto L_0x00b7
            r3 = 2131824295(0x7f110ea7, float:1.9281414E38)
            goto L_0x00b7
        L_0x01e9:
            com.instagram.user.model.User r2 = r8.A01(r13)
            java.lang.String r2 = r2.Ak2()
            r3 = 2131823300(0x7f110ac4, float:1.9279396E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}
            goto L_0x00d4
        L_0x01fa:
            boolean r0 = r1.A3Z()
            if (r0 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0202:
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r13)
            java.lang.String r0 = r1.A17()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r1.A3Z()
            r15 = 1
            if (r0 != 0) goto L_0x0044
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67243zD.A00(android.content.Context, androidx.fragment.app.Fragment, X.0kW, com.instagram.service.session.UserSession, java.lang.String):void");
    }

    public static void A01(Context context, Fragment fragment, C63873iU r6, UserSession userSession, boolean z) {
        String str;
        String A002 = C61853Wb.A00(A00, userSession, "ig_professional_fb_page_linking");
        AnonymousClass06E A003 = AnonymousClass06E.A00(fragment);
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        if (z) {
            str = "business/account/create_and_claim_page/";
        } else {
            str = "business/account/claim_unowned_page/";
        }
        A0N.A0J(str);
        A0N.A0O("fb_access_token", A002);
        C32165H8c A0T = C18180wK.A0T(A0N, C21991Sy.class, AnonymousClass3L7.class);
        if (r6 != null) {
            A0T.A00 = r6;
        }
        C31155GhB.A01(context, A003, A0T);
    }

    public static void A02(Fragment fragment, C82284pN r7, UserSession userSession) {
        C83814s2 r5 = new AnonymousClass1v1(fragment, r7, userSession);
        C83474rR r4 = (C83474rR) fragment;
        FragmentActivity requireActivity = fragment.requireActivity();
        if (C63803iN.A0E(C18250wR.A0D(userSession, 2), userSession, 36325617913832610L)) {
            r5 = new C71904Kv(requireActivity, r5, C49422rM.A00(userSession));
        }
        new C24741jy(fragment, r4, userSession, r5).A00(AnonymousClass264.A06);
    }

    public static void A03(C10300i6 r6, String str, String str2, String str3) {
        C37076Jk8.A01(C311924p.EDIT_PROFILE, r6, "facebook_page_claim_helper", C18180wK.A0e()).Be5(new C37408JrQ(str2, str, str3, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
    }
}
