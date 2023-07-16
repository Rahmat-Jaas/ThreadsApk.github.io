package X;

import android.content.Context;
import com.instagram.barcelona.R;

/* renamed from: X.40o  reason: invalid class name and case insensitive filesystem */
public final class C677940o implements Mcm {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C127397h3 A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ C109326jp A03;

    public C677940o(AnonymousClass3HX r1, C127397h3 r2, C109326jp r3, C109326jp r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        AnonymousClass3HX r5 = this.A00;
        C84884uA r4 = (C84884uA) r5.A01.get(R.id.bk_screen_container);
        if (r4 == null) {
            return null;
        }
        r4.CnI(new AnonymousClass3B8(r5, this.A01, this.A02, this.A03));
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C84884uA r1 = (C84884uA) this.A00.A01.get(R.id.bk_screen_container);
        if (r1 != null) {
            r1.CnI((AnonymousClass3B8) null);
        }
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
