package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.facebook.redex.IDxCListenerShape753S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.service.session.UserSession;
import java.util.TimeZone;

/* renamed from: X.5wv  reason: invalid class name */
public final class AnonymousClass5wv extends C34640IcN {
    public static final String __redex_internal_original_name = "SetReminderBottomSheetFragment";
    public int A00 = 0;
    public long A01 = 0;
    public NumberPicker A02;
    public NumberPicker A03;
    public TextView A04;
    public C109136jW A05 = null;
    public boolean A06 = true;
    public UserSession A07;

    public final String getModuleName() {
        return "limited_interactions_set_reminder_bottom_sheet";
    }

    public static void A00(AnonymousClass5wv r5, boolean z, boolean z2) {
        int i;
        r5.A03.setDisplayedValues((String[]) null);
        int i2 = 4;
        if (z) {
            i2 = 6;
        }
        int i3 = 0;
        r5.A03.setMinValue(0);
        r5.A03.setMaxValue(i2 - 1);
        String[] strArr = new String[i2];
        do {
            i = i3 + 1;
            strArr[i3] = String.valueOf(i);
            i3 = i;
        } while (i < i2);
        r5.A03.setDisplayedValues(strArr);
        if (z2) {
            r5.A00 = r5.A03.getValue() + 1;
        }
    }

    public final C10300i6 getSession() {
        return this.A07;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1833335897);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A01 = bundle2.getLong("LimitedSettingsFragment.REMINDER_DATE");
        this.A07 = C18180wK.A0V(bundle2);
        C14030oh.A09(1705304956, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Context requireContext;
        int i2;
        int A022 = C14030oh.A02(-189145044);
        View inflate = layoutInflater.inflate(R.layout.set_reminder_bottom_sheet, viewGroup, false);
        this.A02 = (NumberPicker) inflate.requireViewById(R.id.duration_picker);
        this.A03 = (NumberPicker) inflate.requireViewById(R.id.units_picker);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.reminder_action_button);
        this.A04 = A0L;
        IDxCListenerShape203S0100000_2_I2 A0P = C86134wK.A0P(this, 164);
        AnonymousClass7FY.A02(A0L, AnonymousClass006.A01);
        this.A04.setOnClickListener(A0P);
        this.A04.setEnabled(true);
        long currentTimeMillis = System.currentTimeMillis();
        long offset = this.A01 - ((currentTimeMillis - ((((long) TimeZone.getDefault().getOffset(currentTimeMillis)) + currentTimeMillis) % 86400000)) / 1000);
        long j = offset / 604800;
        if (((float) j) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            this.A06 = false;
            i = (int) Math.ceil((double) j);
        } else {
            i = (int) (offset / SandboxRepository.CACHE_TTL);
        }
        this.A00 = i;
        A00(this, this.A06, false);
        int i3 = this.A00;
        NumberPicker numberPicker = this.A03;
        if (i3 >= 1) {
            numberPicker.setValue(i3 - 1);
        } else {
            numberPicker.setValue(0);
        }
        this.A03.setOnValueChangedListener(new IDxCListenerShape753S0100000_2_I2(this, 2));
        this.A03.setWrapSelectorWheel(false);
        this.A02.setMinValue(0);
        this.A02.setMaxValue(1);
        String[] strArr = new String[2];
        int i4 = this.A00;
        Context requireContext2 = requireContext();
        if (i4 == 1) {
            strArr[0] = requireContext2.getString(2131829636);
            requireContext = requireContext();
            i2 = 2131829638;
        } else {
            strArr[0] = requireContext2.getString(2131829637);
            requireContext = requireContext();
            i2 = 2131829639;
        }
        strArr[1] = requireContext.getString(i2);
        this.A02.setDisplayedValues(strArr);
        this.A02.setOnValueChangedListener(new IDxCListenerShape753S0100000_2_I2(this, 3));
        this.A02.setWrapSelectorWheel(false);
        this.A02.setValue(this.A06 ^ true ? 1 : 0);
        C14030oh.A09(-1642741927, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(450113202);
        super.onDestroyView();
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
        C14030oh.A09(417869306, A022);
    }
}
