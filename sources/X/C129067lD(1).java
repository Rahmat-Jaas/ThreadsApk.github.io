package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzf;
import com.google.android.gms.internal.auth.zzg;

/* renamed from: X.7lD  reason: invalid class name and case insensitive filesystem */
public final class C129067lD implements C143738hE {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ String A01;

    public C129067lD(String str, Bundle bundle) {
        this.A01 = str;
        this.A00 = bundle;
    }

    public final /* synthetic */ Object DBv(IBinder iBinder) {
        Object zzg;
        if (iBinder == null) {
            zzg = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof zzf) {
                zzg = (zzf) queryLocalInterface;
            } else {
                zzg = new zzg(iBinder);
            }
        }
        String str = this.A01;
        Bundle bundle = this.A00;
        zzb zzb = (zzb) zzg;
        int A03 = C14030oh.A03(-133323485);
        Parcel A002 = zzb.A00();
        A002.writeString(str);
        AnonymousClass7CR.A00(A002, bundle);
        Parcel A012 = zzb.A01(A002, 2);
        BaseBundle baseBundle = (BaseBundle) C86104wH.A0F(A012, Bundle.CREATOR);
        A012.recycle();
        C14030oh.A0A(842549263, A03);
        AnonymousClass7K9.A07(baseBundle);
        String string = baseBundle.getString("Error");
        if (baseBundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new AnonymousClass6CS(string);
    }
}
