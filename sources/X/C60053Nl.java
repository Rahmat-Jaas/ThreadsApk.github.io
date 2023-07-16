package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.Locale;

/* renamed from: X.3Nl  reason: invalid class name and case insensitive filesystem */
public final class C60053Nl {
    public static final CountryCodeData A00(Context context) {
        C04220Ms.A0B(context, 0);
        Object systemService = context.getSystemService("phone");
        C04220Ms.A0C(systemService, AnonymousClass000.A00(188));
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (simCountryIso == null && (simCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
            simCountryIso = Locale.getDefault().getCountry();
        }
        C04220Ms.A06(simCountryIso);
        String A0u = C18220wO.A0u(Locale.ROOT, simCountryIso);
        if (A0u.length() == 0) {
            A0u = "US";
        }
        return new CountryCodeData(String.valueOf(PhoneNumberUtil.A01(context).A06(A0u)), new Locale("", A0u).getDisplayCountry(), A0u);
    }

    public static final CountryCodeData A01(Context context, String str) {
        AnonymousClass0wJ.A1N(context, str);
        if (str.length() == 0) {
            return A00(context);
        }
        int parseInt = Integer.parseInt(str);
        String A0B = PhoneNumberUtil.A01(context).A0B(parseInt);
        C04220Ms.A06(A0B);
        return new CountryCodeData(parseInt, A0B);
    }
}
