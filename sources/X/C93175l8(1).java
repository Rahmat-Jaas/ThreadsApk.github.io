package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.5l8  reason: invalid class name and case insensitive filesystem */
public abstract class C93175l8 extends C99276Iu {
    public final C148598rX A00(Context context, Looper looper, C148648rc r20, C148658rd r21, C110886mR r22, Object obj) {
        Object obj2 = obj;
        if (this instanceof C93165l7) {
            throw null;
        }
        Context context2 = context;
        Looper looper2 = looper;
        C148648rc r7 = r20;
        C148658rd r8 = r21;
        C110886mR r9 = r22;
        if (this instanceof C93155l6) {
            Integer num = r9.A00;
            Bundle A06 = C18180wK.A06();
            A06.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable) null);
            if (num != null) {
                A06.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
            }
            A06.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            A06.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            A06.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
            A06.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            A06.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            A06.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
            A06.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
            A06.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
            return new C93615lt(context2, A06, looper2, r7, r8, r9);
        } else if (this instanceof C93145l5) {
            return new C93565lo(context2, looper2, r7, r8, r9);
        } else {
            if (this instanceof C93135l4) {
                return new C93595lr(context2, looper2, r7, r8, r9);
            }
            if (this instanceof C93085kz) {
                return new C93605ls(context2, looper2, (GoogleSignInOptions) obj2, r7, r8, r9);
            } else if (this instanceof C93075ky) {
                return new C93555ln(context2, looper2, (C129107lI) obj2, r7, r8, r9);
            } else if (this instanceof C93125l3) {
                return new C93535ll(context2, looper2, r7, r8, r9);
            } else {
                if (this instanceof C93115l2) {
                    return new C93575lp(context2, looper2, r7, r8, r9);
                }
                if (this instanceof C93105l1) {
                    return new C93545lm(context2, looper2, r7, r8, r9, (C129087lG) obj2);
                }
                if (this instanceof C93095l0) {
                    return new C93585lq(context2, looper2, r7, r8, r9);
                }
                if (this instanceof C93065kx) {
                    return new C93525lk(context2, looper2, r7, r8, r9);
                }
                throw C86134wK.A0s("buildClient must be implemented");
            }
        }
    }
}
