package com.facebook.pando;

import X.AnonymousClass0wJ;
import X.AnonymousClass68Z;
import X.AnonymousClass6HQ;
import X.C04220Ms;
import X.C116766xV;
import X.C145828l9;
import X.C146418mD;
import X.C15020qa;
import X.C18240wQ;
import X.C33366HmR;
import X.C85754vi;
import com.facebook.jni.HybridData;
import java.util.Map;

public final class PandoGraphQLRequest implements C146418mD, C85754vi {
    public static final AnonymousClass6HQ Companion = new AnonymousClass6HQ();
    public final int injectionCapabilities;
    public final boolean isMutation;
    public final HybridData mHybridData;
    public final Map params;
    public final String queryName;
    public final String rootCallVariable;
    public final String rootFieldName;
    public String schemaName;
    public final Map transientParams;

    public PandoGraphQLRequest(C145828l9 r12, String str, Map map, Map map2, Class cls, boolean z, PandoRealtimeInfoJNI pandoRealtimeInfoJNI, int i, String str2, String str3) {
        String str4;
        String str5 = str;
        AnonymousClass0wJ.A1O(r12, str);
        this.isMutation = z;
        this.injectionCapabilities = i;
        this.rootCallVariable = str2;
        String str6 = str3;
        this.rootFieldName = str6;
        String clientDocIdForQuery = r12.clientDocIdForQuery(str);
        if (clientDocIdForQuery == null) {
            str4 = r12.persistIdForQuery(str);
        } else {
            str4 = null;
        }
        this.queryName = str;
        this.schemaName = r12.schemaForQuery(str);
        this.params = map;
        this.transientParams = map2;
        String str7 = "";
        this.mHybridData = initHybridData(str4 == null ? str7 : str4, clientDocIdForQuery == null ? str7 : clientDocIdForQuery, str5, str3 != null ? str6 : str7, new NativeMap(C116766xV.A00(map)), new NativeMap(C116766xV.A00(map2)), cls, pandoRealtimeInfoJNI);
    }

    private final native int getTimeoutSeconds();

    private final native boolean hasRealtimeSubscriptionInfo();

    private final native HybridData initHybridData(String str, String str2, String str3, String str4, NativeMap nativeMap, NativeMap nativeMap2, Class cls, PandoRealtimeInfoJNI pandoRealtimeInfoJNI);

    private final native void setCacheTtlMs(long j);

    private final native void setFreshCacheTtlMs(long j);

    private final native void setPublishMode(int i);

    private final native void setTimeoutSeconds(int i);

    public native long getFreshCacheAgeMs();

    public native long getMaxToleratedCacheAgeMs();

    public final native void setLocale(String str);

    public final native void setManuallyManageActiveFieldUpdates(boolean z);

    public final native void setPerformOptimisticMerge(boolean z);

    public final PandoGraphQLRequest setPublishMode(AnonymousClass68Z r2) {
        C04220Ms.A0B(r2, 0);
        setPublishMode(r2.A00);
        return this;
    }

    public final native void setQueryVariables(NativeMap nativeMap, NativeMap nativeMap2);

    static {
        C15020qa.A0A("pando-graphql-jni");
    }

    public String getCallName() {
        return this.queryName;
    }

    public String getSchema() {
        return this.schemaName;
    }

    public C33366HmR getQueryParams() {
        throw C18240wQ.A0j();
    }

    public Class getTreeModelType() {
        throw C18240wQ.A0j();
    }

    public final boolean isSubscription() {
        return hasRealtimeSubscriptionInfo();
    }

    public PandoGraphQLRequest setFreshCacheAgeMs(long j) {
        setFreshCacheTtlMs(j);
        return this;
    }

    public PandoGraphQLRequest setMaxToleratedCacheAgeMs(long j) {
        setCacheTtlMs(j);
        return this;
    }
}
