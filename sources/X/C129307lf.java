package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzr;
import com.google.android.gms.internal.auth.zzy;

/* renamed from: X.7lf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C129307lf implements C143788hJ {
    public final Account A00;
    public final Bundle A01;
    public final C93255lG A02;
    public final String A03;

    public C129307lf(Account account, Bundle bundle, C93255lG r3, String str) {
        this.A02 = r3;
        this.A00 = account;
        this.A03 = str;
        this.A01 = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        Account account = this.A00;
        String str = this.A03;
        Bundle bundle = this.A01;
        zzy zzy = new zzy((C113426rN) obj2);
        zzb zzb = (zzb) ((zzr) ((C121837Ij) obj).A03());
        int A032 = C14030oh.A03(-1329674821);
        Parcel A002 = zzb.A00();
        C86134wK.A16(zzy, A002);
        AnonymousClass7CR.A00(A002, account);
        A002.writeString(str);
        AnonymousClass7CR.A00(A002, bundle);
        zzb.A02(A002, 1);
        C14030oh.A0A(-1813188539, A032);
    }
}
