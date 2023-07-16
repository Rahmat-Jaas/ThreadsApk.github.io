package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0xP  reason: invalid class name and case insensitive filesystem */
public final class C18570xP extends Handler {
    public final /* synthetic */ C24671jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18570xP(Looper looper, C24671jo r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        List list;
        C24671jo r6 = this.A00;
        while (true) {
            Deque deque = r6.A05;
            if (!deque.isEmpty()) {
                String str = (String) deque.removeFirst();
                if (!(r6.A00 == null || str == null || (list = r6.A02) == null)) {
                    ArrayList A0v = AnonymousClass0wJ.A0v();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C32165H8c A02 = AnonymousClass3Zx.A02(r6.A01, String.format((Locale) null, "friendships/%s/following/", new Object[]{C18220wO.A0c(it).getId()}), str, "nux_follow_from_logged_in_accounts", (String) null);
                        A0v.add(A02);
                        A02.A00 = new IDxACallbackShape2S1200000_1_I2(A02, r6, str, 5);
                        C145538kf r0 = r6.A04;
                        if (r0 != null) {
                            r0.schedule(A02);
                        }
                    }
                    r6.A06.put(str, A0v);
                }
            } else {
                return;
            }
        }
    }
}
