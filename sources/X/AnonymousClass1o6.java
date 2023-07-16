package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.1o6  reason: invalid class name */
public final class AnonymousClass1o6 extends D2G {
    public final M5O A00(Context context, ViewGroup viewGroup) {
        return new AnonymousClass121(C18180wK.A0D(LayoutInflater.from(context), viewGroup, R.layout.layout_cta_selector_radio_group, false));
    }

    public final void A01(Context context, M5O m5o, C35052Lx r12) {
        boolean z;
        C04220Ms.A0B(r12, 2);
        AnonymousClass121 r11 = (AnonymousClass121) m5o;
        AnonymousClass1o5 r122 = (AnonymousClass1o5) r12;
        C04220Ms.A0B(r11, 1);
        C04220Ms.A0B(r122, 2);
        IgRadioGroup igRadioGroup = r11.A00;
        igRadioGroup.removeAllViews();
        int i = 0;
        for (Object next : r122.A02) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            C57793Cm r7 = (C57793Cm) next;
            String str = r122.A01;
            C19070yv r3 = new C19070yv(context);
            r3.setId(i);
            String str2 = r7.A03;
            r3.setTag(str2);
            C57943Dd r0 = r7.A02;
            if (r0 != null) {
                r3.setTitleText(r0);
            }
            C57943Dd r02 = r7.A01;
            if (r02 != null) {
                r3.setSubTitleText(r02);
            }
            r3.setMetadataText(r7.A04);
            C57943Dd r03 = r7.A00;
            if (r03 != null) {
                r3.setContentDescription(r03);
            }
            if (str != null) {
                z = str.equals(str2);
            } else {
                z = false;
            }
            r3.setChecked(z);
            igRadioGroup.addView(r3, i, new LinearLayout.LayoutParams(-1, -2));
            i = i2;
        }
        igRadioGroup.A02 = r122.A00;
    }

    public AnonymousClass1o6() {
        super("RADIO_GROUP", 3, 3);
    }
}
