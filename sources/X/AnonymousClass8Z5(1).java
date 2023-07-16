package X;

import com.instagram.api.schemas.ProfileTheme;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.8Z5  reason: invalid class name */
public final class AnonymousClass8Z5 extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ProfileTheme A02;
    public final /* synthetic */ F6t A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ AnonymousClass0YY A05;
    public final /* synthetic */ AnonymousClass0YY A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Z5(ProfileTheme profileTheme, F6t f6t, List list, AnonymousClass0YY r5, AnonymousClass0YY r6, int i, int i2, boolean z) {
        super(3);
        this.A07 = z;
        this.A04 = list;
        this.A02 = profileTheme;
        this.A05 = r5;
        this.A03 = f6t;
        this.A06 = r6;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY r4 = (C147188nY) obj2;
        if ((AnonymousClass0wJ.A04(obj3) & 81) != 16 || !r4.BCM()) {
            if (this.A07) {
                r4.Cvb(-2128033692);
                List list = this.A04;
                C122077Ka.A05(r4, this.A02, this.A03, list, this.A05, this.A06, ((this.A00 >> 6) & 896) | 4168 | (57344 & (this.A01 << 12)));
            } else {
                r4.Cvb(-2128033592);
                C122077Ka.A06(r4, this.A02, this.A04, this.A05, ((this.A00 >> 6) & 896) | 72);
            }
            AnonymousClass7W3.A0y(r4);
        } else {
            r4.CuJ();
        }
        return Unit.A00;
    }
}
