package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18190wL;
import X.C18220wO;
import X.C86104wH;
import X.C86144wL;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class DcpContext extends AnonymousClass0Sf {
    public static final DcpContext A05 = new DcpContext(HTTP.IDENTITY_CODING, (Map) null, (Map) null, 30);
    public static final Companion Companion = new Companion();
    public final Type A00;
    public final String A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return DcpContext$$serializer.INSTANCE;
        }
    }

    public DcpContext() {
        this((String) null, (Map) null, (Map) null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C04220Ms.A0I(C86144wL.A0a(obj), getClass())) {
            return false;
        }
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.facebook.dcp.model.DcpContext");
        return C04220Ms.A0I(this.A01, ((DcpContext) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DcpContext(id=");
        A0s.append(this.A01);
        A0s.append(", type=");
        A0s.append(this.A00);
        A0s.append(", longMap=");
        A0s.append(this.A03);
        A0s.append(", doubleMap=");
        A0s.append(this.A02);
        A0s.append(", stringMap=");
        return C86104wH.A0y(this.A04, A0s);
    }

    public /* synthetic */ DcpContext(Type type, String str, Map map, Map map2, Map map3, int i) {
        this.A01 = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.A00 = Type.SERVER_CONTEXT;
        } else {
            this.A00 = type;
        }
        if ((i & 4) == 0) {
            this.A03 = C18220wO.A0y();
        } else {
            this.A03 = map;
        }
        if ((i & 8) == 0) {
            this.A02 = C18220wO.A0y();
        } else {
            this.A02 = map2;
        }
        if ((i & 16) == 0) {
            this.A04 = C18220wO.A0y();
        } else {
            this.A04 = map3;
        }
    }

    public /* synthetic */ DcpContext(String str, Map map, Map map2, int i) {
        Type type = null;
        LinkedHashMap linkedHashMap = null;
        str = (i & 1) != 0 ? "" : str;
        type = (i & 2) != 0 ? Type.SERVER_CONTEXT : type;
        map = (i & 4) != 0 ? C18220wO.A0y() : map;
        linkedHashMap = (i & 8) != 0 ? C18220wO.A0y() : linkedHashMap;
        map2 = (i & 16) != 0 ? C18220wO.A0y() : map2;
        AnonymousClass0wJ.A1O(str, type);
        AnonymousClass0wJ.A1R(map, linkedHashMap);
        C04220Ms.A0B(map2, 5);
        this.A01 = str;
        this.A00 = type;
        this.A03 = map;
        this.A02 = linkedHashMap;
        this.A04 = map2;
    }
}
