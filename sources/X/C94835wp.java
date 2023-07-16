package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.facebook.redex.IDxCListenerShape753S0100000_2_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape21S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape41S0100000_I2_21;

/* renamed from: X.5wp  reason: invalid class name and case insensitive filesystem */
public final class C94835wp extends C34640IcN {
    public static final String __redex_internal_original_name = "BoostAudienceAgePickerBottomSheetFragment";
    public String A00;
    public final C04530Oa A01 = C18220wO.A0M(new KtLambdaShape41S0100000_I2_21(this, 37), new KtLambdaShape41S0100000_I2_21(this, 36), new KtLambdaShape21S0200000_I2_5(10, this, (Object) null), C18210wN.A0l(I6H.class));
    public final C04530Oa A02 = AnonymousClass3W9.A00(this);

    public final String getModuleName() {
        return "boost_audience_age_picker_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        NumberPicker numberPicker = (NumberPicker) AnonymousClass0wJ.A0J(view, R.id.age_picker);
        numberPicker.setMinValue(18);
        numberPicker.setMaxValue(65);
        numberPicker.setWrapSelectorWheel(false);
        if (C04220Ms.A0I(this.A00, "min_age_picker")) {
            numberPicker.setValue(18);
        } else {
            numberPicker.setValue(65);
        }
        numberPicker.setOnValueChangedListener(new IDxCListenerShape753S0100000_2_I2(this, 0));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(-801295928);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(I17.A00(482));
        } else {
            str = null;
        }
        this.A00 = str;
        C14030oh.A09(598554041, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(365423218);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.boost_audience_age_picker_bottom_sheet_view, viewGroup, false);
        C14030oh.A09(-1385774537, A022);
        return inflate;
    }
}
