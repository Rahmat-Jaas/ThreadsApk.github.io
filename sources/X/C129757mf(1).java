package X;

import android.content.Context;

/* renamed from: X.7mf  reason: invalid class name and case insensitive filesystem */
public final class C129757mf implements C143928hX {
    public final C143928hX A00;

    public C129757mf(C143928hX r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object DBu() {
        Context context = ((C129727mc) this.A00).A00.A00;
        if (context != null) {
            return new AnonymousClass75s(context, context.getPackageName());
        }
        throw C18210wN.A0W("Cannot return null from a non-@Nullable @Provides method");
    }
}
