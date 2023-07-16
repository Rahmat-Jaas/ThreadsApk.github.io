package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.barcelona.R;
import java.util.HashSet;

/* renamed from: X.56I  reason: invalid class name */
public final class AnonymousClass56I extends Fragment implements C143648h5, C143678h8 {
    public View A00;
    public FBPayLoggerData A01;
    public C92755jo A02;
    public C883657t A03;

    public final C113986sV BH4() {
        return new C113986sV((Drawable) null, (View.OnClickListener) null, (String) null, getString(2131832208), 0, 0, false, false, true);
    }

    public final boolean Bzy(Bundle bundle, int i, boolean z) {
        return this.A02.Bzy(bundle, i, z);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        C92755jo r2 = this.A02;
        boolean A1T = AnonymousClass0wJ.A1T(i2, -1);
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        r2.Bzy(extras, i, A1T);
    }

    public final void onCreate(Bundle bundle) {
        FBPayLoggerData fBPayLoggerData;
        int A022 = C14030oh.A02(-2083136841);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || bundle2.getParcelable("logger_data") == null) {
            HashSet A0u = C18200wM.A0u();
            fBPayLoggerData = new FBPayLoggerData((String) null, "fbpay_hub", (String) null, (String) null, C122037Js.A01(), (String) null, C86104wH.A13(A0u, A0u));
        } else {
            fBPayLoggerData = (FBPayLoggerData) C18240wQ.A0D(this.mArguments, "logger_data");
        }
        this.A01 = fBPayLoggerData;
        if (bundle == null) {
            AnonymousClass7Kz.A0K().A06().Bb8("client_load_paymentsettings_init", C122037Js.A06(this.A01));
            C121817Ig.A01().markerStart(110177837);
        }
        C14030oh.A09(-1375032198, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(937647495);
        FragmentActivity activity = getActivity();
        AnonymousClass7Kz.A0K();
        View A0H = AnonymousClass0wJ.A0H(C86154wM.A0E(activity, layoutInflater, R.style.Ig4aFbPay), viewGroup, R.layout.fragment_hub_settings);
        C14030oh.A09(-150750660, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A00 = view.requireViewById(R.id.progress_bar);
        if (this.A02 == null) {
            Bundle A06 = C18180wK.A06();
            A06.putBoolean("has_container_fragment", true);
            C86154wM.A1E(A06, this.A01);
            this.A02 = (C92755jo) AnonymousClass7Kz.A0K().A05(A06, "payment_methods");
            AnonymousClass01J A0R = C86124wJ.A0R(this);
            A0R.A0D(this.A02, R.id.payment_methods_fragment_container);
            A0R.A00();
        }
        if (getChildFragmentManager().A0L(R.id.order_info_section_fragment_container) == null) {
            Bundle A062 = C18180wK.A06();
            A062.putBoolean("has_container_fragment", true);
            C86154wM.A1E(A062, this.A01);
            AnonymousClass01J A0R2 = C86124wJ.A0R(this);
            A0R2.A0D(AnonymousClass7Kz.A0K().A05(A062, "order_info"), R.id.order_info_section_fragment_container);
            A0R2.A00();
        }
        AnonymousClass7Kz.A0K().A08();
        if (getChildFragmentManager().A0L(R.id.merchant_loyalty_list_section_fragment_container) == null) {
            Bundle A063 = C18180wK.A06();
            A063.putBoolean("has_container_fragment", true);
            C86154wM.A1E(A063, this.A01);
            AnonymousClass01J A0R3 = C86124wJ.A0R(this);
            A0R3.A0D(AnonymousClass7Kz.A0K().A05(A063, "merchant_loyalty_list"), R.id.merchant_loyalty_list_section_fragment_container);
            A0R3.A00();
        }
        this.A03 = (C883657t) C121817Ig.A00(this).A01(C883657t.class);
        C92835jw r6 = (C92835jw) C121817Ig.A00(this).A01(C92835jw.class);
        C883657t r3 = this.A03;
        FBPayLoggerData A0Q = C86104wH.A0Q(this.mArguments);
        r3.A03 = A0Q;
        r3.A07.Bb8("fbpay_payment_settings_page_display", C122037Js.A06(A0Q));
        r3.A02 = r6;
        r3.A00 = (AnonymousClass5k0) C121817Ig.A00(this).A01(AnonymousClass5k0.class);
        r3.A01 = (AnonymousClass579) C121817Ig.A00(this).A01(AnonymousClass579.class);
        C880756q r2 = r3.A05;
        C880756q r0 = r6.A03;
        C143158gC r1 = r3.A06;
        r2.A0K(r0, r1);
        r2.A0K(r3.A00.A03, r1);
        AnonymousClass579 r02 = r3.A01;
        if (r02 != null) {
            r2.A0K(r02.A01, r1);
        }
        C86104wH.A1F(this, this.A03.A05, 265);
    }
}
