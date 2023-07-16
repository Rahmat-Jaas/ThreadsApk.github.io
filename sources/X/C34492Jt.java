package X;

import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Jt  reason: invalid class name and case insensitive filesystem */
public final class C34492Jt {
    public static final Map A00(BusinessInfo businessInfo) {
        String str;
        String str2;
        C04220Ms.A0B(businessInfo, 0);
        String str3 = businessInfo.A0B;
        if (str3 == null) {
            str3 = "";
        }
        PublicPhoneContact publicPhoneContact = businessInfo.A01;
        String str4 = "";
        String str5 = str4;
        if (publicPhoneContact != null) {
            String str6 = publicPhoneContact.A02;
            if (str6 == null || str6.length() == 0 || (str2 = publicPhoneContact.A03) == null) {
                str2 = str4;
            }
            str4 = str2;
        }
        Address address = businessInfo.A00;
        if (address == null || (str = address.A03) == null) {
            str = str5;
        }
        String valueOf = String.valueOf(businessInfo.A0R);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("email", str3);
        A0y.put("phone", str4);
        A0y.put("address", str);
        C18250wR.A1E(businessInfo.A0J, A0y);
        A0y.put("category_id", businessInfo.A09);
        A0y.put("should_show_public_contacts", valueOf);
        A0y.put("is_profile_audio_call_enabled", String.valueOf(businessInfo.A0O));
        return A0y;
    }
}
