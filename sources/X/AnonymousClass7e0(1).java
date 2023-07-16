package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.Example;
import java.util.Collection;

/* renamed from: X.7e0  reason: invalid class name */
public final class AnonymousClass7e0 implements C145188k1 {
    public final C145188k1 A00;
    public final C145798l6 A01;
    public final String A02;
    public final C03700Kj A03;
    public final Boolean A04;

    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        boolean z;
        AnonymousClass5Id r2;
        AnonymousClass0ZV r1;
        String str;
        AnonymousClass5Id ALA;
        if (C18190wL.A1Z(this.A04, true)) {
            r2 = this.A01.CfA(this.A02);
            z = false;
            if (r2.A02) {
                if (System.currentTimeMillis() > C18190wL.A08(r2.A00) + 2592000000L) {
                    r1 = AnonymousClass0ZV.A00;
                    str = "server features ttl expired";
                } else {
                    C145188k1 r12 = this.A00;
                    if (r12 != null && (ALA = r12.ALA((DcpContext) null)) != null) {
                        return ALA;
                    }
                    r1 = AnonymousClass0ZV.A00;
                    str = "shared prefs source not available";
                }
            }
            r1 = AnonymousClass0ZV.A00;
            str = r2.A01;
        } else {
            r2 = this.A01.CZ5((Long) null, this.A02);
            z = r2.A02;
            if (z) {
                Collection values = ((Example) r2.A00).A02.values();
                C04220Ms.A06(values);
                return AnonymousClass5Id.A01(AnonymousClass00J.A0N(values), (String) null, true);
            }
            r1 = AnonymousClass0ZV.A00;
            str = r2.A01;
        }
        return AnonymousClass5Id.A01(r1, str, z);
    }

    public final String getId() {
        return "Server";
    }

    public AnonymousClass7e0(C03700Kj r1, C145188k1 r2, C145798l6 r3, Boolean bool, String str) {
        AnonymousClass0wJ.A1O(r1, r3);
        this.A03 = r1;
        this.A01 = r3;
        this.A02 = str;
        this.A00 = r2;
        this.A04 = bool;
    }
}
