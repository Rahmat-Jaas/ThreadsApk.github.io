package com.instagram.model.people;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C112176p7;
import X.C144778jG;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class PeopleTagDict extends AnonymousClass0Sf implements Parcelable, C144778jG {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(0);
    public final User A00;
    public final Boolean A01;
    public final Float A02;
    public final Float A03;
    public final List A04;
    public final List A05;

    public final PeopleTagDict D4z(C112176p7 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeopleTagDict) {
                PeopleTagDict peopleTagDict = (PeopleTagDict) obj;
                if (!C04220Ms.A0I(this.A04, peopleTagDict.A04) || !C04220Ms.A0I(this.A02, peopleTagDict.A02) || !C04220Ms.A0I(this.A05, peopleTagDict.A05) || !C04220Ms.A0I(this.A01, peopleTagDict.A01) || !C04220Ms.A0I(this.A03, peopleTagDict.A03) || !C04220Ms.A0I(this.A00, peopleTagDict.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeStringList(this.A04);
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v = C18200wM.A0v(parcel, list);
            while (A0v.hasNext()) {
                parcel.writeFloat(C18240wQ.A00(A0v.next()));
            }
        }
        C18190wL.A14(parcel, this.A01);
        Float f2 = this.A03;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return (((((((((AnonymousClass0wJ.A03(this.A04) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A00);
    }

    public PeopleTagDict(User user, Boolean bool, Float f, Float f2, List list, List list2) {
        this.A04 = list;
        this.A02 = f;
        this.A05 = list2;
        this.A01 = bool;
        this.A03 = f2;
        this.A00 = user;
    }
}
