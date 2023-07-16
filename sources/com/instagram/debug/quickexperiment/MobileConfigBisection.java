package com.instagram.debug.quickexperiment;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0TJ;
import X.AnonymousClass0TM;
import X.AnonymousClass0TN;
import X.AnonymousClass0wJ;
import X.AnonymousClass2R1;
import X.C09120et;
import X.C10300i6;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18240wQ;
import X.C551131u;
import X.C61983Wp;
import X.C62253Xz;
import X.C67603zp;
import X.C84434t8;
import X.C84544tO;
import android.content.Context;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.troubleshooting.BisectDefaultValuesProvider;
import com.facebook.mobileconfig.troubleshooting.BisectHelperHolder;
import com.facebook.mobileconfig.troubleshooting.MobileConfigOverridesWriterHolder;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class MobileConfigBisection {
    public static final String BISECT_DIR = "mobileconfig";
    public static final String OVERRIDES_FIELD = "overrides";
    public static final String RAW_OVERRIDES_FILE_NAME = "mobileconfig/overrides_raw_response.txt";
    public static final String TAG = "MobileConfigBisection";
    public static C84434t8 sBisectHelper;

    public static void initialize(Context context, String str, C10300i6 r11) {
        Context context2 = context;
        C10300i6 r2 = r11;
        C551131u.A01 = AnonymousClass2R1.A00(context2, r2, (C62253Xz) null, str, C61983Wp.A01(0, 9, 48), (String) null, 2, false, false);
        createAndSetBisectHelper(C551131u.A01, context2);
    }

    public static boolean startBisect(Context context, String str, C10300i6 r14) {
        Context context2 = context;
        C10300i6 r5 = r14;
        C551131u.A01 = AnonymousClass2R1.A00(context2, r5, (C62253Xz) null, str, C61983Wp.A01(0, 9, 48), (String) null, 2, false, false);
        C62253Xz r3 = C551131u.A01;
        C18240wQ.A1D(C09120et.A02().A0D, str);
        AnonymousClass0TM r2 = new AnonymousClass0TM();
        r2.A00 = 30000;
        r2.A02 = AnonymousClass006.A0C;
        C67603zp r0 = r3.A00;
        r0.A0A();
        if (!r0.A06().updateConfigs(r2)) {
            AnonymousClass0LU.A0O(TAG, "Failed to update configs for %s after %dms.", C18210wN.A1Y(str, r2.A00));
            C551131u.A00(2);
            return false;
        }
        createAndSetBisectHelper(r3, context2);
        onUpdatedConfigs(context2, r3, str);
        return true;
    }

    public static void createAndSetBisectHelper(C62253Xz r3, Context context) {
        final C67603zp r2 = r3.A00;
        BisectHelperHolder newMCBisectHelper = new MobileConfigOverridesWriterHolder((MobileConfigManagerHolderImpl) r2.A06()).getNewMCBisectHelper(new BisectDefaultValuesProvider() {
            public String getMobileConfigFieldValue(long j) {
                String valueOf;
                String str;
                C67603zp r11 = C67603zp.this;
                HashMap A0y = AnonymousClass0wJ.A0y();
                int A01 = C18190wL.A01(j);
                AnonymousClass0TJ r10 = AnonymousClass0TJ.A06;
                AnonymousClass0TJ A00 = AnonymousClass0TJ.A00(r10);
                A00.A02 = true;
                if (A01 == 1) {
                    valueOf = String.valueOf(r11.ATv(A00, j));
                } else if (A01 == 2) {
                    valueOf = String.valueOf(r11.AtA(A00, j));
                } else if (A01 != 3) {
                    if (A01 != 4) {
                        valueOf = "UNSUPPORTED TYPE";
                    } else {
                        valueOf = String.valueOf(r11.Adv(A00, j));
                    }
                } else if (((j >>> 60) & 1) == 1) {
                    valueOf = r11.BEU(r10, "__fbt_null__", j);
                } else {
                    valueOf = r11.BET(r10, j);
                }
                A0y.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, valueOf);
                AnonymousClass0TN r1 = A00.A00.A00;
                int ordinal = r1.ordinal();
                if (!(ordinal == 1 || ordinal == 0)) {
                    if (ordinal != 2) {
                        str = AnonymousClass00U.A0S("default[", "]", r1.A00);
                    } else {
                        str = QuickExperimentDumperPlugin.OVERRIDE_CMD;
                    }
                    A0y.put("source", str);
                }
                String A0r = C18220wO.A0r(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0y);
                if (A0r == null) {
                    return "";
                }
                return A0r;
            }
        });
        sBisectHelper = newMCBisectHelper;
        try {
            newMCBisectHelper.setBisectPath(new File(context.getFilesDir(), BISECT_DIR).getCanonicalPath());
        } catch (IOException e) {
            AnonymousClass0LU.A0G(TAG, "Failed to set bisect path", e);
        }
    }

    public static C84544tO getBisectState() {
        if (!isInitialized("Failed getBisectState sBisectHelper not initialized.")) {
            return null;
        }
        return ((BisectHelperHolder) sBisectHelper).getCurrentState();
    }

    public static boolean goBackOneStep() {
        if (!isInitialized("Failed goBackOneStep sBisectHelper not initialized.") || !sBisectHelper.goBackOneStep()) {
            return false;
        }
        return true;
    }

    public static boolean isInitialized(String str) {
        if (sBisectHelper != null) {
            return true;
        }
        AnonymousClass0LU.A0C(TAG, str);
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onUpdatedConfigs(android.content.Context r6, X.C62253Xz r7, java.lang.String r8) {
        /*
            java.lang.String r5 = "MobileConfigBisection"
            r0 = 0
            java.util.Map r4 = r7.A02(r0)
            r0 = 2
            X.C551131u.A00(r0)
            java.io.File r2 = r6.getFilesDir()     // Catch:{ IOException -> 0x0042, JSONException -> 0x003e }
            java.lang.String r1 = "mobileconfig/overrides_raw_response.txt"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0042, JSONException -> 0x003e }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0042, JSONException -> 0x003e }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x0042, JSONException -> 0x003e }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0042, JSONException -> 0x003e }
            java.lang.String r2 = X.AnonymousClass42L.A00(r4)     // Catch:{ all -> 0x0039 }
            org.json.JSONObject r1 = X.C18230wP.A0y()     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = "overrides"
            r1.put(r0, r2)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0039 }
            r3.write(r0)     // Catch:{ all -> 0x0039 }
            r3.close()     // Catch:{ all -> 0x0039 }
            startUsingExistingFile(r8)     // Catch:{ all -> 0x0039 }
            r3.close()     // Catch:{ IOException -> 0x0042, JSONException -> 0x003e }
            return
        L_0x0039:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0     // Catch:{ IOException -> 0x0042, JSONException -> 0x003e }
        L_0x003e:
            r1 = move-exception
            java.lang.String r0 = "Failed to write json overrides."
            goto L_0x0045
        L_0x0042:
            r1 = move-exception
            java.lang.String r0 = "Failed to write overrides."
        L_0x0045:
            X.AnonymousClass0LU.A0G(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.MobileConfigBisection.onUpdatedConfigs(android.content.Context, X.3Xz, java.lang.String):void");
    }

    public static void startUsingExistingFile(String str) {
        if (isInitialized("Failed startUsingExistingFile sBisectHelper not initialized.")) {
            sBisectHelper.startUsingExistingFile(str);
        }
    }

    public static boolean stopBisection() {
        if (!isInitialized("Failed stopBisection sBisectHelper not initialized.")) {
            return false;
        }
        return sBisectHelper.stopBisection();
    }

    public static boolean userDidNotReproduceBug() {
        if (!isInitialized("Failed userDidNotReproduceBug sBisectHelper not initialized.") || !sBisectHelper.userDidNotReproduceBug()) {
            return false;
        }
        return true;
    }

    public static boolean userDidReproduceBug() {
        if (!isInitialized("Failed userDidReproduceBug sBisectHelper not initialized.") || !sBisectHelper.userDidReproduceBug()) {
            return false;
        }
        return true;
    }
}
