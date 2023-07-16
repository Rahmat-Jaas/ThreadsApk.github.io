package X;

import android.util.SparseArray;
import com.instagram.barcelona.R;

/* renamed from: X.7qV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7qV implements C144548ig {
    public final /* synthetic */ C130667qT A00;

    public /* synthetic */ AnonymousClass7qV(C130667qT r1) {
        this.A00 = r1;
    }

    public final Object get() {
        C10300i6 r2 = this.A00.A06;
        C04220Ms.A0B(r2, 0);
        SparseArray A0D = C86154wM.A0D();
        A0D.put(R.id.bloks_ig_session, r2);
        C04220Ms.A06(A0D.clone());
        throw C18190wL.A0a(String.format("No implementation bound to key: %s", C18210wN.A1X(1)));
    }
}
