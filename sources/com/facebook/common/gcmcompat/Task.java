package com.facebook.common.gcmcompat;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C115566vU;
import X.C18180wK;
import X.C18190wL;
import X.C86114wI;
import X.C86144wL;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import java.util.Iterator;

public abstract class Task implements Parcelable {
    public final String A00;
    public final String A01;
    public final int A02;
    public final Bundle A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public static void A00(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            if (obtain.dataSize() <= 10240) {
                obtain.recycle();
                Iterator A0x = C86144wL.A0x(bundle);
                while (A0x.hasNext()) {
                    Object obj = bundle.get(C18180wK.A0k(A0x));
                    if (obj instanceof Bundle) {
                        A00((Bundle) obj);
                    } else if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                        throw C18190wL.A0a("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                    }
                }
                return;
            }
            obtain.recycle();
            throw C18190wL.A0a(AnonymousClass00U.A0L("Extras exceeding maximum size(10240 bytes): ", Integer.toString(obtain.dataSize())));
        }
    }

    public final String A02() {
        return this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeBundle(this.A03);
    }

    public Task(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        boolean z = false;
        this.A06 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A04 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A02 = parcel.readInt();
        this.A05 = parcel.readInt() == 1 ? true : z;
        this.A03 = parcel.readBundle(C86114wI.A0Z(this));
    }

    public static void A01(String str) {
        if (TextUtils.isEmpty(str)) {
            throw C18190wL.A0a("Must provide a valid tag.");
        } else if (str.length() > 100) {
            throw C18190wL.A0a("Tag is larger than max permissible tag length (100)");
        }
    }

    public void A03(Bundle bundle) {
        Bundle A062 = C18180wK.A06();
        A062.putInt("retry_policy", 0);
        A062.putInt("initial_backoff_seconds", 30);
        A062.putInt("maximum_backoff_seconds", ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS);
        bundle.putString("tag", this.A01);
        bundle.putBoolean("update_current", this.A06);
        bundle.putBoolean("persisted", this.A04);
        bundle.putString("service", this.A00);
        bundle.putInt("requiredNetwork", this.A02);
        bundle.putBoolean("requiresCharging", this.A05);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", A062);
        bundle.putBundle("extras", this.A03);
    }

    public Task(C115566vU r2) {
        this.A03 = r2.A02;
        this.A02 = 0;
        this.A05 = false;
        this.A00 = r2.A03;
        this.A01 = r2.A04;
        this.A04 = r2.A05;
        this.A06 = r2.A06;
    }
}
