package X;

import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.8aZ  reason: invalid class name */
public final class AnonymousClass8aZ extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ float A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8aZ(List list, float f) {
        super(4);
        this.A01 = list;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        BKU bku;
        String A0m;
        int i2;
        String A002;
        int i3;
        int A04 = AnonymousClass0wJ.A04(obj2);
        C147188nY r7 = (C147188nY) obj3;
        int A042 = AnonymousClass0wJ.A04(obj4);
        if ((A042 & 112) == 0) {
            i = C147188nY.A04(r7, A04) | A042;
        } else {
            i = A042;
        }
        if ((i & 721) != 144 || !r7.BCM()) {
            C110186lG r1 = (C110186lG) this.A01.get(A04);
            if (r1 instanceof AnonymousClass5vE) {
                i2 = 1157;
            } else if (r1 instanceof AnonymousClass5vF) {
                A002 = AnonymousClass000.A00(875);
                i3 = C110186lG.A05;
                C110186lG.A05 = i3 + 1;
                A0m = AnonymousClass00U.A0J(A002, i3);
                AnonymousClass7BT.A01(r7, C97876Dh.A00(Modifier.A00, this.A00, false), A0m, 48);
            } else if (r1 instanceof AnonymousClass5vD) {
                i2 = 990;
            } else {
                BKH bkh = r1.A03;
                if (bkh == null || (bku = bkh.A0M) == null) {
                    throw AnonymousClass0wJ.A0b();
                }
                A0m = C86154wM.A0m(bku);
                AnonymousClass7BT.A01(r7, C97876Dh.A00(Modifier.A00, this.A00, false), A0m, 48);
            }
            A002 = AnonymousClass000.A00(i2);
            i3 = C110186lG.A04;
            C110186lG.A04 = i3 + 1;
            A0m = AnonymousClass00U.A0J(A002, i3);
            AnonymousClass7BT.A01(r7, C97876Dh.A00(Modifier.A00, this.A00, false), A0m, 48);
        } else {
            r7.CuJ();
        }
        return Unit.A00;
    }
}
