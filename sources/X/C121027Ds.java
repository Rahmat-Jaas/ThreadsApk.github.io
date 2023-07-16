package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape22S0201000_I2_8;

/* renamed from: X.7Ds  reason: invalid class name and case insensitive filesystem */
public final class C121027Ds {
    public C111946oh A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;
    public List A07;
    public C83224qz A08;
    public final long A09;
    public final EffectCollectionService A0A;
    public final GX6 A0B;
    public final G2T A0C;
    public final UserSession A0D;
    public final Map A0E = AnonymousClass0wJ.A0y();

    public static final C84714tk A00(C25515Dn3 dn3, C121027Ds r10) {
        return new C1372486y(new KtSLambdaShape22S0201000_I2_8((Object) r10.A0A.A0D(new AnonymousClass5He(dn3, (Integer) null, (String) null, r10.A09, true, true, C04220Ms.A0I(dn3, C25515Dn3.A0A), true)), (C146958n9) null, 2));
    }

    public static final void A01(C121027Ds r4) {
        List A0V = AnonymousClass00J.A0V(r4.A07, r4.A04);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A0V) {
            C18240wQ.A1N(next, A0v, ((CameraAREffect) next).A0L() ? 1 : 0);
        }
        r4.A02 = AnonymousClass00J.A0N(AnonymousClass00J.A0b(A0v));
        List A0V2 = AnonymousClass00J.A0V(r4.A06, r4.A04);
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (Object next2 : A0V2) {
            if (((CameraAREffect) next2).A0L()) {
                A0v2.add(next2);
            }
        }
        r4.A01 = AnonymousClass00J.A0N(AnonymousClass00J.A0b(A0v2));
    }

    public /* synthetic */ C121027Ds(Context context, UserSession userSession) {
        EffectCollectionService A002 = AnonymousClass6LZ.A00(context, userSession);
        GX6 gx6 = new GX6(userSession);
        G2T g2t = new G2T(userSession);
        C04220Ms.A0B(A002, 3);
        this.A0D = userSession;
        this.A0A = A002;
        this.A0B = gx6;
        this.A0C = g2t;
        AnonymousClass0ZV r0 = AnonymousClass0ZV.A00;
        this.A02 = r0;
        this.A01 = r0;
        this.A03 = r0;
        this.A05 = r0;
        this.A04 = r0;
        this.A07 = r0;
        this.A06 = r0;
        this.A09 = C63803iN.A03(AnonymousClass0TJ.A06, g2t.A00, 36594650370344726L);
    }
}
