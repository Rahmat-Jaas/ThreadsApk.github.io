package com.instagram.leadgen.core.api;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C86114wI;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

public final class LeadForm extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(3);
    public final ImageUrl A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadForm) {
                LeadForm leadForm = (LeadForm) obj;
                if (!C04220Ms.A0I(this.A00, leadForm.A00) || !C04220Ms.A0I(this.A02, leadForm.A02) || !C04220Ms.A0I(this.A03, leadForm.A03) || !C04220Ms.A0I(this.A05, leadForm.A05) || !C04220Ms.A0I(this.A01, leadForm.A01) || !C04220Ms.A0I(this.A04, leadForm.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Iterator A0v = C18200wM.A0v(parcel, this.A05);
        while (A0v.hasNext()) {
            ((LeadGenInfoFieldData) A0v.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(C86114wI.A1W(parcel, this.A01) ? 1 : 0);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A05(this.A05, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A03(this.A00) * 31))) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A09(this.A04);
    }

    public LeadForm(ImageUrl imageUrl, Boolean bool, String str, String str2, String str3, List list) {
        AnonymousClass0wJ.A1Q(str, str2);
        C04220Ms.A0B(list, 4);
        this.A00 = imageUrl;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A01 = bool;
        this.A04 = str3;
    }
}
