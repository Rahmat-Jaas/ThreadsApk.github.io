package com.google.android.gms.common.server.response;

import X.AnonymousClass7Eu;
import X.C117046y2;
import X.C13320nQ;
import X.C18220wO;
import X.C86104wH;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

public abstract class FastSafeParcelableJsonResponse extends AnonymousClass7Eu implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (getClass().isInstance(obj)) {
                    AnonymousClass7Eu r7 = (AnonymousClass7Eu) obj;
                    Iterator A14 = C86104wH.A14(A05());
                    while (A14.hasNext()) {
                        FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) A14.next();
                        boolean A06 = A06(fastJsonResponse$Field);
                        boolean A062 = r7.A06(fastJsonResponse$Field);
                        if (A06) {
                            if (A062 && C117046y2.A01(A04(fastJsonResponse$Field), r7.A04(fastJsonResponse$Field))) {
                            }
                        } else if (A062) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator A14 = C86104wH.A14(A05());
        int i = 0;
        while (A14.hasNext()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) A14.next();
            if (A06(fastJsonResponse$Field)) {
                Object A04 = A04(fastJsonResponse$Field);
                C13320nQ.A01(A04);
                i = C18220wO.A06(A04, i * 31);
            }
        }
        return i;
    }
}
