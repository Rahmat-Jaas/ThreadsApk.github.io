package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.09F  reason: invalid class name */
public final class AnonymousClass09F extends AnonymousClass0DX {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final Context A04;

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03() {
        return new AnonymousClass09G();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final /* bridge */ /* synthetic */ boolean A04(X.AnonymousClass0DW r8) {
        /*
            r7 = this;
            X.09G r8 = (X.AnonymousClass09G) r8
            r6 = r7
            X.AnonymousClass0DZ.A00(r8)
            r3 = 0
            android.content.Context r2 = r7.A04     // Catch:{ Exception -> 0x002e }
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ Exception -> 0x002e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x002e }
            android.content.Intent r3 = r2.registerReceiver(r3, r0)     // Catch:{ Exception -> 0x002e }
            if (r3 == 0) goto L_0x0035
            java.lang.String r0 = "level"
            r2 = -1
            int r1 = r3.getIntExtra(r0, r2)
            java.lang.String r0 = "scale"
            int r0 = r3.getIntExtra(r0, r2)
            if (r1 < 0) goto L_0x0035
            if (r0 <= 0) goto L_0x0035
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            goto L_0x0037
        L_0x002e:
            java.lang.String r1 = "DeviceBatteryMetricsCollector"
            java.lang.String r0 = "Exception registering receiver for ACTION_BATTERY_CHANGED"
            android.util.Log.e(r1, r0, r3)
        L_0x0035:
            r0 = -1
            float r1 = (float) r0
        L_0x0037:
            r8.A00 = r1
            long r4 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r6)
            boolean r0 = r7.A03     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0050
            long r2 = r7.A01     // Catch:{ all -> 0x005d }
            long r0 = r7.A02     // Catch:{ all -> 0x005d }
            long r4 = r4 - r0
            long r2 = r2 + r4
            r8.A02 = r2     // Catch:{ all -> 0x005d }
            long r2 = r7.A00     // Catch:{ all -> 0x005d }
        L_0x004c:
            r8.A01 = r2     // Catch:{ all -> 0x005d }
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            goto L_0x005b
        L_0x0050:
            long r0 = r7.A01     // Catch:{ all -> 0x005d }
            r8.A02 = r0     // Catch:{ all -> 0x005d }
            long r2 = r7.A00     // Catch:{ all -> 0x005d }
            long r0 = r7.A02     // Catch:{ all -> 0x005d }
            long r4 = r4 - r0
            long r2 = r2 + r4
            goto L_0x004c
        L_0x005b:
            r0 = 1
            return r0
        L_0x005d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09F.A04(X.0DW):boolean");
    }

    public final void A05(String str, long j) {
        StringBuilder sb = new StringBuilder("Consecutive ");
        sb.append(str);
        sb.append("broadcasts: (");
        sb.append(this.A02);
        sb.append(", ");
        sb.append(j);
        sb.append(")");
        Log.e("DeviceBatteryMetricsCollector", sb.toString(), (Throwable) null);
    }

    public AnonymousClass09F(Context context) {
        boolean z;
        int intExtra;
        this.A04 = context;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1)) == 2 || intExtra == 5)) {
                z = true;
                this.A03 = z;
                this.A02 = SystemClock.elapsedRealtime();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                context.registerReceiver(new IDxBReceiverShape6S0100000_I2(this, 0), intentFilter);
            }
        } catch (Exception unused) {
            Log.e("DeviceBatteryMetricsCollector", "Exception registering receiver for ACTION_BATTERY_CHANGED", (Throwable) null);
        }
        z = false;
        this.A03 = z;
        this.A02 = SystemClock.elapsedRealtime();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter2.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(new IDxBReceiverShape6S0100000_I2(this, 0), intentFilter2);
    }
}
