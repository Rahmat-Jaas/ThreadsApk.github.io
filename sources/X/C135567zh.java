package X;

import android.content.Context;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;

/* renamed from: X.7zh  reason: invalid class name and case insensitive filesystem */
public final class C135567zh implements Runnable {
    public final /* synthetic */ IDxACallbackShape112S0100000_2_I2 A00;

    public C135567zh(IDxACallbackShape112S0100000_2_I2 iDxACallbackShape112S0100000_2_I2) {
        this.A00 = iDxACallbackShape112S0100000_2_I2;
    }

    public final void run() {
        String str;
        int i;
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00.A00;
        Context context = supportServiceEditUrlFragment.getContext();
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        boolean equals = supportServiceEditUrlFragment.A0A.equals("sticker");
        boolean equals2 = sMBPartnerType.equals(SMBPartnerType.GIFT_CARD);
        if (equals) {
            if (equals2) {
                i = 2131834744;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                    i = 2131834645;
                }
                str = null;
                C86134wK.A1C(supportServiceEditUrlFragment, str);
                SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
            }
        } else if (equals2) {
            i = 2131834743;
        } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
            i = 2131834644;
        } else {
            if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
                i = 2131834648;
            }
            str = null;
            C86134wK.A1C(supportServiceEditUrlFragment, str);
            SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
        }
        str = context.getString(i);
        C86134wK.A1C(supportServiceEditUrlFragment, str);
        SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
    }
}
