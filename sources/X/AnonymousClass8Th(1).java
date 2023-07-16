package X;

import android.graphics.drawable.Drawable;
import kotlin.Unit;

/* renamed from: X.8Th  reason: invalid class name */
public final class AnonymousClass8Th extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Drawable A02;
    public final /* synthetic */ AnonymousClass68N A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0ZU A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Th(Drawable drawable, AnonymousClass68N r3, String str, String str2, String str3, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0YY r9, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A02 = drawable;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A0B = z;
        this.A0A = z2;
        this.A03 = r3;
        this.A08 = r7;
        this.A09 = r9;
        this.A07 = r8;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        Drawable drawable = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        String str3 = this.A06;
        boolean z = this.A0B;
        boolean z2 = this.A0A;
        C120557Bj.A00(drawable, A0H, this.A03, str, str2, str3, this.A08, this.A07, this.A09, C115796vv.A00(this.A00), this.A01, z, z2);
        return Unit.A00;
    }
}
