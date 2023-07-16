package X;

import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.service.session.UserSession;

/* renamed from: X.7uR  reason: invalid class name and case insensitive filesystem */
public final class C132747uR implements C39549KvX {
    public final C143408gf A00;
    public final C143418gg A01;
    public final AnonymousClass78G A02;
    public final C146018lU A03;
    public final C146028lV A04;
    public final String A05;
    public final AnonymousClass0YP A06;
    public final boolean A07;
    public final boolean A08;

    public final void AKq(C37284Jnx jnx, C2R c2r) {
        boolean A1Z = AnonymousClass0wJ.A1Z(jnx, c2r);
        int intValue = c2r.BLJ(jnx).intValue();
        if (intValue == 0) {
            AnonymousClass78G r2 = this.A02;
            AnonymousClass0YP r5 = this.A06;
            Object obj = jnx.A02;
            Object obj2 = jnx.A03;
            Object invoke = r5.invoke(obj, obj2);
            C04220Ms.A0B(invoke, 0);
            C146018lU r0 = this.A03;
            this.A04.A5B(AnonymousClass78G.A00(new C126847g2(r0.CY4((C142118dt) r2.A04.get(invoke), jnx, c2r), this, AnonymousClass006.A00, (String) r5.invoke(obj, obj2), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, c2r.B6f()), this.A00, this.A01, r2), jnx, c2r);
        } else if (intValue != A1Z) {
            AnonymousClass78G r22 = this.A02;
            AnonymousClass0YP r52 = this.A06;
            Object obj3 = jnx.A02;
            Object obj4 = jnx.A03;
            Object invoke2 = r52.invoke(obj3, obj4);
            C04220Ms.A0B(invoke2, 0);
            C146018lU r02 = this.A03;
            this.A04.A5D(AnonymousClass78G.A00(new C126847g2(r02.CY6((C142118dt) r22.A04.get(invoke2), jnx, c2r), this, AnonymousClass006.A01, (String) r52.invoke(obj3, obj4), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, c2r.B6f()), this.A00, this.A01, r22), jnx, c2r);
        } else if (!this.A08) {
            AnonymousClass78G r23 = this.A02;
            AnonymousClass0YP r53 = this.A06;
            Object obj5 = jnx.A02;
            Object obj6 = jnx.A03;
            Object invoke3 = r53.invoke(obj5, obj6);
            C04220Ms.A0B(invoke3, 0);
            C142118dt CY8 = this.A03.CY8((C142118dt) r23.A04.get(invoke3), jnx, c2r);
            float BLq = c2r.BLq(jnx);
            this.A04.A5F(AnonymousClass78G.A00(new C126847g2(CY8, this, AnonymousClass006.A0C, (String) r53.invoke(obj5, obj6), BLq, c2r.B6f()), this.A00, this.A01, r23), jnx, c2r);
        }
    }

    public C132747uR(AnonymousClass78G r4, C11630kW r5, UserSession userSession, C146018lU r7, C146028lV r8, String str, AnonymousClass0YP r10, boolean z, boolean z2) {
        AnonymousClass0wJ.A1R(str, r4);
        C04220Ms.A0B(r7, 6);
        AnonymousClass7g4 r2 = new AnonymousClass7g4();
        C126877g6 r0 = new C126877g6(r5, new C19518Axf(), userSession);
        this.A05 = str;
        this.A02 = r4;
        this.A03 = r7;
        this.A04 = r8;
        this.A00 = r2;
        this.A01 = r0;
        this.A06 = r10;
        this.A07 = z;
        this.A08 = z2;
    }
}
