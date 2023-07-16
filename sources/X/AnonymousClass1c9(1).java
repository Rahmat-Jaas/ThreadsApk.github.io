package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.facebook.redex.IDxObjectShape796S0100000_1_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.barcelona.R;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.ui.text.FreeAutoCompleteTextView;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1c9  reason: invalid class name */
public final class AnonymousClass1c9 extends C34640IcN implements C82424pb, C82034oy, CallerContextable {
    public static final long A0R = TimeUnit.SECONDS.toMillis(10);
    public static final String __redex_internal_original_name = "LookupFragment";
    public int A00;
    public int A01;
    public Dialog A02;
    public View A03;
    public TextView A04;
    public C82394pY A05;
    public C82394pY A06;
    public FxSsoViewModel A07;
    public AnonymousClass3V1 A08;
    public AnonymousClass3HV A09;
    public C24661jn A0A;
    public C24751jz A0B;
    public C07530bf A0C;
    public C18330wh A0D;
    public FreeAutoCompleteTextView A0E;
    public InlineErrorMessageView A0F;
    public ProgressButton A0G;
    public Integer A0H;
    public String A0I = "";
    public boolean A0J = false;
    public boolean A0K = false;
    public boolean A0L;
    public final Handler A0M = C18250wR.A08();
    public final View.OnClickListener A0N = C18190wL.A0H(this, 500);
    public final List A0O = AnonymousClass0wJ.A0v();
    public final C84214sk A0P = new C71844Km(this);
    public final Runnable A0Q = new AnonymousClass4PE(this);

    public static void A06(AnonymousClass1c9 r10, C61373Sy r11) {
        String str;
        Integer num = r10.A0H;
        String str2 = "";
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "Phone";
                    break;
                case 2:
                    str = "Username";
                    break;
                default:
                    str = "Email";
                    break;
            }
        } else {
            str = str2;
        }
        if (r11 != null) {
            str2 = r11.A01;
        }
        C07530bf r1 = r10.A0C;
        C04220Ms.A0B(r1, 0);
        AnonymousClass0wJ.A1R(str2, str);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r1), "prefill_lookup_identifier"), 2499);
        AnonymousClass0wJ.A1B(A0I2, A002, A003);
        C63683i7.A05(A0I2);
        C18180wK.A19(A0I2);
        A0I2.A0Q("prefilled", true);
        C18180wK.A1A(A0I2, A003);
        AnonymousClass269.A08(A0I2, "user_lookup");
        A0I2.A0T("cp_prefill_type", str);
        A0I2.A0T("source", str2);
        A0I2.Bb4();
    }

    public final String getModuleName() {
        return "password_lookup";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FreeAutoCompleteTextView freeAutoCompleteTextView = this.A0E;
        freeAutoCompleteTextView.addOnLayoutChangeListener(new C65573tf(AnonymousClass0wJ.A0B(this), freeAutoCompleteTextView, freeAutoCompleteTextView));
        Context requireContext = requireContext();
        AnonymousClass3HV r8 = AnonymousClass3HV.A04;
        if (r8 == null) {
            AnonymousClass3R8.A00(requireContext);
            r8 = new AnonymousClass3HV();
            AnonymousClass3HV.A04 = r8;
        }
        this.A09 = r8;
        r8.A00(requireContext(), this, this.A0C, C18240wQ.A0O(requireContext(), this), new IDxObjectShape796S0100000_1_I2(this, 0));
        String string = requireArguments().getString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING");
        Integer num = AnonymousClass006.A0C;
        C04220Ms.A0B(num, 0);
        EnumSet of = EnumSet.of(AnonymousClass24N.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE, AnonymousClass24N.PHONE_NUMBER_SOURCE_FB_FIRST_PARTY, AnonymousClass24N.PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID);
        C04220Ms.A06(of);
        EnumSet complementOf = EnumSet.complementOf(of);
        C04220Ms.A06(complementOf);
        List<C61583Uh> A052 = C63573hp.A05(requireActivity(), this.A0C, AnonymousClass265.A1c, complementOf);
        Context requireContext2 = requireContext();
        C07530bf r9 = this.A0C;
        List<C61583Uh> A012 = AnonymousClass3PY.A01(requireContext(), this.A0C, num);
        JSONArray A0i = C18250wR.A0i();
        for (C61583Uh A002 : A012) {
            try {
                A0i.put(A002.A00());
            } catch (JSONException unused) {
            }
        }
        JSONArray A0i2 = C18250wR.A0i();
        for (C61583Uh A003 : A052) {
            try {
                A0i2.put(A003.A00());
            } catch (JSONException unused2) {
            }
        }
        List list = this.A0O;
        H1T A0N2 = AnonymousClass0wJ.A0N(r9);
        A0N2.A0J("accounts/contact_point_prefill/");
        C63213h0.A04(A0N2, C18220wO.A0g(requireContext2, A0N2, "usage", "account_recovery_usage"));
        A0N2.A0P("phone_id", C18190wL.A0l(r9));
        A0N2.A0O("guid", C18230wP.A0i(requireContext2));
        if (list != null && !list.isEmpty()) {
            JSONArray A0i3 = C18250wR.A0i();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18210wN.A1R(it, A0i3);
            }
            C18230wP.A1I(A0N2, A0i3);
        }
        JSONArray A0i4 = C18250wR.A0i();
        int i = 0;
        while (i < A0i.length()) {
            try {
                A0i4.put(A0i.getJSONObject(i));
                i++;
            } catch (JSONException unused3) {
                C10450iM.A03("Account recovery identifier filter", "Invalid Json");
            }
        }
        for (int i2 = 0; i2 < A0i2.length(); i2++) {
            A0i4.put(A0i2.getJSONObject(i2));
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty("login_page")) {
            JSONObject A0y = C18230wP.A0y();
            A0y.put("type", "omnistring");
            A0y.put("source", "login_page");
            A0y.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, string);
            A0i4.put(A0y);
        }
        if (A0i4.length() > 0) {
            A0N2.A0O("client_contact_points", A0i4.toString());
        }
        C32165H8c A0T = C18180wK.A0T(A0N2, C22251Tz.class, C60433Pa.class);
        A0T.A00 = new C24221hh(this);
        C31155GhB.A03(A0T);
        C18250wR.A08().postDelayed(new AnonymousClass4PD(this), 4000);
    }

    public static Integer A01(String str) {
        if (C18240wQ.A1V(str.trim(), Patterns.EMAIL_ADDRESS)) {
            return AnonymousClass006.A00;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '#' && charAt != '+' && charAt != ' ' && charAt != '-' && charAt != '(' && charAt != ')' && charAt != '.' && !Character.isDigit(charAt)) {
                return AnonymousClass006.A0C;
            }
        }
        return AnonymousClass006.A01;
    }

    public static String A02(AnonymousClass1c9 r0) {
        return C18180wK.A0f(r0.A0E);
    }

    public static void A04(AnonymousClass1c9 r3) {
        Bundle bundle;
        FreeAutoCompleteTextView freeAutoCompleteTextView = r3.A0E;
        if (freeAutoCompleteTextView != null && C09860go.A0p(freeAutoCompleteTextView) && (bundle = r3.mArguments) != null && bundle.containsKey("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING")) {
            FreeAutoCompleteTextView freeAutoCompleteTextView2 = r3.A0E;
            String string = r3.mArguments.getString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING");
            if (string != null) {
                freeAutoCompleteTextView2.setText(string);
                r3.A0H = A01(string);
                A06(r3, (C61373Sy) null);
            }
        }
    }

    public static void A05(AnonymousClass1c9 r8) {
        String str;
        String A0f = C18180wK.A0f(r8.A0E);
        try {
            str = C63573hp.A01(r8.requireActivity(), r8.A0C, AnonymousClass265.A1c, AnonymousClass006.A0C);
        } catch (IOException unused) {
            str = null;
        }
        List list = r8.A0O;
        if (!(!list.isEmpty())) {
            list = AnonymousClass0wJ.A0v();
        }
        Context requireContext = r8.requireContext();
        C07530bf r6 = r8.A0C;
        H1T A0N2 = AnonymousClass0wJ.A0N(r6);
        A0N2.A0J("users/lookup/");
        C63213h0.A02(requireContext, A0N2, "q", A0f);
        A0N2.A0O("directly_sign_in", "true");
        C18180wK.A1J(A0N2, r6, "waterfall_id", AnonymousClass269.A04());
        A0N2.A0R("is_wa_installed", C09650fs.A07(requireContext));
        A0N2.A0P("country_codes", str);
        C18240wQ.A1A(A0N2, C26621qw.class, C59923My.class);
        A0N2.A06();
        if (!list.isEmpty()) {
            A0N2.A0O("google_id_tokens", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
        }
        if (AnonymousClass0fO.A00(requireContext)) {
            A0N2.A0O("android_build_type", C18240wQ.A0g(C10370iE.A00().name()));
        }
        C32165H8c A022 = A0N2.A02();
        A022.A00 = new AnonymousClass1iT(r8, A0f);
        C31155GhB.A03(A022);
    }

    public final void A07() {
        AnonymousClass3V1 r3 = new AnonymousClass3V1();
        Integer num = this.A0H;
        if (num != null) {
            AnonymousClass267.A01(r3.A00, AnonymousClass267.A03, num);
        }
        Integer A012 = A01(C18180wK.A0f(this.A0E));
        Bundle bundle = r3.A00;
        AnonymousClass267.A01(bundle, AnonymousClass267.A05, A012);
        AnonymousClass267.A02(bundle, this);
        C07530bf r2 = this.A0C;
        AnonymousClass265 r4 = AnonymousClass265.A1c;
        C04220Ms.A0B(r2, 0);
        USLEBaseShape0S0000000 A002 = C62713aZ.A00(r2, "user_lookup");
        A002.A0T("cp_type_given", bundle.getString(C18240wQ.A0g("CP_TYPE_GIVEN")));
        A002.Bb4();
        this.A0G.setShowProgressBar(true);
        AnonymousClass01V.A0p.markerStart(725096220);
        AnonymousClass01V.A0p.markerAnnotate(725096220, "flow", "prod");
        AnonymousClass01V.A0p.markerStart(725096125);
        AnonymousClass01V.A0p.markerAnnotate(725096125, "flow", "prod");
        synchronized (this) {
            this.A0L = true;
            int i = this.A00;
            if (i <= 0 || i <= this.A01) {
                C54192z3.A00(this.A0C, r4, "token_ready");
                if (A08()) {
                    A05(this);
                }
            } else {
                C54192z3.A00(this.A0C, r4, "wait_for_time_out");
                Handler handler = this.A0M;
                Runnable runnable = this.A0Q;
                handler.postDelayed(new AnonymousClass4RY(this, runnable), A0R);
            }
        }
    }

    public final boolean A08() {
        FragmentActivity activity;
        if (this.mView == null || (activity = getActivity()) == null || !isAdded() || this.A0E == null || this.mRemoving || this.mDetached || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    public final C10300i6 getSession() {
        return this.A0C;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C67363zQ.A06(intent, this.A0C, this.A0P, i2);
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A0C, "user_lookup");
        return false;
    }

    public static int A00(IDxEListenerShape223S0100000_1_I2 iDxEListenerShape223S0100000_1_I2, int i) {
        int A032 = C14030oh.A03(i);
        AnonymousClass1c9 r3 = (AnonymousClass1c9) iDxEListenerShape223S0100000_1_I2.A00;
        if (!TextUtils.isEmpty((CharSequence) ((M5J) r3.A07.A00.getValue()).A08())) {
            r3.A04.setText((CharSequence) ((M5J) r3.A07.A00.getValue()).A08());
            return A032;
        }
        r3.A0B.A09(r3.A04, r3, AnonymousClass265.A1c);
        return A032;
    }

    private void A03() {
        Activity rootActivity;
        C18240wQ.A10(this);
        FragmentActivity activity = getActivity();
        if (activity == null || activity.getWindow() == null) {
            getRootActivity();
            if (C18190wL.A0F(this) != null) {
                rootActivity = getRootActivity();
            } else {
                return;
            }
        } else {
            rootActivity = getActivity();
        }
        rootActivity.getWindow().setSoftInputMode(3);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.Cqb(2131830193);
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = C14030oh.A02(-1646096715);
        super.onActivityCreated(bundle);
        this.A0E.requestFocus();
        C14030oh.A09(100643909, A022);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1220661028);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A0C = C18210wN.A0N(this);
        this.A08 = AnonymousClass3V1.A00(bundle2);
        FxSsoViewModel A0X = C18200wM.A0X(this);
        this.A07 = A0X;
        this.A0B = new C24751jz(this, this, A0X, this.A0C, AnonymousClass265.A1c, (String) null);
        if (bundle2 != null) {
            this.A0J = bundle2.getBoolean("is_current_user_fb_connected", false);
        }
        AnonymousClass3YT.A00.A02(this.A0C, "user_lookup");
        C14030oh.A09(-1493479769, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean A052;
        int A022 = C14030oh.A02(1289814972);
        this.A0L = false;
        View inflate = layoutInflater.inflate(R.layout.fragment_lookup, viewGroup, false);
        AnonymousClass0TJ r6 = AnonymousClass0TJ.A05;
        if (C63173fJ.A05(r6, 18305910824769438L)) {
            inflate = layoutInflater.inflate(R.layout.fragment_lookup_v2, viewGroup, false);
        }
        FreeAutoCompleteTextView freeAutoCompleteTextView = (FreeAutoCompleteTextView) inflate.requireViewById(R.id.fragment_lookup_edittext);
        this.A0E = freeAutoCompleteTextView;
        freeAutoCompleteTextView.addTextChangedListener(new IDxWAdapterShape193S0100000_1_I2(this, 1));
        C18210wN.A12(this.A0E, this, 4);
        this.A0E.addTextChangedListener(C64543mW.A00(this.A0C));
        ProgressButton A0O2 = C18210wN.A0O(inflate);
        this.A0G = A0O2;
        A0O2.setOnClickListener(this.A0N);
        this.A0F = (InlineErrorMessageView) inflate.requireViewById(R.id.inline_error);
        InlineErrorMessageView.A03(C18220wO.A0J(inflate, R.id.container));
        View requireViewById = inflate.requireViewById(R.id.need_more_help_text_view);
        Integer num = AnonymousClass006.A01;
        AnonymousClass7FY.A02(requireViewById, num);
        AnonymousClass0wJ.A16(requireViewById, HttpStatus.SC_NOT_IMPLEMENTED, this);
        this.A04 = AnonymousClass0wJ.A0L(inflate, R.id.login_facebook);
        this.A03 = inflate.requireViewById(R.id.login_facebook_container);
        AnonymousClass7FY.A02(this.A04, num);
        AnonymousClass0wJ.A16(this.A04, HttpStatus.SC_BAD_GATEWAY, this);
        AnonymousClass0TJ r7 = AnonymousClass0TJ.A06;
        if (C63173fJ.A05(r7, 2324144822639791137L)) {
            A052 = false;
        } else {
            A052 = C63173fJ.A05(r6, 18301813426031648L);
        }
        TextView textView = this.A04;
        if (A052) {
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instagram_facebook_circle_filled_16, 0, 0, 0);
            if (C63173fJ.A04(r7, 18864763379384500L).equals("button")) {
                C18180wK.A0s(requireContext(), this.A04, R.color.igds_primary_text);
                C63163fI.A03(this.A04, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
                this.A03.setBackgroundResource(R.drawable.secondary_button_selector_panavision_soft_update);
            } else if (C63173fJ.A04(r7, 18864763379384500L).equals("link")) {
                C18180wK.A0s(requireContext(), this.A04, R.color.igds_primary_button);
                C63163fI.A03(this.A04, R.color.igds_primary_button);
            }
            boolean isEmpty = TextUtils.isEmpty((CharSequence) C18180wK.A0d(this.A07.A00));
            TextView textView2 = this.A04;
            FxSsoViewModel fxSsoViewModel = this.A07;
            if (!isEmpty) {
                textView2.setText((CharSequence) C18180wK.A0d(fxSsoViewModel.A00));
            } else {
                textView2.setText((CharSequence) C18180wK.A0d(fxSsoViewModel.A01));
                this.A0B.A09(this.A04, this, AnonymousClass265.A1c);
            }
            C18210wN.A16(this, C18230wP.A0J(this.A07.A00), 27);
            IDxEListenerShape223S0100000_1_I2 A0P2 = C18220wO.A0P(this, 39);
            this.A05 = A0P2;
            this.A06 = C18220wO.A0P(this, 40);
            C38040KHr kHr = C38040KHr.A01;
            kHr.A03(A0P2, AnonymousClass45A.class);
            kHr.A03(this.A06, AnonymousClass45B.class);
            C24661jn r0 = new C24661jn(this.A0C, (AnonymousClass1cQ) null, AnonymousClass265.A1c);
            this.A0A = r0;
            registerLifecycleListener(r0);
        } else {
            C18180wK.A0s(requireContext(), textView, R.color.igds_primary_button);
            C63163fI.A03(this.A04, R.color.igds_primary_button);
        }
        C61763Vg.A00(C63313hF.A02(this.A0C, C313625r.A03, AnonymousClass265.A1c, "continue_with_fb_button_shown"), this.A0J);
        C18330wh A012 = C18330wh.A01(this);
        this.A0D = A012;
        A012.A04(AnonymousClass0wJ.A0B(this).getString(2131830080));
        C14030oh.A09(1578474212, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(161679314);
        super.onDestroyView();
        this.A0M.removeCallbacksAndMessages((Object) null);
        this.A0E.removeTextChangedListener(C64543mW.A00(this.A0C));
        this.A0E = null;
        this.A09 = null;
        C18330wh r0 = this.A0D;
        if (r0 != null && (r0.getOwnerActivity() == null || !this.A0D.getOwnerActivity().isDestroyed())) {
            this.A0D.cancel();
        }
        this.A0D = null;
        this.A02 = null;
        C82394pY r2 = this.A05;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass45A.class);
            this.A05 = null;
        }
        C82394pY r22 = this.A06;
        if (r22 != null) {
            C38040KHr.A01.A04(r22, AnonymousClass45B.class);
            this.A06 = null;
        }
        C24661jn r02 = this.A0A;
        if (r02 != null) {
            unregisterLifecycleListener(r02);
            this.A0A = null;
        }
        C14030oh.A09(1597234220, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-1335210386);
        this.A0K = true;
        super.onPause();
        C14030oh.A09(-501608290, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-497958992);
        this.A0K = false;
        super.onResume();
        this.A0G.setEnabled(C18210wN.A1U(C18180wK.A0f(this.A0E)));
        A03();
        C14030oh.A09(481709764, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(981566215);
        A03();
        Dialog dialog = this.A02;
        if (dialog != null && dialog.isShowing()) {
            this.A02.dismiss();
        }
        super.onStop();
        C14030oh.A09(1504913318, A022);
    }
}
