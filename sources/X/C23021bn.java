package X;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;

/* renamed from: X.1bn  reason: invalid class name and case insensitive filesystem */
public final class C23021bn extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "TwoFacMultipleTotpSetupManuallyFragment";
    public Bundle A00;
    public TextView A01;
    public TextView A02;
    public boolean A03;
    public final C04530Oa A04 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837048);
    }

    public final boolean onBackPressed() {
        return false;
    }

    public static final void A00(C23021bn r4) {
        String str;
        AnonymousClass3WQ.A00(AnonymousClass0wJ.A0X(r4.A04), AnonymousClass006.A01);
        Object systemService = r4.requireContext().getSystemService("clipboard");
        if (systemService != null) {
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            StringBuilder A0r = C18200wM.A0r();
            TextView textView = r4.A01;
            if (textView == null) {
                str = "igKeyLineOne";
            } else {
                A0r.append(textView.getText());
                A0r.append(' ');
                TextView textView2 = r4.A02;
                if (textView2 == null) {
                    str = "igKeyLineTwo";
                } else {
                    C18250wR.A0n(clipboardManager, "Confirm_Key", C18200wM.A0m(textView2.getText(), A0r));
                    C63813iO.A0B(r4.requireContext(), r4.getString(2131824414));
                    return;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1118027832);
        super.onCreate(bundle);
        this.A00 = requireArguments();
        C14030oh.A09(-295294627, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1638601209);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_multiple_totp_setup_manually_fragment, viewGroup, false);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.ig_key_line_one);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.ig_key_line_two);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.copy_key);
        IDxCSpanShape187S0100000_1_I2 A002 = C18730xl.A00(this, requireContext().getColor(R.color.igds_gradient_cyan), 42);
        SpannableStringBuilder A0E = C18200wM.A0E(getString(2131837058));
        A0E.setSpan(A002, 0, A0E.length(), 18);
        A0L.setText(A0E);
        AnonymousClass0wJ.A16(A0L, 546, this);
        C18230wP.A0W(inflate, R.id.next_bottom_button).setPrimaryActionOnClickListener(C18190wL.A0H(this, 547));
        C14030oh.A09(-8217363, A022);
        return inflate;
    }

    public final void onStart() {
        int A022 = C14030oh.A02(391302318);
        super.onStart();
        String str = "twoFacResponseBundle";
        if (this.A03) {
            Bundle bundle = this.A00;
            if (bundle != null) {
                String A0b = C18210wN.A0b(bundle, "instagram_key", "");
                TextView textView = this.A01;
                if (textView == null) {
                    str = "igKeyLineOne";
                } else {
                    TextView textView2 = this.A02;
                    if (textView2 == null) {
                        str = "igKeyLineTwo";
                    } else {
                        C62923b9.A03(textView, textView2, A0b);
                        C14030oh.A09(318413976, A022);
                        return;
                    }
                }
            }
        } else {
            C10300i6 A0U = AnonymousClass0wJ.A0U(this.A04);
            Context requireContext = requireContext();
            IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(this, 97);
            Bundle bundle2 = this.A00;
            if (bundle2 != null) {
                C04220Ms.A0B(A0U, 0);
                H1T A0O = AnonymousClass0wJ.A0O(A0U);
                C63833iQ.A0A(requireContext, A0O, 65, 120);
                A0O.A0R(C63833iQ.A07(311, 15, 109), false);
                A0O.A0O(C63833iQ.A07(384, 17, 71), bundle2.getString(C63833iQ.A01()));
                C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass1RQ.class, AnonymousClass3NH.class);
                A0T.A00 = A06;
                C31155GhB.A03(A0T);
                C14030oh.A09(318413976, A022);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
