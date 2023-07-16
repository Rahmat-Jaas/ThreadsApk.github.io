package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.instagram.compose.igds.components.segmentedpills.SegmentedPillsKt$SegmentedPills$11$1$clickModifier$1$1;
import kotlin.Unit;

/* renamed from: X.8Jl  reason: invalid class name */
public final class AnonymousClass8Jl extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ LazyListState A03;
    public final /* synthetic */ C147368pE A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ AnonymousClass0YY A06;
    public final /* synthetic */ C83224qz A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jl(LazyListState lazyListState, C147368pE r3, Integer num, AnonymousClass0YY r5, C83224qz r6, float f, float f2, float f3) {
        super(1);
        this.A06 = r5;
        this.A05 = num;
        this.A07 = r6;
        this.A03 = lazyListState;
        this.A04 = r3;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        this.A06.invoke(obj);
        Integer num = this.A05;
        if (num == AnonymousClass006.A0N || num == AnonymousClass006.A0C) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new SegmentedPillsKt$SegmentedPills$11$1$clickModifier$1$1(this.A03, this.A04, (C146958n9) null, this.A00, this.A01, this.A02), this.A07, 3);
        }
        return Unit.A00;
    }
}
