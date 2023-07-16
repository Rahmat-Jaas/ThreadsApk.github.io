package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.io.File;
import java.util.Map;
import java.util.Set;

/* renamed from: X.19d  reason: invalid class name */
public final class AnonymousClass19d extends AnonymousClass3Iv {
    public C04560Oe A00;
    public long[][] A01 = null;
    public C211619g A02 = null;
    public final int A03;
    public final C84594tV A04;
    public final String A05;
    public final String A06;
    public final Set A07 = C18200wM.A0u();
    public final Set A08 = C18200wM.A0u();

    public final String getDataDirPath() {
        return "";
    }

    public final long getLastNormalUpdateTimestamp() {
        return 0;
    }

    public final boolean isValid() {
        return true;
    }

    public final boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener) {
        return false;
    }

    public final boolean updateEmergencyPushConfigs() {
        return false;
    }

    public final void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
        }
    }

    public final AnonymousClass3V0 getLatestHandle() {
        StringBuilder A0r;
        String str;
        if (this.A02 == null) {
            String str2 = this.A06;
            if (str2 == null || str2.isEmpty() || str2.equals("0")) {
                A0r = C18200wM.A0r();
                A0r.append(this.A05);
                str = "sessionless.data/";
            } else {
                A0r = C18200wM.A0r();
                A0r.append(this.A05);
                A0r.append(str2);
                str = ".data/";
            }
            File[] listFiles = new File(C18180wK.A0i(str, A0r)).listFiles(new C72234Nd());
            String str3 = "";
            if (listFiles != null) {
                int i = -1;
                for (File file : listFiles) {
                    String name = file.getName();
                    try {
                        int parseInt = Integer.parseInt(name.substring(0, name.length() - 8));
                        if (parseInt > i) {
                            str3 = file.getAbsolutePath();
                            i = parseInt;
                        }
                    } catch (NumberFormatException e) {
                        AnonymousClass0LU.A0L("MobileConfigFilesOnDiskUtils", "Unexpected mctable file: %s", e, file);
                    }
                }
            }
            if (!str3.isEmpty()) {
                this.A02 = new C211619g(str3);
            }
        }
        return this.A02;
    }

    public final AnonymousClass0TK getOrCreateOverridesTable() {
        C67653zu r5 = C67653zu.A09;
        File file = new File(AnonymousClass00U.A0L(this.A05, "mc_overrides.json"));
        if (this.A00 != null && file.exists()) {
            int i = this.A03;
            long[][] jArr = this.A01;
            C04560Oe r2 = this.A00;
            synchronized (r5) {
                Map map = r5.A06;
                Integer valueOf = Integer.valueOf(i);
                map.put(valueOf, jArr);
                r5.A05.put(valueOf, r2);
                r5.A02(file);
            }
        }
        return r5;
    }

    public final void logExposure(String str, String str2) {
        logExposure(str, str2, "");
    }

    public final String syncFetchReason() {
        if (this.A01 != null) {
            return "MobileConfigJavaManager: Using translation table.";
        }
        return "MobileConfigJavaManager: No sync fetch was needed";
    }

    public final boolean updateConfigs(AnonymousClass0TM r3) {
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = r3.A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
        }
        return false;
    }

    public AnonymousClass19d(C84594tV r3, File file, String str, int i) {
        this.A05 = AnonymousClass00U.A0L(file.getAbsolutePath(), "/mobileconfig/");
        this.A06 = str;
        this.A03 = i;
        this.A04 = r3;
    }

    public final void logExposure(String str, String str2, String str3) {
        this.A07.add(new AnonymousClass39R(str, str2, str3));
    }
}
