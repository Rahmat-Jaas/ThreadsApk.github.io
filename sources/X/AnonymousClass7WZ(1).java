package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;

/* renamed from: X.7WZ  reason: invalid class name */
public final class AnonymousClass7WZ implements C145108jq {
    public static final C141738cs A03;
    public C146078lb A00;
    public final Map A01;
    public final Map A02;

    public final void A4s(C147188nY r10, Object obj, AnonymousClass0YP r12, int i) {
        Object obj2 = obj;
        AnonymousClass0YP r7 = r12;
        boolean A1Z = AnonymousClass0wJ.A1Z(obj, r12);
        r10.Cvd(-1198538093);
        r10.Cvb(444418301);
        r10.Cve(HttpStatus.SC_MULTI_STATUS, obj);
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r10);
        Object A13 = A0Y.A13();
        if (A13 == AnonymousClass7GN.A00) {
            C146078lb r0 = this.A00;
            if (r0 == null || r0.ABk(obj)) {
                A13 = new C109646kL(this, obj);
                A0Y.A14(A13);
            } else {
                StringBuilder A0s = C18190wL.A0s("Type of the key ");
                A0s.append(obj);
                throw C18190wL.A0a(C18180wK.A0i(" is not supported. On Android you can only use types which can be stored inside the Bundle.", A0s));
            }
        }
        AnonymousClass7W3.A0w(A0Y, false);
        C109646kL r4 = (C109646kL) A13;
        AnonymousClass7DS[] A012 = AnonymousClass7DS.A01(C102686Wd.A00, r4.A01, A1Z);
        int i2 = i;
        AnonymousClass7Ai.A01(r10, r12, A012, i);
        AnonymousClass7K5.A04(r10, Unit.A00, C86154wM.A0y(obj, this, r4, 18));
        if (A0Y.A0T && A0Y.A0D.A05 == A0Y.A08) {
            A0Y.A08 = -1;
            A0Y.A0T = false;
        }
        AnonymousClass7W3.A0w(A0Y, false);
        AnonymousClass7W3.A0w(A0Y, false);
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i2, 8, r7, obj2, this));
        }
    }

    public final void CcR(Object obj) {
        C04220Ms.A0B(obj, 0);
        C109646kL r0 = (C109646kL) this.A01.get(obj);
        if (r0 != null) {
            r0.A00 = false;
        } else {
            this.A02.remove(obj);
        }
    }

    static {
        AnonymousClass8WE r2 = AnonymousClass8WE.A00;
        AnonymousClass8LR r1 = AnonymousClass8LR.A00;
        AnonymousClass0wJ.A1N(r2, r1);
        A03 = new AnonymousClass7Wc(r1, r2);
    }

    public AnonymousClass7WZ(Map map) {
        this.A02 = map;
        this.A01 = C18220wO.A0y();
    }

    public AnonymousClass7WZ() {
        this(C18220wO.A0y());
    }
}
