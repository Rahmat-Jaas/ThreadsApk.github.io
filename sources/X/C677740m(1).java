package X;

import android.content.Context;
import com.instagram.barcelona.R;

/* renamed from: X.40m  reason: invalid class name and case insensitive filesystem */
public final class C677740m implements Mcm {
    public final /* synthetic */ AnonymousClass3HX A00;

    public C677740m(AnonymousClass3HX r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        C127397h3 A0K;
        C84884uA r2;
        C81864oW A03;
        C127397h3 r8 = (C127397h3) obj2;
        if (!(r8 == null || (A0K = r8.A0K(35)) == null || (r2 = (C84884uA) this.A00.A01.get(R.id.bk_screen_container)) == null || (A03 = C122117Ki.A03(A0K, A0K.A03)) == null)) {
            if (r2 instanceof C81874oX) {
                A03 = new C66873yT(A03, obj3);
            }
            r2.BrU(A03);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        C127397h3 r0;
        C127397h3 r4 = (C127397h3) obj;
        C127397h3 r5 = (C127397h3) obj2;
        C127397h3 r1 = null;
        if (r4 != null) {
            r0 = r4.A0K(35);
        } else {
            r0 = null;
        }
        if (r5 != null) {
            r1 = r5.A0K(35);
        }
        if (r0 == null || !r0.equals(r1) || obj3 != obj4) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
