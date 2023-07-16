package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.47M  reason: invalid class name */
public final class AnonymousClass47M implements C82404pZ {
    public final /* synthetic */ C62113Xe A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ AnonymousClass8s9 A03;

    public AnonymousClass47M(C62113Xe r1, Integer num, String str, AnonymousClass8s9 r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = num;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ImmutableList immutableList;
        if (((C40289Lbs) obj).A01) {
            this.A03.resumeWith(AnonymousClass1pY.A00);
            return;
        }
        E1T e1t = (E1T) this.A00.A04.getValue();
        Integer num = this.A01;
        ImmutableList immutableList2 = null;
        if (num == AnonymousClass006.A01) {
            immutableList = ImmutableList.of(this.A02);
        } else {
            immutableList = null;
        }
        if (num == AnonymousClass006.A00) {
            immutableList2 = ImmutableList.of(this.A02);
        }
        e1t.A00.A0D(new AnonymousClass40C(this.A02, this.A03), immutableList, immutableList2);
    }
}
