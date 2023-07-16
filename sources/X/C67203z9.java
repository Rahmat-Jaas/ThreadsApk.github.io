package X;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3z9  reason: invalid class name and case insensitive filesystem */
public final class C67203z9 implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67203z9.class);
    public static final String __redex_internal_original_name = "BusinessQuickConversionUtils";

    public static BusinessInfo A00(Context context, AnonymousClass3DP r10) {
        C62163Xl r3 = new C62163Xl();
        r3.A09 = r10.A02;
        r3.A0B = r10.A09;
        r3.A0J = r10.A04;
        r3.A0N = true;
        r3.A0A = r10.A03;
        r3.A02 = r10.A00;
        r3.A03 = r10.A01;
        if (!TextUtils.isEmpty(r10.A0A) && !TextUtils.isEmpty(r10.A0B)) {
            r3.A01 = new PublicPhoneContact(r10.A0A, r10.A0B, PhoneNumberUtils.stripSeparators(AnonymousClass00U.A0V(r10.A0A, " ", r10.A0B)), "");
        }
        if (!TextUtils.isEmpty(r10.A05) && !TextUtils.isEmpty(r10.A06)) {
            r3.A00 = new Address(r10.A08, r10.A06, r10.A05, r10.A07, C67353zP.A04(context, r10.A08, r10.A07, r10.A06));
        }
        return new BusinessInfo(r3);
    }

    public static Map A01(AnonymousClass3DP r4) {
        String str;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (r4 != null) {
            A0y.put("category_id", r4.A02);
            A0y.put("category_name", r4.A03);
            AnonymousClass266 r0 = r4.A00;
            String str2 = null;
            if (r0 == null) {
                str = null;
            } else {
                str = r0.A01;
            }
            A0y.put("category_account_type", str);
            AnonymousClass266 r02 = r4.A01;
            if (r02 != null) {
                str2 = r02.A01;
            }
            A0y.put("previous_account_type", str2);
            A0y.put("address_city_id", r4.A05);
            A0y.put("address_city_name", r4.A06);
            A0y.put("address_postal_code", r4.A07);
            A0y.put("address_street", r4.A08);
            A0y.put("email", r4.A09);
            A0y.put("is_page_convertable", String.valueOf(r4.A0D));
            C18250wR.A1E(String.valueOf(r4.A04), A0y);
            A0y.put("phone_country_code", String.valueOf(r4.A0A));
            A0y.put("phone_national_number", String.valueOf(r4.A0B));
            A0y.put("source", String.valueOf(r4.A0C));
        }
        return A0y;
    }

    public static void A02(Context context, AnonymousClass06E r4, C84144sc r5, C10300i6 r6) {
        H1T A0N = AnonymousClass0wJ.A0N(r6);
        A0N.A0J("business/account/fetch_account_type_quick_conversion_settings/");
        A0N.A0B(AnonymousClass1SW.class, AnonymousClass3OE.class);
        A0N.A0O("fb_auth_token", C61853Wb.A00(A00, r6, "ig_professional_conversion_flow"));
        C32165H8c A0Q = C18190wL.A0Q(A0N);
        C63873iU.A0E(A0Q, r5, 33);
        C31155GhB.A01(context, r4, A0Q);
    }
}
