package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3z8  reason: invalid class name */
public final class AnonymousClass3z8 implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(AnonymousClass3z8.class);
    public static final String __redex_internal_original_name = "BusinessConversionFunnelLoggerUtil";

    public static Bundle A00(C10300i6 r2) {
        String bool = Boolean.toString(C61853Wb.A01(A00, r2, "business_conversion_funnel_logger"));
        Bundle A06 = C18180wK.A06();
        A06.putString("fb_account_linked", bool);
        return A06;
    }

    public static Bundle A01(BusinessInfo businessInfo, String str, String str2, String str3, String str4) {
        String str5;
        HashMap A0y = AnonymousClass0wJ.A0y();
        PublicPhoneContact publicPhoneContact = businessInfo.A01;
        String str6 = null;
        if (publicPhoneContact == null || TextUtils.isEmpty(publicPhoneContact.A02)) {
            str5 = null;
        } else {
            str5 = publicPhoneContact.A03;
        }
        A0y.put("email", businessInfo.A0B);
        A0y.put("phone", str5);
        Address address = businessInfo.A00;
        if (address != null) {
            str6 = address.A03;
        }
        A0y.put("address", str6);
        C18250wR.A1E(businessInfo.A0J, A0y);
        A0y.put("subcategory_id", businessInfo.A09);
        Bundle A02 = A02(A0y);
        A02.putString(C62983bG.A01(), str);
        if (str2 != null) {
            A02.putString("new_user_id", str2);
            return A02;
        }
        A02.putString(TraceFieldType.ErrorCode, str3);
        A02.putString("error_message", str4);
        return A02;
    }

    public static Bundle A02(Map map) {
        Bundle A06 = C18180wK.A06();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            A06.putString(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
        }
        return A06;
    }
}
