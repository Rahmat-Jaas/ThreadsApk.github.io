package X;

import android.os.Handler;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.0ke  reason: invalid class name and case insensitive filesystem */
public final class C11700ke implements Runnable {
    public C15170qr A00;
    public final /* synthetic */ C12490m0 A01;

    public C11700ke(C15170qr r1, C12490m0 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C12490m0 r4 = this.A01;
        C15170qr r3 = this.A00;
        String string = r4.A01.getString("user_id", "");
        if (TextUtils.isEmpty(string)) {
            string = "0";
        }
        r3.A00(string);
        List list = r4.A00.A07;
        list.add(r3);
        Handler handler = r4.A02;
        handler.removeMessages(1);
        if (list.size() >= 50) {
            C12490m0.A00(r4);
        } else {
            handler.sendEmptyMessageDelayed(1, 300000);
        }
    }
}
