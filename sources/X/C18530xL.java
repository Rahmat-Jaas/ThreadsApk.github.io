package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.0xL  reason: invalid class name and case insensitive filesystem */
public final class C18530xL extends Handler {
    public final /* synthetic */ C23371df A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18530xL(Looper looper, C23371df r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            String str = (String) message.obj;
            if (!TextUtils.isEmpty(str)) {
                C23371df r2 = this.A00;
                if (r2.isVisible()) {
                    C32165H8c A0U = C18200wM.A0U(C18180wK.A0V(r2.mArguments), new C26251qI(StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", str)));
                    A0U.A00 = new AnonymousClass1i8(r2, str);
                    r2.schedule(A0U);
                }
            }
        }
    }
}
