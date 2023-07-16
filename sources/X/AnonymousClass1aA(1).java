package X;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.1aA  reason: invalid class name */
public final class AnonymousClass1aA extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PhoneVerifyFragment";
    public long A00;
    public CountDownTimer A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public ActionButton A05;
    public C10300i6 A06;
    public AnonymousClass3Um A07;
    public C689946i A08;
    public C690046j A09;
    public C690146k A0A;
    public C690246l A0B;
    public C64513mT A0C;
    public C313225m A0D;
    public UserSession A0E;
    public ProgressButton A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public InputMethodManager A0K;
    public final Handler A0L = C18250wR.A08();
    public final C63873iU A0M = C63873iU.A06(this, 69);
    public final C63873iU A0N = C63873iU.A06(this, 70);
    public final Runnable A0O = new AnonymousClass4PK(this);

    public final String getModuleName() {
        return "phone_verify";
    }

    public static void A00(AnonymousClass1aA r6) {
        if (r6.A0D == C313225m.ARGUMENT_TWOFAC_FLOW) {
            AnonymousClass0KW.A00(r6.A0E, "createEnableSMSTwoFactorRequest() additionally includes a checkNotNull in IgApi.Builder to assert that the user session is not null");
            r6.mArguments.getClass();
            C32165H8c A032 = C62403Zn.A03(r6.requireContext(), r6.A0E, r6.mArguments.getString("PHONE_NUMBER"), AnonymousClass0wJ.A0n(r6.A0C.A01).replaceAll("\\D+", ""));
            A032.A00 = r6.A0N;
            r6.schedule(A032);
        }
        UserSession userSession = r6.A0E;
        AnonymousClass0KW.A00(userSession, "createVerifySMSCodeTask() additionally includes a checkNotNull in IgApi.Builder to assert that the user session is not null");
        C32165H8c A042 = C63503hc.A04(userSession, C18250wR.A07(r6).getString("PHONE_NUMBER"), AnonymousClass0wJ.A0n(r6.A0C.A01).replaceAll("\\D+", ""), r6.mArguments.getBoolean("HAS_SMS_CONSENT"));
        A042.A00 = r6.A0N;
        r6.schedule(A042);
    }

    public final C10300i6 getSession() {
        return this.A06;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        this.A05 = r3.Crq(C18190wL.A0H(this, 508), 2131837729);
    }

    public final void onCreate(Bundle bundle) {
        C313225m r0;
        int A022 = C14030oh.A02(-1652015096);
        int A023 = C14030oh.A02(803847063);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
        this.A06 = r2.A02(bundle2);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        this.A07 = new AnonymousClass3Um(bundle);
        this.A00 = SystemClock.elapsedRealtime();
        C14030oh.A09(-1270960520, A023);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            this.A0E = r2.A06(bundle3);
            String A0n = C18200wM.A0n(bundle3.getString("PHONE_NUMBER"));
            this.A0H = A0n;
            if (A0n != null) {
                this.A0H = A0n.replace("-", " ");
            }
        }
        this.A0K = (InputMethodManager) requireActivity().getSystemService("input_method");
        boolean z = false;
        if (bundle3 != null && bundle3.getBoolean("AUTO_CONFIRM_SMS", false)) {
            z = true;
        }
        this.A0I = z;
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null) {
            r0 = C313225m.ARGUMENT_DEFAULT_FLOW;
        } else {
            r0 = C313225m.values()[bundle4.getInt("flow_key")];
        }
        this.A0D = r0;
        this.A0J = C313225m.ARGUMENT_EDIT_PROFILE_FLOW.equals(r0);
        C14030oh.A09(-1298985371, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A0k;
        int A022 = C14030oh.A02(-1682722048);
        int A023 = C14030oh.A02(1504536409);
        boolean z = this.A0J;
        int i = R.layout.fragment_verify;
        if (z) {
            i = R.layout.fragment_verify_new;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.A03 = AnonymousClass0wJ.A0L(inflate, R.id.code_verification_instruction);
        if (this.A0J) {
            this.A0G = getString(2131837716);
            A0k = C18220wO.A0i(inflate.getResources(), this.A0H, 2131834851);
        } else {
            String string = getString(2131837717);
            this.A0G = string;
            A0k = C18220wO.A0k(this, this.A0H, string, 2131837714);
        }
        String str = this.A0G;
        TextView textView = this.A03;
        IDxCListenerShape201S0100000_1_I2 A0H2 = C18190wL.A0H(this, 495);
        SpannableStringBuilder A0E2 = C18200wM.A0E(A0k);
        C18720xk.A00(A0E2, A0H2, str, textView.getCurrentTextColor(), 13);
        C18180wK.A0z(textView);
        textView.setHighlightColor(0);
        textView.setText(A0E2);
        C14030oh.A09(892733533, A023);
        if (this.A0J) {
            ProgressButton A0O2 = C18210wN.A0O(inflate);
            this.A0F = A0O2;
            A0O2.setEnabled(false);
            AnonymousClass0wJ.A16(this.A0F, HttpStatus.SC_INSUFFICIENT_STORAGE, this);
        } else {
            this.A04 = AnonymousClass0wJ.A0L(inflate, R.id.code_verification_instruction);
            String string2 = getString(2131823207);
            String A0o = AnonymousClass0wJ.A0o(this, string2, 2131837730);
            TextView textView2 = this.A04;
            AnonymousClass0KW.A00(textView2, "Set as non-null in the line directly preceding this method call in OnCreateView");
            IDxCListenerShape201S0100000_1_I2 A0H3 = C18190wL.A0H(this, 509);
            SpannableStringBuilder A0E3 = C18200wM.A0E(A0o);
            C18720xk.A00(A0E3, A0H3, string2, textView2.getCurrentTextColor(), 13);
            C18180wK.A0z(textView2);
            textView2.setHighlightColor(0);
            textView2.setText(A0E3);
        }
        EditText editText = (EditText) inflate.requireViewById(R.id.confirmation_code);
        this.A02 = editText;
        C64513mT r0 = new C64513mT(editText, this);
        this.A0C = r0;
        editText.addTextChangedListener(r0);
        C18210wN.A12(this.A02, this, 6);
        if (this.A0J) {
            C63163fI.A05((SearchEditText) this.A02);
        }
        if (this.A0I) {
            C38040KHr kHr = C38040KHr.A01;
            C690146k r02 = new C690146k(this);
            this.A0A = r02;
            kHr.A03(r02, AnonymousClass45I.class);
            C689946i r03 = new C689946i(this);
            this.A08 = r03;
            kHr.A03(r03, AnonymousClass45D.class);
            C690246l r04 = new C690246l(this);
            this.A0B = r04;
            kHr.A03(r04, AnonymousClass45S.class);
            C690046j r05 = new C690046j(this);
            this.A09 = r05;
            kHr.A03(r05, AnonymousClass45R.class);
        }
        C14030oh.A09(1059740674, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1653739574);
        super.onDestroy();
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        C14030oh.A09(-187956484, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1871408601);
        InputMethodManager inputMethodManager = this.A0K;
        if (inputMethodManager != null) {
            C18230wP.A14(this.A02, inputMethodManager);
        }
        this.A02.removeCallbacks(this.A0O);
        this.A0C = null;
        this.A02 = null;
        this.A04 = null;
        this.A05 = null;
        this.A0F = null;
        if (this.A0I) {
            C38040KHr kHr = C38040KHr.A01;
            C690146k r1 = this.A0A;
            if (r1 != null) {
                kHr.A04(r1, AnonymousClass45I.class);
            }
            C689946i r12 = this.A08;
            if (r12 != null) {
                kHr.A04(r12, AnonymousClass45D.class);
            }
            C690246l r13 = this.A0B;
            if (r13 != null) {
                kHr.A04(r13, AnonymousClass45S.class);
            }
            C690046j r14 = this.A09;
            if (r14 != null) {
                kHr.A04(r14, AnonymousClass45R.class);
            }
        }
        super.onDestroyView();
        C14030oh.A09(-2024631975, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1801650564);
        int A023 = C14030oh.A02(248008605);
        super.onResume();
        AnonymousClass3Um r7 = this.A07;
        if (r7.A03 && r7.A00 <= 0 && SystemClock.elapsedRealtime() - this.A00 >= ((long) (r7.A02 * 1000)) && this.A01 == null) {
            C18490xH r0 = new C18490xH(this, (long) (r7.A01 * 1000));
            this.A01 = r0;
            r0.start();
        }
        C14030oh.A09(-1688372431, A023);
        this.A02.postDelayed(this.A0O, 200);
        C14030oh.A09(-1510732322, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A07.A00(bundle);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(916723602);
        super.onStart();
        this.A02.requestFocus();
        C14030oh.A09(317712146, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-1162232179);
        super.onStop();
        C18240wQ.A10(this);
        Window A0F2 = C18180wK.A0F(this);
        A0F2.getClass();
        A0F2.setSoftInputMode(3);
        C14030oh.A09(-1295161056, A022);
    }
}
