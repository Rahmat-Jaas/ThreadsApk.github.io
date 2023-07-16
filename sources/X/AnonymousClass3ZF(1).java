package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.Map;
import kotlin.jvm.internal.IDxRImplShape188S0000000_1_I2;
import kotlin.jvm.internal.KtLambdaShape161S0100000_I2_16;

/* renamed from: X.3ZF  reason: invalid class name */
public final class AnonymousClass3ZF {
    public static final /* synthetic */ AnonymousClass0A5[] A06;
    public C08960ea A00;
    public final C81464nq A01;
    public final Map A02;
    public final C86024w9 A03 = new AnonymousClass4Un((Object) null);
    public final C86024w9 A04;
    public final C86024w9 A05;

    public final void A02(C62073Xa r3, Object obj) {
        C04220Ms.A0B(r3, 0);
        this.A02.put(r3.A01, obj);
    }

    public final void A03(String str) {
        this.A05.CrD(this, str, A06[0]);
    }

    static {
        Class<AnonymousClass3ZF> cls = AnonymousClass3ZF.class;
        A06 = new AnonymousClass0A5[]{new C000000a(cls, FXPFAccessLibraryDebugFragment.NAME, "getName()Ljava/lang/String;"), new C000000a(cls, "allocation", "getAllocation()D"), new C000000a(cls, "groups", "getGroups()Lcom/instagram/experiments/ExperimentGroups;")};
    }

    public static void A00(AnonymousClass3ZF r2, int i) {
        new KtLambdaShape161S0100000_I2_16(r2, i).invoke(r2.A01);
    }

    public final void A01(double d) {
        this.A03.CrD(this, Double.valueOf(d), A06[1]);
    }

    public final void A04(AnonymousClass0YY r5) {
        AnonymousClass3HJ r0 = new AnonymousClass3HJ(this.A01, this.A02);
        r5.invoke(r0);
        this.A04.CrD(this, new AnonymousClass34V(r0.A01), A06[2]);
    }

    public AnonymousClass3ZF(C81464nq r4) {
        this.A01 = r4;
        Class<?> cls = r4.getClass();
        C04220Ms.A0B(cls, 1);
        this.A05 = new AnonymousClass4Un(AnonymousClass0N8.A00(cls));
        if (C60913Rb.A00.get(r4) != null) {
            StringBuilder A0s = C18190wL.A0s("An experiment (named ");
            A0s.append(C60913Rb.A00(r4).A09);
            A0s.append(") has already been defined for contract ");
            throw C18180wK.A0a(C18200wM.A0m(r4, A0s));
        }
        this.A02 = C18220wO.A0y();
        this.A04 = new C73854Uo(new IDxRImplShape188S0000000_1_I2(this, 7));
    }
}
