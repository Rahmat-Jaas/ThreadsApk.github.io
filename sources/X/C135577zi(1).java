package X;

import android.content.Context;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.common.api.base.IDxACallbackShape5S1100000_2_I2;

/* renamed from: X.7zi  reason: invalid class name and case insensitive filesystem */
public final class C135577zi implements Runnable {
    public final /* synthetic */ IDxACallbackShape5S1100000_2_I2 A00;

    public C135577zi(IDxACallbackShape5S1100000_2_I2 iDxACallbackShape5S1100000_2_I2) {
        this.A00 = iDxACallbackShape5S1100000_2_I2;
    }

    public final void run() {
        String str;
        int i;
        SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00.A00;
        if (!"business_hub".equals(supportServiceEditUrlFragment.A0A)) {
            Context context = supportServiceEditUrlFragment.getContext();
            SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
            if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
                i = 2131821111;
            } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                i = 2131821040;
            } else if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
                i = 2131821046;
            } else {
                str = null;
                C86134wK.A1C(supportServiceEditUrlFragment, str);
            }
            str = context.getString(i);
            C86134wK.A1C(supportServiceEditUrlFragment, str);
        }
        SupportServiceEditUrlFragment.A01(supportServiceEditUrlFragment);
    }
}
