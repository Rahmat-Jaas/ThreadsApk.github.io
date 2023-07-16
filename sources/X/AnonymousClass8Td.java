package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8Td  reason: invalid class name */
public final class AnonymousClass8Td extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ AnonymousClass0ZU A03;
    public final /* synthetic */ AnonymousClass0ZU A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0YY A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Td(String str, AnonymousClass0ZU r3, AnonymousClass0ZU r4, AnonymousClass0ZU r5, AnonymousClass0ZU r6, AnonymousClass0YY r7, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.A0B = z;
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
        this.A07 = r7;
        this.A06 = r6;
        this.A0A = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r7 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r7.BCM()) {
            if (this.A0B) {
                AnonymousClass0ZU r10 = this.A03;
                AnonymousClass0ZU r11 = this.A05;
                AnonymousClass0ZU r12 = this.A04;
                AnonymousClass0YY r14 = this.A07;
                AnonymousClass0ZU r13 = this.A06;
                boolean z = this.A0A;
                boolean z2 = this.A08;
                boolean z3 = this.A09;
                String str = this.A02;
                int i = this.A00;
                int i2 = i >> 3;
                int i3 = this.A01 << 15;
                boolean z4 = z;
                C117856zM.A01(r7, (Modifier) null, str, r10, r11, r12, r13, r14, C86114wI.A03(i2, i2 & 14) | (57344 & i2) | (458752 & (i >> 12)) | (3670016 & i3) | (29360128 & i3) | ((i << 3) & 1879048192), 256, z4, z2, z3);
            }
        } else {
            r7.CuJ();
        }
        return Unit.A00;
    }
}
