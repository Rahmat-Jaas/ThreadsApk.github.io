package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.2Gt  reason: invalid class name and case insensitive filesystem */
public final class C33712Gt {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        String A0D = C63893iY.A0D(r6, AnonymousClass0wJ.A1Y(r6, r5) ? 1 : 0);
        C10300i6 A0F = C63913ic.A0F(r5);
        FragmentActivity A05 = C63913ic.A05(r5);
        CountryCodeData countryCodeData = ((RegFlowExtras) A0F.A01(RegFlowExtras.class, AnonymousClass4b5.A00)).A01;
        if (countryCodeData == null) {
            countryCodeData = C60053Nl.A00(A05);
        }
        try {
            return String.valueOf(Long.valueOf(PhoneNumberUtil.A01(A05).A0A(A0D, countryCodeData.A00).A02));
        } catch (C32122Ah unused) {
            return null;
        }
    }
}
