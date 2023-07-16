package X;

/* renamed from: X.70F  reason: invalid class name */
public final class AnonymousClass70F {
    public static final AnonymousClass684 A00(AnonymousClass684 r1, String str) {
        C04220Ms.A0B(r1, 1);
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        return AnonymousClass684.STRETCH;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        return AnonymousClass684.CENTER;
                    }
                    break;
                case 100571:
                    if (str.equals("end")) {
                        return AnonymousClass684.FLEX_END;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        return AnonymousClass684.FLEX_START;
                    }
                    break;
            }
        }
        return r1;
    }

    public static final Integer A01(C127397h3 r4) {
        Integer num = AnonymousClass006.A00;
        String A0m = C86114wI.A0m(r4.A04, 96);
        C127397h3 A0K = r4.A0K(94);
        if (A0m == null || A0K == null) {
            return num;
        }
        if (A0m.equals("grid")) {
            if (A0K.A03 == 16373) {
                return AnonymousClass006.A01;
            }
            throw C18190wL.A0a("CollectionLayoutUtils: requested \"grid\" layout_config_type, but provided layout_config doesn't match bk.types.GridCollectionLayoutConfig");
        } else if (!A0m.equals("staggered_grid")) {
            return num;
        } else {
            if (A0K.A03 == 16483) {
                return AnonymousClass006.A0C;
            }
            throw C18190wL.A0a("CollectionLayoutUtils: requested \"staggered_grid\" layout_config_type, but provided layout_config doesn't match bk.types.StaggeredGridCollectionLayoutConfig");
        }
    }
}
