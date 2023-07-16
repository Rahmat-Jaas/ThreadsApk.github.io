package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.78k  reason: invalid class name and case insensitive filesystem */
public final class C1200778k {
    public final AutofillData A00;
    public final CardDetails A01;

    public C1200778k(AutofillData autofillData, CardDetails cardDetails) {
        this.A00 = autofillData;
        this.A01 = cardDetails;
    }

    public static void A00(Object obj, AbstractMap abstractMap, Map map) {
        if (map.get(obj) != null) {
            abstractMap.put(obj, map.get(obj));
        }
    }

    public final Map A01() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        AutofillData autofillData = this.A00;
        if (autofillData != null) {
            Map map = autofillData.A00;
            Object obj = Collections.unmodifiableMap(map).get(FXPFAccessLibraryDebugFragment.NAME);
            if (obj != null) {
                A0y.put(FXPFAccessLibraryDebugFragment.NAME, obj);
                A0y.put("cc-name", obj);
            }
            if (map.get("given-name") != null) {
                A0y.put("given-name", map.get("given-name"));
                A0y.put("cc-given-name", map.get("given-name"));
            }
            if (map.get("family-name") != null) {
                A0y.put("family-name", map.get("family-name"));
                A0y.put("cc-family-name", map.get("family-name"));
            }
            A00("email", A0y, map);
            A00("tel", A0y, map);
            A00("address-line1", A0y, map);
            A00("address-line2", A0y, map);
            A00("address-level1", A0y, map);
            A00("address-level2", A0y, map);
            A00("postal-code", A0y, map);
        }
        return A0y;
    }

    public final Map A02() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.putAll(A01());
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        CardDetails cardDetails = this.A01;
        if (cardDetails != null) {
            String str = cardDetails.A06;
            if (str != null) {
                A0y2.put("cc-number", str);
            }
            StringBuilder A0r = C18200wM.A0r();
            Integer num = cardDetails.A02;
            if (num != null) {
                String format = String.format(Locale.US, "%02d", C18210wN.A1X(num.intValue() % 100));
                A0y2.put("cc-exp-month", format);
                A0r.append(format);
            }
            Integer num2 = cardDetails.A03;
            if (num2 != null) {
                String format2 = String.format(Locale.US, "%02d", C18210wN.A1X(num2.intValue() % 100));
                A0y2.put("cc-exp-year", num2.toString());
                A0r.append('/');
                A0r.append(format2);
            }
            if (A0r.length() == 5) {
                A0y2.put("cc-exp", A0r.toString());
            }
        }
        A0y.putAll(A0y2);
        return A0y;
    }
}
