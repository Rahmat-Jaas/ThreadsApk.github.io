package X;

import androidx.paging.PagingDataDiffer;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.8ET  reason: invalid class name */
public final class AnonymousClass8ET extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C143188gF A02;
    public final /* synthetic */ C1201779c A03;
    public final /* synthetic */ C1201779c A04;
    public final /* synthetic */ C125047cK A05;
    public final /* synthetic */ PagingDataDiffer A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ C04180Mo A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ET(C143188gF r2, C1201779c r3, C1201779c r4, C125047cK r5, PagingDataDiffer pagingDataDiffer, List list, C04180Mo r8, int i, int i2) {
        super(0);
        this.A06 = pagingDataDiffer;
        this.A05 = r5;
        this.A08 = r8;
        this.A02 = r2;
        this.A03 = r3;
        this.A07 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        PagingDataDiffer pagingDataDiffer = this.A06;
        pagingDataDiffer.A01 = this.A05;
        this.A08.A00 = true;
        C143188gF r5 = this.A02;
        pagingDataDiffer.A00 = r5;
        C1201779c r3 = this.A03;
        List list = this.A07;
        int i = this.A01;
        int i2 = this.A00;
        C1201779c r4 = this.A04;
        if (AnonymousClass6D2.A00 != null && C86164wN.A1P(3)) {
            StringBuilder A0s = C18190wL.A0s("Presenting data:\n                            |   first item: ");
            C1202779m r0 = (C1202779m) AnonymousClass00J.A0D(list);
            Object obj2 = null;
            if (r0 != null) {
                obj = AnonymousClass00J.A0D(r0.A01);
            } else {
                obj = null;
            }
            A0s.append(obj);
            A0s.append("\n                            |   last item: ");
            C1202779m r02 = (C1202779m) AnonymousClass00J.A0F(list);
            if (r02 != null) {
                obj2 = AnonymousClass00J.A0F(r02.A01);
            }
            A0s.append(obj2);
            A0s.append("\n                            |   placeholdersBefore: ");
            A0s.append(i);
            A0s.append("\n                            |   placeholdersAfter: ");
            A0s.append(i2);
            A0s.append("\n                            |   hintReceiver: ");
            A0s.append(r5);
            A0s.append("\n                            |   sourceLoadStates: ");
            A0s.append(r4);
            AnonymousClass4n8.A09(AnonymousClass00U.A0L(C86104wH.A0v(r3, C18180wK.A0i("\n                        ", A0s)), "|)"), "|");
        }
        return Unit.A00;
    }
}
