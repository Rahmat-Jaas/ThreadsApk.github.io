package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.msc.logging.LoggingData;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.6S1  reason: invalid class name */
public final class AnonymousClass6S1 {
    public static final Fragment A00(UserMonetizationProductType userMonetizationProductType, C35355ItJ itJ, String str, String str2, boolean z) {
        String str3;
        C04220Ms.A0B(itJ, 2);
        if (AnonymousClass7Kz.A0V()) {
            Bundle A06 = C18180wK.A06();
            String A0t = C86124wJ.A0t(A06, itJ.toString(), str2);
            C04220Ms.A06(A0t);
            A06.putParcelable("logging_data", new LoggingData(A0t));
            if (str != null) {
                A06.putString("financial_entity_id", str);
            }
            if (userMonetizationProductType != null) {
                A06.putString("payout_subtype", C37416Jrb.A03(userMonetizationProductType).A00);
            }
            return AnonymousClass7Kz.A06().A00(A06, "settings_fragment");
        }
        DDJ.A00();
        AnonymousClass5x9 r3 = new AnonymousClass5x9();
        Bundle A062 = C18180wK.A06();
        if (userMonetizationProductType != null) {
            str3 = userMonetizationProductType.A00;
        } else {
            str3 = null;
        }
        A062.putString("MONETIZATION_PRODUCT_TYPE", str3);
        A062.putString("FINANCIAL_ENTITY_ID", str);
        A062.putString("PAYOUT_HUB_ORIGIN", itJ.A00);
        A062.putString("UPL_SESSION_ID", (String) null);
        A062.putBoolean("SHOULD_REFETCH_PAYOUT_INFORMATION", z);
        r3.setArguments(A062);
        return r3;
    }
}
