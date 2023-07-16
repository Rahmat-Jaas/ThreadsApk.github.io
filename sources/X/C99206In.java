package X;

import com.facebookpay.form.cell.label.LabelCellParams;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;

/* renamed from: X.6In  reason: invalid class name and case insensitive filesystem */
public final class C99206In {
    public static LabelCellParams A00() {
        int i;
        C91885h0 r6 = new C91885h0(16);
        UserSession A00 = AnonymousClass7HK.A00();
        AnonymousClass0TJ r7 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r7, A00, 36327542059182141L)) {
            i = 2131830507;
        } else {
            i = 2131823146;
            if (AnonymousClass7HK.A01()) {
                i = 2131830503;
            }
        }
        r6.A03 = i;
        LinkParams linkParams = new LinkParams("[[payment_terms_token]]", 2131832210, C18170wI.A00(1118));
        ImmutableList.Builder builder = r6.A08;
        builder.add((Object) linkParams);
        if (C63803iN.A0E(r7, AnonymousClass7HK.A00(), 36327542059182141L)) {
            builder.add((Object) new LinkParams("[[learn_more_token]]", 2131832192, "https://www.facebook.com/help/322044199117075"));
        }
        return r6.A00();
    }
}
