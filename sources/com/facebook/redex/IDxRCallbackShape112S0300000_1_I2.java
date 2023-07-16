package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.C19359Av2;
import X.C20134BPz;
import X.C34635IcE;
import X.C63733iD;
import X.L1Q;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;
import com.instagram.user.model.User;

public class IDxRCallbackShape112S0300000_1_I2 implements L1Q {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxRCallbackShape112S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A00 = obj2;
    }

    public final void Bmc() {
    }

    public final void BrW() {
        if (this.A03 == 0) {
            C20134BPz.A01((C19359Av2) this.A01, (C20134BPz) this.A00, ((User) this.A02).BRq());
        }
    }

    public final void Bxq() {
    }

    public final void CNe() {
    }

    public final void onCancel() {
    }

    public final void onSuccess() {
        if (1 - this.A03 == 0) {
            C34635IcE icE = (C34635IcE) this.A01;
            Context context = (Context) this.A02;
            Object obj = this.A00;
            Drawable drawable = context.getDrawable(R.drawable.instagram_circle_x_pano_outline_24);
            if (drawable != null) {
                drawable.setColorFilter(icE.A05, PorterDuff.Mode.SRC_IN);
            }
            C63733iD A012 = C63733iD.A01();
            A012.A0C();
            A012.A0A = AnonymousClass0wJ.A0l(context, icE.A09.getValue(), 2131837473);
            C63733iD.A06(context, drawable, A012, 2131837472);
            A012.A0D = AnonymousClass0wJ.A0k(context, 2131837479);
            A012.A07 = new IDxCBackShape140S0200000_6_I2(4, obj, icE);
            A012.A0I = true;
            C63733iD.A0A(A012);
        }
    }
}
