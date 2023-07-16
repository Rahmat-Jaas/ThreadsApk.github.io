package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.47O  reason: invalid class name */
public final class AnonymousClass47O implements C82404pZ {
    public final /* synthetic */ AnonymousClass601 A00;
    public final /* synthetic */ C109326jp A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ E1T A03;
    public final /* synthetic */ String A04;

    public AnonymousClass47O(AnonymousClass601 r1, C109326jp r2, C109326jp r3, E1T e1t, String str) {
        this.A04 = str;
        this.A03 = e1t;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        if (!((C40289Lbs) obj).A01) {
            String str = this.A04;
            if (str.length() > 0) {
                E1T e1t = this.A03;
                ImmutableList of = ImmutableList.of(str);
                e1t.A00.A0D(new AnonymousClass40D(this.A00, this.A02, this.A01, str), (List) null, of);
                return;
            }
        }
        C109326jp r2 = this.A01;
        C61043Rr.A00(this.A00, C63893iY.A01, r2);
    }
}
