package com.google.android.gms.location;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C1365483d;
import X.C18180wK;
import X.C18220wO;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Comparator A03 = new C1365483d();
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(23);
    public final String A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
                if (!C117046y2.A01(this.A01, activityTransitionRequest.A01) || !C117046y2.A01(this.A00, activityTransitionRequest.A00) || !C117046y2.A01(this.A02, activityTransitionRequest.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.A01.hashCode() * 31) + C18220wO.A07(this.A00)) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A01);
        String str = this.A00;
        String valueOf2 = String.valueOf(this.A02);
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 61 + C86104wH.A0A(str) + C86104wH.A0A(valueOf2));
        A0s.append("ActivityTransitionRequest [mTransitions=");
        A0s.append(valueOf);
        A0s.append(", mTag='");
        A0s.append(str);
        A0s.append('\'');
        A0s.append(", mClients=");
        A0s.append(valueOf2);
        return C86114wI.A0q(A0s, ']');
    }

    public ActivityTransitionRequest(String str, List list, List list2) {
        List unmodifiableList;
        C13320nQ.A02(list, "transitions can't be null");
        C13320nQ.A06(C18180wK.A1X(list.size()), "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(A03);
        for (Object next : list) {
            C13320nQ.A06(treeSet.add(next), String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = str;
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.A02 = unmodifiableList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0K(parcel, this.A01, 1, false);
        C122167Ky.A0H(parcel, this.A00, 2, false);
        C122167Ky.A0K(parcel, this.A02, 3, false);
        C122167Ky.A05(parcel, A002);
    }
}
