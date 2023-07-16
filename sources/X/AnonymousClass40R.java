package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.40R  reason: invalid class name */
public final class AnonymousClass40R implements C83324rC {
    public final AnonymousClass3UH A00 = new AnonymousClass3UH();

    public final String DB3() {
        return "client_filters";
    }

    public final AnonymousClass3DC A8q(AnonymousClass3DQ r14, C81224nO r15) {
        AnonymousClass39T r2;
        boolean A1Y = AnonymousClass0wJ.A1Y(r15, r14);
        C560635q r0 = ((AnonymousClass18L) r15).A02;
        if (r0 != null) {
            C57243Ah r3 = r0.A00;
            if (r3.A00 != AnonymousClass006.A0N) {
                try {
                    r2 = AnonymousClass3UH.A00(r14, this.A00, r15, r3);
                } catch (C32062Aa | IllegalArgumentException | NullPointerException unused) {
                    r2 = new AnonymousClass39T((ImmutableList) null, r3, A1Y);
                }
                if (!r2.A02) {
                    ImmutableList immutableList = r2.A00;
                    AnonymousClass40W r32 = new AnonymousClass40W(immutableList);
                    if (immutableList == null || immutableList.isEmpty()) {
                        C57243Ah r5 = r2.A01;
                        if (r5 != null) {
                            return new AnonymousClass3DC(r32, (C57233Ag) null, r5, (Integer) null, "Failed filter clause", (Throwable) null, 220, A1Y, A1Y, A1Y);
                        }
                        return AnonymousClass3W5.A01(r32);
                    }
                    C57233Ag r4 = (C57233Ag) immutableList.get(A1Y ? 1 : 0);
                    C04220Ms.A04(r4);
                    return new AnonymousClass3DC(r32, r4, (C57243Ah) null, (Integer) null, "Failed context filter", (Throwable) null, 188, A1Y, A1Y, A1Y);
                }
            }
        }
        return AnonymousClass3W5.A00();
    }
}
