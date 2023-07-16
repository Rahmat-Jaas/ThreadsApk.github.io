package com.google.android.gms.common.internal;

import X.AnonymousClass7DN;
import X.C121837Ij;
import X.C13320nQ;
import X.C14030oh;
import X.C86104wH;
import X.C86164wN;
import X.C93535ll;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;

public abstract class zzab extends zzb implements IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        C14030oh.A0A(-936809769, C14030oh.A03(-285607217));
    }

    public final boolean A03(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int i4;
        RootTelemetryConfiguration rootTelemetryConfiguration;
        int A03 = C14030oh.A03(-1199167684);
        if (i != 1) {
            if (i == 2) {
                parcel.readInt();
                C86164wN.A19(parcel, Bundle.CREATOR);
                i3 = C14030oh.A03(1205045639);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                i4 = 1081273689;
            } else if (i != 3) {
                C14030oh.A0A(1772362381, A03);
                return false;
            } else {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                zzj zzj = (zzj) C86104wH.A0F(parcel, zzj.CREATOR);
                zzd zzd = (zzd) this;
                i3 = C14030oh.A03(587035578);
                C121837Ij r1 = zzd.A00;
                C13320nQ.A02(r1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                C13320nQ.A01(zzj);
                r1.A0Q = zzj;
                if (r1 instanceof C93535ll) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzj.A02;
                    AnonymousClass7DN A00 = AnonymousClass7DN.A00();
                    if (connectionTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = null;
                    } else {
                        rootTelemetryConfiguration = connectionTelemetryConfiguration.A01;
                    }
                    synchronized (A00) {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = AnonymousClass7DN.A02;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = A00.A00;
                            if (rootTelemetryConfiguration2 != null) {
                                if (rootTelemetryConfiguration2.A00 < rootTelemetryConfiguration.A00) {
                                }
                            }
                        }
                        A00.A00 = rootTelemetryConfiguration;
                    }
                }
                zzd.CBo(readInt, readStrongBinder, zzj.A01);
                i4 = 1303799382;
            }
            C14030oh.A0A(i4, i3);
        } else {
            CBo(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C86104wH.A0F(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        C14030oh.A0A(1789954591, A03);
        return true;
    }
}
