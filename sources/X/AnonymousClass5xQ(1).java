package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.barcelona.R;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.5xQ  reason: invalid class name */
public final class AnonymousClass5xQ extends C34640IcN implements C21839C2o, C82034oy {
    public static final String __redex_internal_original_name = "EditAutofillEntryFragment";
    public Intent A00;
    public ScrollView A01;
    public C121007Dp A02;
    public UserSession A03;
    public SpinnerImageView A04;
    public AutofillData A05;
    public boolean A06 = false;

    public static boolean A03(Map map) {
        if (Collections.unmodifiableMap(map).size() != 1 || !Collections.unmodifiableMap(map).containsKey("id")) {
            return false;
        }
        return true;
    }

    public final String getModuleName() {
        return "autofill_entry_edit";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        A02(r9, r7);
        r9.A00.putStringArrayListExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS", r5.A02());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010b, code lost:
        A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass5xQ r9) {
        /*
            X.7Dp r0 = r9.A02
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r1 = X.C121007Dp.A00(r0)
            android.os.Bundle r2 = r9.requireArguments()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r3 = X.C18190wL.A0j(r2, r0)
            int r0 = r3.hashCode()
            r2 = -1
            switch(r0) {
                case -1312919206: goto L_0x0054;
                case -1213125907: goto L_0x004a;
                case -816846443: goto L_0x0040;
                case -314094605: goto L_0x0036;
                case -108875093: goto L_0x002c;
                case 165505526: goto L_0x0022;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r7 = "EDITED_AUTOFILL"
            java.lang.String r4 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
            java.lang.String r8 = "id"
            switch(r2) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00d9;
                case 3: goto L_0x0091;
                case 4: goto L_0x010f;
                case 5: goto L_0x005e;
                default: goto L_0x0021;
            }
        L_0x0021:
            return
        L_0x0022:
            java.lang.String r0 = "multiple_contact_add_contact_info_fragment"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            r2 = 5
            goto L_0x0018
        L_0x002c:
            java.lang.String r0 = "save_autofill_request_fragment"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            r2 = 4
            goto L_0x0018
        L_0x0036:
            java.lang.String r0 = "multiple_contact_info_fragment"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            r2 = 3
            goto L_0x0018
        L_0x0040:
            java.lang.String r0 = "browser_settings_fragment"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            r2 = 2
            goto L_0x0018
        L_0x004a:
            java.lang.String r0 = "autofill_request_fragment"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            r2 = 1
            goto L_0x0018
        L_0x0054:
            java.lang.String r0 = "account_settings_fragment"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            r2 = 0
            goto L_0x0018
        L_0x005e:
            java.util.Map r2 = r1.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            boolean r1 = r0.isEmpty()
            boolean r0 = A03(r2)
            if (r1 != 0) goto L_0x010b
            if (r0 != 0) goto L_0x010b
            android.content.Context r1 = X.C18230wP.A0A(r9)
            com.instagram.service.session.UserSession r0 = r9.A03
            X.79a r5 = X.C1201579a.A00(r1, r0)
            X.7Dp r0 = r9.A02
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r3 = X.C121007Dp.A00(r0)
            X.6dR r2 = new X.6dR
            r2.<init>(r9)
            android.content.Context r1 = X.C18230wP.A0A(r9)
            com.instagram.service.session.UserSession r0 = r5.A02
            X.C121307Fk.A01(r1, r3, r2, r0)
            java.lang.String r7 = "START_ADD_CONTACT_AUTOFILL"
            goto L_0x00fe
        L_0x0091:
            java.util.Map r2 = r1.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            boolean r1 = r0.isEmpty()
            boolean r0 = A03(r2)
            if (r1 != 0) goto L_0x010b
            if (r0 != 0) goto L_0x010b
            android.content.Context r1 = X.C18230wP.A0A(r9)
            com.instagram.service.session.UserSession r0 = r9.A03
            X.79a r5 = X.C1201579a.A00(r1, r0)
            X.7Dp r0 = r9.A02
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r6 = X.C121007Dp.A00(r0)
            android.content.Context r3 = X.C18230wP.A0A(r9)
            java.util.Map r0 = X.C86164wN.A0l(r6)
            java.lang.String r2 = X.C18220wO.A0r(r8, r0)
            if (r2 == 0) goto L_0x00d2
            android.content.SharedPreferences r0 = r5.A01
            android.content.SharedPreferences$Editor r1 = r0.edit()
            org.json.JSONObject r0 = r6.A01()
            java.lang.String r0 = r0.toString()
            X.C18180wK.A0v(r1, r2, r0)
        L_0x00d2:
            com.instagram.service.session.UserSession r1 = r5.A02
            r0 = 0
            X.C121307Fk.A01(r3, r6, r0, r1)
            goto L_0x00fe
        L_0x00d9:
            java.util.Map r2 = r1.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            boolean r1 = r0.isEmpty()
            boolean r0 = A03(r2)
            if (r1 != 0) goto L_0x010b
            if (r0 != 0) goto L_0x010b
            android.content.Context r1 = X.C18230wP.A0A(r9)
            com.instagram.service.session.UserSession r0 = r9.A03
            X.79a r5 = X.C1201579a.A00(r1, r0)
            X.7Dp r0 = r9.A02
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = X.C121007Dp.A00(r0)
            r5.A03(r0)
        L_0x00fe:
            A02(r9, r7)
            android.content.Intent r1 = r9.A00
            java.util.ArrayList r0 = r5.A02()
            r1.putStringArrayListExtra(r4, r0)
            return
        L_0x010b:
            A00(r9)
            return
        L_0x010f:
            android.content.Intent r2 = r9.A00
            org.json.JSONObject r0 = r1.A01()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING"
            r2.putExtra(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xQ.A01(X.5xQ):void");
    }

    public static void A02(AnonymousClass5xQ r2, String str) {
        BK1 A052 = C19541Ay2.A05(r2, C18170wI.A00(177));
        A052.A3B = str;
        C18180wK.A1K(A052.A0B(), r2.A03);
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public static void A00(AnonymousClass5xQ r7) {
        C1201579a A002 = C1201579a.A00(C18230wP.A0A(r7), r7.A03);
        Bundle bundle = r7.mArguments;
        if (bundle == null || !"multiple_contact_info_fragment".equals(bundle.getString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"))) {
            C18190wL.A11(A002.A01);
            UserSession userSession = A002.A02;
            try {
                GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
                A004.A0F("", "sensitive_string_value");
                A003.A0B(A004, "access_token");
                C67463zb A005 = C67463zb.A00();
                A005.A02(A003, "request");
                C121307Fk.A02(C121307Fk.A00(new C67473zc(A005, AnonymousClass5Fm.class, "IABAutofillDeleteData"), userSession));
            } catch (IOException e) {
                C10450iM.A06("AutofillGraphQLRequest", "Error creating delete autofill request", e);
            }
            A02(r7, "DELETED_AUTOFILL");
            r7.A00.putStringArrayListExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS", A002.A02());
            return;
        }
        Map map = r7.A05.A00;
        String A0r = C18220wO.A0r("id", Collections.unmodifiableMap(map));
        if (A0r != null) {
            C18180wK.A0u(A002.A01.edit(), A0r);
        }
        UserSession userSession2 = A002.A02;
        try {
            String A0r2 = C18220wO.A0r("id", map);
            if (A0r2 == null) {
                C10450iM.A03("AutofillGraphQLRequest", "Error creating delete autofill request for multiple entries");
                return;
            }
            GQLCallInputCInputShape0S0000000 A006 = GraphQlCallInput.A00();
            A006.A0F(A0r2, "ent_id");
            C67463zb A007 = C67463zb.A00();
            A007.A02(A006, "request");
            C121307Fk.A02(C121307Fk.A00(new C67473zc(A007, AnonymousClass5Fl.class, "IABAutofillDeleteDataMultiEntries"), userSession2));
        } catch (IOException e2) {
            C10450iM.A06("AutofillGraphQLRequest", "Error creating delete autofill request", e2);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        AnonymousClass4u2.A07(r3, 2131824328);
        r3.A7X(C86164wN.A0L(this, r3, 53), 2131835122);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        if (r1.equals(r0) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        r1 = r4.getStringArrayList("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r1 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (r1.isEmpty() != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        r0 = r1.get(r4.getInt(X.I17.A00(71), -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0096, code lost:
        if (r1.equals(r0) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
        r0 = r4.getString("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009e, code lost:
        if (r0 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.A05 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData(X.C18250wR.A0j(r0));
        r5.A06 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        r1 = X.C18180wK.A0a("Illegal JSON for autofill save");
        X.C14030oh.A09(-607710999, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0040, code lost:
        r1 = X.C18230wP.A0B();
        r5.A00 = r1;
        r1.putExtras(requireArguments());
        requireActivity().setResult(-1, r5.A00);
        super.onCreate(r6);
        X.C14030oh.A09(-1015802979, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -838690933(0xffffffffce02978b, float:-5.477424E8)
            int r2 = X.C14030oh.A02(r0)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            android.view.Window r1 = r0.getWindow()
            r1.getClass()
            r0 = 16
            r1.setSoftInputMode(r0)
            android.os.Bundle r0 = r5.requireArguments()
            com.instagram.service.session.UserSession r0 = X.C18180wK.A0V(r0)
            r5.A03 = r0
            android.os.Bundle r4 = r5.mArguments
            if (r4 == 0) goto L_0x00c3
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r1 = r4.getString(r0)
            if (r1 == 0) goto L_0x00bc
            int r0 = r1.hashCode()
            r3 = -1
            switch(r0) {
                case -1312919206: goto L_0x0060;
                case -1213125907: goto L_0x0063;
                case -816846443: goto L_0x0066;
                case -314094605: goto L_0x0069;
                case -108875093: goto L_0x0090;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.util.Map r1 = java.util.Collections.emptyMap()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r0.<init>((java.util.Map) r1)
            r5.A05 = r0
        L_0x0040:
            android.content.Intent r1 = X.C18230wP.A0B()
            r5.A00 = r1
            android.os.Bundle r0 = r5.requireArguments()
            r1.putExtras(r0)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            android.content.Intent r0 = r5.A00
            r1.setResult(r3, r0)
            super.onCreate(r6)
            r0 = -1015802979(0xffffffffc374139d, float:-244.07661)
            X.C14030oh.A09(r0, r2)
            return
        L_0x0060:
            java.lang.String r0 = "account_settings_fragment"
            goto L_0x0092
        L_0x0063:
            java.lang.String r0 = "autofill_request_fragment"
            goto L_0x006b
        L_0x0066:
            java.lang.String r0 = "browser_settings_fragment"
            goto L_0x006b
        L_0x0069:
            java.lang.String r0 = "multiple_contact_info_fragment"
        L_0x006b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
            java.util.ArrayList r1 = r4.getStringArrayList(r0)
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0035
            r0 = 71
            java.lang.String r0 = X.I17.A00(r0)
            int r0 = r4.getInt(r0, r3)
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x009e
        L_0x0090:
            java.lang.String r0 = "save_autofill_request_fragment"
        L_0x0092:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING"
            java.lang.String r0 = r4.getString(r0)
        L_0x009e:
            if (r0 == 0) goto L_0x0035
            org.json.JSONObject r1 = X.C18250wR.A0j(r0)     // Catch:{ JSONException -> 0x00af }
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData     // Catch:{ JSONException -> 0x00af }
            r0.<init>((org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x00af }
            r5.A05 = r0     // Catch:{ JSONException -> 0x00af }
            r0 = 1
            r5.A06 = r0     // Catch:{ JSONException -> 0x00af }
            goto L_0x0040
        L_0x00af:
            java.lang.String r0 = "Illegal JSON for autofill save"
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
            r0 = -607710999(0xffffffffdbc710e9, float:-1.12064227E17)
            X.C14030oh.A09(r0, r2)
            throw r1
        L_0x00bc:
            java.lang.String r0 = "No source request fragment provided"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x00c3:
            java.lang.String r0 = "No arguments provided"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xQ.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1565316010);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_autofill_entry, viewGroup, false);
        this.A04 = (SpinnerImageView) inflate.requireViewById(R.id.loading_spinner);
        this.A01 = (ScrollView) inflate.requireViewById(R.id.scrollView);
        this.A02 = new C121007Dp(C18230wP.A0A(this), inflate);
        String string = requireArguments().getString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE");
        if (string != null && !string.equals("save_autofill_request_fragment")) {
            View requireViewById = inflate.requireViewById(R.id.delete_button);
            TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.autofill_fbpay_disclosure);
            C18180wK.A0z(A0L);
            if (this.A06) {
                requireViewById.setVisibility(0);
                UserSession userSession = this.A03;
                AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
                if (C63803iN.A05(r4, userSession, 36310512515088493L).booleanValue()) {
                    int i = 2131821693;
                    if (C63803iN.A05(r4, this.A03, 36310512515743859L).booleanValue()) {
                        i = 2131821694;
                    }
                    SpannableStringBuilder A0E = C18200wM.A0E(getString(i));
                    AnonymousClass3Zw.A00(A0E, new IDxCSpanShape187S0100000_1_I2(requireContext().getColor(R.color.igds_primary_button), 3, this), getString(2131821695));
                    A0L.setText(A0E);
                    A0L.setVisibility(0);
                }
            }
            TextView A0L2 = AnonymousClass0wJ.A0L(inflate, R.id.contact_info_management_disclosure);
            C18180wK.A0z(A0L2);
            SpannableStringBuilder A0E2 = C18200wM.A0E(getString(2131824329));
            AnonymousClass3Zw.A00(A0E2, new IDxCSpanShape187S0100000_1_I2(requireContext().getColor(R.color.igds_primary_button), 2, this), getString(2131832067));
            A0L2.setText(A0E2);
            inflate.requireViewById(R.id.delete_button).setOnClickListener(C18190wL.A0H(this, 41));
        }
        C14030oh.A09(406844832, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1250906962);
        super.onPause();
        this.A05 = C121007Dp.A00(this.A02);
        C14030oh.A09(-2046599562, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1910992425);
        super.onResume();
        C121007Dp r3 = this.A02;
        Map A0l = C86164wN.A0l(this.A05);
        IgFormField igFormField = r3.A07;
        String A0r = C18220wO.A0r("given-name", A0l);
        if (A0r == null) {
            A0r = "";
        }
        igFormField.setText(A0r);
        IgFormField igFormField2 = r3.A06;
        String A0r2 = C18220wO.A0r("family-name", A0l);
        if (A0r2 == null) {
            A0r2 = "";
        }
        igFormField2.setText(A0r2);
        IgFormField igFormField3 = r3.A03;
        String A0r3 = C18220wO.A0r("address-line1", A0l);
        if (A0r3 == null) {
            A0r3 = "";
        }
        igFormField3.setText(A0r3);
        IgFormField igFormField4 = r3.A04;
        String A0r4 = C18220wO.A0r("address-line2", A0l);
        if (A0r4 == null) {
            A0r4 = "";
        }
        igFormField4.setText(A0r4);
        IgFormField igFormField5 = r3.A01;
        String A0r5 = C18220wO.A0r("address-level1", A0l);
        if (A0r5 == null) {
            A0r5 = "";
        }
        igFormField5.setText(A0r5);
        IgFormField igFormField6 = r3.A02;
        String A0r6 = C18220wO.A0r("address-level2", A0l);
        if (A0r6 == null) {
            A0r6 = "";
        }
        igFormField6.setText(A0r6);
        IgFormField igFormField7 = r3.A08;
        String A0r7 = C18220wO.A0r("postal-code", A0l);
        if (A0r7 == null) {
            A0r7 = "";
        }
        igFormField7.setText(A0r7);
        IgFormField igFormField8 = r3.A05;
        String A0r8 = C18220wO.A0r("email", A0l);
        if (A0r8 == null) {
            A0r8 = "";
        }
        igFormField8.setText(A0r8);
        IgFormField igFormField9 = r3.A09;
        String A0r9 = C18220wO.A0r("tel", A0l);
        if (A0r9 == null) {
            A0r9 = "";
        }
        igFormField9.setText(A0r9);
        r3.A00 = C18220wO.A0r("id", A0l);
        C14030oh.A09(890571022, A022);
    }
}
