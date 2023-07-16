package X;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.7tt  reason: invalid class name and case insensitive filesystem */
public final class C132437tt implements AnonymousClass0i1 {
    public final C90695dv A00;
    public final C132377tn A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final Callable A07;
    public final boolean A08;

    public C132437tt(C90695dv r2, C132377tn r3, String str, String str2, String str3, List list, List list2, List list3, Callable callable, boolean z) {
        C86114wI.A1I(str, 6, r3);
        this.A08 = z;
        this.A05 = list;
        this.A04 = list2;
        this.A06 = list3;
        this.A07 = callable;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = str2;
        this.A02 = str3;
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public final ImmutableList A00() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll((Iterable) this.A05);
        builder.addAll((Iterable) this.A04);
        builder.addAll((Iterable) this.A06);
        return C18250wR.A0F(builder);
    }
}
