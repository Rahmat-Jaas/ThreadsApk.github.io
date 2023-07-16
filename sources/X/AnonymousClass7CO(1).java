package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.common.dextricks.DexStore;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* renamed from: X.7CO  reason: invalid class name */
public final class AnonymousClass7CO {
    public static final C113826sD A00 = new C113826sD("GoogleSignInCommon", new String[0]);

    public static Intent A00(Context context, GoogleSignInOptions googleSignInOptions) {
        A00.A00("getSignInIntent()", C86164wN.A1T());
        SignInConfiguration signInConfiguration = new SignInConfiguration(googleSignInOptions, context.getPackageName());
        Intent A05 = C18250wR.A05("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        A05.setPackage(context.getPackageName());
        A05.setClass(context, SignInHubActivity.class);
        Bundle A06 = C18180wK.A06();
        A06.putParcelable(DexStore.CONFIG_FILENAME, signInConfiguration);
        A05.putExtra(DexStore.CONFIG_FILENAME, A06);
        return A05;
    }

    public static void A01(Context context) {
        C1199977y.A00(context).A01();
        Set<AnonymousClass7AL> set = AnonymousClass7AL.A00;
        synchronized (set) {
        }
        for (AnonymousClass7AL r1 : set) {
            if (r1 instanceof C93285lJ) {
                C146548mQ r0 = ((C93285lJ) r1).A01;
                if (r0 != null) {
                    r0.DBp();
                }
            } else {
                throw C18240wQ.A0j();
            }
        }
        synchronized (AnonymousClass7MI.A0I) {
            AnonymousClass7MI r12 = AnonymousClass7MI.A0F;
            if (r12 != null) {
                r12.A0C.incrementAndGet();
                Handler handler = r12.A06;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
