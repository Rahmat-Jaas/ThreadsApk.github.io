package X;

import com.google.common.collect.ImmutableSet;
import java.util.EnumSet;

/* renamed from: X.40Q  reason: invalid class name */
public final class AnonymousClass40Q implements C83324rC {
    public final AnonymousClass3DC A8q(AnonymousClass3DQ r12, C81224nO r13) {
        String str;
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        ImmutableSet immutableSet = r12.A05;
        if (immutableSet.isEmpty()) {
            str = "No triggers";
        } else {
            str = "Unsupported trigger";
            if (immutableSet.size() == A1Z) {
                Object A08 = AnonymousClass00J.A08(immutableSet);
                if (A08 != null) {
                    EnumSet copyOf = EnumSet.copyOf(((AnonymousClass18L) r13).A01.A0F);
                    C04220Ms.A06(copyOf);
                    if (copyOf.contains(A08)) {
                    }
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            } else {
                EnumSet<Object> copyOf2 = EnumSet.copyOf(((AnonymousClass18L) r13).A01.A0F);
                C04220Ms.A06(copyOf2);
                for (Object contains : copyOf2) {
                    if (immutableSet.contains(contains)) {
                    }
                }
            }
            return AnonymousClass3W5.A00();
        }
        return new AnonymousClass3DC((C81984oq) null, (C57233Ag) null, (C57243Ah) null, (Integer) null, str, (Throwable) null, 508, false, false, false);
    }

    public final String DB3() {
        return null;
    }
}
