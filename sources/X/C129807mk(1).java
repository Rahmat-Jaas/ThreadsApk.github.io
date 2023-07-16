package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.7mk  reason: invalid class name and case insensitive filesystem */
public final class C129807mk implements C143928hX {
    public final C143928hX A00;
    public final C143928hX A01;
    public final C143928hX A02;
    public final C143928hX A03;

    public C129807mk(C143928hX r1, C143928hX r2, C143928hX r3, C143928hX r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object DBu() {
        C143918hW r1;
        Context context = ((C129727mc) this.A00).A00.A00;
        if (context != null) {
            File file = (File) this.A01.DBu();
            AnonymousClass75H r3 = (AnonymousClass75H) this.A02.DBu();
            C143928hX r2 = this.A03;
            if (r2 instanceof C143918hW) {
                r1 = (C143918hW) r2;
            } else {
                r1 = new C129827mm(r2);
            }
            return new AnonymousClass7ms(context, r1, r3, file);
        }
        throw C18210wN.A0W("Cannot return null from a non-@Nullable @Provides method");
    }
}
