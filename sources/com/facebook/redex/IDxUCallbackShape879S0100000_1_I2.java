package com.facebook.redex;

import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass18b;
import X.AnonymousClass1ae;
import X.C04220Ms;
import X.C04530Oa;
import X.C04620Ok;
import X.C06810aP;
import X.C18180wK;
import X.C63813iO;
import X.C63823iP;
import X.C83924sD;
import androidx.fragment.app.Fragment;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.user.model.User;

public class IDxUCallbackShape879S0100000_1_I2 implements C83924sD {
    public Object A00;
    public final int A01;

    public IDxUCallbackShape879S0100000_1_I2(AnonymousClass1ae r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void Bwp(Long l, Long l2, long j, long j2, boolean z) {
        if (this.A01 != 0) {
            C63813iO.A08(((Fragment) this.A00).getActivity());
            return;
        }
        AnonymousClass1ae r1 = (AnonymousClass1ae) this.A00;
        C63813iO.A08(r1.getActivity());
        IgSwitch igSwitch = r1.A0C;
        if (igSwitch == null) {
            C04220Ms.A0E("quietModeToggle");
            throw null;
        } else {
            igSwitch.setChecked(!z);
        }
    }

    public final void CNV(Long l, Long l2, long j, long j2, boolean z) {
        User user;
        AnonymousClass1ae r4;
        String str;
        if (this.A01 != 0) {
            long A0A = AnonymousClass0wJ.A0A() / 1000;
            long j3 = A0A + j;
            long j4 = A0A + j2;
            r4 = (AnonymousClass1ae) this.A00;
            IgTextView igTextView = r4.A05;
            if (igTextView == null) {
                str = "fromRowValue";
            } else {
                igTextView.setText(C63823iP.A08(r4, j3));
                IgTextView igTextView2 = r4.A0A;
                if (igTextView2 == null) {
                    str = "toRowValue";
                } else {
                    igTextView2.setText(C63823iP.A08(r4, j4));
                    C04620Ok r1 = C06810aP.A01;
                    C04530Oa r3 = r4.A0I;
                    user = r1.A01(AnonymousClass0wJ.A0X(r3));
                    user.A05.Con(C18180wK.A0n(new AnonymousClass18b(Integer.valueOf((int) j2), Integer.valueOf((int) j))));
                    C63823iP.A0A(AnonymousClass0wJ.A0X(r3));
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        r4 = (AnonymousClass1ae) this.A00;
        AnonymousClass1ae.A08(r4, z);
        user = C06810aP.A01.A01(AnonymousClass0wJ.A0X(r4.A0I));
        if (!z) {
            user.A2G(AnonymousClass0ZV.A00);
        } else if (!(l == null || l2 == null)) {
            C63823iP.A0B(user, l.longValue(), l2.longValue());
        }
        AnonymousClass1ae.A07(r4, z);
    }
}
