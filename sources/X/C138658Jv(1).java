package X;

import kotlin.Unit;

/* renamed from: X.8Jv  reason: invalid class name and case insensitive filesystem */
public final class C138658Jv extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C142638fL A01;
    public final /* synthetic */ C142638fL A02;
    public final /* synthetic */ C115596vX A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0ZU A08;
    public final /* synthetic */ AnonymousClass0YP A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138658Jv(C142638fL r2, C142638fL r3, C115596vX r4, String str, String str2, String str3, AnonymousClass0ZU r8, AnonymousClass0ZU r9, AnonymousClass0YP r10, float f) {
        super(1);
        this.A03 = r4;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A00 = f;
        this.A08 = r8;
        this.A02 = r2;
        this.A01 = r3;
        this.A07 = r9;
        this.A09 = r10;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C146508mM r4 = (C146508mM) obj;
        C04220Ms.A0B(r4, 0);
        C115596vX r7 = this.A03;
        String str = this.A05;
        String str2 = this.A04;
        String str3 = this.A06;
        long BCI = r4.BCI();
        long Bb2 = r4.Bb2(C86104wH.A0C(((float) C86104wH.A07(BCI)) / 2.0f, ((float) C86104wH.A08(BCI)) / 2.0f));
        long A022 = AnonymousClass7FV.A02(r4.BCI());
        float f = this.A00;
        r7.A01(this.A02, this.A01, str, str2, str3, this.A08, this.A07, this.A09, f, Bb2, A022);
        return Unit.A00;
    }
}
