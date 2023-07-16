package X;

import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.8Sf  reason: invalid class name and case insensitive filesystem */
public final class C140158Sf extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0YY A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140158Sf(Modifier modifier, Integer num, List list, AnonymousClass0ZU r5, AnonymousClass0ZU r6, AnonymousClass0YY r7, int i, int i2, boolean z) {
        super(2);
        this.A06 = r5;
        this.A07 = r7;
        this.A05 = r6;
        this.A08 = z;
        this.A03 = num;
        this.A04 = list;
        this.A02 = modifier;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0ZU r5 = this.A06;
        AnonymousClass0YY r7 = this.A07;
        AnonymousClass0ZU r6 = this.A05;
        boolean z = this.A08;
        C121327Fm.A02(A0H, this.A02, this.A03, this.A04, r5, r6, r7, C115796vv.A00(this.A00), this.A01, z);
        return Unit.A00;
    }
}
