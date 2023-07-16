package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.barcelona.R;
import com.instagram.login.callback.IDxLCallbacksShape165S0100000_1_I2;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.1d9  reason: invalid class name */
public abstract class AnonymousClass1d9 extends C34640IcN implements AnonymousClass4tS {
    public static final String __redex_internal_original_name = "BaseEmailVerifyFragment";
    public long A00;
    public TextView A01;
    public C10300i6 A02;
    public C24721jv A03;
    public ProgressButton A04;
    public SearchEditText A05;
    public String A06;

    public final void CDH(boolean z) {
    }

    public final String getModuleName() {
        return "email_verify";
    }

    public final void A00() {
        SearchEditText searchEditText;
        String str;
        C32165H8c A062;
        C63873iU iDxLCallbacksShape165S0100000_1_I2;
        SearchEditText searchEditText2;
        String str2;
        SearchEditText searchEditText3;
        String str3;
        if (this instanceof C26871rN) {
            C62713aZ.A00.A03(this.A02, "sign_up_email_code_confirmation");
            if (!C18240wQ.A1U(this) && (searchEditText3 = this.A05) != null && C18180wK.A0f(searchEditText3) != null) {
                Context context = getContext();
                C10300i6 r2 = this.A02;
                String str4 = this.A06;
                SearchEditText searchEditText4 = this.A05;
                if (searchEditText4 != null) {
                    str3 = C18180wK.A0f(searchEditText4);
                } else {
                    str3 = null;
                }
                H1T A0N = AnonymousClass0wJ.A0N(r2);
                A0N.A0J("accounts/check_confirmation_code/");
                C63213h0.A04(A0N, C09140ev.A00(context));
                A0N.A0O("email", str4);
                AnonymousClass269.A0A(A0N, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str3);
                C63873iU.A0C(this, C18180wK.A0T(A0N, AnonymousClass1SP.class, AnonymousClass3NW.class), 72);
                return;
            }
            return;
        }
        C26861rM r5 = (C26861rM) this;
        if (r5.A01) {
            AnonymousClass01V.A0p.markerStart(725095506);
            AnonymousClass01V.A0p.markerAnnotate(725095506, "flow", "prod");
            AnonymousClass01V.A0p.markerAnnotate(725095506, DatePickerDialogModule.ARG_MODE, "email");
            FragmentActivity activity = r5.getActivity();
            if (!(activity == null || activity.isFinishing() || (searchEditText2 = r5.A05) == null || C18180wK.A0f(searchEditText2) == null || r5.getContext() == null)) {
                Context context2 = r5.getContext();
                C07530bf r7 = (C07530bf) r5.A02;
                SearchEditText searchEditText5 = r5.A05;
                if (searchEditText5 != null) {
                    str2 = C18180wK.A0f(searchEditText5);
                } else {
                    str2 = null;
                }
                A062 = C63883iV.A05(context2, r7, str2, r5.A06, "email", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                iDxLCallbacksShape165S0100000_1_I2 = new C27461sY(r5.getActivity(), r5, (C07530bf) r5.A02);
            }
            C62713aZ.A00.A03(r5.A02, "recovery_email_code_confirmation");
        }
        FragmentActivity activity2 = r5.getActivity();
        if (!(activity2 == null || activity2.isFinishing() || (searchEditText = r5.A05) == null || C18180wK.A0f(searchEditText) == null || r5.getContext() == null)) {
            Context context3 = r5.getContext();
            C07530bf r72 = (C07530bf) r5.A02;
            String str5 = r5.A00;
            SearchEditText searchEditText6 = r5.A05;
            if (searchEditText6 != null) {
                str = C18180wK.A0f(searchEditText6);
            } else {
                str = null;
            }
            A062 = C63883iV.A06(context3, r72, str5, str, (String) null, (String) null, (String) null, (String) null);
            FragmentActivity activity3 = r5.getActivity();
            AnonymousClass265 r9 = AnonymousClass265.A1C;
            Integer num = AnonymousClass006.A01;
            String str6 = r5.A06;
            iDxLCallbacksShape165S0100000_1_I2 = new IDxLCallbacksShape165S0100000_1_I2((Activity) activity3, (C11630kW) r5, (C84634tZ) new C70224Dh(activity3), r5, (C07530bf) r5.A02, r9, num, str6);
        }
        C62713aZ.A00.A03(r5.A02, "recovery_email_code_confirmation");
        A062.A00 = iDxLCallbacksShape165S0100000_1_I2;
        r5.schedule(A062);
        C62713aZ.A00.A03(r5.A02, "recovery_email_code_confirmation");
    }

    public final void AHz() {
        this.A05.setEnabled(false);
        this.A05.setClearButtonEnabled(false);
    }

    public final void AJV() {
        this.A05.setEnabled(true);
        this.A05.setClearButtonEnabled(true);
    }

    public final C313625r Aiy() {
        if (!(this instanceof C26871rN)) {
            return null;
        }
        C313625r r1 = C313625r.SAC;
        if (r1 != ((C26871rN) this).A00.A01()) {
            return C313625r.EMAIL;
        }
        return r1;
    }

    public final boolean BXY() {
        if (this.A05.getText().length() < 6 || this.A05.getText().length() > 8) {
            return false;
        }
        return true;
    }

    public final void C9G() {
        ProgressButton progressButton = this.A04;
        if (progressButton != null && progressButton.isEnabled()) {
            A00();
        }
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void A01(int i) {
        C25828Dsm A0W = C18190wL.A0W(getContext());
        A0W.A0L(i);
        C18180wK.A1M(A0W);
        AnonymousClass0wJ.A1K(A0W);
    }

    public void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1939319964);
        super.onCreate(bundle);
        this.A00 = SystemClock.elapsedRealtime();
        C14030oh.A09(830269372, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A0i;
        int A022 = C14030oh.A02(-2117284847);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_verify_new, viewGroup, false);
        SearchEditText searchEditText = (SearchEditText) inflate.requireViewById(R.id.confirmation_code);
        this.A05 = searchEditText;
        searchEditText.setAllowTextSelection(true);
        C18210wN.A12(this.A05, this, 2);
        C63163fI.A05(this.A05);
        ProgressButton A0c = C18230wP.A0c(inflate);
        this.A04 = A0c;
        C24721jv r0 = new C24721jv(this.A05, this.A02, this, A0c);
        this.A03 = r0;
        registerLifecycleListener(r0);
        this.A01 = AnonymousClass0wJ.A0L(inflate, R.id.code_verification_instruction);
        String string = getString(2131837715);
        if (this instanceof C26871rN) {
            A0i = C18220wO.A0i(AnonymousClass0wJ.A0B(this), this.A06, 2131834850);
        } else {
            C26861rM r7 = (C26861rM) this;
            Resources A0B = AnonymousClass0wJ.A0B(r7);
            int i = 2131834852;
            if (r7.A01) {
                i = 2131835987;
            }
            A0i = C18220wO.A0i(A0B, r7.A06, i);
        }
        SpannableStringBuilder A0E = C18200wM.A0E(A0i);
        C18730xl.A01(A0E, this, string, getContext().getColor(R.color.igds_primary_button), 28);
        C18180wK.A0z(this.A01);
        this.A01.setHighlightColor(0);
        this.A01.setText(A0E);
        C14030oh.A09(-1500013617, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-164657260);
        super.onDestroyView();
        unregisterLifecycleListener(this.A03);
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A01 = null;
        C14030oh.A09(1261105545, A022);
    }
}
