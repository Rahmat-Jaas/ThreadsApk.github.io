package X;

import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.4JZ  reason: invalid class name */
public final class AnonymousClass4JZ implements C83734rt {
    public final UserSession A00;

    public static String A01() {
        if (Build.VERSION.SDK_INT >= 30) {
            return "android.permission.READ_PHONE_NUMBERS";
        }
        return "android.permission.READ_PHONE_STATE";
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017f  */
    /* renamed from: A04 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AAl(X.C84844tx r15, X.C28291u0 r16, X.C201413h r17) {
        /*
            r14 = this;
            r10 = r16
            X.1tt r2 = r10.A08
            r13 = r17
            android.view.ViewStub r1 = r13.A01
            android.view.ViewParent r0 = r1.getParent()
            r12 = r14
            if (r0 == 0) goto L_0x0040
            r0 = 2131493708(0x7f0c034c, float:1.8610904E38)
            r1.setLayoutResource(r0)
            r1.inflate()
            android.view.View r1 = r13.itemView
            r0 = 2131304195(0x7f091f03, float:1.8226526E38)
            android.view.View r9 = r1.requireViewById(r0)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r9 = (com.instagram.ui.widget.editphonenumber.EditPhoneNumberView) r9
            r13.A00 = r9
            com.instagram.service.session.UserSession r7 = r14.A00
            android.content.Context r0 = X.C18240wQ.A0B(r13)
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.0m7 r4 = r0.getSupportFragmentManager()
            X.4MG r8 = new X.4MG
            r8.<init>(r13, r14)
            r3 = 0
            X.4FG r6 = new X.4FG
            r6.<init>(r13, r14)
            r5 = r3
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView.A01(r3, r4, r5, r6, r7, r8, r9)
        L_0x0040:
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r13.A00
            if (r1 == 0) goto L_0x0052
            X.38u r0 = A00(r1)
            if (r0 == 0) goto L_0x00ae
            X.38u r0 = A00(r1)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00ae
        L_0x0052:
            X.1tw r1 = r2.A09
            r4 = 8
            r3 = 0
            android.widget.TextView r0 = r13.A05
            X.C18210wN.A11(r0, r1)
            X.1tu r1 = r2.A03
            android.widget.TextView r0 = r13.A03
            X.C18210wN.A11(r0, r1)
            android.view.View r0 = r13.itemView
            r0.setVisibility(r3)
            X.3CQ r1 = r2.A00
            android.widget.ImageView r0 = r13.A02
            r11 = r15
            if (r1 == 0) goto L_0x00aa
            r0.setVisibility(r3)
            r9 = 16
            com.facebook.redex.IDxCListenerShape15S0400000_1_I2 r8 = new com.facebook.redex.IDxCListenerShape15S0400000_1_I2
            r8.<init>(r9, r10, r11, r12, r13)
            r0.setOnClickListener(r8)
        L_0x007c:
            X.3CQ r2 = r2.A01
            if (r2 == 0) goto L_0x00a8
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r1 == r0) goto L_0x00a8
            X.1tw r0 = r2.A00
            java.lang.String r1 = r0.A00
        L_0x008a:
            android.widget.TextView r0 = r13.A04
            if (r0 == 0) goto L_0x00a0
            if (r1 == 0) goto L_0x00a4
            r0.setVisibility(r3)
            r0.setText(r1)
            r9 = 17
            com.facebook.redex.IDxCListenerShape15S0400000_1_I2 r8 = new com.facebook.redex.IDxCListenerShape15S0400000_1_I2
            r8.<init>(r9, r10, r11, r12, r13)
            r0.setOnClickListener(r8)
        L_0x00a0:
            r15.CEB(r10)
            return
        L_0x00a4:
            r0.setVisibility(r4)
            goto L_0x00a0
        L_0x00a8:
            r1 = 0
            goto L_0x008a
        L_0x00aa:
            r0.setVisibility(r4)
            goto L_0x007c
        L_0x00ae:
            com.instagram.service.session.UserSession r6 = r14.A00
            X.3Gy r1 = r10.A09
            java.lang.String r0 = "inline_prefill_text_from_django"
            X.3Fu r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x00c8
            java.lang.String r4 = r0.A03
        L_0x00bc:
            android.content.Context r0 = X.C18240wQ.A0B(r13)
            com.facebook.phonenumbers.PhoneNumberUtil r0 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r0)
            r5 = 0
            if (r4 == 0) goto L_0x00cf
            goto L_0x00ca
        L_0x00c8:
            r4 = 0
            goto L_0x00bc
        L_0x00ca:
            X.4Np r5 = r0.A0A(r4, r5)     // Catch:{ 2Ah -> 0x00f3, NumberFormatException -> 0x00f5 }
            goto L_0x00ff
        L_0x00cf:
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r13.A00     // Catch:{ 2Ah -> 0x00f3, NumberFormatException -> 0x00f5 }
            r0.getClass()     // Catch:{ 2Ah -> 0x00f3, NumberFormatException -> 0x00f5 }
            android.content.Context r3 = r0.getContext()     // Catch:{ 2Ah -> 0x00f3, NumberFormatException -> 0x00f5 }
            X.24N r1 = X.AnonymousClass24N.PHONE_NUMBER_SOURCE_SIM     // Catch:{ 2Ah -> 0x00f3, NumberFormatException -> 0x00f5 }
            X.265 r0 = X.AnonymousClass265.A0z     // Catch:{ 2Ah -> 0x00f3, NumberFormatException -> 0x00f5 }
            X.1yy r0 = X.C63573hp.A00(r3, r6, r1, r0)     // Catch:{ 2Ah -> 0x00f3, NumberFormatException -> 0x00f5 }
            if (r0 == 0) goto L_0x00ff
            X.4Np r6 = new X.4Np     // Catch:{ 2Ah -> 0x00f3, NumberFormatException -> 0x00f5 }
            r6.<init>()     // Catch:{ 2Ah -> 0x00f3, NumberFormatException -> 0x00f5 }
            java.lang.String r0 = r0.A01     // Catch:{ 2Ah | NumberFormatException -> 0x00f0 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ 2Ah | NumberFormatException -> 0x00f0 }
            r6.A02 = r0     // Catch:{ 2Ah | NumberFormatException -> 0x00f0 }
            goto L_0x00fe
        L_0x00f0:
            r3 = move-exception
            r5 = r6
            goto L_0x00f6
        L_0x00f3:
            r3 = move-exception
            goto L_0x00f6
        L_0x00f5:
            r3 = move-exception
        L_0x00f6:
            java.lang.String r1 = "IG-QP"
            java.lang.String r0 = "Invalid phone number prefill"
            X.C10450iM.A06(r1, r0, r3)
            goto L_0x00ff
        L_0x00fe:
            r5 = r6
        L_0x00ff:
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r13.A00
            r0.getClass()
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r0.A05
            r0.A04()
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r13.A00
            if (r5 == 0) goto L_0x017f
            android.content.Context r0 = r0.getContext()
            int r3 = r5.A00
            if (r3 == 0) goto L_0x0141
            com.facebook.phonenumbers.PhoneNumberUtil r0 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r0)
            java.lang.String r1 = r0.A0B(r3)
            if (r1 == 0) goto L_0x0141
            java.lang.String r0 = "ZZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0141
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0141
            com.instagram.phonenumber.model.CountryCodeData r4 = new com.instagram.phonenumber.model.CountryCodeData
            r4.<init>(r3, r1)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r3 = r13.A00
            long r0 = r5.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.setupEditPhoneNumberView((com.instagram.phonenumber.model.CountryCodeData) r4, (java.lang.String) r0)
            goto L_0x0052
        L_0x0141:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0156
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r4 = r13.A00
            java.lang.String r3 = java.lang.String.valueOf(r0)
            long r0 = r5.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.setupEditPhoneNumberView((java.lang.String) r3, (java.lang.String) r0)
            goto L_0x0052
        L_0x0156:
            java.lang.String r0 = "Invalid phone number prefill "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r4)
            java.lang.String r0 = "IG-QP"
            X.C10450iM.A03(r0, r1)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r7 = r13.A00
            android.content.Context r0 = X.C18240wQ.A0B(r13)
            com.instagram.phonenumber.model.CountryCodeData r1 = X.C60053Nl.A00(r0)
            long r3 = r5.A02
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x017c
            java.lang.String r0 = java.lang.String.valueOf(r3)
        L_0x0177:
            r7.setupEditPhoneNumberView((com.instagram.phonenumber.model.CountryCodeData) r1, (java.lang.String) r0)
            goto L_0x0052
        L_0x017c:
            java.lang.String r0 = ""
            goto L_0x0177
        L_0x017f:
            android.widget.EditText r0 = r0.A01
            android.text.Editable r0 = r0.getText()
            r0.clear()
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r13.A00
            android.content.Context r0 = X.C18240wQ.A0B(r13)
            com.instagram.phonenumber.model.CountryCodeData r0 = X.C60053Nl.A00(r0)
            r1.setCountryCodeWithCountryPrefix(r0)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4JZ.AAl(X.4tx, X.1u0, X.13h):void");
    }

    public AnonymousClass4JZ(UserSession userSession) {
        this.A00 = userSession;
    }

    public static C568538u A00(EditPhoneNumberView editPhoneNumberView) {
        if (editPhoneNumberView.getTag() == null || (editPhoneNumberView.getTag() instanceof C568538u)) {
            C568538u r0 = (C568538u) editPhoneNumberView.getTag();
            if (r0 != null) {
                return r0;
            }
            C568538u r02 = new C568538u();
            editPhoneNumberView.setTag(r02);
            return r02;
        }
        C10450iM.A03("IG-QP", AnonymousClass00U.A0L("EditPhoneNumberView tag used unexpectedly: ", C18220wO.A0q(editPhoneNumberView.getTag())));
        return null;
    }

    public static void A02(Activity activity, UserSession userSession, EditPhoneNumberView editPhoneNumberView) {
        A03(activity, userSession, editPhoneNumberView);
        C18250wR.A08().postDelayed(new C72774Pq(editPhoneNumberView.A01), 100);
        if (C18180wK.A1W(activity.checkSelfPermission(A01())) && C09860go.A0p(editPhoneNumberView.A01)) {
            C10450iM.A03("IG-QP", "Failed to get the phone number from the SIM card");
        }
    }

    public static void A03(Activity activity, UserSession userSession, EditPhoneNumberView editPhoneNumberView) {
        Activity activity2 = activity;
        if (C18180wK.A1W(activity.checkSelfPermission(A01())) && C09860go.A0p(editPhoneNumberView.A01)) {
            AnonymousClass3YI r5 = new AnonymousClass3YI(activity2, editPhoneNumberView.A01, editPhoneNumberView.A04, userSession, (CountryCodeData) null, AnonymousClass265.A0z);
            AnonymousClass3YI.A00(r5, C63573hp.A00(r5.A00, r5.A03, AnonymousClass24N.PHONE_NUMBER_SOURCE_SIM, r5.A05), AnonymousClass006.A0N);
        }
    }

    public final View Bhn(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.inline_editing_megaphone);
    }
}
