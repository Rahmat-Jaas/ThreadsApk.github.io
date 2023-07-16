package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzf;
import com.google.android.gms.internal.auth.zzg;

/* renamed from: X.7lE  reason: invalid class name */
public final class AnonymousClass7lE implements C143738hE {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ String A02;

    public AnonymousClass7lE(Account account, Bundle bundle, String str) {
        this.A00 = account;
        this.A02 = str;
        this.A01 = bundle;
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
        Account account = this.A00;
        String str = this.A02;
        Bundle bundle = this.A01;
        zzb zzb = (zzb) zzg;
        int A03 = C14030oh.A03(730339254);
        Parcel A002 = zzb.A00();
        AnonymousClass7CR.A00(A002, account);
        A002.writeString(str);
        AnonymousClass7CR.A00(A002, bundle);
        Parcel A012 = zzb.A01(A002, 5);
        Bundle bundle2 = (Bundle) C86104wH.A0F(A012, Bundle.CREATOR);
        A012.recycle();
        C14030oh.A0A(-1419387378, A03);
        AnonymousClass7K9.A07(bundle2);
        return AnonymousClass7K9.A00(bundle2);
    }
}
