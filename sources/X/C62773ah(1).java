package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape161S0100000_I2_16;

/* renamed from: X.3ah  reason: invalid class name and case insensitive filesystem */
public final class C62773ah {
    public static final /* synthetic */ AnonymousClass0A5[] A05 = {new C000000a(C62773ah.class, "size", "getSize()D")};
    public String A00;
    public final C81464nq A01;
    public final C86024w9 A02 = new AnonymousClass4Un((Object) null);
    public final Map A03;
    public final Map A04;

    public C62773ah(C81464nq r3, String str, Map map) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = r3;
        this.A03 = map;
        this.A04 = new LinkedHashMap(map);
    }

    public final void A04(C62073Xa r3, Object obj) {
        C04220Ms.A0B(r3, 0);
        this.A04.put(r3.A01, obj);
    }

    public static C62773ah A00(Object obj) {
        C62773ah r2 = (C62773ah) obj;
        C04220Ms.A0B(r2, 0);
        r2.A03(0.5d);
        return r2;
    }

    public static Unit A01(C62773ah r2, int i) {
        new KtLambdaShape161S0100000_I2_16(r2, i).invoke(r2.A01);
        return Unit.A00;
    }

    public final C61163Sd A02() {
        C81464nq r0 = this.A01;
        Map map = this.A04;
        String str = this.A00;
        AnonymousClass2O6 A002 = AnonymousClass2O5.A00(r0, str, map);
        if (!(A002 instanceof AnonymousClass1pD)) {
            return new C61163Sd(str, map, ((Number) this.A02.BKJ(this, A05[0])).doubleValue());
        }
        throw C18180wK.A0a(A002.toString());
    }

    public final void A03(double d) {
        this.A02.CrD(this, Double.valueOf(d), A05[0]);
    }
}
