package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.device.messaging.ADM;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.7sc  reason: invalid class name and case insensitive filesystem */
public final class C131687sc implements C146338m4 {
    public final Context A00;

    public final void C5S() {
    }

    public final PushChannelType B59() {
        return PushChannelType.AMAZON;
    }

    public final void BPv(HGC hgc, String str, boolean z) {
        Context context = this.A00;
        ComponentName componentName = new ComponentName(context, "com.instagram.notifications.push.ADMMessageHandler$Receiver");
        PackageManager packageManager = context.getPackageManager();
        componentName.getClassName();
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    public final void BiW(C106326er r3) {
        r3.A00.C3z(false);
    }

    public final void CZk() {
        new ADM(this.A00).startRegister();
    }

    public C131687sc(Context context) {
        this.A00 = context;
    }
}
