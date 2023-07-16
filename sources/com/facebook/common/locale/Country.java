package com.facebook.common.locale;

import X.AnonymousClass00U;
import X.AnonymousClass7J2;
import X.C108736ir;
import X.C18190wL;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public class Country extends LocaleMember {
    public static final Country A00 = A00((Country) null, "IN");
    public static final Country A01 = A00((Country) null, "US");
    public static final C108736ir A02 = new C108736ir();
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(52);

    public static Country A00(Country country, String str) {
        IllegalArgumentException illegalArgumentException;
        LocaleMember localeMember;
        try {
            C108736ir r2 = A02;
            if (str != null) {
                int length = str.length();
                if (length == 2) {
                    try {
                        localeMember = (LocaleMember) r2.A01.A00(str);
                    } catch (ExecutionException e) {
                        AnonymousClass7J2.A02(e);
                        illegalArgumentException = null;
                    }
                } else if (length == 3) {
                    Object obj = r2.A00.get();
                    obj.getClass();
                    localeMember = (LocaleMember) ((ImmutableMap) obj).get(str);
                    if (localeMember == null) {
                        illegalArgumentException = C18190wL.A0a(AnonymousClass00U.A0L("Not a legal code: ", str));
                        throw illegalArgumentException;
                    }
                }
                return (Country) localeMember;
            }
            illegalArgumentException = C18190wL.A0a(AnonymousClass00U.A0L("Not a legal code: ", str));
            throw illegalArgumentException;
        } catch (IllegalArgumentException e2) {
            if (country != null) {
                return country;
            }
            throw e2;
        }
    }

    public Country(Locale locale) {
        super(locale);
    }
}
