package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.signin.internal.zae;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* renamed from: X.5lt  reason: invalid class name and case insensitive filesystem */
public final class C93615lt extends C93625lu implements C148588rW {
    public final Bundle A00;
    public final C110886mR A01;
    public final Integer A02;

    public final int Ave() {
        return 12451000;
    }

    public final boolean CeJ() {
        return true;
    }

    public final void DBd(zae zae) {
        GoogleSignInAccount googleSignInAccount;
        try {
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = AnonymousClass7HJ.A00(this.A0F).A02();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.A02;
            C13320nQ.A01(num);
            zat zat = new zat(account, googleSignInAccount, 2, num.intValue());
            zaa zaa = (zaa) A03();
            zai zai = new zai(zat, 1);
            int A03 = C14030oh.A03(2108055427);
            Parcel A002 = zaa.A00();
            A002.writeInt(1);
            zai.writeToParcel(A002, 0);
            C86134wK.A16(zae, A002);
            zaa.A01(A002, 12);
            C14030oh.A0A(-1036543505, A03);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zae.DBa(new zak(new ConnectionResult(8, (PendingIntent) null), (zav) null, 1));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public C93615lt(Context context, Bundle bundle, Looper looper, C148648rc r12, C148658rd r13, C110886mR r14) {
        super(context, looper, r12, r13, r14, 44);
        this.A01 = r14;
        this.A00 = bundle;
        this.A02 = r14.A00;
    }
}
