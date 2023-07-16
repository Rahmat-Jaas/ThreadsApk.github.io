package X;

import com.facebook.models.IgModelLoader;
import java.util.List;

/* renamed from: X.61G  reason: invalid class name */
public final class AnonymousClass61G extends AnonymousClass0gG {
    public final /* synthetic */ C1203279s A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61G(C1203279s r2, List list) {
        super(728039861);
        this.A00 = r2;
        this.A01 = list;
    }

    public final void run() {
        Runnable runnable;
        Runnable r0;
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        C1203279s r4 = this.A00;
        IgModelLoader A002 = GP0.A00(r1.A02(r4.A02));
        if (A002 != null) {
            r4.A00 = A002;
            AnonymousClass7EB r2 = new AnonymousClass7EB(r4.A04, new C112096oz(A002, r4.A06), r4.A05);
            try {
                List A02 = r2.A02(r4.A03, this.A01);
                if (C18190wL.A1a(A02)) {
                    r0 = new C1360981k(r4, A02);
                } else {
                    r0 = new AnonymousClass808(r4);
                }
                C63643hy.A04(r0);
            } catch (AnonymousClass6CN e) {
                runnable = new C1361081l(e, r4);
                C63643hy.A04(runnable);
            } catch (Exception e2) {
                runnable = new C1361181m(r4, e2);
                C63643hy.A04(runnable);
            }
        } else {
            throw AnonymousClass0wJ.A0b();
        }
    }
}
