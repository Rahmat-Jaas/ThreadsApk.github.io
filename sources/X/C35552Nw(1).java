package X;

import java.util.List;

/* renamed from: X.2Nw  reason: invalid class name and case insensitive filesystem */
public final class C35552Nw {
    public static final AnonymousClass34S A00(C37170Jlr jlr) {
        String A0L;
        C35358ItM itM = jlr.A02;
        if (itM.ordinal() == 1) {
            C36857Jfo jfo = jlr.A01;
            C04220Ms.A0A(jfo);
            if (jfo.A0E == null) {
                A0L = "Cannot make SingleRowSection with null media";
            } else {
                C36857Jfo jfo2 = jlr.A01;
                C04220Ms.A0A(jfo2);
                List list = jfo2.A0E;
                if (list != null) {
                    return new AnonymousClass34S(new AnonymousClass4O4(list, 0, list.size()));
                }
                throw AnonymousClass0wJ.A0b();
            }
        } else {
            A0L = AnonymousClass00U.A0L("Unsupported DiscoverySection layout_type: ", itM.A00);
        }
        C10450iM.A03("DiscoverySectionTransformer", A0L);
        return null;
    }
}
