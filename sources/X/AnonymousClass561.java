package X;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.view.IDxDCompatShape35S0100000_2_I2;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape71S0200000_2_I2;
import com.facebook.redex.IDxObserverShape15S0500000_2_I2;
import com.facebook.redex.IDxObserverShape28S0400000_2_I2;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.561  reason: invalid class name */
public final class AnonymousClass561 extends Fragment {
    public AnonymousClass5jH A00;
    public C883357q A01;

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1289893173);
        super.onCreate(bundle);
        this.A00 = (AnonymousClass5jH) AnonymousClass7Kz.A07().A02(getActivity(), AnonymousClass5jH.class);
        C883357q r0 = (C883357q) AnonymousClass7IU.A00(C1203379t.A00(), this).A01(C883357q.class);
        this.A01 = r0;
        Bundle requireArguments = requireArguments();
        r0.A00 = requireArguments;
        Bundle A06 = C18180wK.A06();
        A06.putString("PAYMENT_TYPE", C883357q.A00(r0));
        A06.putParcelable("logger_data", requireArguments.getParcelable("logger_data"));
        AnonymousClass7Kz.A07().A03(A06);
        C14030oh.A09(-66663034, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1165451118);
        AnonymousClass5jH r1 = this.A00;
        C143608h1 r0 = r1.A01;
        View A0D = C18180wK.A0D(((C128707k8) r0).A00, viewGroup, r1.A00, false);
        C14030oh.A09(1154918035, A02);
        return A0D;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        View view2 = view;
        TextView A0L = AnonymousClass0wJ.A0L(view2, R.id.setting_section_title);
        C18180wK.A10(A0L, this, 2131827291);
        if (A0L.getVisibility() == 0 && requireArguments().getBoolean("should_hide_title")) {
            A0L.setVisibility(8);
        }
        C883357q r3 = this.A01;
        AnonymousClass0wJ.A0L(view2, R.id.setting_pin_switch_title).setText(2131827250);
        AnonymousClass0wJ.A0L(view2, R.id.pin_subtitle).setText(2131827249);
        View findViewById = view2.findViewById(R.id.pin_locked_error);
        M5J m5j = r3.A01;
        C86114wI.A1A(this, m5j, C86164wN.A0O(findViewById, this, 21), 276);
        CompoundButton compoundButton = (CompoundButton) view2.requireViewById(R.id.setting_pin_switch);
        View findViewById2 = view2.findViewById(R.id.setting_pin_row);
        M5J A0H = C86114wI.A0H(m5j, this, 13);
        IDxCListenerShape71S0200000_2_I2 A0L2 = C86164wN.A0L(this, compoundButton, 35);
        C006702y.A0C(compoundButton, new IDxDCompatShape35S0100000_2_I2(this, 2));
        A0H.A0C(this, new IDxObserverShape55S0300000_2_I2(22, (Object) new AnonymousClass7S3(A0L2, compoundButton, A0H, this), (Object) compoundButton, (Object) this));
        C86104wH.A1D(findViewById2, 34, this, A0L2);
        C883357q r10 = this.A01;
        View findViewById3 = view2.findViewById(R.id.setting_bio_row);
        CompoundButton compoundButton2 = (CompoundButton) view2.requireViewById(R.id.setting_bio_switch);
        TextView A0L3 = AnonymousClass0wJ.A0L(view2, R.id.setting_bio_switch_title);
        A0L3.setText(2131827247);
        TextView A0L4 = AnonymousClass0wJ.A0L(view2, R.id.bio_subtitle);
        int i2 = 2131827246;
        if (AnonymousClass7HK.A01()) {
            i2 = 2131830509;
        }
        AnonymousClass5jH r16 = this.A00;
        TypedValue typedValue = new TypedValue();
        if (!r16.getContext().getTheme().resolveAttribute(R.attr.pinBioSettingOtherAppsName, typedValue, true) || (i = typedValue.resourceId) == 0) {
            str = "";
        } else {
            str = r16.getContext().getResources().getString(i);
        }
        A0L4.setText(AnonymousClass0wJ.A0o(this, str, i2));
        M5J m5j2 = r10.A06.A02;
        CompoundButton compoundButton3 = compoundButton2;
        m5j2.A0C(this, new IDxObserverShape15S0500000_2_I2(1, findViewById3, compoundButton3, A0L3, A0L4, this));
        r10.A01.A0C(this, C86164wN.A0O(view2.findViewById(R.id.bio_pin_locked_error), this, 22));
        View findViewById4 = view2.findViewById(R.id.setting_bio_row);
        M5J A0H2 = C86114wI.A0H(m5j2, this, 12);
        IDxCListenerShape71S0200000_2_I2 A0L5 = C86164wN.A0L(this, compoundButton2, 33);
        C006702y.A0C(compoundButton2, new IDxDCompatShape35S0100000_2_I2(this, 2));
        A0H2.A0C(this, new IDxObserverShape55S0300000_2_I2(22, (Object) new AnonymousClass7S3(A0L5, compoundButton2, A0H2, this), (Object) compoundButton2, (Object) this));
        C86104wH.A1D(findViewById4, 34, this, A0L5);
        C883357q r1 = this.A01;
        View requireViewById = view2.requireViewById(R.id.change_reset_pin);
        C86114wI.A1A(this, r1.A01, new IDxObserverShape28S0400000_2_I2(3, view2.findViewById(R.id.change_pin_divider_top), requireViewById, this, view2.findViewById(R.id.change_pin_divider_bottom)), 276);
        C86104wH.A1C(requireViewById, 53, this);
        AnonymousClass7Kz.A07().A07.Bb8("fbpay_security_page_display", C121257Ff.A00(requireArguments()));
        View requireViewById2 = view2.requireViewById(R.id.progress_bar_layout);
        C86114wI.A1A(this, this.A01.A04, C86114wI.A0Q(this, 210), 275);
        C86114wI.A1A(this, this.A01.A06.A05, C86114wI.A0Q(this, 211), 275);
        this.A01.A02.A0C(this, C86164wN.A0O(requireViewById2, this, 20));
        C86114wI.A1A(this, this.A01.A05, C86114wI.A0Q(this, 212), 275);
        Bundle requireArguments = requireArguments();
        if (bundle == null && requireArguments.getBoolean("should_log_view_load_success")) {
            Map A06 = C122037Js.A06((FBPayLoggerData) C18240wQ.A0D(requireArguments, "logger_data"));
            C121817Ig.A02("view_name", "security_settings", A06).Bb8("client_load_view_success", A06);
        }
    }
}
