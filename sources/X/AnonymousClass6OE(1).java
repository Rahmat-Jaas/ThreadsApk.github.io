package X;

/* renamed from: X.6OE  reason: invalid class name */
public final class AnonymousClass6OE {
    public static AnonymousClass69F A00(String str) {
        switch (str.hashCode()) {
            case -1867169789:
                if (str.equals("success")) {
                    return AnonymousClass69F.SUCCESS;
                }
                break;
            case -1281977283:
                if (str.equals("failed")) {
                    return AnonymousClass69F.FAILED;
                }
                break;
            case 336650556:
                if (str.equals("loading")) {
                    return AnonymousClass69F.LOADING;
                }
                break;
        }
        throw C18180wK.A0a(AnonymousClass00U.A0L("unknown spinner state: ", str));
    }
}
