package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.AnonymousClass2CN;
import android.app.IntentService;
import android.content.Intent;

public class IsManagedAppCacheService extends IntentService {
    public IsManagedAppCacheService() {
        super("IsManagedAppCacheService");
    }

    public final void onHandleIntent(Intent intent) {
        AnonymousClass2CN.A00(intent, this);
    }
}
