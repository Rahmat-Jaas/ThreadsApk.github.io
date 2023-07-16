package X;

/* renamed from: X.7jU  reason: invalid class name and case insensitive filesystem */
public abstract class C128387jU implements AnonymousClass8e8 {
    public final C109776kb A00;

    public static C92375iF A02(AnonymousClass5iC r3, AnonymousClass5iR r4) {
        r3.A03 = false;
        r4.A04 = new C92395iH(r3);
        r4.A01 = 0;
        r4.A00 = 1.0f;
        return new C92375iF();
    }

    public static C92375iF A03(AnonymousClass5iC r3, AnonymousClass5iR r4) {
        r3.A03 = false;
        r4.A04 = new C92395iH(r3);
        r4.A01 = 0;
        r4.A00 = 1.0f;
        return new C92375iF();
    }

    public boolean A05(C128387jU r6) {
        if (r6 == null) {
            return false;
        }
        C109776kb r3 = this.A00;
        boolean z = r3.A03;
        C109776kb r2 = r6.A00;
        return z == r2.A03 && AnonymousClass0wJ.A1W(r3.A00) == AnonymousClass0wJ.A1W(r2.A00) && C04220Ms.A0I(r3.A02, r2.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0227, code lost:
        if (r1 == 0) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x024b, code lost:
        if (r1 == 0) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x026f, code lost:
        if (r1 == 0) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        if (r0 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (r0 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
        if (r0 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010e, code lost:
        if (r0 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015a, code lost:
        if (r0.length() != 0) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C113656rv r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00df
            android.view.ViewStub r2 = r9.A02
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0049
            int r1 = r9.A01
            if (r1 == 0) goto L_0x0019
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = X.C86124wJ.A0K(r0, r1)
            r2.setLayoutInflater(r0)
        L_0x0019:
            android.view.View r0 = r2.inflate()
            X.C04220Ms.A06(r0)
            r9.A00 = r0
            boolean r0 = r9 instanceof X.C92495ib
            if (r0 == 0) goto L_0x0312
            r2 = r9
            X.5ib r2 = (X.C92495ib) r2
            android.view.View r1 = r2.A00()
            r0 = 2131307454(0x7f092bbe, float:1.8233136E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r2.A01 = r1
            android.view.View r1 = r2.A00()
            r0 = 2131299802(0x7f090dda, float:1.8217616E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r1, r0)
            r2.A00 = r0
        L_0x0049:
            r4 = r8
            boolean r0 = r8 instanceof X.C92415iK
            if (r0 == 0) goto L_0x011a
            X.5iK r4 = (X.C92415iK) r4
            boolean r0 = r9 instanceof X.C92495ib
            if (r0 == 0) goto L_0x0404
            r6 = r9
            X.5ib r6 = (X.C92495ib) r6
            android.view.View r5 = r6.A00
            if (r5 == 0) goto L_0x0465
            X.5iE r3 = r4.A00
            boolean r0 = r3.A02
            int r0 = X.C18190wL.A00(r0)
            r5.setVisibility(r0)
            java.lang.Integer r0 = r3.A01
            if (r0 == 0) goto L_0x0082
            int r2 = r0.intValue()
            X.6nt r1 = X.AnonymousClass7Kz.A0D()
            android.content.Context r0 = X.C18190wL.A0A(r5)
            int r1 = r1.A00(r0, r2)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r5.setBackground(r0)
        L_0x0082:
            X.8nD r1 = r3.A00
            if (r1 == 0) goto L_0x008d
            android.widget.ImageView r0 = r6.A01
            if (r0 == 0) goto L_0x0401
            r1.Bao(r0)
        L_0x008d:
            android.view.View r1 = r9.A00()
            X.6kb r4 = r8.A00
            boolean r0 = r4.A03
            r1.setFocusable(r0)
            android.view.View r2 = r9.A00()
            boolean r1 = r4.A03
            r0 = 4
            if (r1 == 0) goto L_0x00a2
            r0 = 0
        L_0x00a2:
            r2.setImportantForAccessibility(r0)
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x00b4
            int r1 = r0.intValue()
            android.view.View r0 = r9.A00()
            r0.setId(r1)
        L_0x00b4:
            r3 = r8
            boolean r2 = r8 instanceof X.AnonymousClass5iI
            if (r2 == 0) goto L_0x00fc
            r0 = r3
            X.5iI r0 = (X.AnonymousClass5iI) r0
            X.5iA r0 = r0.A00
            X.7E5 r1 = r0.A01
            if (r1 == 0) goto L_0x00cc
            r0 = r9
            X.5ic r0 = (X.C92505ic) r0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0452
        L_0x00c9:
            r1.A02(r0)
        L_0x00cc:
            if (r2 == 0) goto L_0x00e0
            X.5iI r3 = (X.AnonymousClass5iI) r3
            X.5iA r0 = r3.A00
            android.view.View$OnClickListener r1 = r0.A00
            if (r1 == 0) goto L_0x00df
            X.5ic r9 = (X.C92505ic) r9
            android.view.View r0 = r9.A00
            if (r0 == 0) goto L_0x0452
        L_0x00dc:
            r0.setOnClickListener(r1)
        L_0x00df:
            return
        L_0x00e0:
            boolean r0 = r8 instanceof X.C92385iG
            if (r0 == 0) goto L_0x00f3
            X.5iG r3 = (X.C92385iG) r3
            X.5iB r0 = r3.A00
            android.view.View$OnClickListener r1 = r0.A00
            if (r1 == 0) goto L_0x00df
            X.5iY r9 = (X.AnonymousClass5iY) r9
            android.widget.Button r0 = r9.A00
            if (r0 == 0) goto L_0x0462
            goto L_0x00dc
        L_0x00f3:
            android.view.View$OnClickListener r1 = r4.A00
            if (r1 == 0) goto L_0x00df
            android.view.View r0 = r9.A00()
            goto L_0x00dc
        L_0x00fc:
            boolean r0 = r8 instanceof X.C92385iG
            if (r0 == 0) goto L_0x0111
            r0 = r3
            X.5iG r0 = (X.C92385iG) r0
            X.5iB r0 = r0.A00
            X.7E5 r1 = r0.A01
            if (r1 == 0) goto L_0x00cc
            r0 = r9
            X.5iY r0 = (X.AnonymousClass5iY) r0
            android.widget.Button r0 = r0.A00
            if (r0 == 0) goto L_0x0462
            goto L_0x00c9
        L_0x0111:
            X.7E5 r1 = r4.A01
            if (r1 == 0) goto L_0x00cc
            android.view.View r0 = r9.A00()
            goto L_0x00c9
        L_0x011a:
            boolean r0 = r8 instanceof X.C92405iJ
            if (r0 == 0) goto L_0x0163
            X.5iJ r4 = (X.C92405iJ) r4
            boolean r0 = r9 instanceof X.C92485ia
            if (r0 == 0) goto L_0x040c
            r2 = r9
            X.5ia r2 = (X.C92485ia) r2
            android.widget.TextView r1 = r2.A01
            if (r1 == 0) goto L_0x0409
            X.5iD r3 = r4.A00
            X.7Ib r0 = r3.A01
            X.AnonymousClass6I3.A00(r1, r0)
            android.widget.ImageView r1 = r2.A00
            if (r1 == 0) goto L_0x045a
            X.8nD r0 = r3.A00
            if (r0 == 0) goto L_0x013d
            r0.Bao(r1)
        L_0x013d:
            android.widget.TextView r2 = r2.A01
            if (r2 == 0) goto L_0x0409
            X.7Ib r0 = r3.A01
            if (r0 == 0) goto L_0x015c
            X.8n6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.C18190wL.A0A(r0)
            java.lang.CharSequence r0 = r1.BEM(r0)
            r1 = 0
            if (r0 == 0) goto L_0x015c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x015e
        L_0x015c:
            r1 = 8
        L_0x015e:
            r2.setVisibility(r1)
            goto L_0x008d
        L_0x0163:
            boolean r0 = r8 instanceof X.AnonymousClass5iL
            if (r0 == 0) goto L_0x029b
            X.5iL r4 = (X.AnonymousClass5iL) r4
            boolean r0 = r9 instanceof X.C92515id
            if (r0 == 0) goto L_0x041a
            X.5iF r4 = r4.A00
            X.7E5 r0 = r4.A01
            r3 = 0
            boolean r7 = X.AnonymousClass0wJ.A1W(r0)
            r5 = r9
            X.5id r5 = (X.C92515id) r5
            android.widget.TextView r0 = r5.A03
            if (r0 == 0) goto L_0x044f
            r6 = r7 ^ 1
            r0.setFocusable(r6)
            android.widget.TextView r1 = r5.A03
            if (r1 == 0) goto L_0x044f
            r2 = 4
            r0 = 4
            if (r7 != 0) goto L_0x018b
            r0 = 0
        L_0x018b:
            r1.setImportantForAccessibility(r0)
            X.7E5 r1 = r4.A06
            if (r1 == 0) goto L_0x019b
            if (r7 != 0) goto L_0x019b
            android.widget.TextView r0 = r5.A03
            if (r0 == 0) goto L_0x044f
            r1.A02(r0)
        L_0x019b:
            X.7E5 r1 = r4.A05
            if (r1 == 0) goto L_0x01a8
            if (r7 != 0) goto L_0x01a8
            android.widget.TextView r0 = r5.A02
            if (r0 == 0) goto L_0x0417
            r1.A02(r0)
        L_0x01a8:
            android.widget.TextView r0 = r5.A01
            if (r0 == 0) goto L_0x0414
            r0.setFocusable(r6)
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x0414
            r0 = 4
            if (r7 != 0) goto L_0x01b7
            r0 = 0
        L_0x01b7:
            r1.setImportantForAccessibility(r0)
            android.widget.TextView r0 = r5.A02
            if (r0 == 0) goto L_0x0417
            r0.setFocusable(r6)
            android.widget.TextView r1 = r5.A02
            if (r1 == 0) goto L_0x0417
            r0 = 4
            if (r7 != 0) goto L_0x01c9
            r0 = 0
        L_0x01c9:
            r1.setImportantForAccessibility(r0)
            android.widget.TextView r0 = r5.A00
            if (r0 == 0) goto L_0x0411
            r0.setFocusable(r6)
            android.widget.TextView r0 = r5.A00
            if (r0 == 0) goto L_0x0411
            if (r7 != 0) goto L_0x01da
            r2 = 0
        L_0x01da:
            r0.setImportantForAccessibility(r2)
            android.widget.TextView r1 = r5.A03
            if (r1 == 0) goto L_0x044f
            X.7Ib r0 = r4.A04
            X.AnonymousClass6I3.A00(r1, r0)
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x0414
            X.7Ib r0 = r4.A02
            X.AnonymousClass6I3.A00(r1, r0)
            android.widget.TextView r1 = r5.A02
            if (r1 == 0) goto L_0x0417
            X.7Ib r0 = r4.A03
            X.AnonymousClass6I3.A00(r1, r0)
            android.widget.TextView r1 = r5.A02
            if (r1 == 0) goto L_0x0417
            android.view.View$OnClickListener r0 = r4.A00
            r1.setOnClickListener(r0)
            android.widget.TextView r1 = r5.A00
            if (r1 == 0) goto L_0x0411
            X.7Ib r0 = r4.A01
            X.AnonymousClass6I3.A00(r1, r0)
            android.widget.TextView r2 = r5.A03
            if (r2 == 0) goto L_0x044f
            X.7Ib r0 = r4.A04
            if (r0 == 0) goto L_0x0229
            X.8n6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.C18190wL.A0A(r0)
            java.lang.CharSequence r0 = r1.BEM(r0)
            if (r0 == 0) goto L_0x0229
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x022b
        L_0x0229:
            r0 = 8
        L_0x022b:
            r2.setVisibility(r0)
            android.widget.TextView r2 = r5.A01
            if (r2 == 0) goto L_0x0414
            X.7Ib r0 = r4.A02
            if (r0 == 0) goto L_0x024d
            X.8n6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.C18190wL.A0A(r0)
            java.lang.CharSequence r0 = r1.BEM(r0)
            if (r0 == 0) goto L_0x024d
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x024f
        L_0x024d:
            r0 = 8
        L_0x024f:
            r2.setVisibility(r0)
            android.widget.TextView r2 = r5.A02
            if (r2 == 0) goto L_0x0417
            X.7Ib r0 = r4.A03
            if (r0 == 0) goto L_0x0271
            X.8n6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.C18190wL.A0A(r0)
            java.lang.CharSequence r0 = r1.BEM(r0)
            if (r0 == 0) goto L_0x0271
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0273
        L_0x0271:
            r0 = 8
        L_0x0273:
            r2.setVisibility(r0)
            android.widget.TextView r2 = r5.A00
            if (r2 == 0) goto L_0x0411
            X.7Ib r0 = r4.A01
            if (r0 == 0) goto L_0x0294
            X.8n6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.C18190wL.A0A(r0)
            java.lang.CharSequence r0 = r1.BEM(r0)
            if (r0 == 0) goto L_0x0294
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0296
        L_0x0294:
            r3 = 8
        L_0x0296:
            r2.setVisibility(r3)
            goto L_0x008d
        L_0x029b:
            boolean r0 = r8 instanceof X.AnonymousClass5iI
            if (r0 == 0) goto L_0x02d0
            X.5iI r4 = (X.AnonymousClass5iI) r4
            boolean r0 = r9 instanceof X.C92505ic
            if (r0 == 0) goto L_0x0455
            r6 = r9
            X.5ic r6 = (X.C92505ic) r6
            android.view.View r5 = r6.A00
            if (r5 == 0) goto L_0x0452
            X.6nt r3 = X.AnonymousClass7Kz.A0D()
            android.view.View r0 = r9.A00()
            android.content.Context r2 = X.C18190wL.A0A(r0)
            android.view.View r0 = r9.A00()
            android.content.Context r1 = r0.getContext()
            r0 = 2131231138(0x7f0801a2, float:1.8078349E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            r0 = 13
            if (r1 == 0) goto L_0x041f
            r3.A00(r2, r0)
            r0 = 0
            throw r0
        L_0x02d0:
            boolean r0 = r8 instanceof X.C92395iH
            if (r0 == 0) goto L_0x02f7
            X.5iH r4 = (X.C92395iH) r4
            boolean r0 = r9 instanceof X.C92475iZ
            if (r0 == 0) goto L_0x045d
            r3 = r9
            X.5iZ r3 = (X.C92475iZ) r3
            android.widget.ImageView r2 = r3.A00
            if (r2 == 0) goto L_0x045a
            X.5iC r1 = r4.A00
            X.8nD r0 = r1.A01
            if (r0 == 0) goto L_0x02ea
            r0.Bao(r2)
        L_0x02ea:
            android.widget.ImageView r2 = r3.A00
            if (r2 == 0) goto L_0x045a
            X.8nD r0 = r1.A00
        L_0x02f0:
            if (r0 == 0) goto L_0x008d
            r0.Chv(r2)
            goto L_0x008d
        L_0x02f7:
            X.5iG r4 = (X.C92385iG) r4
            boolean r0 = r9 instanceof X.AnonymousClass5iY
            if (r0 == 0) goto L_0x046c
            r3 = r9
            X.5iY r3 = (X.AnonymousClass5iY) r3
            android.widget.Button r2 = r3.A00
            if (r2 == 0) goto L_0x0462
            X.5iB r1 = r4.A00
            X.7Ib r0 = r1.A01
            X.AnonymousClass6I3.A00(r2, r0)
            android.widget.Button r2 = r3.A00
            if (r2 == 0) goto L_0x0462
            X.8nD r0 = r1.A00
            goto L_0x02f0
        L_0x0312:
            boolean r0 = r9 instanceof X.C92485ia
            if (r0 == 0) goto L_0x0340
            r3 = r9
            X.5ia r3 = (X.C92485ia) r3
            android.view.View r1 = r3.A00()
            r0 = 2131301892(0x7f091604, float:1.8221855E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            r3.A01 = r0
            android.view.View r1 = r3.A00()
            r0 = 2131301885(0x7f0915fd, float:1.822184E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.C04220Ms.A0B(r0, r2)
            r3.A00 = r0
            goto L_0x0049
        L_0x0340:
            boolean r0 = r9 instanceof X.C92515id
            if (r0 == 0) goto L_0x0392
            r3 = r9
            X.5id r3 = (X.C92515id) r3
            android.view.View r1 = r3.A00()
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            r3.A03 = r0
            android.view.View r1 = r3.A00()
            r0 = 2131307619(0x7f092c63, float:1.823347E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.C04220Ms.A0B(r0, r2)
            r3.A01 = r0
            android.view.View r1 = r3.A00()
            r0 = 2131307967(0x7f092dbf, float:1.8234176E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.C04220Ms.A0B(r0, r2)
            r3.A02 = r0
            android.view.View r1 = r3.A00()
            r0 = 2131305105(0x7f092291, float:1.8228371E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.C04220Ms.A0B(r0, r2)
            r3.A00 = r0
            goto L_0x0049
        L_0x0392:
            boolean r0 = r9 instanceof X.C92505ic
            if (r0 == 0) goto L_0x03cd
            r3 = r9
            X.5ic r3 = (X.C92505ic) r3
            android.view.View r1 = r3.A00()
            r0 = 2131306876(0x7f09297c, float:1.8231963E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r1, r0)
            r3.A00 = r0
            android.view.View r1 = r3.A00()
            r0 = 2131306878(0x7f09297e, float:1.8231968E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            r3.A02 = r0
            android.view.View r1 = r3.A00()
            r0 = 2131306877(0x7f09297d, float:1.8231965E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.C04220Ms.A0B(r0, r2)
            r3.A01 = r0
            goto L_0x0049
        L_0x03cd:
            boolean r0 = r9 instanceof X.C92475iZ
            if (r0 == 0) goto L_0x03e9
            r2 = r9
            X.5iZ r2 = (X.C92475iZ) r2
            android.view.View r1 = r2.A00()
            r0 = 2131301885(0x7f0915fd, float:1.822184E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r2.A00 = r1
            goto L_0x0049
        L_0x03e9:
            r2 = r9
            X.5iY r2 = (X.AnonymousClass5iY) r2
            android.view.View r1 = r2.A00()
            r0 = 2131297775(0x7f0905ef, float:1.8213504E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.Button r1 = (android.widget.Button) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r2.A00 = r1
            goto L_0x0049
        L_0x0401:
            java.lang.String r0 = "statusIcon"
            goto L_0x0467
        L_0x0404:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r4)
            throw r0
        L_0x0409:
            java.lang.String r0 = "imageTitle"
            goto L_0x0467
        L_0x040c:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r4)
            throw r0
        L_0x0411:
            java.lang.String r0 = "quaternaryTitle"
            goto L_0x0467
        L_0x0414:
            java.lang.String r0 = "subtitle"
            goto L_0x0467
        L_0x0417:
            java.lang.String r0 = "tertiaryTitle"
            goto L_0x0467
        L_0x041a:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r4)
            throw r0
        L_0x041f:
            r5.setBackground(r1)
            android.widget.TextView r1 = r6.A02
            if (r1 == 0) goto L_0x044f
            X.5iA r0 = r4.A00
            X.7Ib r0 = r0.A00
            X.AnonymousClass6I3.A00(r1, r0)
            android.widget.ImageView r0 = r6.A01
            if (r0 == 0) goto L_0x044c
            X.AnonymousClass7Kz.A0Q()
            android.view.View r0 = r9.A00()
            android.content.Context r0 = r0.getContext()
            X.C04220Ms.A06(r0)
            java.lang.String r1 = "Invalid icon type: "
            r0 = 8
            java.lang.String r0 = X.AnonymousClass00U.A0J(r1, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x044c:
            java.lang.String r0 = "icon"
            goto L_0x0467
        L_0x044f:
            java.lang.String r0 = "title"
            goto L_0x0467
        L_0x0452:
            java.lang.String r0 = "container"
            goto L_0x0467
        L_0x0455:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r4)
            throw r0
        L_0x045a:
            java.lang.String r0 = "image"
            goto L_0x0467
        L_0x045d:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r4)
            throw r0
        L_0x0462:
            java.lang.String r0 = "button"
            goto L_0x0467
        L_0x0465:
            java.lang.String r0 = "divider"
        L_0x0467:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x046c:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128387jU.A04(X.6rv):void");
    }

    public C128387jU(C109776kb r1) {
        this.A00 = r1;
    }
}
