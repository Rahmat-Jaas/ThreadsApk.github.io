package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.1fV  reason: invalid class name */
public final class AnonymousClass1fV extends C34727Idy {
    public int A00;
    public AnonymousClass3CS A01;
    public C67233zC A02;
    public boolean A03;
    public C19460Awh A04;
    public boolean A05;
    public final Context A06;
    public final AnonymousClass1gV A07;
    public final AnonymousClass1gL A08;
    public final C24001gj A09;
    public final C24021gl A0A;
    public final C34741IeD A0B;
    public final List A0C = AnonymousClass0wJ.A0v();
    public final List A0D = AnonymousClass0wJ.A0v();
    public final C04530Oa A0E;
    public final C04530Oa A0F;
    public final AnonymousClass1gM A0G;
    public final AnonymousClass9TL A0H;

    public final void A04(List list, List list2) {
        C04220Ms.A0B(list2, 1);
        List list3 = this.A0C;
        list3.clear();
        list3.addAll(list);
        List list4 = this.A0D;
        list4.clear();
        list4.addAll(list2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0.A02 != true) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r4 = this;
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x002d
            X.3zC r0 = r4.A02
            r1 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.A02
            r3 = 1
            if (r0 == r1) goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            android.content.Context r0 = r4.A06
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131689515(0x7f0f002b, float:1.9008048E38)
            int r0 = r4.A00
            java.lang.String r2 = X.AnonymousClass0wJ.A0m(r2, r0, r1)
            X.C04220Ms.A06(r2)
            r0 = 17
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r1.<init>((int) r0, (java.lang.String) r2, (boolean) r3)
            X.1gM r0 = r4.A0G
            r4.addModel(r1, r0)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1fV.A00():void");
    }

    public final void A02(int i) {
        C63613hu r2;
        if (this.A05 && (r2 = (C63613hu) getModel(C63613hu.class, 0)) != null) {
            r2.A0A = AnonymousClass0wJ.A0m(this.A06.getResources(), i, R.plurals.audience_picker_members_section_title);
            notifyItemChanged(0);
        }
    }

    public AnonymousClass1fV(Context context, C11630kW r10, AnonymousClass1cP r11, AnonymousClass1cP r12, C83074qk r13) {
        this.A06 = context;
        AnonymousClass1gM r1 = new AnonymousClass1gM(context, r12);
        this.A0G = r1;
        AnonymousClass1gV r2 = new AnonymousClass1gV(context, r10, r11);
        this.A07 = r2;
        AnonymousClass1gL r3 = new AnonymousClass1gL(context, r13);
        this.A08 = r3;
        C24001gj r4 = new C24001gj(context);
        this.A09 = r4;
        C24021gl r5 = new C24021gl(context);
        this.A0A = r5;
        C34741IeD ieD = new C34741IeD(context, AnonymousClass4ME.A00);
        this.A0B = ieD;
        this.A0F = C62373Zc.A03(C20696BhV.A00);
        this.A0E = C62373Zc.A02(this, 24);
        AnonymousClass9TL r7 = new AnonymousClass9TL(context);
        this.A0H = r7;
        init(r1, r2, r3, r4, r5, ieD, r7);
    }

    public final void A01() {
        AnonymousClass36S r1;
        L2E l2e;
        clear();
        List<Object> list = this.A0C;
        if (!list.isEmpty() || !this.A0D.isEmpty()) {
            if (C18190wL.A1a(list)) {
                int size = list.size();
                Context context = this.A06;
                String A0m = AnonymousClass0wJ.A0m(context.getResources(), size, R.plurals.audience_picker_members_section_title);
                C04220Ms.A06(A0m);
                String string = context.getString(2131823313);
                C63613hu r2 = new C63613hu((CharSequence) A0m);
                if (string != null) {
                    r2.A0D = string;
                    r1 = null;
                    l2e = this.A08;
                } else {
                    r1 = new AnonymousClass36S();
                    l2e = this.A09;
                }
                addModel(r2, r1, l2e);
                A00();
                for (Object addModel : list) {
                    addModel(addModel, this.A07);
                }
            }
            this.A05 = C18190wL.A1a(list);
            List<Object> list2 = this.A0D;
            if (C18190wL.A1a(list2)) {
                addModel(new C63613hu((CharSequence) AnonymousClass0wJ.A0k(this.A06, 2131836395)), new AnonymousClass36S(), this.A09);
                if (list.isEmpty()) {
                    A00();
                }
                for (Object addModel2 : list2) {
                    addModel(addModel2, this.A07);
                }
            }
        } else {
            A03(this.A06, (View.OnClickListener) null, C170039uK.EMPTY);
        }
        notifyDataSetChangedSmart();
    }

    public final void A03(Context context, View.OnClickListener onClickListener, C170039uK r10) {
        String str;
        boolean A1Y = AnonymousClass0wJ.A1Y(context, r10);
        clear();
        AnonymousClass3CS r3 = this.A01;
        if (r3 != null) {
            C19460Awh awh = new C19460Awh();
            awh.A00 = AnonymousClass0wJ.A04(r3.A04.getValue());
            int ordinal = r10.ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    awh.A04 = onClickListener;
                    StringBuilder A0r = C18200wM.A0r();
                    String A0k = AnonymousClass0wJ.A0k(context, 2131834950);
                    String string = context.getString(2131824047);
                    A0r.append(string);
                    A0r.append(" ");
                    A0r.append(A0k);
                    SpannableString spannableString = new SpannableString(AnonymousClass00U.A0V(string, " ", A0k));
                    C18720xk r32 = new C18720xk(C18220wO.A02(context, R.attr.textColorRegularLink));
                    int lastIndexOf = A0r.lastIndexOf(A0k);
                    spannableString.setSpan(r32, lastIndexOf, AnonymousClass0hA.A01(A0k) + lastIndexOf, 33);
                    str = spannableString;
                } else if (ordinal != A1Y) {
                    C10450iM.A03("Private Story Empty State Bindings", "Tried to bind to an invalid empty state in Private Story adapter.");
                } else {
                    awh.A02 = r3.A00;
                    awh.A0C = r3.A03;
                    str = r3.A02;
                }
                awh.A06 = str;
            }
            this.A04 = awh;
            addModel(awh, r10, this.A0H);
            notifyDataSetChangedSmart();
            return;
        }
        C04220Ms.A0E("emptyStateController");
        throw null;
    }
}
