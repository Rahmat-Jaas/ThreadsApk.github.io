package X;

import com.facebookpay.form.cell.toggle.SwitchCellParams;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.76f  reason: invalid class name and case insensitive filesystem */
public final class C1196376f {
    public int A00;
    public int A01;
    public int A02;
    public String A03 = "";
    public String A04 = "";

    public static C109806ke A00(C91885h0 r3, ImmutableList.Builder builder, int i, boolean z) {
        r3.A03 = i;
        C1196376f r2 = new C1196376f();
        r2.A04 = "https://m.facebook.com/policy";
        r2.A01 = 2131824764;
        r2.A03 = "[[data_policy_token]]";
        r3.A08.add((Object) new LinkParams(r2));
        builder.add((Object) r3.A00());
        builder.add((Object) new SwitchCellParams(new C91795gr(z, z)));
        return new C109806ke();
    }
}
