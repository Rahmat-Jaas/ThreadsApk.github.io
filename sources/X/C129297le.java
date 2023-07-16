package X;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzv;

/* renamed from: X.7le  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C129297le implements C143788hJ {
    public final /* synthetic */ RetrieveBytesRequest A00;
    public final /* synthetic */ C93245lF A01;

    public /* synthetic */ C129297le(RetrieveBytesRequest retrieveBytesRequest, C93245lF r2) {
        this.A01 = r2;
        this.A00 = retrieveBytesRequest;
    }

    public final void accept(Object obj, Object obj2) {
        RetrieveBytesRequest retrieveBytesRequest = this.A00;
        zzv zzv = new zzv((C113426rN) obj2);
        int A03 = C14030oh.A03(-1993799605);
        Parcel A0F = C86114wI.A0F(zzv);
        C86114wI.A12(A0F, retrieveBytesRequest, 0);
        ((zza) ((C121837Ij) obj).A03()).A00(A0F, 12);
        C14030oh.A0A(-1388156947, A03);
    }
}
