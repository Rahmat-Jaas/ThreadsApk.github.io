package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.7Tb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C122607Tb implements C142618fJ {
    public static final /* synthetic */ C122607Tb A00 = new C122607Tb();

    public final Object apply(Object obj) {
        String str;
        String str2 = ((C115406v0) obj).A00;
        if ("PIN".equalsIgnoreCase(str2)) {
            str = "VERIFY_PIN_TO_PAY";
        } else if ("BIO".equalsIgnoreCase(str2)) {
            str = "VERIFY_BIO_TO_PAY";
        } else {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        return C880856r.A04(AnonymousClass7Kx.A0A(str));
    }
}
