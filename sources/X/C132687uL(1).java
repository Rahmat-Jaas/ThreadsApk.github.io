package X;

import android.os.Handler;
import com.instagram.service.session.UserSession;
import java.io.IOException;

/* renamed from: X.7uL  reason: invalid class name and case insensitive filesystem */
public final class C132687uL implements C09990hX {
    public final AnonymousClass0hW A00;
    public final C11900kz A01 = new C11900kz(C09820gj.A00, AnonymousClass0gN.A00(), "LocalReelSeenStateSerialize");
    public final C113776s7 A02;
    public final UserSession A03;
    public final Handler A04;

    public final synchronized String toString() {
        String str;
        try {
            str = AnonymousClass71F.A00(this.A02);
        } catch (IOException e) {
            C10450iM.A06("LocalReelSeenStateStore#toString", "Failed to serialize seen state to json", e.getCause());
            str = "";
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        C113776s7 r2;
        C113776s7 r3 = this.A02;
        synchronized (r3) {
            r2 = new C113776s7();
            r2.A01.addAll(r3.A01);
            r2.A00.putAll(r3.A00);
        }
        this.A01.AKp(new AnonymousClass61F(r2, this));
    }

    public C132687uL(C113776s7 r6, UserSession userSession) {
        Handler A0F = AnonymousClass0wJ.A0F();
        this.A04 = A0F;
        this.A03 = userSession;
        this.A02 = r6;
        this.A00 = new AnonymousClass0hW(A0F, this, 100);
    }
}
