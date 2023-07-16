package com.facebook.papaya.fb.client.executor.generic;

import X.AnonymousClass0wJ;
import X.AnonymousClass748;
import X.C04220Ms;
import android.content.Context;
import android.os.Bundle;
import com.facebook.papaya.client.executor.IExecutorFactory;
import com.google.common.collect.ImmutableMap;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class GenericExecutorFactory extends IExecutorFactory {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenericExecutorFactory(Context context, Bundle bundle) {
        super("papaya-fb-generic-executor");
        long[] jArr;
        String str;
        C04220Ms.A0B(bundle, 2);
        if (bundle.containsKey("required_features")) {
            jArr = bundle.getLongArray("required_features");
            if (jArr == null) {
                throw AnonymousClass0wJ.A0b();
            }
        } else {
            jArr = new long[0];
        }
        boolean z = bundle.getBoolean("encryption_enabled");
        long j = bundle.getLong("feature_group_id");
        String string = bundle.getString("data_namespace", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        C04220Ms.A06(string);
        boolean z2 = bundle.getBoolean("reuse_data", false);
        ImmutableMap immutableMap = null;
        if (z) {
            AnonymousClass748.A00();
            immutableMap = AnonymousClass748.A00;
            AnonymousClass748.A00();
            str = AnonymousClass748.A01;
        } else {
            str = null;
        }
        initHybrid(new GenericDatasetFactory(j, string, z2, jArr, immutableMap, str));
    }

    private final native void initHybrid(GenericDatasetFactory genericDatasetFactory);
}
