package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaa;

/* renamed from: X.7lZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C129247lZ implements C143788hJ {
    public final /* synthetic */ TelemetryData A00;

    public /* synthetic */ C129247lZ(TelemetryData telemetryData) {
        this.A00 = telemetryData;
    }

    /* JADX INFO: finally extract failed */
    public final void accept(Object obj, Object obj2) {
        TelemetryData telemetryData = this.A00;
        C113426rN r8 = (C113426rN) obj2;
        zaa zaa = (zaa) ((C121837Ij) obj).A03();
        int A03 = C14030oh.A03(-1746547611);
        Parcel A002 = zaa.A00();
        A002.writeInt(1);
        telemetryData.writeToParcel(A002, 0);
        int A032 = C14030oh.A03(-1122337457);
        try {
            zaa.A00.transact(1, A002, (Parcel) null, 1);
            A002.recycle();
            C14030oh.A0A(1863232442, A032);
            C14030oh.A0A(-759865617, A03);
            r8.A00.A0B((Object) null);
        } catch (Throwable th) {
            A002.recycle();
            C14030oh.A0A(-1980423653, A032);
            throw th;
        }
    }
}
