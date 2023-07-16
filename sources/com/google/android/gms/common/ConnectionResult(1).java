package com.google.android.gms.common;

import X.C113596rm;
import X.C117046y2;
import X.C122167Ky;
import X.C18180wK;
import X.C86114wI;
import X.C86124wJ;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final ConnectionResult A04 = new ConnectionResult(0);
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(27);
    public static final int SUCCESS = 0;
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(pendingIntent, (String) null, 1, i);
    }

    public ConnectionResult(PendingIntent pendingIntent, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ConnectionResult) {
                ConnectionResult connectionResult = (ConnectionResult) obj;
                if (this.A01 != connectionResult.A01 || !C117046y2.A01(this.A02, connectionResult.A02) || !C117046y2.A01(this.A03, connectionResult.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static String A00(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case LangUtils.HASH_SEED /*17*/:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder A0s = C86114wI.A0s(31);
                        A0s.append("UNKNOWN_ERROR_CODE(");
                        A0s.append(i);
                        return C18180wK.A0i(")", A0s);
                }
        }
    }

    public final int hashCode() {
        return C86124wJ.A0I(Integer.valueOf(this.A01), this.A02, this.A03);
    }

    public final String toString() {
        C113596rm r2 = new C113596rm(this);
        r2.A00(A00(this.A01), "statusCode");
        r2.A00(this.A02, "resolution");
        r2.A00(this.A03, DialogModule.KEY_MESSAGE);
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A0D(parcel, this.A02, 3, i, false);
        C122167Ky.A0G(parcel, this.A03, A002, false);
    }

    public ConnectionResult(int i) {
        this((PendingIntent) null, (String) null, 1, i);
    }
}
