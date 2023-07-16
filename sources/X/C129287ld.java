package X;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzu;

/* renamed from: X.7ld  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C129287ld implements C143788hJ {
    public final /* synthetic */ StoreBytesData A00;
    public final /* synthetic */ C93245lF A01;

    public /* synthetic */ C129287ld(StoreBytesData storeBytesData, C93245lF r2) {
        this.A01 = r2;
        this.A00 = storeBytesData;
    }

    public final void accept(Object obj, Object obj2) {
        StoreBytesData storeBytesData = this.A00;
        zzu zzu = new zzu((C113426rN) obj2);
        int A03 = C14030oh.A03(1854331366);
        Parcel A0F = C86114wI.A0F(zzu);
        C86114wI.A12(A0F, storeBytesData, 0);
        ((zza) ((C121837Ij) obj).A03()).A00(A0F, 10);
        C14030oh.A0A(-324524744, A03);
    }
}
