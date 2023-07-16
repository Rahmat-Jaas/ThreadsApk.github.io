package com.facebook.browser.lite.extensions.autofill.base;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass25T;
import X.C18220wO;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class IDxFieldShape23S0000000_1_I2 extends AnonymousClass25T {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxFieldShape23S0000000_1_I2(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0014;
                case 2: goto L_0x0010;
                case 3: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = "TELEPHONE"
            r0 = 4
        L_0x0008:
            r2.<init>(r1, r0)
            return
        L_0x000c:
            java.lang.String r1 = "EMAIL"
            r0 = 3
            goto L_0x0008
        L_0x0010:
            java.lang.String r1 = "CITY_STATE_ZIPCODE"
            r0 = 2
            goto L_0x0008
        L_0x0014:
            java.lang.String r1 = "ADDRESS"
            r0 = 1
            goto L_0x0008
        L_0x0018:
            java.lang.String r1 = "NAME"
            r0 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.IDxFieldShape23S0000000_1_I2.<init>(int):void");
    }

    public final String A00(Context context, AutofillData autofillData) {
        int i;
        int i2 = this.A00;
        Resources resources = context.getResources();
        switch (i2) {
            case 0:
                i = R.string.f0nameremoved;
                break;
            case 3:
                i = R.string.f0nameremoved;
                break;
            case 4:
                i = R.string.f0nameremoved;
                break;
            default:
                i = R.string.f0nameremoved;
                break;
        }
        return resources.getString(i);
    }

    public final String A01(AutofillData autofillData) {
        Map unmodifiableMap;
        String str;
        switch (this.A00) {
            case 0:
                unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
                str = FXPFAccessLibraryDebugFragment.NAME;
                break;
            case 1:
                Map map = autofillData.A00;
                String A0r = C18220wO.A0r("address-line1", Collections.unmodifiableMap(map));
                if (A0r == null) {
                    return null;
                }
                String A0r2 = C18220wO.A0r("address-line2", Collections.unmodifiableMap(map));
                if (A0r2 != null) {
                    return AnonymousClass00U.A0V(A0r, " ", A0r2);
                }
                return A0r;
            case 2:
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Map map2 = autofillData.A00;
                Object obj = Collections.unmodifiableMap(map2).get("address-level2");
                if (obj != null) {
                    A0v.add(obj);
                }
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                Object obj2 = Collections.unmodifiableMap(map2).get("address-level1");
                if (obj2 != null) {
                    A0v2.add(obj2);
                }
                Object obj3 = Collections.unmodifiableMap(map2).get("postal-code");
                if (obj3 != null) {
                    A0v2.add(obj3);
                }
                if (!A0v2.isEmpty()) {
                    A0v.add(TextUtils.join(" ", A0v2));
                }
                if (!A0v.isEmpty()) {
                    return TextUtils.join(", ", A0v);
                }
                return null;
            case 3:
                unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
                str = "email";
                break;
            default:
                unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
                str = "tel";
                break;
        }
        return C18220wO.A0r(str, unmodifiableMap);
    }
}
