package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0hp  reason: invalid class name and case insensitive filesystem */
public final class C10160hp implements Handler.Callback {
    public final /* synthetic */ C10110hk A00;

    public C10160hp(C10110hk r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        Object obj = message.obj;
        obj.getClass();
        C10140hn r4 = (C10140hn) obj;
        View view = r4.A02;
        if (view != null) {
            C10120hl r2 = r4.A03;
            r2.getClass();
            r2.C2P((ViewGroup) null, view, r4.A01);
        }
        C10130hm r22 = this.A00.A02;
        r4.A03 = null;
        r4.A04 = null;
        r4.A01 = 0;
        r4.A02 = null;
        r22.A00.Can(r4);
        return true;
    }
}
