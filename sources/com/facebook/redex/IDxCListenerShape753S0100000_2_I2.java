package com.facebook.redex;

import X.AnonymousClass571;
import X.AnonymousClass5wv;
import X.AnonymousClass5xP;
import X.C04220Ms;
import X.C18180wK;
import X.C86074wE;
import X.C94835wp;
import X.I17;
import X.I6H;
import android.content.Context;
import android.widget.NumberPicker;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.TimeZone;

public class IDxCListenerShape753S0100000_2_I2 implements NumberPicker.OnValueChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape753S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        AnonymousClass5wv r9;
        int i3;
        C86074wE r1;
        Context requireContext;
        int i4;
        switch (this.A01) {
            case 0:
                C94835wp r2 = (C94835wp) this.A00;
                String str = r2.A00;
                if (C04220Ms.A0I(str, "min_age_picker")) {
                    r1 = ((I6H) r2.A01.getValue()).A0I;
                } else if (C04220Ms.A0I(str, I17.A00(755))) {
                    r1 = ((I6H) r2.A01.getValue()).A0H;
                } else {
                    return;
                }
                r1.CrC(Integer.valueOf(i2));
                return;
            case 1:
                AnonymousClass571 r0 = ((AnonymousClass5xP) this.A00).A02;
                if (r0 == null) {
                    C04220Ms.A0E("musicOverlayDurationViewModel");
                    throw null;
                } else {
                    r0.A00.A0H(Integer.valueOf(i2));
                    return;
                }
            case 2:
                r9 = (AnonymousClass5wv) this.A00;
                i3 = i2 + 1;
                r9.A00 = i3;
                break;
            default:
                r9 = (AnonymousClass5wv) this.A00;
                boolean A1W = C18180wK.A1W(i2);
                r9.A06 = A1W;
                AnonymousClass5wv.A00(r9, A1W, true);
                i3 = r9.A00;
                break;
        }
        r9.A02.setDisplayedValues((String[]) null);
        r9.A02.setMinValue(0);
        r9.A02.setMaxValue(1);
        String[] strArr = new String[2];
        Context requireContext2 = r9.requireContext();
        if (i3 == 1) {
            strArr[0] = requireContext2.getString(2131829636);
            requireContext = r9.requireContext();
            i4 = 2131829638;
        } else {
            strArr[0] = requireContext2.getString(2131829637);
            requireContext = r9.requireContext();
            i4 = 2131829639;
        }
        strArr[1] = requireContext.getString(i4);
        r9.A02.setDisplayedValues(strArr);
        long currentTimeMillis = System.currentTimeMillis();
        long offset = (currentTimeMillis - ((((long) TimeZone.getDefault().getOffset(currentTimeMillis)) + currentTimeMillis) % 86400000)) / 1000;
        long j = (long) r9.A00;
        long j2 = (j * 604800) + offset;
        if (r9.A06) {
            j2 = offset + (j * SandboxRepository.CACHE_TTL);
        }
        r9.A01 = j2;
    }
}
