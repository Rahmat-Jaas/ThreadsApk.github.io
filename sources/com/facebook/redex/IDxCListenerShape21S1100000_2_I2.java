package com.facebook.redex;

import android.content.DialogInterface;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;

public class IDxCListenerShape21S1100000_2_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCListenerShape21S1100000_2_I2(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str, int i) {
        this.A02 = i;
        this.A00 = supportServiceEditUrlFragment;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A02;
        Object obj = this.A00;
        if (i2 != 0) {
            SupportServiceEditUrlFragment.A04((SupportServiceEditUrlFragment) obj, this.A01);
        } else {
            SupportServiceEditUrlFragment.A02((SupportServiceEditUrlFragment) obj, this.A01);
        }
    }
}
