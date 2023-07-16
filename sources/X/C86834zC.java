package X;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;

/* renamed from: X.4zC  reason: invalid class name and case insensitive filesystem */
public final class C86834zC extends Handler {
    public final ComponentName A00;
    public final /* synthetic */ C86264wq A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86834zC(ComponentName componentName, Looper looper, C86264wq r3) {
        super(looper);
        this.A01 = r3;
        this.A00 = componentName;
    }

    public final void handleMessage(Message message) {
        AnonymousClass83P A05;
        if (message != null) {
            C86264wq r5 = this.A01;
            try {
                ((AppOpsManager) r5.getApplicationContext().getSystemService("appops")).checkPackage(message.sendingUid, "com.google.android.gms");
                int i = message.what;
                if (i == 1) {
                    Bundle data = message.getData();
                    Messenger messenger = message.replyTo;
                    String string = data.getString("tag");
                    if (messenger != null && string != null && (A05 = C86264wq.A05(data.getBundle("extras"), r5, new C67403zU(this.A00, messenger, string), string)) != null) {
                        A05.A01();
                    }
                } else if (i != 2 && i != 4) {
                    AnonymousClass0LU.A0N("GcmTaskService", "Unrecognized message received: %s", message);
                }
            } catch (SecurityException e) {
                AnonymousClass0LU.A0E("GcmTaskService", "Message was not sent from GCM.", e);
            }
        }
    }
}
