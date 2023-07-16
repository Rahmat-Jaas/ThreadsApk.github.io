package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3J5;
import X.AnonymousClass3ZL;
import X.AnonymousClass3Zs;
import X.C146958n9;
import X.C18200wM;
import X.C25237DiI;
import X.C27952Ew2;
import X.C31236Gkb;
import X.C63603ht;
import X.CRY;
import X.D2R;
import android.content.DialogInterface;
import kotlin.coroutines.jvm.internal.KtSLambdaShape7S0101000_I2_4;

public class IDxSListenerShape454S0100000_1_I2 implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public IDxSListenerShape454S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                CRY cry = (CRY) this.A00;
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape7S0101000_I2_4(cry, (C146958n9) null, 30), AnonymousClass3J5.A00(C18200wM.A0N(cry.A0D)), 3);
                return;
            case 1:
                C31236Gkb gkb = (C31236Gkb) this.A00;
                AnonymousClass0wJ.A13(AnonymousClass3Zs.A03(gkb.A0I).A02(D2R.A2C, gkb.getClass()).edit(), "has_seen_mention_sharing_privacy_nux", true);
                return;
            case 2:
                C63603ht.A07((C63603ht) this.A00);
                return;
            default:
                AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(((C63603ht) this.A00).A09), "PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_NUX_FOR_CURRENT_PANAVISION_USER", true);
                return;
        }
    }
}
