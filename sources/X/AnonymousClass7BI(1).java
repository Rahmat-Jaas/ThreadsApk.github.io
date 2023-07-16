package X;

import com.facebookpay.form.cell.label.LabelCellParams;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7BI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7BI {
    public static LabelCellParams A00(int i) {
        C91885h0 r4 = new C91885h0(16);
        r4.A03 = i;
        r4.A08.add((Object) new LinkParams("[[data_terms_token]]", 2131826457, "https://www.facebook.com/privacy/explanation/"));
        r4.A04 = 0;
        return r4.A00();
    }

    public static LabelCellParams A01(int i) {
        C91885h0 r4 = new C91885h0(16);
        r4.A03 = i;
        r4.A08.add((Object) new LinkParams("[[payment_terms_token]]", 2131826599, "https://www.facebook.com/payments_terms/"));
        r4.A04 = 0;
        return r4.A00();
    }

    public static LabelCellParams A02(int i, int i2, int i3, int i4) {
        String str;
        C91885h0 r4 = new C91885h0(16);
        r4.A03 = i;
        LinkParams linkParams = new LinkParams("[[payment_terms_token]]", 2131826567, "https://www.facebook.com/payments_terms/");
        ImmutableList.Builder builder = r4.A08;
        builder.add((Object) linkParams);
        builder.add((Object) new LinkParams("[[data_terms_token]]", 2131826566, "https://www.facebook.com/privacy/explanation/"));
        r4.A04 = i2;
        r4.A05 = i3;
        r4.A01 = i4;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7HK.A00(), 36327542059182141L)) {
            AnonymousClass7Kz.A0E();
            if ("instagram".equals("instagram")) {
                str = "https://help.instagram.com/339753487169481?ref=learn_more";
            } else {
                str = "https://www.facebook.com/help/322044199117075?ref=learn_more";
            }
            AnonymousClass3ZT.A02(str, "url");
            builder.add((Object) new LinkParams("[[learn_more_token]]", 2131826458, str));
        }
        return r4.A00();
    }
}
