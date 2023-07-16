package X;

import java.util.LinkedList;

/* renamed from: X.0of  reason: invalid class name and case insensitive filesystem */
public final class C14010of implements AnonymousClass0gW {
    public static final C14010of A02 = new C14010of();
    public boolean A00;
    public final LinkedList A01 = new LinkedList();

    public final synchronized void AKp(AnonymousClass0gG r2) {
        if (this.A00) {
            AnonymousClass0gN.A00().AKp(r2);
        } else {
            this.A01.addLast(r2);
        }
    }

    public final void AKo(AnonymousClass0gJ r3) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
