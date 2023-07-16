package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C0S;
import X.C112176p7;
import X.C144028hi;
import X.C18200wM;
import X.C18230wP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import java.util.Iterator;
import java.util.List;

public final class StoryGroupMentionTappableData extends AnonymousClass0Sf implements Parcelable, C0S {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(43);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final StoryGroupMentionTappableData D1U(C112176p7 r1) {
        return this;
    }

    public final StoryGroupMentionTappableData D1V(C144028hi r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryGroupMentionTappableData) {
                StoryGroupMentionTappableData storyGroupMentionTappableData = (StoryGroupMentionTappableData) obj;
                if (!C04220Ms.A0I(this.A01, storyGroupMentionTappableData.A01) || !C04220Ms.A0I(this.A02, storyGroupMentionTappableData.A02) || !C04220Ms.A0I(this.A04, storyGroupMentionTappableData.A04) || !C04220Ms.A0I(this.A00, storyGroupMentionTappableData.A00) || !C04220Ms.A0I(this.A03, storyGroupMentionTappableData.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        Iterator A0v = C18200wM.A0v(parcel, this.A04);
        while (A0v.hasNext()) {
            parcel.writeParcelable((Parcelable) A0v.next(), i);
        }
        parcel.writeInt(C18230wP.A02(parcel, this.A00));
        parcel.writeString(this.A03);
    }

    public final String Abz() {
        return this.A01;
    }

    public final List AvH() {
        return this.A04;
    }

    public final Integer BDz() {
        return this.A00;
    }

    public final String BFt() {
        return this.A03;
    }

    public final String getId() {
        return this.A02;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A06(this.A01) * 31)) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A09(this.A03);
    }

    public StoryGroupMentionTappableData(Integer num, String str, String str2, String str3, List list) {
        AnonymousClass0wJ.A1Q(str2, list);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = list;
        this.A00 = num;
        this.A03 = str3;
    }
}
