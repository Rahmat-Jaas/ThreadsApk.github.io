package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.AnonymousClass000;
import X.C14030oh;
import X.C18250wR;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class IsManagedAppReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C14030oh.A01(-149583057);
        if (intent == null) {
            i = 2081470689;
        } else {
            String action = intent.getAction();
            if (!action.equals("com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED")) {
                i = -877942130;
            } else {
                Class<IsManagedAppCacheJobService> cls = IsManagedAppCacheJobService.class;
                C18250wR.A04(context, cls).setAction(action);
                ((JobScheduler) context.getApplicationContext().getSystemService(AnonymousClass000.A00(389))).enqueue(new JobInfo.Builder(1517668458, new ComponentName(context, cls)).setOverrideDeadline(0).build(), new JobWorkItem(intent));
                i = -1954695994;
            }
        }
        C14030oh.A0E(i, A01, intent);
    }
}
