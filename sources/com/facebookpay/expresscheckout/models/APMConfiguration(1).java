package com.facebookpay.expresscheckout.models;

import X.C04220Ms;
import X.C147878q4;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.modelutil.parcel.TreeParcelable;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.redex.PCreatorCreatorShape3S0000000_I2_3;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class APMConfiguration implements Parcelable {
    public static final PCreatorCreatorShape3S0000000_I2_3 CREATOR = C86124wJ.A0X(10);
    public final C147878q4 A00;

    public APMConfiguration(C147878q4 r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C147878q4 r1 = this.A00;
        if (r1 instanceof Tree) {
            parcel.writeInt(1);
            Tree tree = (Tree) r1;
            if (tree.isValidGraphServicesJNIModel()) {
                String A0q = C18220wO.A0q(tree);
                int typeTag = tree.getTypeTag();
                byte[] A01 = TreeParcelable.A01(tree);
                parcel.writeString(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                parcel.writeString(A0q);
                parcel.writeInt(typeTag);
                parcel.writeInt(A01.length);
                parcel.writeByteArray(A01);
                return;
            }
            throw C18210wN.A0W("asTree_DO_NOT_USE");
        }
        throw C18190wL.A0a("Unknown GraphQLModel concrete type!");
    }
}
