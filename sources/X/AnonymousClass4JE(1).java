package X;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.4JE  reason: invalid class name */
public final class AnonymousClass4JE implements C82924qU {
    public final Dialog A00;
    public final Context A01;
    public final C25828Dsm A02;

    public final void BN1(Uri uri, Bundle bundle) {
        C13950oZ.A00(this.A00);
    }

    public AnonymousClass4JE(Context context) {
        this.A01 = context;
        C25828Dsm A0W = C18190wL.A0W(context);
        this.A02 = A0W;
        A0W.A02 = context.getString(2131826054);
        C18220wO.A14(context, A0W, 2131826053);
        A0W.A0c(C18220wO.A0O(this, 139), context.getString(2131826052));
        this.A00 = A0W.A0G();
    }
}
