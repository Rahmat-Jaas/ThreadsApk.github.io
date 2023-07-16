package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.Unit;

/* renamed from: X.8YM  reason: invalid class name */
public final class AnonymousClass8YM extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YM(int i, String str) {
        super(3);
        this.A00 = i;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY r5 = (C147188nY) obj2;
        int A04 = AnonymousClass0wJ.A04(obj3);
        C04220Ms.A0B(obj, 0);
        if ((A04 & 81) != 16 || !r5.BCM()) {
            String A042 = AnonymousClass7JS.A04(r5, new Object[]{this.A01, AnonymousClass7JS.A00(r5)}, R.plurals.barcelona_onboarding_following_screen__pending_tab_subtitle, this.A00);
            float f = (float) 58;
            Modifier A05 = AnonymousClass7K4.A05(Modifier.A04(Modifier.A00), f, (float) 24, f, (float) 16);
            long A03 = AnonymousClass7KB.A03(r5);
            long A032 = AnonymousClass7Hi.A03(12);
            AnonymousClass7I9.A02(r5, A05, AnonymousClass7J9.A02(r5).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 196607, 0, 0, AnonymousClass7Hi.A03(19))), (C114236su) null, (C134817yQ) null, C121117Ee.A00(), A042, 0, 0, 0, 3072, 0, 1968, A03, A032, false);
        } else {
            r5.CuJ();
        }
        return Unit.A00;
    }
}
