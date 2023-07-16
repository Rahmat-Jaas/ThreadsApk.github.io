package X;

import android.content.Context;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.7hk  reason: invalid class name and case insensitive filesystem */
public final class C127807hk implements Mcm {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C127397h3 A01;

    public C127807hk(AnonymousClass3HX r1, C127397h3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        RCTextView rCTextView = (RCTextView) obj;
        AnonymousClass75U r1 = (AnonymousClass75U) AnonymousClass7K7.A03(this.A00, this.A01);
        if (!(rCTextView instanceof C91095fa)) {
            return null;
        }
        ((C91095fa) rCTextView).A00 = r1;
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RCTextView rCTextView = (RCTextView) obj;
        if (rCTextView instanceof C91095fa) {
            ((C91095fa) rCTextView).A00 = null;
        }
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
