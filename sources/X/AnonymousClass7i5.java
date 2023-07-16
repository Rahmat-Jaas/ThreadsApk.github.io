package X;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7i5  reason: invalid class name */
public final class AnonymousClass7i5 implements C145298kG {
    public final Context A00;

    public AnonymousClass7i5(Context context) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
    }

    public final String BaB() {
        return "sm";
    }

    public final Map CXv() {
        ApplicationInfo applicationInfo;
        HashMap A0y = AnonymousClass0wJ.A0y();
        Context context = this.A00;
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
        if (storageStatsManager == null || (applicationInfo = context.getApplicationInfo()) == null) {
            return null;
        }
        try {
            StorageStats queryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
            C04220Ms.A06(queryStatsForUid);
            A0y.put("ustats", new C127947i3(this, queryStatsForUid.getAppBytes(), queryStatsForUid.getDataBytes(), queryStatsForUid.getCacheBytes()));
        } catch (IOException unused) {
        }
        return A0y;
    }
}
