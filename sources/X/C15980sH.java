package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: X.0sH  reason: invalid class name and case insensitive filesystem */
public final class C15980sH {
    public static C15460rM A02(Context context, String[] strArr) {
        Signature A01 = A01(A00(context, strArr[0]));
        int length = strArr.length;
        int i = 1;
        if (length > 1) {
            while (A01.equals(A01(A00(context, strArr[i])))) {
                i++;
                if (i >= length) {
                }
            }
            throw new C15670rh(AnonymousClass00U.A0L("packageName=", Arrays.toString(strArr)));
        }
        return A03(A01);
    }

    public static boolean A05(Context context, int i, int i2) {
        boolean z = false;
        if (i == i2) {
            z = true;
        }
        if (!z) {
            try {
                if (context.getPackageManager().checkSignatures(i, i2) != 0) {
                    return false;
                }
            } catch (RuntimeException e) {
                throw new SecurityException(e);
            }
        }
        return true;
    }

    public static Signature A01(PackageInfo packageInfo) {
        int length;
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || (length = signatureArr.length) == 0) {
            throw new C15630rd(packageInfo.packageName);
        } else if (length <= 1) {
            Signature signature = signatureArr[0];
            if (signature != null) {
                return signature;
            }
            throw new C15620rc(packageInfo.packageName);
        } else {
            throw new C15670rh(packageInfo.packageName);
        }
    }

    public static PackageInfo A00(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null) {
                String str2 = packageInfo.packageName;
                if (str.equals(str2)) {
                    return packageInfo;
                }
                throw new C15660rg(str, str2);
            }
            throw new C15650rf(str);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C15640re(AnonymousClass00U.A0L(str, " not found by PackageManager."));
        } catch (RuntimeException e) {
            throw new SecurityException(e);
        }
    }

    public static C15460rM A03(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(byteArray);
            String encodeToString = Base64.encodeToString(instance.digest(), 11);
            MessageDigest instance2 = MessageDigest.getInstance("SHA-256");
            instance2.update(byteArray);
            return new C15460rM(encodeToString, Base64.encodeToString(instance2.digest(), 11));
        } catch (NoSuchAlgorithmException unused) {
            throw new SecurityException("Error obtaining SHA1/SHA256");
        }
    }

    public static boolean A04(Context context) {
        return C15470rN.A1H.contains(A03(A01(A00(context, context.getPackageName()))));
    }

    public static boolean A06(Context context, String str) {
        ApplicationInfo applicationInfo = A00(context, context.getPackageName()).applicationInfo;
        if (applicationInfo != null) {
            ApplicationInfo applicationInfo2 = A00(context, str).applicationInfo;
            if (applicationInfo2 != null) {
                return A05(context, applicationInfo.uid, applicationInfo2.uid);
            }
            throw new C15700rk(str);
        }
        throw new C15700rk(context.getPackageName());
    }

    public static String[] A07(Context context, int i) {
        try {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null && packagesForUid.length != 0) {
                return packagesForUid;
            }
            throw new C15640re(AnonymousClass00U.A0J("No packageName associated with uid=", i));
        } catch (RuntimeException e) {
            throw new SecurityException(e);
        }
    }
}
