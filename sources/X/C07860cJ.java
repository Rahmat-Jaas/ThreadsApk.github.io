package X;

import com.facebook.profilo.config.ConfigParams;
import java.util.Arrays;
import java.util.TreeMap;

/* renamed from: X.0cJ  reason: invalid class name and case insensitive filesystem */
public final class C07860cJ implements AnonymousClass0UJ {
    public final ConfigParams A00;
    public final AnonymousClass0UN[] A01;

    public final String[] getTraceConfigProviders(int i) {
        return new String[0];
    }

    public final int[] getTraceConfigIdxs(String str, String str2) {
        int length = this.A01.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
        }
        return Arrays.copyOf(iArr, 0);
    }

    public final int getTraceConfigParamInt(int i, String str) {
        throw new NullPointerException("params");
    }

    public final int getTraceConfigTriggerParamInt(int i, String str, String str2, String str3) {
        TreeMap treeMap = ConfigParams.EMPTY.intParams;
        if (treeMap != null && treeMap.containsKey("trigger.qpl.marker")) {
            return ((Number) treeMap.get("trigger.qpl.marker")).intValue();
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0V("Parameter ", "trigger.qpl.marker", " not found"));
    }

    public final int optSystemConfigParamInt(String str, int i) {
        TreeMap treeMap = this.A00.intParams;
        Object valueOf = Integer.valueOf(i);
        if (treeMap != null && treeMap.containsKey(str)) {
            valueOf = treeMap.get(str);
        }
        return ((Number) valueOf).intValue();
    }

    public final boolean optTraceConfigParamBool(int i, String str, boolean z) {
        throw new NullPointerException("params");
    }

    public final int optTraceConfigParamInt(int i, String str, int i2) {
        throw new NullPointerException("params");
    }

    public final int[] optTraceConfigParamIntList(int i, String str) {
        throw new NullPointerException("params");
    }

    public final String optTraceConfigParamString(int i, String str, String str2) {
        throw new NullPointerException("params");
    }

    public final String[] optTraceConfigParamStringList(int i, String str) {
        throw new NullPointerException("params");
    }

    public final int optTraceConfigTriggerParamInt(int i, String str, String str2, String str3, int i2) {
        TreeMap treeMap = ConfigParams.EMPTY.intParams;
        int i3 = 0;
        if (treeMap != null && treeMap.containsKey("trigger.qpl.marker")) {
            i3 = treeMap.get("trigger.qpl.marker");
        }
        return ((Number) i3).intValue();
    }

    public C07860cJ(ConfigParams configParams, AnonymousClass0UN... r2) {
        this.A00 = configParams;
        this.A01 = r2;
    }

    public final long getID() {
        return 0;
    }

    public final ConfigParams getTraceConfigParams(int i) {
        return getTraceConfigParams(i);
    }
}
