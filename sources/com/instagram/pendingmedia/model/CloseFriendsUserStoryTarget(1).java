package com.instagram.pendingmedia.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18210wN;
import X.C28174Ezk;
import X.C86124wJ;
import android.os.Parcel;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class CloseFriendsUserStoryTarget implements UserStoryTarget {
    public static final PCreatorCreatorShape15S0000000_I2_15 CREATOR = new PCreatorCreatorShape15S0000000_I2_15(94);
    public String A00 = C28174Ezk.A00(128);
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18190wL.A1Y(this, obj)) {
                return false;
            }
            CloseFriendsUserStoryTarget closeFriendsUserStoryTarget = (CloseFriendsUserStoryTarget) obj;
            if (ImmutableList.copyOf((Collection) this.A01) != ImmutableList.copyOf((Collection) closeFriendsUserStoryTarget.A01) || !C04220Ms.A0I(this.A00, closeFriendsUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeList(ImmutableList.copyOf((Collection) this.A01));
    }

    public final String BIu() {
        return this.A00;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A00, ImmutableList.copyOf((Collection) this.A01));
    }

    public CloseFriendsUserStoryTarget(Parcel parcel) {
        ArrayList arrayList;
        this.A00 = parcel.readString();
        ArrayList readArrayList = parcel.readArrayList(CloseFriendsUserStoryTarget.class.getClassLoader());
        if (readArrayList != null) {
            arrayList = AnonymousClass0wJ.A0w(readArrayList);
            Iterator it = readArrayList.iterator();
            while (it.hasNext()) {
                C18210wN.A1O(it.next(), arrayList);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
    }

    public CloseFriendsUserStoryTarget() {
    }
}
