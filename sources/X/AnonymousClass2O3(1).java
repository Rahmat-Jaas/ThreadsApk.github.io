package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2O3  reason: invalid class name */
public final class AnonymousClass2O3 {
    public static final String A00(AnonymousClass253 r1) {
        switch (C18230wP.A04(r1, 0)) {
            case 0:
                return "invited";
            case 1:
                return "going";
            case 2:
                return "cant_go";
            case 3:
                return "maybe";
            case 4:
                return "removed";
            case 5:
                return "self_removed";
            case 6:
                return I17.A00(HttpStatus.SC_MOVED_PERMANENTLY);
            case 7:
                return NetInfoModule.CONNECTION_TYPE_NONE;
            default:
                throw AnonymousClass4VZ.A00();
        }
    }
}
