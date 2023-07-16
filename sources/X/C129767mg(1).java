package X;

import android.content.Context;

/* renamed from: X.7mg  reason: invalid class name and case insensitive filesystem */
public final class C129767mg implements C143928hX {
    public final C143928hX A00;

    public C129767mg(C143928hX r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object DBu() {
        Context context = ((C129727mc) this.A00).A00.A00;
        if (context != null) {
            return new C105136cw(context);
        }
        throw C18210wN.A0W("Cannot return null from a non-@Nullable @Provides method");
    }
}
