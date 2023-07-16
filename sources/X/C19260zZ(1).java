package X;

import android.app.Application;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;

/* renamed from: X.0zZ  reason: invalid class name and case insensitive filesystem */
public final class C19260zZ extends AnonymousClass10X {
    public static final C15720rm A0A = new C15720rm("FanClubContentPreviewPickerViewModel");
    public final C695148w A00;
    public final PendingMediaStore A01;
    public final UserSession A02;
    public final C04530Oa A03 = AnonymousClass0OY.A02(C18250wR.A0g(this, 16));
    public final C86074wE A04;
    public final C86074wE A05;
    public final C86074wE A06;
    public final C86074wE A07;
    public final C86074wE A08;
    public final C86094wG A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19260zZ(Application application, C695148w r14, PendingMediaStore pendingMediaStore, UserSession userSession) {
        super(application);
        C04220Ms.A0B(r14, 4);
        this.A02 = userSession;
        this.A01 = pendingMediaStore;
        this.A00 = r14;
        Lr0 lr0 = DIV.A01;
        C27457Enn A0z = C18190wL.A0z(lr0);
        this.A07 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(lr0);
        this.A08 = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(false);
        this.A06 = A0z3;
        C27457Enn A0z4 = C18190wL.A0z(false);
        this.A05 = A0z4;
        C27457Enn A0z5 = C18190wL.A0z(false);
        this.A04 = A0z5;
        IDxFlowShape93S0200000_1_I2 iDxFlowShape93S0200000_1_I2 = new IDxFlowShape93S0200000_1_I2(15, (Object) this, (Object) new C84714tk[]{A0z, r14.A04, A0z2, A0z3, A0z4, A0z5});
        this.A09 = C25753DrP.A04(new C22929Cif(AnonymousClass0ZV.A00, false), AnonymousClass3J5.A00(this), iDxFlowShape93S0200000_1_I2, AnonymousClass74I.A00);
    }

    public final void A09() {
        Object value = this.A07.getValue();
        if (value != null) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(value, this, (C146958n9) null, 13), AnonymousClass3J5.A00(this), 3);
        }
    }
}
