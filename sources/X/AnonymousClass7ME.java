package X;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.7ME  reason: invalid class name */
public final class AnonymousClass7ME implements Handler.Callback {
    public final /* synthetic */ AnonymousClass7H7 A00;

    public /* synthetic */ AnonymousClass7ME(AnonymousClass7H7 r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap hashMap = this.A00.A02;
            synchronized (hashMap) {
                AnonymousClass7Em r4 = (AnonymousClass7Em) message.obj;
                AnonymousClass7M6 r3 = (AnonymousClass7M6) hashMap.get(r4);
                if (r3 != null && r3.A05.isEmpty()) {
                    if (r3.A03) {
                        AnonymousClass7H7 r2 = r3.A06;
                        r2.A04.removeMessages(1, r3.A04);
                        r2.A01.A02(r2.A00, r3);
                        r3.A03 = false;
                        r3.A00 = 2;
                    }
                    hashMap.remove(r4);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            HashMap hashMap2 = this.A00.A02;
            synchronized (hashMap2) {
                AnonymousClass7Em r7 = (AnonymousClass7Em) message.obj;
                AnonymousClass7M6 r5 = (AnonymousClass7M6) hashMap2.get(r7);
                if (r5 != null && r5.A00 == 3) {
                    String valueOf = String.valueOf(r7);
                    StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 47);
                    A0s.append("Timeout waiting for ServiceConnection callback ");
                    A0s.append(valueOf);
                    Log.e("GmsClientSupervisor", A0s.toString(), new Exception());
                    ComponentName componentName = r5.A01;
                    if (componentName == null && (componentName = r7.A00) == null) {
                        String str = r7.A02;
                        C13320nQ.A01(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    r5.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
