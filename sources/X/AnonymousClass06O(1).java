package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.06O  reason: invalid class name */
public final class AnonymousClass06O {
    public static AnonymousClass06O A05;
    public static final Object A06 = new Object();
    public final Context A00;
    public final ArrayList A01 = new ArrayList();
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final Handler A04;

    public static AnonymousClass06O A00(Context context) {
        AnonymousClass06O r1;
        synchronized (A06) {
            r1 = A05;
            if (r1 == null) {
                r1 = new AnonymousClass06O(context.getApplicationContext());
                A05 = r1;
            }
        }
        return r1;
    }

    public final void A01(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            AnonymousClass06N r5 = new AnonymousClass06N(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) hashMap.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                hashMap.put(broadcastReceiver, arrayList);
            }
            arrayList.add(r5);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap hashMap2 = this.A02;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    hashMap2.put(action, arrayList2);
                }
                arrayList2.add(r5);
            }
        }
    }

    public final void A02(Intent intent) {
        synchronized (this.A03) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            intent.getFlags();
            ArrayList arrayList = (ArrayList) this.A02.get(intent.getAction());
            if (arrayList != null) {
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    AnonymousClass06N r4 = (AnonymousClass06N) arrayList.get(i);
                    if (!r4.A00 && r4.A03.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(r4);
                        r4.A00 = true;
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((AnonymousClass06N) arrayList2.get(i2)).A00 = false;
                    }
                    this.A01.add(new AnonymousClass06M(intent, arrayList2));
                    Handler handler = this.A04;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public AnonymousClass06O(Context context) {
        this.A00 = context;
        this.A04 = new AnonymousClass06L(context.getMainLooper(), this);
    }
}
