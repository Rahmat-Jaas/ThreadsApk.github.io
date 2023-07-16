package X;

import java.util.List;

/* renamed from: X.40T  reason: invalid class name */
public final class AnonymousClass40T implements C81974op {
    public final List A00;

    public final /* bridge */ /* synthetic */ AnonymousClass3DC AKa(AnonymousClass3DQ r4, C81224nO r5) {
        C04220Ms.A0B(r5, 0);
        for (C81974op AKa : this.A00) {
            AnonymousClass3DC AKa2 = AKa.AKa(r4, r5);
            if (!AKa2.A08) {
                return AKa2;
            }
        }
        return AnonymousClass3W5.A00();
    }

    public AnonymousClass40T(List list) {
        this.A00 = list;
    }
}
