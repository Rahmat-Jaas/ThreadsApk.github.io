package com.google.firebase.messaging;

import X.C122167Ky;
import X.C86134wK;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(73);
    public Bundle A00;
    public Map A01;

    public final int A00() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        if ("normal".equals(string)) {
            return 2;
        }
        return 0;
    }

    public final int A01() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        if ("normal".equals(string)) {
            return 2;
        }
        return 0;
    }

    public RemoteMessage(Bundle bundle) {
        this.A00 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A02(this.A00, parcel, 2);
        C122167Ky.A05(parcel, A002);
    }
}
