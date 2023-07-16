package com.instagram.business.insights.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C18220wO;
import X.C35656IzW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import java.util.Iterator;
import java.util.List;

public final class InsightsChartFilterData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(4);
    public final Integer A00;
    public final String A01;
    public final List A02;

    public InsightsChartFilterData(Integer num, String str, List list) {
        C04220Ms.A0B(num, 2);
        this.A01 = str;
        this.A00 = num;
        this.A02 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InsightsChartFilterData) {
                InsightsChartFilterData insightsChartFilterData = (InsightsChartFilterData) obj;
                if (!C04220Ms.A0I(this.A01, insightsChartFilterData.A01) || this.A00 != insightsChartFilterData.A00 || !C04220Ms.A0I(this.A02, insightsChartFilterData.A02)) {
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
        parcel.writeString(C35656IzW.A00(this.A00));
        Iterator A0v = C18200wM.A0v(parcel, this.A02);
        while (A0v.hasNext()) {
            DataPoint dataPoint = (DataPoint) A0v.next();
            if (dataPoint == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dataPoint.writeToParcel(parcel, i);
            }
        }
    }

    public final int hashCode() {
        int A06 = AnonymousClass0wJ.A06(this.A01) * 31;
        Integer num = this.A00;
        return C18220wO.A06(this.A02, C18220wO.A05(num, C35656IzW.A00(num), A06));
    }
}
