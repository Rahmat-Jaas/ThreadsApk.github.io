package com.facebook.messaging.lockbox;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass0wJ;
import X.AnonymousClass5KM;
import X.AnonymousClass5KN;
import X.AnonymousClass6BR;
import X.AnonymousClass6HD;
import X.AnonymousClass6HE;
import X.AnonymousClass6ZX;
import X.AnonymousClass74V;
import X.AnonymousClass7BA;
import X.AnonymousClass7II;
import X.AnonymousClass8bP;
import X.C04220Ms;
import X.C104676cB;
import X.C104766cL;
import X.C112106p0;
import X.C113356rG;
import X.C114936uA;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C91205fo;
import X.C93245lF;
import X.C98946Hn;
import X.COU;
import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.redex.IDxCTaskShape424S0100000_2_I2;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class LockBoxStorageManager {
    public static final LockBoxStorageManager INSTANCE = new LockBoxStorageManager();
    public static C104676cB backupManager;
    public static boolean blockStoreAvailable;
    public static C112106p0 shareKeyRetrieve;

    public static final void initialize(Context context) {
        C04220Ms.A0B(context, 0);
        if (backupManager == null && GoogleApiAvailability.A00.A02(context, 203400000) == 0) {
            backupManager = new C104676cB(new C113356rG(new AnonymousClass7II(new C104766cL(new AnonymousClass7BA()), new C93245lF(context))));
            shareKeyRetrieve = new C112106p0(context, AnonymousClass6ZX.A00);
            blockStoreAvailable = true;
        }
    }

    public static final boolean lockBoxDeleteDeviceSecret(String str) {
        C04220Ms.A0B(str, 0);
        return lockBoxDeleteSecret("DU", str);
    }

    public static final boolean lockBoxDeleteSecret(String str, String str2) {
        boolean A1Z = AnonymousClass0wJ.A1Z(str, str2);
        String A0r = C18220wO.A0r(str2, AnonymousClass6ZX.A01);
        if (A0r != null) {
            str2 = A0r;
        }
        if (backupManager != null) {
            JSONObject lockBoxGetSecretsJsonForOwner = INSTANCE.lockBoxGetSecretsJsonForOwner(str);
            if (lockBoxGetSecretsJsonForOwner.has(str2)) {
                lockBoxGetSecretsJsonForOwner.remove(str2);
                AnonymousClass5KN r2 = new AnonymousClass5KN(C18190wL.A0n(lockBoxGetSecretsJsonForOwner));
                C104676cB r0 = backupManager;
                if (r0 == null) {
                    C04220Ms.A0E("backupManager");
                    throw null;
                }
                C114936uA A00 = AnonymousClass7II.A00(r2, AnonymousClass6BR.A03, r0.A00.A00, str, false);
                try {
                    A00.A01.await();
                } catch (InterruptedException unused) {
                }
                if (A00.A00 instanceof COU) {
                    return A1Z;
                }
            }
        }
        return false;
    }

    public static final String lockBoxGetDeviceSecret(String str) {
        C04220Ms.A0B(str, 0);
        return lockBoxGetSecret("DU", str);
    }

    private final String getRecoveryCodeFromLegacyLocation(String str) {
        AnonymousClass5KM r1;
        C104676cB r12 = backupManager;
        if (r12 == null) {
            C04220Ms.A0E("backupManager");
            throw null;
        }
        AnonymousClass6BR r2 = AnonymousClass6BR.A04;
        C04220Ms.A0B(str, 0);
        C114936uA A01 = r12.A00.A01(r2, str);
        try {
            A01.A01.await();
        } catch (InterruptedException unused) {
        }
        Object obj = A01.A00;
        C04220Ms.A06(obj);
        C98946Hn r22 = (C98946Hn) obj;
        if (!(r22 instanceof C91205fo)) {
            return null;
        }
        List A0e = AnonymousClass8bP.A0e(new String(((C91205fo) r22).A00, AnonymousClass74V.A05), new char[]{':'}, 0);
        if (A0e.size() == 2) {
            r1 = new AnonymousClass5KM(C18190wL.A0p(A0e, 1));
        } else {
            r1 = null;
        }
        if (r1 == null) {
            return null;
        }
        String str2 = r1.A00;
        moveRecoveryCodeFromLegacyToLockBox(str, str2);
        return str2;
    }

    private final JSONObject lockBoxGetSecretsJsonForOwner(String str) {
        C114936uA r3 = new C114936uA();
        C104676cB r0 = backupManager;
        if (r0 == null) {
            C04220Ms.A0E("backupManager");
            throw null;
        }
        AnonymousClass6BR r1 = AnonymousClass6BR.A03;
        C04220Ms.A0B(str, 0);
        r0.A00.A01(r1, str).A01(new IDxCTaskShape424S0100000_2_I2(r3, 0));
        try {
            r3.A01.await();
        } catch (InterruptedException unused) {
        }
        Object obj = r3.A00;
        C04220Ms.A06(obj);
        return (JSONObject) obj;
    }

    private final void moveRecoveryCodeFromLegacyToLockBox(String str, String str2) {
        if (lockBoxSaveSecret(str, "rc", str2) == 1) {
            C104676cB r2 = backupManager;
            if (r2 == null) {
                C04220Ms.A0E("backupManager");
                throw null;
            }
            AnonymousClass6BR r1 = AnonymousClass6BR.A04;
            C04220Ms.A0B(str, 0);
            r2.A00.A00(r1, str);
        }
    }

    public static final String lockBoxGetLocalSecret(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        String A0r = C18220wO.A0r(str2, AnonymousClass6ZX.A01);
        if (A0r == null) {
            A0r = str2;
        }
        if (backupManager == null) {
            return null;
        }
        LockBoxStorageManager lockBoxStorageManager = INSTANCE;
        String optString = lockBoxStorageManager.lockBoxGetSecretsJsonForOwner(str).optString(A0r);
        if ((optString == null || optString.length() == 0) && str2.equals("rc")) {
            return lockBoxStorageManager.getRecoveryCodeFromLegacyLocation(str);
        }
        return optString;
    }

    public static final String lockBoxGetSecret(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        String A0r = C18220wO.A0r(str2, AnonymousClass6ZX.A01);
        if (A0r != null) {
            str2 = A0r;
        }
        String lockBoxGetLocalSecret = lockBoxGetLocalSecret(str, str2);
        if (lockBoxGetLocalSecret == null || lockBoxGetLocalSecret.length() <= 0) {
            lockBoxGetLocalSecret = null;
            if (AnonymousClass6HE.A00(str2) != null) {
                C112106p0 r1 = shareKeyRetrieve;
                if (r1 == null) {
                    C04220Ms.A0E("shareKeyRetrieve");
                    throw null;
                }
                KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2 = (KtCSuperShape0S2000000_I2) AnonymousClass00J.A08(r1.A00(str, str2));
                if (ktCSuperShape0S2000000_I2 != null) {
                    return ktCSuperShape0S2000000_I2.A01;
                }
            }
        }
        return lockBoxGetLocalSecret;
    }

    public static final AnonymousClass6HD lockBoxGetSecretWithSource(String str, String str2) {
        String str3;
        boolean A1Y = AnonymousClass0wJ.A1Y(str, str2);
        String A0r = C18220wO.A0r(str2, AnonymousClass6ZX.A01);
        if (A0r != null) {
            str2 = A0r;
        }
        String lockBoxGetLocalSecret = lockBoxGetLocalSecret(str, str2);
        if (lockBoxGetLocalSecret != null && lockBoxGetLocalSecret.length() > 0) {
            return new AnonymousClass6HD(lockBoxGetLocalSecret, AnonymousClass006.A00);
        }
        if (AnonymousClass6HE.A00(str2) != null) {
            C112106p0 r0 = shareKeyRetrieve;
            if (r0 == null) {
                C04220Ms.A0E("shareKeyRetrieve");
                throw null;
            }
            KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2 = (KtCSuperShape0S2000000_I2) AnonymousClass00J.A08(r0.A00(str, str2));
            if (ktCSuperShape0S2000000_I2 != null) {
                String str4 = ktCSuperShape0S2000000_I2.A01;
                if (str4.length() > 0) {
                    String str5 = ktCSuperShape0S2000000_I2.A00;
                    C04220Ms.A0B(str5, A1Y ? 1 : 0);
                    for (Integer num : AnonymousClass006.A00(5)) {
                        switch (num.intValue()) {
                            case 1:
                                str3 = "com.facebook.katana";
                                break;
                            case 2:
                                str3 = "com.facebook.wakizashi";
                                break;
                            case 3:
                                str3 = "com.facebook.orca";
                                break;
                            case 4:
                                str3 = "com.facebook.lite";
                                break;
                            default:
                                str3 = "";
                                break;
                        }
                        if (C04220Ms.A0I(str3, str5)) {
                            return new AnonymousClass6HD(str4, num);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final int lockBoxSaveDeviceSecret(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        return lockBoxSaveSecret("DU", str, str2);
    }

    public static final int lockBoxSaveSecret(String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(str, str2);
        C04220Ms.A0B(str3, 2);
        if (backupManager != null) {
            JSONObject lockBoxGetSecretsJsonForOwner = INSTANCE.lockBoxGetSecretsJsonForOwner(str);
            try {
                String A0r = C18220wO.A0r(str2, AnonymousClass6ZX.A01);
                if (A0r != null) {
                    str2 = A0r;
                }
                lockBoxGetSecretsJsonForOwner.putOpt(str2, str3);
                AnonymousClass5KN r3 = new AnonymousClass5KN(C18190wL.A0n(lockBoxGetSecretsJsonForOwner));
                C104676cB r0 = backupManager;
                if (r0 == null) {
                    C04220Ms.A0E("backupManager");
                    throw null;
                }
                AnonymousClass6BR r2 = AnonymousClass6BR.A03;
                C113356rG r02 = r0.A00;
                C114936uA A00 = AnonymousClass7II.A00(r3, r2, r02.A00, str, C18210wN.A1V(r2));
                try {
                    A00.A01.await();
                } catch (InterruptedException unused) {
                }
                return C18180wK.A1V(A00.A00 instanceof COU ? 1 : 0) ? 1 : 0;
            } catch (JSONException unused2) {
                return 7;
            }
        } else if (!blockStoreAvailable) {
            return 6;
        } else {
            return 5;
        }
    }
}
