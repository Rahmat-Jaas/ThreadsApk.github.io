package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;

/* renamed from: X.6IL  reason: invalid class name */
public final class AnonymousClass6IL {
    public static final void A00(C146928n6 r20, C146928n6 r21, C146928n6 r22, C146928n6 r23, ImmutableList.Builder builder, String str, String str2, String str3, String str4, AnonymousClass0YM r29, double d, int i) {
        int i2;
        AnonymousClass69Q r2;
        String str5 = null;
        String str6 = str3;
        if (d > 0.0d) {
            if (str3 != null) {
                str5 = AnonymousClass8bQ.A0l(str6, "↑", "", false);
            }
            i2 = 2131832100;
        } else {
            if (str3 != null) {
                str5 = AnonymousClass8bQ.A0l(str6, "↓", "", false);
            }
            i2 = 2131832099;
        }
        C146928n6 r24 = r20;
        C146928n6 r6 = r21;
        C146928n6 r5 = r22;
        C128097is A00 = C128097is.A00(new Object[]{r24, r6, r5, C128097is.A00(new Object[]{C128107it.A01(str5)}, i2)}, 2131832098);
        AnonymousClass5iO r1 = new AnonymousClass5iO();
        C92375iF A002 = C92375iF.A00();
        C121777Ib.A02(r24, A002, AnonymousClass69Q.PRIMARY_TEXT);
        A002.A02 = new C121777Ib((C146998nD) null, r6, AnonymousClass69Q.A0s);
        A002.A03 = new C121777Ib((C146998nD) null, r5, AnonymousClass69Q.A0z);
        if (d > 0.0d) {
            r2 = AnonymousClass69Q.A18;
        } else {
            r2 = AnonymousClass69Q.A17;
        }
        A002.A01 = new C121777Ib((C146998nD) null, r23, r2);
        C121187Eo r8 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
        r8.A01 = A00;
        r8.A04 = false;
        AnonymousClass7E5.A00(r8, A002);
        r1.A02 = new AnonymousClass5iL(A002);
        AnonymousClass5iB r4 = new AnonymousClass5iB();
        r4.A01 = new C121777Ib((C146998nD) null, C128097is.A00(new Object[0], 2131837914), AnonymousClass69Q.A0y);
        r4.A00 = new C128067iI(6, (Integer) null, R.drawable.button_background, 0);
        r4.A00 = new AnonymousClass7RB(str2, str, str4, r29);
        AnonymousClass7E5.A00(new C121187Eo((C146928n6) null, C128097is.A00(new Object[0], i), AnonymousClass006.A01, 116, true, false, false), r4);
        r1.A01 = new C92385iG(r4);
        builder.add((Object) new AnonymousClass5iT(r1));
    }
}
