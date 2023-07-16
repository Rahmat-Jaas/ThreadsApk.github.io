package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.60z  reason: invalid class name and case insensitive filesystem */
public final class C955060z extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass5vV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C955060z(AnonymousClass5vV r5) {
        super(16, 3, true, false);
        this.A00 = r5;
    }

    public final void run() {
        AnonymousClass5vV r2 = this.A00;
        Iterator A0z = AnonymousClass0wJ.A0z(r2.A00.getAll());
        while (A0z.hasNext()) {
            try {
                C132127tN.A01(r2, C18180wK.A0o(A0z).getValue().toString());
            } catch (IOException unused) {
            }
        }
    }
}
