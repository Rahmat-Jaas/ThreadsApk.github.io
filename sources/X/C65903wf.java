package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.CompoundButton;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110;

/* renamed from: X.3wf  reason: invalid class name and case insensitive filesystem */
public final class C65903wf implements C143158gC, CompoundButton.OnCheckedChangeListener {
    public final Context A00;
    public final AnonymousClass06E A01;
    public final C11630kW A02;
    public final Reel A03;
    public final AnonymousClass396 A04;
    public final AnonymousClass3H0 A05;

    public C65903wf(Context context, ViewStub viewStub, AnonymousClass066 r5, AnonymousClass06E r6, C11630kW r7, Reel reel, UserSession userSession) {
        C04220Ms.A0B(userSession, 3);
        C04220Ms.A0B(viewStub, 7);
        AnonymousClass3H0 r1 = (AnonymousClass3H0) userSession.A01(AnonymousClass3H0.class, new KtLambdaShape130S0100000_I2_110(userSession, 40));
        C04220Ms.A06(r1);
        AnonymousClass396 r0 = new AnonymousClass396(viewStub);
        this.A00 = context;
        this.A02 = r7;
        this.A01 = r6;
        this.A05 = r1;
        this.A04 = r0;
        this.A03 = reel;
        C18230wP.A0J(r1.A01).A0C(r5, this);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A05.A00(this.A00, this.A01, this.A02, (String) null, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r1 == com.instagram.model.reels.ReelType.A0V) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r6 = X.AnonymousClass0wJ.A1X(r9)
            X.396 r7 = r8.A04
            com.instagram.model.reels.Reel r4 = r8.A03
            r1 = 0
            if (r4 == 0) goto L_0x0066
            com.instagram.model.reels.ReelType r2 = r4.A0P
        L_0x000d:
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0T
            r3 = 0
            if (r2 == r0) goto L_0x001b
            if (r4 == 0) goto L_0x0016
            com.instagram.model.reels.ReelType r1 = r4.A0P
        L_0x0016:
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0V
            r2 = 0
            if (r1 != r0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131835787(0x7f113b8b, float:1.9304722E38)
            X.1kC r5 = X.AnonymousClass1kC.A00(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131835786(0x7f113b8a, float:1.930472E38)
            X.1kC r4 = X.AnonymousClass1kC.A00(r1, r0)
            if (r2 == 0) goto L_0x0068
            X.Ayd r0 = r7.A00
            r0.A09(r3)
            X.0Oa r1 = r7.A01
            java.lang.Object r0 = r1.getValue()
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r3 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.menu.SimpleSwitchRowViewBinder.Holder"
            X.C04220Ms.A0C(r3, r0)
            X.13k r3 = (X.C201713k) r3
            java.lang.Object r0 = r1.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r2 = X.C18190wL.A0A(r0)
            java.lang.CharSequence r0 = X.C59523Ld.A00(r2, r5)
            X.4MC r1 = new X.4MC
            r1.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r8, (java.lang.CharSequence) r0, (boolean) r6)
            java.lang.CharSequence r0 = X.C59523Ld.A00(r2, r4)
            r1.A0A = r0
            r0 = 0
            X.C50342sq.A00(r0, r3, r0, r1)
            return
        L_0x0066:
            r2 = r1
            goto L_0x000d
        L_0x0068:
            X.Ayd r1 = r7.A00
            r0 = 8
            r1.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65903wf.onChanged(java.lang.Object):void");
    }
}
