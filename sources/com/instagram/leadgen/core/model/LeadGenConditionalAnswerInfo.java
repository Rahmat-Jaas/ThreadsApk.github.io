package com.instagram.leadgen.core.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class LeadGenConditionalAnswerInfo extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(8);
    public final List A00;
    public final Map A01;

    public LeadGenConditionalAnswerInfo(List list, Map map) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
        this.A01 = map;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenConditionalAnswerInfo) {
                LeadGenConditionalAnswerInfo leadGenConditionalAnswerInfo = (LeadGenConditionalAnswerInfo) obj;
                if (!C04220Ms.A0I(this.A00, leadGenConditionalAnswerInfo.A00) || !C04220Ms.A0I(this.A01, leadGenConditionalAnswerInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
        Map map = this.A01;
        parcel.writeInt(map.size());
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            parcel.writeString(C18200wM.A0p(A0o));
            ((LeadGenConditionalAnswerInfo) A0o.getValue()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A04(this.A00));
    }
}
