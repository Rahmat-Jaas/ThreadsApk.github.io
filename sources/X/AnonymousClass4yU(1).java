package X;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.4yU  reason: invalid class name */
public final class AnonymousClass4yU extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ C1192374c A00;

    public AnonymousClass4yU(C1192374c r1) {
        this.A00 = r1;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A00.A02.A01(i, charSequence);
    }

    public final void onAuthenticationFailed() {
        this.A00.A00.A02.A00();
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((AnonymousClass52R) this.A00.A00.A02).A00;
        if (weakReference.get() != null) {
            AnonymousClass586 r1 = (AnonymousClass586) weakReference.get();
            C880856r r0 = r1.A09;
            if (r0 == null) {
                r0 = C880856r.A03();
                r1.A09 = r0;
            }
            AnonymousClass586.A00(r0, charSequence);
        }
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        C1192374c r3 = this.A00;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        AnonymousClass7DT r1 = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                r1 = new AnonymousClass7DT(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                r1 = new AnonymousClass7DT(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                r1 = new AnonymousClass7DT(cryptoObject.getMac());
            }
        }
        C121597Gy r2 = null;
        if (r1 != null) {
            Cipher cipher = r1.A01;
            if (cipher != null) {
                r2 = new C121597Gy(cipher);
            } else {
                Signature signature = r1.A00;
                if (signature != null) {
                    r2 = new C121597Gy(signature);
                } else {
                    Mac mac = r1.A02;
                    if (mac != null) {
                        r2 = new C121597Gy(mac);
                    }
                }
            }
        }
        r3.A00.A02.A02(new C106686fR(r2, 2));
    }
}
