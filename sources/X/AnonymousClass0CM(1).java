package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0CM  reason: invalid class name */
public final class AnonymousClass0CM extends Handler {
    public final C02730Cq A00;

    public final void handleMessage(Message message) {
        List list;
        C13750oF.A02(this.A00.A00);
        synchronized (AnonymousClass0CN.class) {
            list = AnonymousClass0CN.A09;
            if (list == null) {
                list = Collections.synchronizedList(new ArrayList(1));
                AnonymousClass0CN.A09 = list;
            }
        }
        list.remove(this);
    }

    public AnonymousClass0CM(C02730Cq r1) {
        this.A00 = r1;
    }
}
