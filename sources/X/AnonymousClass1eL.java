package X;

import android.os.Looper;
import java.util.Map;

/* renamed from: X.1eL  reason: invalid class name */
public final class AnonymousClass1eL extends AnonymousClass1eT {
    public final /* synthetic */ String A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ C109326jp A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ boolean A05;

    public final void A03(AnonymousClass3XX r6) {
        C04220Ms.A0B(r6, 0);
        C109326jp r1 = this.A02;
        if (r1 != null) {
            C63893iY.A0G(this.A01, r1);
        }
        C30967GcS.A01(this.A01.A00, AnonymousClass00U.A0L("[Bloks] AsyncActionWithDataManifestV2: ", this.A00), "Failed to fetch action on payload", r6.A01, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1eL(AnonymousClass601 r1, C109326jp r2, C109326jp r3, String str, Map map, boolean z) {
        super(z);
        this.A05 = z;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r1;
        this.A04 = map;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C61323St A002 = C61733Vd.A00(obj);
        if (this.A05) {
            C109326jp r0 = A002.A02;
            if (r0 != null) {
                AnonymousClass70N.A01(r0);
            }
            C109326jp r02 = this.A03;
            if (r02 != null) {
                AnonymousClass70N.A01(r02);
            }
            C109326jp r03 = this.A02;
            if (r03 != null) {
                AnonymousClass70N.A01(r03);
            }
        }
        AnonymousClass4T2 r2 = new AnonymousClass4T2(A002, this.A01, this.A03, this.A02, this.A04);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            r2.run();
        } else {
            C62053Wy.A00.post(r2);
        }
    }
}
