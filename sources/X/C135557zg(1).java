package X;

import android.content.Context;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.common.api.base.IDxACallbackShape5S1100000_2_I2;

/* renamed from: X.7zg  reason: invalid class name and case insensitive filesystem */
public final class C135557zg implements Runnable {
    public final /* synthetic */ IDxACallbackShape5S1100000_2_I2 A00;

    public C135557zg(IDxACallbackShape5S1100000_2_I2 iDxACallbackShape5S1100000_2_I2) {
        this.A00 = iDxACallbackShape5S1100000_2_I2;
    }

    public final void run() {
        String A01;
        int i;
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00.A00;
        boolean z = supportServiceEditUrlFragment.A0C;
        Context context = supportServiceEditUrlFragment.getContext();
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        String str = supportServiceEditUrlFragment.A0A;
        if (z) {
            boolean equals = str.equals("sticker");
            boolean equals2 = sMBPartnerType.equals(SMBPartnerType.GIFT_CARD);
            if (equals) {
                if (equals2) {
                    i = 2131837440;
                } else {
                    if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                        i = 2131837411;
                    }
                    A01 = null;
                }
            } else if (equals2) {
                i = 2131837439;
            } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                i = 2131837410;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
                    i = 2131837412;
                }
                A01 = null;
            }
            A01 = context.getString(i);
        } else {
            A01 = C121877Ip.A01(context, sMBPartnerType, str);
        }
        C86134wK.A1C(supportServiceEditUrlFragment, A01);
        SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
    }
}
