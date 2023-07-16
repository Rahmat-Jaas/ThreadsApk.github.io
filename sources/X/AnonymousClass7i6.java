package X;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.common.dextricks.OdexSchemeArtTurbo;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7i6  reason: invalid class name */
public final class AnonymousClass7i6 implements C145298kG {
    public static final String[] A02 = {"base.odex", "base.vdex", "base.art", "base.oat"};
    public static final String[] A03 = {"arm", "arm64", "x86", "x86_64"};
    public final Context A00;
    public final String[] A01;

    public AnonymousClass7i6(Context context, String[] strArr) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A01 = strArr;
    }

    public final String BaB() {
        return IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE;
    }

    public final Map CXv() {
        File file;
        HashMap A0y = AnonymousClass0wJ.A0y();
        Context context = this.A00;
        File A0Z = C86144wL.A0Z(context.getPackageCodePath());
        C91295fy r4 = new C91295fy(C121707Ho.A01(A0Z));
        A0y.put("apk", r4);
        File parentFile = A0Z.getParentFile();
        if (parentFile != null) {
            try {
                file = parentFile.getCanonicalFile();
            } catch (IOException unused) {
                file = parentFile.getAbsoluteFile();
            }
            C91295fy r11 = new C91295fy(C121707Ho.A01(file));
            C04220Ms.A06(file);
            C112416pY r16 = new C112416pY(0, 0, 0);
            File A0U = C86154wM.A0U(file, OdexSchemeArtTurbo.OREO_ODEX_DIR);
            for (String A0U2 : A03) {
                File A0U3 = C86154wM.A0U(A0U, A0U2);
                for (String str : this.A01) {
                    try {
                        int length = str.length() - 1;
                        int i = 0;
                        boolean z = false;
                        while (i <= length) {
                            int i2 = length;
                            if (!z) {
                                i2 = i;
                            }
                            int A002 = C04220Ms.A00(str.charAt(i2), 32);
                            boolean z2 = false;
                            if (A002 <= 0) {
                                z2 = true;
                            }
                            if (z) {
                                if (!z2) {
                                    break;
                                }
                                length--;
                            } else if (!z2) {
                                z = true;
                            } else {
                                i++;
                            }
                        }
                        C112416pY A012 = C121707Ho.A01(C86154wM.A0U(A0U3, str.subSequence(i, length + 1).toString()));
                        if (A012.A02 != 0) {
                            r16 = r16.A00(A012);
                            A0y.put(AnonymousClass00U.A0L("<oat_dir>/", str), new C91295fy(A012));
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            C91295fy r1 = new C91295fy(r16);
            A0y.put("extra", r1);
            r4 = new C91295fy(r11.A00(r1));
        }
        long j = -1;
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(storageStatsManager == null || applicationInfo == null)) {
            try {
                StorageStats queryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
                C04220Ms.A06(queryStatsForUid);
                j = queryStatsForUid.getAppBytes();
            } catch (IOException | SecurityException unused3) {
            }
        }
        if (j < 0) {
            A0y.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, r4);
            return A0y;
        }
        A0y.put("bf_measurement", r4);
        A0y.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, new C91295fy(j, j, r4.A01));
        return A0y;
    }
}
