package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.75s  reason: invalid class name */
public final class AnonymousClass75s {
    public static final AnonymousClass78d A02 = new AnonymousClass78d("SplitInstallService");
    public static final Intent A03 = C18250wR.A05("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public C121087Eb A00;
    public final String A01;

    public AnonymousClass75s(Context context, String str) {
        int length;
        String str2;
        this.A01 = str;
        int i = 0;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    C103006Xl.A00.A02("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                do {
                    byte[] byteArray = signatureArr[i].toByteArray();
                    try {
                        MessageDigest instance = MessageDigest.getInstance("SHA-256");
                        instance.update(byteArray);
                        str2 = Base64.encodeToString(instance.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str2 = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str2)) {
                        String str3 = Build.TAGS;
                        if ((!str3.contains("dev-keys") && !str3.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str2)) {
                            i++;
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.A00 = new C121087Eb(applicationContext != null ? applicationContext : context, A03, A02, C129717mb.A00);
                    return;
                } while (i < length);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
