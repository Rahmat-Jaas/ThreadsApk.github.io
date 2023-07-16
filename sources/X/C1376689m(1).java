package X;

import android.util.SparseArray;
import com.instagram.barcelona.R;
import java.util.HashMap;

/* renamed from: X.89m  reason: invalid class name and case insensitive filesystem */
public final class C1376689m extends HashMap<String, C144578ij> {
    public final /* synthetic */ C131997t9 A00;
    public final /* synthetic */ C130667qT A01;
    public final /* synthetic */ C131967t6 A02;

    public C1376689m(C131997t9 r4, C130667qT r5, C131967t6 r6) {
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r6;
        SparseArray A0D = C86154wM.A0D();
        C10300i6 r0 = r5.A06;
        A0D.put(R.id.bloks_ig_session, r0);
        put("ig_api", new C130907qy(r0));
        put("gs", r4.A00);
        put("ls", new C130897qx());
        put("gql", r6.A00);
        put("media_store", new AnonymousClass7r0());
    }
}
