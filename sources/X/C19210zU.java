package X;

import android.app.Application;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0010000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1000000_I2;
import java.util.List;

/* renamed from: X.0zU  reason: invalid class name and case insensitive filesystem */
public final class C19210zU extends AnonymousClass10X {
    public final List A00;
    public final C86074wE A01;
    public final C86094wG A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19210zU(Application application) {
        super(application);
        C04220Ms.A0B(application, 1);
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0010000_I2(AnonymousClass0wJ.A1V(C18190wL.A0X().A0m), 2));
        this.A01 = A0z;
        this.A02 = C18230wP.A0x((C148838sG) null, A0z);
        long j = AnonymousClass0Jc.A00(application).A00;
        long A06 = C18230wP.A06();
        KtCSuperShape1S1000000_I2 ktCSuperShape1S1000000_I2 = new KtCSuperShape1S1000000_I2("App Version", 6);
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(C10380iF.A02(application));
        A0r.append('(');
        A0r.append(C10380iF.A00());
        this.A00 = C06750aI.A17(ktCSuperShape1S1000000_I2, new KtCSuperShape1S1000000_I2(AnonymousClass0wJ.A0u(A0r), 0), new C210418q(AnonymousClass31M.A00.A01(application, j, A06), C61433Tk.A00(j, A06)), new KtCSuperShape1S1000000_I2("Login", 6), new KtCSuperShape1S1000000_I2("Launch SSO login flow", 3), new KtCSuperShape1S1000000_I2("Launch Onboarding login flow", 5), new KtCSuperShape1S1000000_I2("Reset Onboarding state", 4), new KtCSuperShape1S1000000_I2("Enable Feed seen state logging", 2), new KtCSuperShape1S1000000_I2("Developer Option", 1));
    }
}
