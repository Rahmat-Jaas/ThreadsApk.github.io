package X;

import android.os.Bundle;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.profile.ui.ProfileViewModel;
import kotlin.Unit;

/* renamed from: X.8aq  reason: invalid class name and case insensitive filesystem */
public final class C141368aq extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ AnonymousClass7KG A00;
    public final /* synthetic */ C146638ma A01;
    public final /* synthetic */ AnonymousClass0ZU A02;
    public final /* synthetic */ AnonymousClass0ZU A03;
    public final /* synthetic */ AnonymousClass0ZU A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0YY A06;
    public final /* synthetic */ AnonymousClass0YY A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ AnonymousClass0YY A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141368aq(AnonymousClass7KG r2, C146638ma r3, AnonymousClass0ZU r4, AnonymousClass0ZU r5, AnonymousClass0ZU r6, AnonymousClass0ZU r7, AnonymousClass0YY r8, AnonymousClass0YY r9, AnonymousClass0YY r10, AnonymousClass0YY r11) {
        super(4);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A09 = r8;
        this.A05 = r6;
        this.A08 = r9;
        this.A04 = r7;
        this.A07 = r10;
        this.A06 = r11;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String str2;
        C123917Zx r2 = (C123917Zx) obj2;
        C147188nY A0H = C86104wH.A0H(obj3, obj4);
        boolean A1Z = AnonymousClass0wJ.A1Z(obj, r2);
        Bundle bundle = r2.A06;
        if (bundle != null) {
            str = bundle.getString("userId");
            str2 = bundle.getString(C61973Wo.A01(229, 8, 73));
        } else {
            str = null;
            str2 = null;
        }
        Modifier A052 = Modifier.A05(Modifier.A00);
        AnonymousClass0ZU r22 = this.A02;
        boolean A0z = C147188nY.A0z(A0H, r22, 1157296644);
        AnonymousClass7W3 r4 = (AnonymousClass7W3) A0H;
        Object A13 = r4.A13();
        if (A0z || A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass7W3.A0I(r4, r22, 27);
        }
        AnonymousClass0ZU A082 = AnonymousClass7W3.A08(r4, A13, false);
        C146638ma r12 = this.A01;
        AnonymousClass0ZU r8 = this.A03;
        AnonymousClass0YY r23 = this.A09;
        boolean A0z2 = C147188nY.A0z(A0H, r23, 1157296644);
        Object A132 = r4.A13();
        if (A0z2 || A132 == AnonymousClass7GN.A00) {
            A132 = AnonymousClass7W3.A0D(r4, r23, 27);
        }
        AnonymousClass0YY A0A = AnonymousClass7W3.A0A(r4, A132, false);
        AnonymousClass0ZU r5 = this.A05;
        AnonymousClass0YY r42 = this.A08;
        AnonymousClass0ZU r24 = this.A04;
        AnonymousClass0ZU r20 = r24;
        AnonymousClass0ZU r18 = r8;
        AnonymousClass0ZU r19 = r5;
        C100386Nc.A00(A0H, (C147368pE) null, A052, r12, (AnonymousClass7p1) null, (ProfileViewModel) null, str, str2, A082, r18, r19, r20, C86164wN.A0z(this.A00, 28), A0A, r42, this.A07, this.A06, 0, 432, 114688, A1Z);
        return Unit.A00;
    }
}
