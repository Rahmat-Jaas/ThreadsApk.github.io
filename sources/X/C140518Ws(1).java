package X;

/* renamed from: X.8Ws  reason: invalid class name and case insensitive filesystem */
public final class C140518Ws extends C02220Ah implements AnonymousClass0YP {
    public static final C140518Ws A00 = new C140518Ws();

    public C140518Ws() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass682 r4;
        C141738cs r0;
        C141748ct r8 = (C141748ct) obj;
        AnonymousClass7HE r9 = (AnonymousClass7HE) obj2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r9);
        Object obj3 = r9.A02;
        if (obj3 instanceof C121237Ex) {
            r4 = AnonymousClass682.Paragraph;
        } else if (obj3 instanceof AnonymousClass7F0) {
            r4 = AnonymousClass682.Span;
        } else if (obj3 instanceof AnonymousClass55L) {
            r4 = AnonymousClass682.VerbatimTts;
        } else if (obj3 instanceof C114226st) {
            r4 = AnonymousClass682.Url;
        } else {
            r4 = AnonymousClass682.String;
        }
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            C04220Ms.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            r0 = C1192274b.A09;
        } else if (ordinal == A1Z) {
            C04220Ms.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
            r0 = C1192274b.A0B;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                C04220Ms.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                r0 = C1192274b.A0H;
            }
            return C06750aI.A14(r4, obj3, Integer.valueOf(r9.A01), Integer.valueOf(r9.A00), r9.A03);
        } else {
            C04220Ms.A0C(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
            r0 = C1192274b.A0I;
        }
        obj3 = C1192274b.A00(r0, r8, obj3);
        return C06750aI.A14(r4, obj3, Integer.valueOf(r9.A01), Integer.valueOf(r9.A00), r9.A03);
    }
}
