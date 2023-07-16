package X;

import android.app.Activity;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.3YI  reason: invalid class name */
public final class AnonymousClass3YI {
    public Activity A00;
    public EditText A01;
    public TextView A02;
    public C10300i6 A03;
    public CountryCodeData A04;
    public AnonymousClass265 A05;
    public PhoneNumberFormattingTextWatcher A06;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        if (r0 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if (r0 == null) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass3YI r13, X.C29621yy r14, java.lang.Integer r15) {
        /*
            r10 = r13
            android.widget.TextView r5 = r13.A02
            if (r5 == 0) goto L_0x0063
            double r3 = X.C18200wM.A00()
            double r1 = X.AnonymousClass269.A00()
            X.0i6 r9 = r13.A03
            X.0nS r6 = X.C13330nS.A02(r9)
            java.lang.String r0 = "guessed_country_code"
            X.0A2 r6 = X.AnonymousClass0wJ.A0M(r6, r0)
            r0 = 703(0x2bf, float:9.85E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r8 = X.C18180wK.A0I(r6, r0)
            X.AnonymousClass0wJ.A1A(r8, r3, r1)
            X.265 r0 = r13.A05
            java.lang.String r0 = r0.A01
            X.AnonymousClass269.A08(r8, r0)
            X.C18210wN.A17(r8)
            com.instagram.phonenumber.model.CountryCodeData r0 = r13.A04
            r6 = 0
            if (r0 != 0) goto L_0x0074
            r7 = r6
        L_0x0032:
            java.lang.String r0 = "code"
            r8.A0S(r0, r7)
            com.instagram.phonenumber.model.CountryCodeData r0 = r13.A04
            if (r0 == 0) goto L_0x003d
            java.lang.String r6 = r0.A00
        L_0x003d:
            java.lang.String r0 = "country"
            r8.A0T(r0, r6)
            java.lang.String r0 = "phone"
            X.C18210wN.A19(r8, r0)
            X.AnonymousClass0wJ.A1D(r8, r1, r3)
            X.C63683i7.A0A(r8, r9)
            com.instagram.phonenumber.model.CountryCodeData r0 = r13.A04
            java.lang.String r0 = r0.A02()
            r5.setText(r0)
            com.instagram.phonenumber.model.CountryCodeData r0 = r13.A04
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x0072
        L_0x0060:
            r5.setContentDescription(r1)
        L_0x0063:
            r11 = r15
            if (r14 == 0) goto L_0x00f6
            java.lang.String r2 = r14.A01
            java.lang.String r13 = r14.A00
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00f1
            goto L_0x007b
        L_0x0071:
            r0 = r1
        L_0x0072:
            r1 = r0
            goto L_0x0060
        L_0x0074:
            java.lang.String r0 = r0.A01
            java.lang.Long r7 = X.AnonymousClass0wJ.A0d(r0)
            goto L_0x0032
        L_0x007b:
            android.app.Activity r3 = r10.A00     // Catch:{ Exception -> 0x0100 }
            com.facebook.phonenumbers.PhoneNumberUtil r1 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r3)     // Catch:{ Exception -> 0x0100 }
            com.instagram.phonenumber.model.CountryCodeData r0 = r10.A04     // Catch:{ Exception -> 0x0100 }
            java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x0100 }
            X.4Np r4 = r1.A0A(r2, r0)     // Catch:{ Exception -> 0x0100 }
            int r2 = r4.A00     // Catch:{ Exception -> 0x0100 }
            com.facebook.phonenumbers.PhoneNumberUtil r1 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r3)     // Catch:{ Exception -> 0x0100 }
            int r0 = r4.A00     // Catch:{ Exception -> 0x0100 }
            java.lang.String r1 = r1.A0B(r0)     // Catch:{ Exception -> 0x0100 }
            com.instagram.phonenumber.model.CountryCodeData r0 = new com.instagram.phonenumber.model.CountryCodeData     // Catch:{ Exception -> 0x0100 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0100 }
            r10.A04 = r0     // Catch:{ Exception -> 0x0100 }
            if (r5 == 0) goto L_0x00b2
            java.lang.String r0 = r0.A02()     // Catch:{ Exception -> 0x0100 }
            r5.setText(r0)     // Catch:{ Exception -> 0x0100 }
            com.instagram.phonenumber.model.CountryCodeData r0 = r10.A04     // Catch:{ Exception -> 0x0100 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r0.A02     // Catch:{ Exception -> 0x0100 }
            if (r0 != 0) goto L_0x00ca
        L_0x00af:
            r5.setContentDescription(r1)     // Catch:{ Exception -> 0x0100 }
        L_0x00b2:
            r10.A02()     // Catch:{ Exception -> 0x0100 }
            android.widget.EditText r3 = r10.A01     // Catch:{ Exception -> 0x0100 }
            r15 = 1
            long r0 = r4.A02     // Catch:{ Exception -> 0x0100 }
            java.lang.Object[] r1 = X.C18240wQ.A1b(r0)     // Catch:{ Exception -> 0x0100 }
            java.lang.String r0 = "%d"
            r2 = 0
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ Exception -> 0x0100 }
            r3.setText(r0)     // Catch:{ Exception -> 0x0100 }
            goto L_0x00cc
        L_0x00c9:
            r0 = r1
        L_0x00ca:
            r1 = r0
            goto L_0x00af
        L_0x00cc:
            if (r5 != 0) goto L_0x00e5
            com.instagram.phonenumber.model.CountryCodeData r0 = r10.A04     // Catch:{ Exception -> 0x0100 }
            java.lang.String r1 = r0.A00()     // Catch:{ Exception -> 0x0100 }
            android.text.Editable r0 = r3.getText()     // Catch:{ Exception -> 0x0100 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ Exception -> 0x0100 }
            java.lang.String r0 = "%s %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ Exception -> 0x0100 }
            r3.setText(r0)     // Catch:{ Exception -> 0x0100 }
        L_0x00e5:
            java.lang.String r12 = ""
            long r0 = r4.A02     // Catch:{ Exception -> 0x0100 }
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0100 }
            r10.A01(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0100 }
            goto L_0x0107
        L_0x00f1:
            r15 = 0
            r14 = 0
            java.lang.String r12 = "no_number"
            goto L_0x00fc
        L_0x00f6:
            r15 = 0
            r14 = 0
            java.lang.String r12 = "no_number"
            java.lang.String r13 = ""
        L_0x00fc:
            r10.A01(r11, r12, r13, r14, r15)
            goto L_0x0107
        L_0x0100:
            r15 = 0
            r14 = 0
            java.lang.String r12 = "parse_failed"
            r10.A01(r11, r12, r13, r14, r15)
        L_0x0107:
            android.widget.EditText r1 = r10.A01
            boolean r0 = X.C09860go.A0p(r1)
            if (r0 != 0) goto L_0x0118
            boolean r0 = r1 instanceof android.widget.AutoCompleteTextView
            if (r0 == 0) goto L_0x0118
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            r1.dismissDropDown()
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YI.A00(X.3YI, X.1yy, java.lang.Integer):void");
    }

    public final void A02() {
        EditText editText = this.A01;
        editText.removeTextChangedListener(this.A06);
        PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher = new PhoneNumberFormattingTextWatcher(this.A04.A00);
        this.A06 = phoneNumberFormattingTextWatcher;
        editText.addTextChangedListener(phoneNumberFormattingTextWatcher);
    }

    public AnonymousClass3YI(Activity activity, EditText editText, TextView textView, C10300i6 r5, CountryCodeData countryCodeData, AnonymousClass265 r7) {
        this.A00 = activity;
        this.A01 = editText;
        this.A02 = textView;
        this.A05 = r7;
        this.A03 = r5;
        if (countryCodeData == null) {
            this.A04 = C60053Nl.A00(activity);
        } else {
            this.A04 = countryCodeData;
        }
    }

    private void A01(Integer num, String str, String str2, String str3, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        Activity activity = this.A00;
        CountryCodeData countryCodeData = this.A04;
        C10300i6 r2 = this.A03;
        AnonymousClass265 r5 = this.A05;
        String A012 = C61893Wf.A01(activity, countryCodeData, str3, (String) null, C63573hp.A04(activity, r2, r5, num), AnonymousClass3PY.A01(activity, r2, num));
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r2), "prefill_phone_number"), 2500);
        double d = (double) currentTimeMillis;
        AnonymousClass0wJ.A1A(A0I, d, AnonymousClass269.A00());
        AnonymousClass269.A08(A0I, r5.A01);
        C18180wK.A1B(A0I, d);
        A0I.A0Q("is_valid", Boolean.valueOf(z));
        A0I.A0T("phone_num_source", str2);
        C04220Ms.A0B(activity, 0);
        A0I.A0Q("found_contacts_me_phone", Boolean.valueOf(AnonymousClass0wJ.A1W(C63573hp.A03(activity))));
        A0I.A0T("available_prefills", A012);
        A0I.A0T("error", str);
        A0I.Bb4();
    }
}
